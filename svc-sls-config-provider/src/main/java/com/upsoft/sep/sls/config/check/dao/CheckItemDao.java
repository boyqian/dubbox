package com.upsoft.sep.sls.config.check.dao;

import java.util.List;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.config.check.entity.CheckItemEditEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemPageEntity;
import com.upsoft.sep.sls.config.check.param.AddCheckItemParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemByIdsParam;
import com.upsoft.sep.sls.config.check.param.ModCheckItemParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByIdParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByNameParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemPageParam;
import com.upsoft.sep.sls.config.check.param.QuoteCounts;
import com.upsoft.sep.sls.config.check.param.TemplateIdParam;

/**
 * 
 * Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：CheckItemDao.java<br>
 * 摘要：简要描述本文件的内容<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：wang meng <br>
 * 完成日期：2016年10月29日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：wang meng <br>
 * 完成日期：2016年10月29日<br>
 */
public interface CheckItemDao{
	/**
	 * 分页查询检查项
	 * 
	 * @author wang meng
	 * @param page
	 * @return
	 */
	List<CheckItemPageEntity> selectCheckItems(RequestPage<QueryCheckItemPageParam> page);

	/**
	 * 查询检查项 列表
	 * 
	 * @author wang meng
	 * @param param
	 * @return
	 */
	List<CheckItemPageEntity> selectCheckItemList(QueryCheckItemByIdParam param);

	/**
	 * 通过ID查询检查项
	 * 
	 * @author wang meng
	 * @param param
	 * @return
	 */
	CheckItemEditEntity selectCheckItemById(QueryCheckItemByIdParam param);

	/**
	 * 查询列表
	 * 
	 * @date 2017年3月8日 下午1:50:17
	 * @author wang meng
	 * @param checkItems
	 * @return
	 */
	List<CheckItemEntity> selectCheckItemByIds(List<String> checkItems);

	/**
	 * 批量删除检查项
	 * 
	 * @author wang meng
	 * @param parm
	 */
	void deleteItemByIds(DelCheckItemByIdsParam parm);

	/**
	 * 新增检查项
	 * 
	 * @author wang meng
	 * @param param
	 */
	void insertCheckItems(AddCheckItemParam param);

	/**
	 * 编辑检查项
	 * 
	 * @author wang meng
	 * @param param
	 */
	void updateCheckItems(ModCheckItemParam param);

	/**
	 * 通过检查项名查询检查项数
	 * 
	 * @author wang meng
	 * @param param
	 * @return
	 */
	int selectCheckItemCountByName(QueryCheckItemByNameParam param);

	/**
	 * 根据检查模版ID获取检查项
	 * 
	 * @date 2017年3月6日 下午2:58:34
	 * @author wang meng
	 * @param param
	 * @return
	 */
	List<CheckItemEntity> queryItemsByTemplateId(TemplateIdParam param);

	List<QuoteCounts> queryQuoteCounts(List<String> checkItemIdList);


}
