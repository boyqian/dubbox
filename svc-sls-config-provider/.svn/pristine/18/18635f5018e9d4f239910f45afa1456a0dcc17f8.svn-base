package com.upsoft.sep.sls.config.check.dao;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptRelEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemRelEntity;
import com.upsoft.sep.sls.config.check.param.AddItemOptRelParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemOptParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemPageParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：CheckItemOptRelDao.java<br>
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
public interface CheckItemOptRelDao{
	/**
	 * 分页查询关系
	 * @date 2017年2月24日 下午1:16:53
	 * @author Tao Wang
	 * @param page
	 * @return
	 */
	List<CheckItemOptRelEntity> queryCheckItemOptRels(
            RequestPage<QueryCheckItemPageParam> page);
	/**
	 * 新增关系
	 * 
	 * @author wang meng
	 * @param param
	 */
	void insertItemOptRel(AddItemOptRelParam param);

	/**
	 * 通过optId查询关联ID
	 * 
	 * @author wang meng
	 * @param optId
	 * @return
	 */
	List<CheckItemRelEntity> selectItemOptRelByOptId(String optId);
	

	/**
	 * 删除
	 * 
	 * @author wang meng
	 * @param checkOptId
	 */
	void deleteRelbyCheckOptId(String checkOptId);

	/**
	 * 批量删除
	 * 
	 * @author wang meng
	 * @param param
	 */
	void deleteRelbyCheckOptIdList(DelCheckItemOptParam param);
	
	List<CheckItemOptRelEntity> selectItemRelByItemIds(@Param("checkItemList") List<String> checkItemList);
	
	/**
	 * 根据检查选项id列表查询子检查项
	 * @date 2017年3月29日 下午7:58:41
	 * @author wang meng 
	 * @param optIdlist
	 * @return 
	 */
	List<CheckItemRelEntity> selectItemOptRelByOptIds(@Param("optIdlist") List<String> optIdlist);
}
