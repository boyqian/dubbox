package com.upsoft.sep.sls.grid.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
import com.upsoft.sep.sls.grid.entity.GridEnterprise;
import com.upsoft.sep.sls.grid.entity.SlsGrid;
import com.upsoft.sep.sls.grid.param.gridenterprise.*;
import io.swagger.annotations.ApiOperation;


import java.util.List;

/**
 * 接口描述信息
 *
 * @author autoCoder
 */
@Path("/grid/gridEnterprise")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({"application/json; charset=UTF-8"})
public interface GridEnterpriseService {
    public static final String TAG = "/grid/gridEnterprise(grid/网格关联的企业)";

    @Path(GlobalRestApiAction.DEL + "ByGridId")
    @POST
    @ApiOperation(hidden = false, value = "根据网格id删除企业数据", notes = "", tags = TAG)
    public Result<String> delGridEnterpriseByGridId(GridEnterpriseDelParam gridEnterpriseDelParam);


    @Path(GlobalRestApiAction.ADD)
    @POST
    @ApiOperation(hidden = false, value = "新增", notes = "", tags = TAG)
    public Result<String> saveGridEnterprise(GridEnterpriseAddParam gridEnterpriseAddParam);

    @Path("addBatch")
    @POST
    @ApiOperation(hidden = false, value = "批量新增", notes = "", tags = TAG)
    public Result<String> saveGridEnterpriseList(List<GridEnterprise> gridEnterpriseList,String gridId,String gridName);


    @Path(GlobalRestApiAction.MOD)
    @POST
    @ApiOperation(hidden = false, value = "修改", notes = "", tags = TAG)
    public Result<String> updateGridEnterprise(GridEnterpriseModParam gridEnterpriseModParam);


    @Path(GlobalRestApiAction.GET + "ById")
    @POST
    @ApiOperation(hidden = false, value = "获取单个", notes = "", tags = TAG)
    public Result<GridEnterprise> getGridEnterprise(GridEnterpriseGetParam gridEnterpriseGetParam);


    @Path("/getByGridId")
    @POST
    @ApiOperation(hidden = false, value = "根据网格id获取所属企业列表", notes = "", tags = TAG)
    public Result<List<GridEnterprise>> getGridEnterpriseByGridId(GridEnterpriseGetByGridParam gridEnterpriseGetParam);


    @Path(GlobalRestApiAction.PAGE)
    @POST
    @ApiOperation(hidden = false, value = "分页查询GridEnterprise", notes = "", tags = TAG)
    public Result<ResponsePage<List<GridEnterprise>>> getPageQuery(RequestPage<GridEnterpriseQueryParam> requestPage);

    @Path("/getGridByEnterprise")
    @POST
    @ApiOperation(hidden = false, value = "根据企业查询其所在网格", notes = "", tags = TAG)
    public Result<List<SlsGrid>> getGridByEnterprise(GridEnterpriseQueryParam param);

}
