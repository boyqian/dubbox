package com.upsoft.sep.sls.config.check.service;

import com.upsoft.sep.sls.config.check.entity.CheckItemEntity;
import com.upsoft.sep.sls.config.check.entity.CheckTemplateEditEntity;
import com.upsoft.sep.sls.config.check.entity.CheckTemplatePageEntity;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
import com.upsoft.sep.sls.config.check.entity.TemplateItemRelPageEntity;
import com.upsoft.sep.sls.config.check.param.AddCheckTemplateParam;
import com.upsoft.sep.sls.config.check.param.DelCheckItemByIdsParam;
import com.upsoft.sep.sls.config.check.param.DelCheckTemplateByIdParam;
import com.upsoft.sep.sls.config.check.param.ModCheckTemplateParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckTemplateByIdParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckTemplateListIdsParam;
import com.upsoft.sep.sls.config.check.param.QueryCheckTemplatePageParam;
import com.upsoft.sep.sls.config.check.param.QueryPreviewParam;
import com.upsoft.sep.sls.config.check.param.TemplateIdParam;

@Path("/check/checktemplate")
@Produces({ "application/json; charset=UTF-8" })
@Consumes(MediaType.APPLICATION_JSON)
public interface CheckTemplateService {
	public final static String TAG ="/checkTemplate : 巡查配置——检查模板";

	/**
	 * 分页查询
	 * @date 2017年2月15日 上午11:05:15
	 * @author wang meng
	 * @param page
	 * @return
	 */
	@Path(GlobalRestApiAction.PAGE)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "分页查询检查模板信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<ResponsePage<List<CheckTemplatePageEntity>>> queryPage(
            RequestPage<QueryCheckTemplatePageParam> page);



	/**
	 * 根据ＩＤ查询模版信息
	 * @date 2017年2月15日 上午11:04:54
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.GET_BY+"TemplateId")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckTemplateEditEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据模板ID 查模板信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<CheckTemplateEditEntity> queryCheckTemplateEntity(QueryCheckTemplateByIdParam param);

	/**
	 * 批量查询模版
	 * @date 2017年2月15日 上午11:04:07
	 * @author wang meng
	 * @param param 模版的ids
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"ListByTemplateId")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Map.class, code = 0, message = "<id,name>")
	@ApiOperation(hidden = false, value = "根据模板ID 查模板信息（批量）", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Map<String,String>> queryCheckTemplateListByIds(QueryCheckTemplateListIdsParam param);

	/**
	 * 新增模版
	 * @date 2017年2月15日 上午11:03:46
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.ADD+"Template")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "新增模版", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> addCheckTemplateEntity(AddCheckTemplateParam param);

	/**
	 * 修改模信息
	 * @date 2017年2月15日 上午11:03:35
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.MOD)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "编辑模板信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> modTemplateItem(ModCheckTemplateParam param);

	/**
	 *根据检查模版查询相关的检查项
	 * @date 2017年2月15日 上午11:02:06
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"CheckItemList")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据检查模版查询相关的检查项", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<TemplateItemRelPageEntity>> QueryTemplateItemRel(QueryCheckTemplateByIdParam param);

	/**
	 * 删除与检查模版相关的检查项
	 * @date 2017年2月15日 上午11:01:41
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.DEL+"RelByCheckItemId")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "删除与检查模版相关的检查项", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> deleteRelByCheckItemId(DelCheckItemByIdsParam param);

	/**
	 * 删除模版
	 * @date 2017年2月15日 上午11:01:34
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.DEL+"TemplateById")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "删除关联信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> deleteTemplateById(DelCheckTemplateByIdParam param);

	/**
	 * 获取预览数据
	 * @date 2017年2月15日 上午11:00:55
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"PreviewItem")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "获取预览数据", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<Object[]>> toPreviewItem(QueryPreviewParam param);

	/**
	 * 根据检查模版ID获取所有的检查项
	 * @date 2017年3月6日 下午2:43:19
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"checkItems")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = CheckItemEntity.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "获取检查模版的所有检查项", notes = "", tags = TAG)
	public List<CheckItemEntity> getCheckItemsByTemplateId(TemplateIdParam param);

	/**
	 * 根据检查模版获取检查项
	 * @date 2017年2月15日 上午11:01:06
	 * @author wang meng
	 * @param param
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"CheckItemsByTemplateId")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据检查模版获取检查项", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	@Deprecated
	public Result<List<Object[]>> getTaskCheckItems(QueryCheckTemplateByIdParam param);

	/**
	 * 查询所有检查模板
	 * @date 2017年3月17日 上午10:04:58
	 * @author IT_Debug
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"AllCheckTemplate")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "查询所有检查模板", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<CheckTemplatePageEntity>> getAllCheckTemplate();

}
