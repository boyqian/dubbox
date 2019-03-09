package com.upsoft.sep.sls.config.check.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.upsoft.sep.sls.config.check.base.TimeUtils;
import com.upsoft.sep.sls.config.check.dao.CheckItemOptDao;
import com.upsoft.sep.sls.config.check.dao.CheckItemOptRelDao;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.exception.BPException;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.bp.common.util.UUIDUtil;
import com.upsoft.sep.bp.sso.client.bean.User;
import com.upsoft.sep.bp.sso.client.utils.UserUtil;
import com.upsoft.sep.bp.user.entity.Organization;
import com.upsoft.sep.bp.user.param.UserGetParam;
import com.upsoft.sep.bp.user.service.UserService;
import com.upsoft.sep.sls.config.check.base.CheckBaseConst;
import com.upsoft.sep.sls.config.check.base.StringUtil;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptPageEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptRelEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemRelEntity;
import com.upsoft.sep.sls.config.check.entity.CheckOptEditEntity;
import com.upsoft.sep.sls.config.check.param.AddCheckItemOptParam;
import com.upsoft.sep.sls.config.check.param.AddItemOptRelParam;
import com.upsoft.sep.sls.config.check.param.CheckItemIdsParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemOptParam;
import com.upsoft.sep.sls.config.check.param.ModCheckItemOptParam;
import com.upsoft.sep.sls.config.check.param.MoveOptParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemOptByIdAndNameParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemOptByIdParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemOptByIdsParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemPageParam;

public class CheckItemOptServiceImpl implements CheckItemOptService {
	@Autowired
	private CheckItemOptDao checkItemOptDao;

	@Autowired
	private CheckItemOptRelDao checkItemOptRelDao;

	@Autowired
	private UserService userService;

	private static final LogHandler LOG = LogHandler.getLogHandler("CheckItemOptServiceImpl");

	@Override
	public Result<CheckItemOptEntity> getCheckItemOptByIdAndOptName(QueryCheckItemOptByIdAndNameParam param) {
		Result<CheckItemOptEntity> result = new Result<CheckItemOptEntity>();
		try {
			List<CheckItemOptEntity> opts = checkItemOptDao.selectCheckItemOptInfo(param);
			if (opts != null && opts.size() > 0) {
				result.setData(opts.get(0));
			}
			LOG.debug("根据Id和选项名称查询检查选项");
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
		} catch (Exception e) {
			LOG.error("根据Id和选项名称查询检查选项失败", e);
			e.printStackTrace();
			throw new BPException(e,"0","根据Id和选项名称查询检查选项失败");
			
		}
		return result;
	}

	@Override
	public Result<Boolean> addCheckItemOpt(AddCheckItemOptParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			param.setCheckOptId(UUIDUtil.generate());
			User info = UserUtil.getCurrentUser();
			param.setCreaterId(info.getUserId());
			param.setCreaterName(info.getUserName());
			param.setCreaterOrgCode(info.getOrgId());
			param.setCreaterOrgName(getUserOrg(info));
			param.setStatus(CheckBaseConst.STATUS_TYPE.valid.getCode());
			param.setCreateTime(TimeUtils.getTimeStampByLong(System.currentTimeMillis()));
			param.setVersionTime(TimeUtils.getTimeStampByLong(System.currentTimeMillis()));
			checkItemOptDao.insertCheckItemOpt(param);

			AddItemOptRelParam rel = new AddItemOptRelParam();
			rel.setCheckOptId(param.getCheckOptId());
			rel.setVersionTime(param.getVersionTime());
			String idStr = param.getChildItemId();
			// 新增子检查项
			if (idStr.endsWith(",")) {
				idStr = idStr.substring(0, idStr.length() - 1);
				String[] ids = idStr.split(",");
				for (String id : ids) {
					rel.setCheckItemId(id);
					rel.setPcItemId(UUIDUtil.generate());
					checkItemOptRelDao.insertItemOptRel(rel);
				}
			}
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.ADD_SUCCESS.getValue());
			LOG.debug("新增检查项检查选项");
		} catch (Exception e) {
			LOG.error("新增检查项检查选项失败", e);
			e.printStackTrace();
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.ADD_FAIL.getValue());
			throw new BPException(e,"0","新增检查项检查选项失败");
		}
		return result;
	}

	@Override
	public Result<List<CheckItemOptPageEntity>> queryCheckItemOptList(QueryCheckItemOptByIdsParam param) {
		Result<List<CheckItemOptPageEntity>> result = new Result<List<CheckItemOptPageEntity>>();
		try {
			if (null != param && null != param.getVersionTime()) {
				param.setVersionTimeDate(new Date(param.getVersionTime()*1000));
			}
			List<CheckItemOptPageEntity> opts = checkItemOptDao.selectcheckOptList(param);
			List<String> optIdlist = new ArrayList<String>();
			for (CheckItemOptPageEntity opt : opts) {
				optIdlist.add(opt.getCheckOptId());
			}
			if (optIdlist.size() > 0) {
				opts = buildOptsEntity(opts, optIdlist);
			}
			LOG.debug("查询检查项检查选项");
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			result.setData(opts);
		} catch (Exception e) {
			LOG.debug("查询检查项检查选项失败");
			e.printStackTrace();
			throw new BPException(e,"0","查询检查项检查选项失败");
		}
		return result;
	}

	private List<CheckItemOptPageEntity> buildOptsEntity(List<CheckItemOptPageEntity> opts, List<String> optIdlist) {
		List<CheckItemRelEntity> children = checkItemOptRelDao.selectItemOptRelByOptIds(optIdlist);
		for (CheckItemOptPageEntity opt : opts) {
			// 获取子检查项
			if (children != null && children.size() > 0) {
				String childId = "";
				String childName = "";
				for (CheckItemRelEntity child : children) {
					if (StringUtils.equals(child.getOptId(), opt.getCheckOptId())) {
						childId += child.getChildId() + ",";
						childName += child.getChildName() + ",";
					}
				}
				if (!"".equals(childId)) {
					childId = childId.substring(0, childId.length() - 1);
					childName = childName.substring(0, childName.length() - 1);
				}
				opt.setChildItemId(childId);
				opt.setChildItemName(childName);
			}
		}
		return opts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * CheckItemOptService#getCheckItemOptByIds
	 * (com.upsoft.sep.sls.check.param.OptIdsParam)
	 */
	@Override
	public Result<List<CheckItemOptPageEntity>> getCheckItemOptByIds(CheckItemIdsParam param) {
		Result<List<CheckItemOptPageEntity>> result = new Result<List<CheckItemOptPageEntity>>();
		if (null == param || null == param.getItemIdList() || param.getItemIdList().size() < 1) {
			result.setMsg("参数错误");
			result.setStatus(Result.STATUS_ERROR);
			return result;
		}
		try {
			List<CheckItemOptPageEntity> opts = checkItemOptDao.selectcheckOptsList(param.getItemIdList());
			List<String> optIdlist = new ArrayList<String>();
			for (CheckItemOptPageEntity opt : opts) {
				optIdlist.add(opt.getCheckOptId());
			}
			if (optIdlist.size() > 0) {
				buildOptsEntity(opts, optIdlist);
			}
			LOG.debug("查询检查项检查选项");
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			result.setData(opts);
		} catch (Exception e) {
			LOG.error("查询检查项检查选项失败");
			e.printStackTrace();
			throw new BPException(e,"0","查询检查项检查选项失败");
		}
		return result;
	}

	@Override
	public Result<List<CheckItemOptPageEntity>> queryCheckItemOptListApp(QueryCheckItemOptByIdsParam param) {
		Result<List<CheckItemOptPageEntity>> result = new Result<List<CheckItemOptPageEntity>>();
		try {
			if (null != param && null != param.getVersionTime()) {
				param.setVersionTimeDate(new Date(param.getVersionTime()));
			}
			List<CheckItemOptPageEntity> opts = checkItemOptDao.selectcheckOptListApp(param);
			for (CheckItemOptPageEntity opt : opts) {
				List<CheckItemRelEntity> children = checkItemOptRelDao.selectItemOptRelByOptId(opt.getCheckOptId());
				// 获取子检查项
				if (children != null && children.size() > 0) {
					String childId = "";
					String childName = "";
					for (CheckItemRelEntity child : children) {
						childId += child.getChildId() + ",";
						childName += child.getChildName() + ",";
					}
					if (!"".equals(childId)) {
						childId = childId.substring(0, childId.length() - 1);
						childName = childName.substring(0, childName.length() - 1);
					}
					opt.setChildItemId(childId);
					opt.setChildItemName(childName);
				}
			}
			LOG.debug("查询检查项检查选项");
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			result.setData(opts);
		} catch (Exception e) {
			e.printStackTrace();
			throw new BPException(e,"0","查询检查项检查选项失败");
		}
		return result;
	}

	@Override
	public Result<CheckOptEditEntity> getCheckItemOptById(QueryCheckItemOptByIdParam param) {
		Result<CheckOptEditEntity> result = new Result<CheckOptEditEntity>();
		CheckOptEditEntity entity = checkItemOptDao.selectCheckItemOptById(param);
		result.setData(entity);
		result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
		result.setStatus(Result.STATUS_SUCCES);
		LOG.debug("查询检查项检查选项");
		return result;
	}

	@Override
	public Result<Boolean> modCheckItemOptById(ModCheckItemOptParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			param.setVersionTime(TimeUtils.getTimeStampByLong(System.currentTimeMillis()));
			QueryCheckItemOptByIdParam qcp = new QueryCheckItemOptByIdParam();
			qcp.setCheckOptId(param.getCheckOptId());
			CheckOptEditEntity opt = checkItemOptDao.selectCheckItemOptById(qcp);
			if (null == opt) {
				result.setData(false);
				result.setMsg("修改失败");
				result.setStatus(Result.STATUS_ERROR);
				return result;
			}
			checkItemOptDao.updateCheckItemOpt(param);
			checkItemOptRelDao.deleteRelbyCheckOptId(param.getCheckOptId());
			AddItemOptRelParam rel = new AddItemOptRelParam();
			rel.setCheckOptId(param.getCheckOptId());
			rel.setVersionTime(param.getVersionTime());
			String idStr = param.getChildItemId();
			if (idStr.endsWith(",")) {
				idStr = idStr.substring(0, idStr.length() - 1);
				String[] ids = idStr.split(",");
				for (String id : ids) {
					rel.setCheckItemId(id);
					rel.setPcItemId(UUIDUtil.generate());
					checkItemOptRelDao.insertItemOptRel(rel);
				}
			}
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_SUCCESS.getValue());
			LOG.debug("编辑检查项检查选项");
		} catch (Exception e) {
			LOG.error("编辑检查项检查选项失败", e);
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_FAIL.getValue());
			e.printStackTrace();
			throw new BPException(e,"0","编辑检查项检查选项失败");
		}
		return result;
	}

	@Override
	public Result<Boolean> deleteCheckItemOptById(DelCheckItemOptParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			checkItemOptDao.deleteCheckOptByIdList(param);
			checkItemOptRelDao.deleteRelbyCheckOptIdList(param);
			LOG.debug("删除检查项检查选项");
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_SUCCESS.getValue());
		} catch (Exception e) {
			LOG.error("删除检查项检查选项失败", e);
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_FAIL.getValue());
			e.printStackTrace();
			throw new BPException(e,"0","删除检查项检查选项失败");
		}
		return result;
	}

	@Override
	public Result<Boolean> moveCheckItemOptById(MoveOptParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			ModCheckItemOptParam modCheckItemOptParam = new ModCheckItemOptParam();
			modCheckItemOptParam.setCheckOptId(param.getOptId());
			modCheckItemOptParam.setOrderNumber(param.getOrderNumber());
			checkItemOptDao.updateCheckItemOpt(modCheckItemOptParam);
			ModCheckItemOptParam removedCheckItemOptParam = new ModCheckItemOptParam();
			removedCheckItemOptParam.setCheckOptId(param.getOptRemovedId());
			removedCheckItemOptParam.setOrderNumber(param.getOrderNumber() + param.getIncrement());
			checkItemOptDao.updateCheckItemOpt(removedCheckItemOptParam);
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_SUCCESS.getValue());
			LOG.debug("移动检查项检查选项");
		} catch (Exception e) {
			LOG.error("移动检查项检查选项失败", e);
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_FAIL.getValue());
			e.printStackTrace();
			throw new BPException(e,"0","移动检查项检查选项失败");
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
	public Result<ResponsePage<List<CheckItemOptRelEntity>>> queryPageCheckItemOptRel(RequestPage<QueryCheckItemPageParam> page) {
		Result<ResponsePage<List<CheckItemOptRelEntity>>> result = new Result<ResponsePage<List<CheckItemOptRelEntity>>>();
		try {
			// 排序
			QueryCheckItemPageParam param = page.getParam();
			if (null != param && StringUtils.isNotBlank(param.getSortName())) {
				param.setSortName(StringUtil.propertyToField(param.getSortName()));
			}
			if (null != param && null != param.getVersionTime() && StringUtils.isNotBlank(param.getVersionTime() + "")) {
				param.setVersionTimeDate(new Date(param.getVersionTime()));
			}
			List<CheckItemOptRelEntity> checkItemOptRels = checkItemOptRelDao.queryCheckItemOptRels(page);
			@SuppressWarnings("unchecked")
			ResponsePage<List<CheckItemOptRelEntity>> rPage = page.toResponsePage();
			rPage.setData(checkItemOptRels);
			result.setData(rPage);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
		} catch (Exception e) {
			LOG.error("分页查询检查项关联关系出错", e);
			e.printStackTrace();
			throw new BPException(e,"0","分页查询检查项关联关系出错");
		}
		return result;
	}

}
