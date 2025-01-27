package com.upsoft.sep.sls.grid.service;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
import com.upsoft.sep.sls.grid.entity.SlsGrid;
import com.upsoft.sep.sls.grid.param.slsgrid.*;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 接口描述信息
 *
 * @author autoCoder
 */
@Path("/grid/slsGrid")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({"application/json; charset=UTF-8"})
public interface SlsGridService {
    public static final String TAG = "/grid/slsGrid(grid/网格基本信息)";

    @Path(GlobalRestApiAction.MOD)
    @POST
    @ApiOperation(hidden = false, value = "修改", notes = "", tags = TAG)
    public Result<String> updateSlsGrid(SlsGridModParam slsGridModParam);


    @Path(GlobalRestApiAction.DEL + "ByGridId")
    @POST
    @ApiOperation(hidden = false, value = "删除，包括其关联的监管企业", notes = "", tags = TAG)
    public Result<String> delSlsGrid(SlsGridDelParam slsGridDelParam);


    @Path(GlobalRestApiAction.ADD)
    @POST
    @ApiOperation(hidden = false, value = "新增网格，包括其关联的监管企业", notes = "", tags = TAG)
    public Result<String> saveSlsGrid(SlsGridAddParam slsGridAddParam);


    @Path(GlobalRestApiAction.PAGE)
    @POST
    @ApiOperation(hidden = false, value = "分页查询SlsGrid", notes = "", tags = TAG)
    public Result<ResponsePage<List<SlsGrid>>> getPageQuery(RequestPage<SlsGridPageQueryParam> requestPage);


    @Path("/getGridAndEnterpriseByGridId")
    @POST
    @ApiOperation(hidden = false, value = "获取指定网格及对应企业", notes = "", tags = TAG)
    public Result<GridAndEnterpriseResultParam> getGridAndEnterprise(SlsGridGetParam slsGridGetParam);

    @Path("/getGridTree")
    @POST
    @ApiOperation(hidden = false, value = "获取网格树（参数为空，获取所有）", notes = "", tags = TAG)
    public Result<List<SlsGrid>> getGridTree(GridTreeQueryParam param);

    @Path("/getNextGridList")
    @POST
    @ApiOperation(hidden = false, value = "获取指定网格的下级网格，参数为网格Id（若只获取根节点，请传入 -1）", notes = "", tags = TAG)
    public Result<List<SlsGrid>> getNextGridList(String gridId);

    @Path("/validateGridIfExist")
    @POST
    @ApiOperation(hidden = false, value = "根据参数条件，判断网格是否已经存在", notes = "", tags = TAG)
    public Result<Boolean> validateGridIfExist(ValidateGridIfExistParam param);

}
