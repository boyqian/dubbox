package com.upsoft.sep.sls.task.service;                  
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
import com.upsoft.sep.sls.task.entity.SlsRunTask;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskAddParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskAndDetailAddParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskAndDetailModParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskDelParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskGetParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskModParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskPageQueryParam;

/**
 * 接口描述信息
 * @author autoCoder
 */
@Path("/task/slsruntask")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ "application/json; charset=UTF-8" })
public interface SlsRunTaskService {
	           public static final String TAG = "/task/slsruntask(task/任务信息相关接口)";
		  
	            @Path(GlobalRestApiAction.DEL)
	            @POST
	            @ApiOperation(hidden = false, value = "删除", notes = "", tags = TAG)
	            public Result<String> delSlsRunTask(SlsRunTaskDelParam slsRunTaskDelParam);
	            
	            
	            /**
	             * 新增调度任务单
	             * @param slsRunTaskAddParam
	             * @return
	             */
		  
	            @Path(GlobalRestApiAction.ADD)
	            @POST
	            @ApiOperation(hidden = false, value = "新增", notes = "", tags = TAG)
	            public Result<String> saveSlsRunTask(SlsRunTaskAddParam slsRunTaskAddParam);
	            
		  
	            @Path(GlobalRestApiAction.MOD)
	            @POST
	            @ApiOperation(hidden = false, value = "修改", notes = "", tags = TAG)
	            public Result<String> updateSlsRunTask(SlsRunTaskModParam slsRunTaskModParam);
	            
		  
	            @Path(GlobalRestApiAction.PAGE)
	            @POST
	            @ApiOperation(hidden = false, value = "分页查询SlsRunTask", notes = "", tags = TAG)
	            public Result<ResponsePage<List<SlsRunTask>>> getPageQuery(RequestPage<SlsRunTaskPageQueryParam> requestPage);
	            
		  
	            @Path(GlobalRestApiAction.GET)
	            @POST
	            @ApiOperation(hidden = false, value = "获取单个", notes = "", tags = TAG)
	            public Result<SlsRunTask> getSlsRunTask(SlsRunTaskGetParam slsRunTaskGetParam);
	            
	            /**
	             * 新增调度任务单(所有类型任务<任务详情>)
	             * @param slsRunTaskAddParam
	             * @return
	             */
	            @Path(GlobalRestApiAction.ADD + "SchedulingTaskList")
	            @POST
	            @ApiOperation(hidden = false, value = "新增调度任务单(所有类型任务<任务详情>)", notes = "", tags = TAG)
	            public Result<String> saveSchedulingTaskList(SlsRunTaskAndDetailAddParam param);
	            
	            /**
	             * 查询任务详情
	             * @param slsRunTaskAddParam
	             * @return
	             */
	            @Path(GlobalRestApiAction.GET + "DetailInfo")
	            @GET
	            @ApiOperation(hidden = false, value = "查询任务详情", notes = "", tags = TAG)
	            public Result<Map<String, Object>> getTaskMap(@QueryParam("taskId") String taskId);
	            
	            /**
	             * 修改任务<详情>信息
	             * @param taskMap
	             * @return
	             */
	            @Path(GlobalRestApiAction.MOD+ "DetailInfo")
	            @POST
	            @ApiOperation(hidden = false, value = "修改任务<详情>信息", notes = "", tags = TAG)
	            public Result<String> updateTaskMap(SlsRunTaskAndDetailModParam param);
	            
	            /**
	             * 修改任务状态
	             * 0-已拟定, 1-已派发, 2-已签收, 3-已退回 , 4-已撤销, 5-已完成
	             * @param param
	             * @return
	             */
	            @Path(GlobalRestApiAction.MOD+ "Status")
	            @GET
	            @ApiOperation(hidden = false, value = "修改任务状态（0-已拟定, 1-已派发, 2-已签收, 3-已退回 , 4-已撤销, 5-已完成）", notes = "", tags = TAG)
	            public Result<String> updateTaskStatus(@QueryParam("taskId") String taskId, @QueryParam("status") Byte status);
	            
	            
	            
	            
	            
}
