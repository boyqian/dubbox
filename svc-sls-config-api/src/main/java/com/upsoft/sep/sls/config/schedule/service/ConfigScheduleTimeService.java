package com.upsoft.sep.sls.config.schedule.service;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
import com.upsoft.sep.sls.config.schedule.entity.ConfigScheduleTime;
import com.upsoft.sep.sls.config.schedule.param.configscheduletime.*;
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
@Path("/schedule/configscheduletime")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({"application/json; charset=UTF-8"})
public interface ConfigScheduleTimeService {
    public static final String TAG = "/schedule/configscheduletime(schedule/调度时间配置)";

    @Path(GlobalRestApiAction.MOD)
    @POST
    @ApiOperation(hidden = false, value = "修改", notes = "", tags = TAG)
    public Result<String> updateConfigScheduleTime(ConfigScheduleTimeModParam configScheduleTimeModParam);


    @Path("/delByid")
    @POST
    @ApiOperation(hidden = false, value = "根据主键删除", notes = "", tags = TAG)
    public Result<String> delConfigScheduleTime(ConfigScheduleTimeDelParam configScheduleTimeDelParam);


    @Path(GlobalRestApiAction.ADD)
    @POST
    @ApiOperation(hidden = false, value = "新增", notes = "", tags = TAG)
    public Result<String> saveConfigScheduleTime(ConfigScheduleTimeAddParam configScheduleTimeAddParam);


    @Path("/getByid")
    @POST
    @ApiOperation(hidden = false, value = "根据主键获取单个", notes = "", tags = TAG)
    public Result<ConfigScheduleTime> getConfigScheduleTime(ConfigScheduleTimeGetParam configScheduleTimeGetParam);


    @Path(GlobalRestApiAction.PAGE)
    @POST
    @ApiOperation(hidden = false, value = "分页查询ConfigScheduleTime", notes = "", tags = TAG)
    public Result<ResponsePage<List<ConfigScheduleTime>>> getPageQuery(RequestPage<ConfigScheduleTimePageQueryParam> requestPage);

}
