package com.upsoft.sep.sls.config.check.dao;

import com.upsoft.sep.sls.config.check.entity.CheckItemOptEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptPageEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptReturnEntity;
import com.upsoft.sep.sls.config.check.entity.CheckOptEditEntity;
import com.upsoft.sep.sls.config.check.param.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * 
* Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
* All rights reserved.<br>
*
* 文件名称：CheckItemOptDao.java<br>
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
public interface CheckItemOptDao{
	/**
	 * 新增检查项选项
	 * @author wang meng 
	 * @param param
	 */
	void insertCheckItemOpt(AddCheckItemOptParam param);
	
	/**
	 * 编辑检查项选项
	 * @author wang meng 
	 * @param param
	 */
	void updateCheckItemOpt(ModCheckItemOptParam param);
	
	/**
	 * 通过ID查询检查选项
	 * @author wang meng 
	 * @param param
	 * @return
	 */
	CheckOptEditEntity selectCheckItemOptById(QueryCheckItemOptByIdParam param);
	/**
	 *通过ID和Name 查询检查选项 
	 * @author wang meng 
	 * @param param
	 * @return
	 */
	List<CheckItemOptEntity> selectCheckItemOptInfo(QueryCheckItemOptByIdAndNameParam param);
	/**
	 * 通过ID查询检查选项列表
	 * @author wang meng 
	 * @param param
	 * @return
	 */
	List<CheckItemOptPageEntity> selectcheckOptList(QueryCheckItemOptByIdsParam param);
	
	/**
	 * 通过ID查询检查选项列表app 以versiontime排序
	 * @author wang meng 
	 * @param param
	 * @return
	 */
	List<CheckItemOptPageEntity> selectcheckOptListApp(QueryCheckItemOptByIdsParam param);
	/**
	 * 根据检查项Id查询检查选项
	 * @date 2016年11月2日 下午5:58:48
	 * @author wang meng 
	 * @param param
	 * @return
	 */
	List<CheckItemOptReturnEntity> selectCheckOptListByItemId(QueryCheckItemByIdParam param);
	/**
	 *批量删除检查选项 
	 * @author wang meng 
	 * @param param
	 */
	void deleteCheckOptByIdList(DelCheckItemOptParam param);

	/**
	 * 根据检查选项id列表查询所有检查项
	 * @date 2017年3月29日 下午8:25:56
	 * @author wang meng 
	 * @param optList
	 * @return 
	 */
	List<CheckItemOptPageEntity> selectcheckOptsList(@Param("itemIdList") List<String> itemIdList);
	
}