package com.upsoft.sep.sls.config.check.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.upsoft.sep.sls.config.check.base.TimeUtils;
import com.upsoft.sep.sls.config.check.dao.CheckItemDao;
import com.upsoft.sep.sls.config.check.dao.CheckItemOptDao;
import com.upsoft.sep.sls.config.check.dao.CheckItemOptRelDao;
import com.upsoft.sep.sls.config.check.dao.TemplateItemRelDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.exception.BPException;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.bp.sso.client.bean.User;
import com.upsoft.sep.bp.sso.client.utils.UserUtil;
import com.upsoft.sep.bp.user.entity.Organization;
import com.upsoft.sep.bp.user.param.UserGetParam;
import com.upsoft.sep.bp.user.service.UserService;
import com.upsoft.sep.sls.config.check.base.CheckBaseConst;
import com.upsoft.sep.sls.config.check.base.StringUtil;
import com.upsoft.sep.sls.config.check.entity.CheckItemEditEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptPageEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptRelEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemPageEntity;
import com.upsoft.sep.sls.config.check.entity.TemplateItemRelEntity;
import com.upsoft.sep.sls.config.check.param.AddCheckItemParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemByIdsParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemOptParam;
import com.upsoft.sep.sls.config.check.param.ModCheckItemParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByIdParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByIdsParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByNameParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemPageParam;

public class CheckItemServiceImpl implements CheckItemService {

	@Autowired
	private CheckItemDao checkItemDao;

	@Autowired
	private UserService userService;

	@Autowired
	private TemplateItemRelDao templateItemRelDao;

	@Autowired
	private CheckItemOptDao checkItemOptDao;

	@Autowired
	private CheckItemOptRelDao checkItemOptRelDao;
	
	@Autowired
	private CheckItemOptService checkItemOptService;

	private static final LogHandler LOG = LogHandler.getLogHandler("CheckItemServiceImpl");

	@SuppressWarnings("unchecked")
	@Override
	public Result<ResponsePage<List<CheckItemPageEntity>>> queryPage(RequestPage<QueryCheckItemPageParam> page) {
		Result<ResponsePage<List<CheckItemPageEntity>>> result = new Result<ResponsePage<List<CheckItemPageEntity>>>();
		try {
			if (null != page.getParam() && null != page.getParam().getVersionTime()) {
				page.getParam().setVersionTimeDate(new Date(page.getParam().getVersionTime()));
			}
			page.getParam().setSortName(StringUtil.propertyToField(page.getParam().getSortName()));
			List<CheckItemPageEntity> checkItems = checkItemDao.selectCheckItems(page);
			ResponsePage<List<CheckItemPageEntity>> rPage = page.toResponsePage();
			rPage.setData(checkItems);
			result.setData(rPage);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("分页查询检查项");
		} catch (Exception e) {
			LOG.debug("分页查询检查项");
			e.printStackTrace();
			throw new BPException(e,"0","分页查询检查项");
		}
		return result;
	}

	@Override
	public Result<Boolean> addChekItem(AddCheckItemParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			User currentUser = UserUtil.getCurrentUser();
			param.setCreaterId(currentUser.getUserId());
			param.setCreaterName(currentUser.getUserName());
			param.setCreaterOrgCode(currentUser.getOrgId());
			param.setCreaterOrgName(getUserOrg(currentUser));
			param.setCreateTime(TimeUtils.getTimeStampByLong(new Date().getTime()));
			param.setVersionTime(TimeUtils.getTimeStampByLong(new Date().getTime()));
			QueryCheckItemByNameParam qcbp = new QueryCheckItemByNameParam();
			qcbp.setCheckItemName(param.getCheckItemName());
			Result<Integer> countRes = this.queryChekItemByName(qcbp);
			if (countRes.getData() > 0) {
				throw new BPException("检查项名称存在");
			}
			checkItemDao.insertCheckItems(param);
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.ADD_SUCCESS.getValue());
			LOG.debug("新增检查项");
		} catch (Exception e) {
			LOG.error("新增检查项失败", e);
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.ADD_FAIL.getValue());
			e.printStackTrace();
			throw new BPException(e,"0","新增检查项失败");
		}
		return result;
	}

	@Override
	public Result<Boolean> modChekItem(ModCheckItemParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			param.setVersionTime(TimeUtils.getTimeStampByLong(System.currentTimeMillis()));
			QueryCheckItemByIdParam qpByIdParam = new QueryCheckItemByIdParam();
			qpByIdParam.setCheckItemId(param.getCheckItemId());
			CheckItemEditEntity item = checkItemDao.selectCheckItemById(qpByIdParam);
			if (null == item) {
				result.setMsg("无效参数");
				return result;
			}
			checkItemDao.updateCheckItems(param);
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_SUCCESS.getValue());
			LOG.debug("编辑检查项");
		} catch (Exception e) {
			LOG.error("编辑检查项失败", e);
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_FAIL.getValue());
			e.printStackTrace();
			throw new BPException(e,"0","编辑检查项失败");
		}
		return result;
	}

	@Override
	public Result<List<CheckItemPageEntity>> queryChekItemList(QueryCheckItemByIdParam param) {
		Result<List<CheckItemPageEntity>> result = new Result<List<CheckItemPageEntity>>();
		try {
			List<CheckItemPageEntity> itemList = checkItemDao.selectCheckItemList(param);
			result.setData(itemList);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询检查项");
		} catch (Exception e) {
			LOG.error("查询检查项失败");
			e.printStackTrace();
			throw new BPException(e,"0","查询检查项失败");
		}
		return result;
	}

	@Override
	public Result<CheckItemEditEntity> queryChekItemById(QueryCheckItemByIdParam param) {
		Result<CheckItemEditEntity> result = new Result<CheckItemEditEntity>();
		try {
			CheckItemEditEntity entity = checkItemDao.selectCheckItemById(param);
			result.setData(entity);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("根据ID查询检查项");
		} catch (Exception e) {
			LOG.error("根据ID查询检查项失败", e);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			e.printStackTrace();
			throw new BPException(e,"0","根据ID查询检查项失败");
		}
		return result;
	}

	@Override
	public Result<Integer> queryChekItemByName(QueryCheckItemByNameParam param) {
		Result<Integer> result = new Result<Integer>();
		try {
			int count = checkItemDao.selectCheckItemCountByName(param);
			result.setData(count);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("根据检查项名查询检查项");
		} catch (Exception e) {
			LOG.error("根据检查项名查询检查项");
			e.printStackTrace();
			throw new BPException(e,"0","根据检查项名查询检查项失败");
		}
		return result;
	}

	@Override
	public Result<Boolean> deleteChekItemByIds(DelCheckItemByIdsParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			if (null == param.getCheckItemIdList() || param.getCheckItemIdList().size() < 1) {
				result.setMsg("参数错误！");
				return result;
			}
			if (null != param.getCheckItemIdList() && param.getCheckItemIdList().size() > 0) {
				List<TemplateItemRelEntity> templateRel = templateItemRelDao.selectByCheckItemIds(param.getCheckItemIdList());
				List<CheckItemOptRelEntity> optItemRels = checkItemOptRelDao.selectItemRelByItemIds(param.getCheckItemIdList());
				if ((null != templateRel && templateRel.size() > 0) || (null != optItemRels && optItemRels.size() > 0)) {
					result.setMsg("删除失败，检查项已关联检查模板！");
					result.setStatus(Result.STATUS_ERROR);
					return result;
				}
			} 
			checkItemDao.deleteItemByIds(param);
			List<CheckItemOptPageEntity> opts = checkItemOptDao.selectcheckOptsList(param.getCheckItemIdList());
			List<String>optIds = new ArrayList<String>();
			if(null != opts && opts.size()>0){
				for(CheckItemOptPageEntity id:opts){
					optIds.add(id.getCheckOptId());
				}
				DelCheckItemOptParam dciop = new DelCheckItemOptParam();
				dciop.setOptIdList(optIds);
				checkItemOptDao.deleteCheckOptByIdList(dciop);
				checkItemOptRelDao.deleteRelbyCheckOptIdList(dciop);
			}
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_SUCCESS.getValue());
			LOG.debug("根据ID删除检查项");
		} catch (Exception e) {
			LOG.error("根据ID删除检查项失败", e);
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_FAIL.getValue());
			e.printStackTrace();
			throw new BPException(e,"0","根据ID删除检查项失败");
		}
		return result;
	}

	private String getUserOrg(User userInfo) {
		UserGetParam userParam = new UserGetParam();
		userParam.setUserId(userInfo.getUserId());
		Result<com.upsoft.sep.bp.user.entity.User> user = userService.get(userParam);
		Organization org = null;
		String orgName = "";
		if (null != user && null != user.getData()) {
			org = user.getData().getUserOrg();
			orgName = org.getName();
		}
		return orgName;
	}

	@Override
	public Result<List<CheckItemEntity>> queryChekItemByIds(QueryCheckItemByIdsParam param) {
		Result<List<CheckItemEntity>> result = new Result<List<CheckItemEntity>>();
		if (null == param.getCheckItemId() || param.getCheckItemId().size() < 1) {
			result.setMsg("参数错误");
			result.setStatus(Result.STATUS_ERROR);
			return result;
		}
		try {
			List<CheckItemEntity> items = checkItemDao.selectCheckItemByIds(param.getCheckItemId());
			result.setData(items);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg("查询检查项列表成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg("查询检查项列表失败");
			LOG.error("检查项列表查询失败");
			e.printStackTrace();
			throw new BPException(e,"0","检查项列表查询失败");
		}
		return result;
	}
}
