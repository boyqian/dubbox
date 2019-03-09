package com.upsoft.sep.sls.config.check.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.upsoft.sep.sls.config.check.base.TimeUtils;
import com.upsoft.sep.sls.config.check.entity.CheckItemEditEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemRelEntity;
import com.upsoft.sep.sls.config.check.entity.CheckTemplateEditEntity;
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
import com.upsoft.sep.sls.config.check.dao.CheckItemDao;
import com.upsoft.sep.sls.config.check.dao.CheckItemOptDao;
import com.upsoft.sep.sls.config.check.dao.CheckItemOptRelDao;
import com.upsoft.sep.sls.config.check.dao.CheckTemplateDao;
import com.upsoft.sep.sls.config.check.dao.TemplateItemRelDao;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptReturnEntity;
import com.upsoft.sep.sls.config.check.entity.CheckTemplatePageEntity;
import com.upsoft.sep.sls.config.check.entity.TemplateItemRelPageEntity;
import com.upsoft.sep.sls.config.check.param.AddCheckTemplateParam;
import com.upsoft.sep.sls.config.check.param.AddTemplateItemRelParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemByIdsParam;
import com.upsoft.sep.sls.config.check.param.DelCheckTemplateByIdParam;
import com.upsoft.sep.sls.config.check.param.ModCheckTemplateParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByIdParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckTemplateByIdParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckTemplateListIdsParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckTemplatePageParam;
import com.upsoft.sep.sls.config.check.param.QueryPreviewParam;
import com.upsoft.sep.sls.config.check.param.TemplateIdParam;

/**
 * 
 * Copyright (c) 2016,重庆扬讯软件技术股份有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：CheckTemplateServiceImpl.java<br>
 * 摘要：检查模板实现类<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：wang meng <br>
 * 完成日期：2016年10月31日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：wang meng <br>
 * 完成日期：2016年10月31日<br>
 */
public class CheckTemplateServiceImpl implements CheckTemplateService {

	@Autowired
	private CheckTemplateDao checkTemplateDao;

	@Autowired
	private TemplateItemRelDao templateItemRelDao;

	@Autowired
	private CheckItemDao checkItemDao;

	@Autowired
	private CheckItemOptDao checkItemOptDao;

	@Autowired
	private CheckItemOptRelDao checkItemOptRelDao;

	@Autowired
	private UserService userService;
	
	private static final LogHandler LOG = LogHandler.getLogHandler("CheckTemplateServiceImpl");

	@SuppressWarnings("unchecked")
	@Override
	public Result<ResponsePage<List<CheckTemplatePageEntity>>> queryPage(RequestPage<QueryCheckTemplatePageParam> page) {
		Result<ResponsePage<List<CheckTemplatePageEntity>>> result = new Result<ResponsePage<List<CheckTemplatePageEntity>>>();
		try {
			page.getParam().setSortName(StringUtil.propertyToField(page.getParam().getSortName()));
			List<CheckTemplatePageEntity> templates = checkTemplateDao.selectCheckTemplateByPage(page);
			ResponsePage<List<CheckTemplatePageEntity>> rPage = page.toResponsePage();
			rPage.setData(templates);
			result.setData(rPage);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("分页查询检查模板");
		} catch (Exception e) {
			e.printStackTrace();
			throw new BPException(e,"0","分页查询检查模板失败");
		}
		return result;
	}

	@Override
	public Result<CheckTemplateEditEntity> queryCheckTemplateEntity(QueryCheckTemplateByIdParam param) {
		Result<CheckTemplateEditEntity> result = new Result<CheckTemplateEditEntity>();
		try {
			CheckTemplateEditEntity template = checkTemplateDao.selectCheckTemplateInfoById(param);
			result.setData(template);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("根据ID查询检查模板");
		} catch (Exception e) {
			throw new BPException(e,"0","根据ID查询检查模板");
		}
		return result;
	}

	@Override
	public Result<Boolean> addCheckTemplateEntity(AddCheckTemplateParam param) {
		Result<Boolean> result = new Result<Boolean>();
		User userInfo = UserUtil.getCurrentUser();
		try {
			param.setCreaterId(userInfo.getUserId());
			param.setCreaterName(userInfo.getUserName());
			param.setCreaterOrgCode(userInfo.getOrgId());
			param.setCreaterOrgName(getUserOrg(userInfo));
			param.setCreateTime(TimeUtils.getTimeStampByLong(System.currentTimeMillis()));
			param.setVersionTime(TimeUtils.getTimeStampByLong(System.currentTimeMillis()));
			checkTemplateDao.insertCheckTemplateInfo(param);
			saveTemplateItemRel(param.getChildItemId(), param.getCheckTemplateId());
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.ADD_SUCCESS.getValue());
			LOG.debug("新增检查模板");
		} catch (Exception e) {
			LOG.error("新增检查模板失败", e);
			e.printStackTrace();
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.ADD_FAIL.getValue());
			throw new BPException(e,"0","新增检查模板失败");
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
			if(null != org){
				orgName = org.getName();
			}
		}
		return orgName;
	}

	@Override
	public Result<List<TemplateItemRelPageEntity>> QueryTemplateItemRel(QueryCheckTemplateByIdParam param) {
		Result<List<TemplateItemRelPageEntity>> result = new Result<List<TemplateItemRelPageEntity>>();
		try {
			List<TemplateItemRelPageEntity> rels = templateItemRelDao.selectTemplateItemRelByTmpId(param);
			result.setData(rels);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询检查模板检查项关系");
		} catch (Exception e) {
			LOG.error("查询检查模板检查项关系失败");
			e.printStackTrace();
			throw new BPException(e,"0","查询检查模板检查项关系失败");
		}
		return result;
	}

	@Override
	public Result<Boolean> modTemplateItem(ModCheckTemplateParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			QueryCheckTemplateByIdParam qp = new QueryCheckTemplateByIdParam();
			qp.setCheckTemplateId(param.getCheckTemplateId());
			CheckTemplateEditEntity template = checkTemplateDao.selectCheckTemplateInfoById(qp);
			if (null == template) {
				result.setData(false);
				result.setStatus(Result.STATUS_ERROR);
				result.setMsg("无对应数据");
				return result;
			}
			param.setVersionTime(TimeUtils.getTimeStampByLong(System.currentTimeMillis()));
			checkTemplateDao.updateCheckTemplateInfo(param);
			saveTemplateItemRel(param.getChildItemId(), param.getCheckTemplateId());
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_SUCCESS.getValue());
			LOG.debug("编辑检查模板");
		} catch (Exception e) {
			LOG.error("编辑检查模板失败", e);
			e.printStackTrace();
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_FAIL.getValue());
			throw new BPException(e,"0","编辑检查模板失败");
		}
		return result;
	}

	/**
	 * 保存
	 * 
	 * @date 2017年3月17日 上午2:38:28
	 * @author wang meng
	 * @param ids
	 * @param templateId
	 */
	private void saveTemplateItemRel(List<String> ids, String templateId) {
		try {
			templateItemRelDao.deleteTemplateItemRel(templateId);
			if (ids == null || ids.size() == 0) {
				return;
			}
			AddTemplateItemRelParam param = new AddTemplateItemRelParam();
			param.setCheckTemplateId(templateId);
			int len = ids.size();
			for (int i = 0; i < len; i++) {
				param.setItemFormId(UUIDUtil.generate());
				param.setOrderNum((short) (i + 1));
				param.setCheckItemId(ids.get(i));
				param.setVersionTime(TimeUtils.getTimeStampByLong(System.currentTimeMillis()));
				templateItemRelDao.insertTemplateItemRel(param);
			}
		} catch (Exception e) {
			LOG.error("新增检查模板失败", e);
			e.printStackTrace();
			throw new BPException(e,"0","新增检查模板失败");
		}
	}

	@Override
	public Result<Map<String, String>> queryCheckTemplateListByIds(QueryCheckTemplateListIdsParam param) {
		if (param == null || param.getCheckTemplateIdList() == null) {
			return null;
		}
		Result<Map<String, String>> result = new Result<Map<String, String>>();
		try {
			Map<String, String> map = new HashMap<String, String>();
			List<CheckTemplateEditEntity> templates = checkTemplateDao.selectCheckTemplateListByIds(param);
			for (CheckTemplateEditEntity entity : templates) {
				map.put(entity.getCheckTemplateId(), entity.getCheckTemplateName());
			}
			LOG.debug("根据ID查询检查模板");
			result.setData(map);
		} catch (Exception e) {
			e.printStackTrace();
			throw new BPException(e,"0","根据ID查询检查模板失败");
		}
		return result;
	}

	@Override
	public Result<Boolean> deleteRelByCheckItemId(DelCheckItemByIdsParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			templateItemRelDao.deleteRelByCheckItemIds(param);
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_SUCCESS.getValue());
			LOG.debug("根据ID删除检查项");
		} catch (Exception e) {
			LOG.error("根据ID删除检查项失败", e);
			e.printStackTrace();
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_FAIL.getValue());
			throw new BPException(e,"0","根据ID删除检查项失败");
		}
		return result;
	}

	@Override
	public Result<Boolean> deleteTemplateById(DelCheckTemplateByIdParam param) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			QueryCheckTemplateByIdParam qp = new QueryCheckTemplateByIdParam();
			qp.setCheckTemplateId(param.getCheckTemplateId());
			CheckTemplateEditEntity template = checkTemplateDao.selectCheckTemplateInfoById(qp);
			if (null == template) {
				result.setData(false);
				result.setStatus(Result.STATUS_ERROR);
				result.setMsg("无对应数据");
				return result;
			}
			checkTemplateDao.deleteCheckTemplateInfoById(param);
			templateItemRelDao.deleteRelByTemplateId(param);
			result.setData(true);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_SUCCESS.getValue());
			LOG.debug("根据ID删除检查模板");
		} catch (Exception e) {
			LOG.error("根据ID删除检查模板", e);
			e.printStackTrace();
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_FAIL.getValue());
			throw new BPException(e,"0","根据ID删除检查模板失败");
		}

		return result;
	}

	@Override
	public Result<List<Object[]>> toPreviewItem(QueryPreviewParam param) {
		Result<List<Object[]>> result = new Result<List<Object[]>>();
		List<Object[]> list = new ArrayList<Object[]>();
		List<String> checkItems = param.getCheckItemIdList();
		Object[] obj = null;
		QueryCheckItemByIdParam itemParam = new QueryCheckItemByIdParam();
		for (String item : checkItems) {
			itemParam.setCheckItemId(item);
			CheckItemEditEntity checkItem = checkItemDao.selectCheckItemById(itemParam);
			if (checkItem == null) {
				continue;
			}
			QueryCheckItemByIdParam itemIdParam = new QueryCheckItemByIdParam();
			itemIdParam.setCheckItemId(checkItem.getCheckItemId());
			List<CheckItemOptReturnEntity> opts = checkItemOptDao.selectCheckOptListByItemId(itemIdParam);

			for (CheckItemOptReturnEntity opt : opts) {
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

			obj = new Object[2];
			obj[0] = checkItem;
			obj[1] = opts;
			list.add(obj);
			result.setData(list);
		}
		LOG.debug("预览检查模板");
		return result;
	}

	/*
	 * @Override public Result<List<TaskCheckItemsEntity>>
	 * getTemplateItems(QueryCheckTemplateByIdParam param) {
	 * Assert.notNull(param.getCheckTemplateId(), "必须传递templateId");
	 * Result<List<TaskCheckItemsEntity>> result = new
	 * Result<List<TaskCheckItemsEntity>>(); try { QueryCheckTemplateByIdParam
	 * relParam = new QueryCheckTemplateByIdParam();
	 * relParam.setCheckTemplateId(param.getCheckTemplateId()); boolean isApp =
	 * StringUtils.isNotBlank(param.getIsApp()); boolean notAll =
	 * StringUtils.equals(param.getItemTypeCode(), "-1");
	 * List<TemplateItemRelPageEntity> itemIds =
	 * templateItemRelDao.selectTemplateItemRelByTmpId(relParam); List<String>
	 * itemIdList = new ArrayList<String>(); for (TemplateItemRelPageEntity item
	 * : itemIds) { itemIdList.add(item.getCheckItemId()); } QueryPreviewParam
	 * queryParam = new QueryPreviewParam();
	 * queryParam.setCheckItemIdList(itemIdList); List<TaskCheckItemsEntity>
	 * taskCheckItemsEntities = new ArrayList<TaskCheckItemsEntity>();
	 * Result<List<Object[]>> checkItemsRes = this.toPreviewItem(queryParam); if
	 * (checkItemsRes != null && checkItemsRes.getData() != null) { Map<String,
	 * TaskCheckItemsEntity> map = new HashMap<String, TaskCheckItemsEntity>();
	 * TaskCheckItemsEntity taskCheckItemsEntity; List<CheckItemsEntity>
	 * itemLists; List<Object[]> listObjs = checkItemsRes.getData(); for
	 * (Object[] objs : listObjs) { CheckItemEditEntity checkItem =
	 * (CheckItemEditEntity) objs[0]; String typeCode =
	 * checkItem.getItemTypeCode(); if (isApp && !notAll) { if
	 * (!StringUtils.equals(typeCode, param.getItemTypeCode())) { continue; } }
	 * if (null == (taskCheckItemsEntity = map.get(typeCode))) {
	 * taskCheckItemsEntity = new TaskCheckItemsEntity();
	 * taskCheckItemsEntity.setCode(typeCode);
	 * taskCheckItemsEntity.setName(checkItem.getItemTypeName());
	 * map.put(typeCode, taskCheckItemsEntity); } if (isApp && notAll) {
	 * continue; } if (null == (itemLists = taskCheckItemsEntity.getItems())) {
	 * itemLists = new ArrayList<CheckItemsEntity>();
	 * taskCheckItemsEntity.setItems(itemLists); } CheckItemsEntity
	 * checkItemsEntity = new CheckItemsEntity();
	 * itemLists.add(checkItemsEntity);
	 * checkItemsEntity.setCheckItem(checkItem);
	 * checkItemsEntity.setOpts((List<CheckItemOptReturnEntity>) objs[1]); }
	 * Set<String> keys = map.keySet(); for (String key : keys) {
	 * taskCheckItemsEntities.add(map.get(key)); } }
	 * result.setData(taskCheckItemsEntities); } catch (Exception e) { }
	 * 
	 * return result; }
	 */

	@Deprecated
	@Override
	public Result<List<Object[]>> getTaskCheckItems(QueryCheckTemplateByIdParam param) {
		QueryCheckTemplateByIdParam relParam = new QueryCheckTemplateByIdParam();
		relParam.setCheckTemplateId(param.getCheckTemplateId());
		List<TemplateItemRelPageEntity> itemIds = templateItemRelDao.selectTemplateItemRelByTmpId(relParam);
		List<String> itemIdList = new ArrayList<String>();
		for (TemplateItemRelPageEntity item : itemIds) {
			itemIdList.add(item.getCheckItemId());
		}
		QueryPreviewParam queryParam = new QueryPreviewParam();
		queryParam.setCheckItemIdList(itemIdList);
		return this.toPreviewItem(queryParam);
	}

	@Override
	public List<CheckItemEntity> getCheckItemsByTemplateId(TemplateIdParam param) {
		List<CheckItemEntity> items = null;
		try {
			items = checkItemDao.queryItemsByTemplateId(param);
		} catch (Exception e) {
			LOG.error("获取检查项出错");
			e.printStackTrace();
			throw new BPException(e,"0","获取检查项出错");
		}
		return items;
	}

	@Override
	public Result<List<CheckTemplatePageEntity>> getAllCheckTemplate() {
		Result<List<CheckTemplatePageEntity>> result = new Result<List<CheckTemplatePageEntity>>();
		try {
			List<CheckTemplatePageEntity> list = checkTemplateDao.getAllCheckTemplate();
			result.setData(list);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询所有检查模板");
		} catch (Exception e) {
			e.printStackTrace();
			throw new BPException(e,"0","查询所有检查模板失败");
		}
		return result;
	}
}
