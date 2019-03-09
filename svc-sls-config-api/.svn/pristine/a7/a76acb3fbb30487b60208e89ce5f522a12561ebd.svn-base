package com.upsoft.sep.sls.config.check.service;

import com.upsoft.sep.sls.config.check.entity.TemplateItemRelEntity;
import com.upsoft.sep.sls.config.check.param.QueryTemplateItemRelParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;

/**
 * 
* Copyright (c) 2017,重庆扬讯软件技术有限公司<br>
* All rights reserved.<br>
*
* 文件名称：TemplateItemRelService.java<br>
* 摘要：监测模板与检查项的关联关系<br>
* -------------------------------------------------------<br>
* 当前版本：1.1.1<br>
* 作者：Tao Wang <br>
* 完成日期：2017年3月1日<br>
* -------------------------------------------------------<br>
* 取代版本：1.1.0<br>
* 原作者：Tao Wang <br>
* 完成日期：2017年3月1日<br>
 */
@Path("/template/item")
@Produces({ "application/json; charset=UTF-8" })
@Consumes(MediaType.APPLICATION_JSON)
public interface TemplateItemRelService {
	
	public final static String TAG ="/template/item: 模板与检查项关系"; 
	
	/**
	 * 分页查询
	 * @date 2017年3月1日 上午10:47:07
	 * @author Tao Wang
	 * @param page
	 * @return
	 */
	@Path(GlobalRestApiAction.PAGE)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "分页查询检查模板与检查项关系信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<ResponsePage<List<TemplateItemRelEntity>>> queryPage(
            RequestPage<QueryTemplateItemRelParam> page);

}
