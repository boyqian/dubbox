package com.upsoft.sep.sls.config.check.service;

import com.upsoft.sep.sls.config.check.entity.CheckItemEditEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemEntity;
import com.upsoft.sep.sls.config.check.entity.CheckItemPageEntity;
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
import com.upsoft.sep.sls.config.check.param.AddCheckItemParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemByIdsParam;
import com.upsoft.sep.sls.config.check.param.ModCheckItemParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByIdParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByIdsParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemByNameParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckItemPageParam;

@Path("/check/checkitem")
@Produces({ "application/json; charset=UTF-8" })
@Consumes(MediaType.APPLICATION_JSON)
public interface CheckItemService {
	public static final String TAG = "/checkItem : 巡查配置——检查项";

	/**
	 * 分页查询
	 * 
	 * @date 2017年3月8日 下午1:45:09
	 * @author wang meng
	 * @param page
	 * @return
	 */
	@Path(GlobalRestApiAction.PAGE)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "分页查询检查项信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<ResponsePage<List<CheckItemPageEntity>>> queryPage(RequestPage<QueryCheckItemPageParam> page);

	/**
	 * 新增
	 * 
	 * @date 2017年3月8日 下午1:45:26
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.ADD)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "新增检查项", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> addChekItem(AddCheckItemParam param);

	/**
	 * 编辑修改
	 * 
	 * @date 2017年3月8日 下午1:45:35
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.MOD)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "编辑检查项", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> modChekItem(ModCheckItemParam param);

	/**
	 * 查询列表
	 * 
	 * @date 2017年3月8日 下午1:45:43
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.LIST + "ExceptCheckItemId")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemPageEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "查询检查项(不包含自己)", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<CheckItemPageEntity>> queryChekItemList(QueryCheckItemByIdParam param);

	/**
	 * 查询
	 * 
	 * @date 2017年3月8日 下午1:45:55
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.GET_BY + "Id")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemPageEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据ID查询检查项", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<CheckItemEditEntity> queryChekItemById(QueryCheckItemByIdParam param);

	/**
	 * 根据id列表查询
	 * 
	 * @date 2017年3月8日 下午1:48:19
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.LIST_BY + "Ids")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemPageEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据ID查询检查项列表", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<CheckItemEntity>> queryChekItemByIds(QueryCheckItemByIdsParam param);

	@Path(GlobalRestApiAction.GET_BY + "Name")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemPageEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据选项名查询检查项数量", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Integer> queryChekItemByName(QueryCheckItemByNameParam param);

	@Path(GlobalRestApiAction.DEL_BY + "Ids")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemPageEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "批量删除", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> deleteChekItemByIds(DelCheckItemByIdsParam param);

}
