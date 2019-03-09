package com.upsoft.sep.sls.config.check.service;

import java.util.Date;
import java.util.List;

import com.upsoft.sep.sls.config.check.dao.TemplateItemRelDao;
import com.upsoft.sep.sls.config.check.entity.TemplateItemRelEntity;
import com.upsoft.sep.sls.config.check.param.QueryTemplateItemRelParam;
import org.springframework.beans.factory.annotation.Autowired;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.exception.BPException;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.sls.config.check.base.CheckBaseConst;

/**
 * 
* Copyright (c) 2017,重庆扬讯软件技术有限公司<br>
* All rights reserved.<br>
*
* 文件名称：TemplateItemRelServiceImpl.java<br>
* 摘要：查询检查项与模板关联关系<br>
* -------------------------------------------------------<br>
* 当前版本：1.1.1<br>
* 作者：Tao Wang <br>
* 完成日期：2017年3月1日<br>
* -------------------------------------------------------<br>
* 取代版本：1.1.0<br>
* 原作者：Tao Wang <br>
* 完成日期：2017年3月1日<br>
 */
public class TemplateItemRelServiceImpl implements TemplateItemRelService {
	LogHandler LOG=LogHandler.getLogHandler(TemplateItemRelServiceImpl.class);
	@Autowired
	private TemplateItemRelDao templateItemRelDao;
    /**
     * 分页查询
     */
	@SuppressWarnings({ "unchecked" })
	@Override
	public Result<ResponsePage<List<TemplateItemRelEntity>>> queryPage(RequestPage<QueryTemplateItemRelParam> page) {
		Result<ResponsePage<List<TemplateItemRelEntity>>> result = new Result<ResponsePage<List<TemplateItemRelEntity>>>();
		try {
			QueryTemplateItemRelParam param = page.getParam();
			if(null!=param&&null!=param.getVersionTime()){
				param.setVersionTimeDate(new Date(param.getVersionTime()));
			}
			List<TemplateItemRelEntity> templates=templateItemRelDao.page(page);
			ResponsePage<List<TemplateItemRelEntity>> rPage = page.toResponsePage();
			rPage.setData(templates);
			result.setData(rPage);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
		} catch (Exception e) {
			LOG.error("获取检查模板和检查项关联关系失败。",e);
			throw new BPException(e,"0","获取检查模板和检查项关联关系失败。");
		}
		return result;
	}

}
