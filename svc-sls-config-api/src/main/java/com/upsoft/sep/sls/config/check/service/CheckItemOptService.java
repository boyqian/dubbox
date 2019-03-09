package com.upsoft.sep.sls.config.check.service;

import com.upsoft.sep.sls.config.check.entity.CheckItemOptEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptPageEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemOptRelEntity;
import com.upsoft.sep.sls.config.check.entity.CheckOptEditEntity;
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
import com.upsoft.sep.sls.config.check.param.AddCheckItemOptParam;
import com.upsoft.sep.sls.config.check.param.CheckItemIdsParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemOptParam;
import com.upsoft.sep.sls.config.check.param.ModCheckItemOptParam;
import com.upsoft.sep.sls.config.check.param.MoveOptParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemOptByIdAndNameParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemOptByIdParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemOptByIdsParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemPageParam;
/**
 * 
* Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
* All rights reserved.<br>
*
* 文件名称：CheckItemOptService.java<br>
* 摘要：检查选项接口类<br>
* -------------------------------------------------------<br>
* 当前版本：1.1.1<br>
* 作者：wang meng <br>
* 完成日期：2016年10月31日<br>
* -------------------------------------------------------<br>
* 取代版本：1.1.0<br>
* 原作者：wang meng <br>
* 完成日期：2016年10月31日<br>
 */
@Path("/check/checkitemoption")
@Produces({ "application/json; charset=UTF-8" })
@Consumes(MediaType.APPLICATION_JSON)
public interface CheckItemOptService {

	public static final String TAG = "/checkItemOption : 巡查配置——检查选项";

	@Path(GlobalRestApiAction.GET + "ByIdAndOptName")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemOptEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据checkItemId和optName查询检查项选项信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<CheckItemOptEntity> getCheckItemOptByIdAndOptName(
            QueryCheckItemOptByIdAndNameParam page);
	
	@Path(GlobalRestApiAction.PAGE+"CheckItemOptRel")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "分页查询检查项和检查项选项关联关系信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<ResponsePage<List<CheckItemOptRelEntity>>> queryPageCheckItemOptRel(
            RequestPage<QueryCheckItemPageParam> page);
	
	
	
	@Path(GlobalRestApiAction.GET + "ById")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemOptEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据optId查询检查项选项信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<CheckOptEditEntity> getCheckItemOptById(
            QueryCheckItemOptByIdParam param);
	
	
//	@Path(GlobalRestApiAction.GET + "ByIds")
//	@POST
//	@Produces({ "application/json; charset=UTF-8" })
//	@ApiResponse(response = CheckItemOptEntity.class, code = 0, message = "")
//	@ApiOperation(hidden = false, value = "根据checkItemid列表查询检查项选项信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<CheckItemOptPageEntity>> getCheckItemOptByIds(
            CheckItemIdsParam param);
	
	
	@Path(GlobalRestApiAction.ADD)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemOptEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "新增检查项选项信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> addCheckItemOpt(AddCheckItemOptParam param);
	
	@Path(GlobalRestApiAction.LIST)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "查询检查项选项信息 list", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public  Result<List<CheckItemOptPageEntity>> queryCheckItemOptList(QueryCheckItemOptByIdsParam param);
	
	
	@Path(GlobalRestApiAction.LIST+"App")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "手机端查询检查项选项信息 list 以versionTime排序", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public  Result<List<CheckItemOptPageEntity>> queryCheckItemOptListApp(QueryCheckItemOptByIdsParam param);
	
	@Path(GlobalRestApiAction.MOD)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "编辑检查项选项信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public  Result<Boolean> modCheckItemOptById(ModCheckItemOptParam param);
	
	@Path(GlobalRestApiAction.DEL_BY+"Ids")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "删除检查项选项信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public  Result<Boolean> deleteCheckItemOptById(DelCheckItemOptParam param);
	
	@Path("move")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "移动检查项选项信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public  Result<Boolean> moveCheckItemOptById(MoveOptParam param);

}
