package com.upsoft.sep.sls.task.service;                  
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
import com.upsoft.sep.sls.task.entity.SlsDetailTask;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskAddParam;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskDelParam;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskGetParam;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskModParam;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskPageQueryParam;
import io.swagger.annotations.ApiOperation;
import java.util.List;	        	

/**
 * 接口描述信息
 * @author autoCoder
 */
@Path("/task/slsdetailtask")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ "application/json; charset=UTF-8" })
public interface SlsDetailTaskService {
	           public static final String TAG = "/task/slsdetailtask(task/任务详情相关接口)";
		  
	            @Path(GlobalRestApiAction.DEL)
	            @POST
	            @ApiOperation(hidden = false, value = "删除", notes = "", tags = TAG)
	            public Result<String> delSlsDetailTask(SlsDetailTaskDelParam slsDetailTaskDelParam);
	            
		  
	            @Path(GlobalRestApiAction.ADD)
	            @POST
	            @ApiOperation(hidden = false, value = "新增", notes = "", tags = TAG)
	            public Result<String> saveSlsDetailTask(SlsDetailTaskAddParam slsDetailTaskAddParam);
	            
		  
	            @Path(GlobalRestApiAction.MOD)
	            @POST
	            @ApiOperation(hidden = false, value = "修改", notes = "", tags = TAG)
	            public Result<String> updateSlsDetailTask(SlsDetailTaskModParam slsDetailTaskModParam);
	            
		  
	            @Path(GlobalRestApiAction.PAGE)
	            @POST
	            @ApiOperation(hidden = false, value = "分页查询SlsDetailTask", notes = "", tags = TAG)
	            public Result<ResponsePage<List<SlsDetailTask>>> getPageQuery(RequestPage<SlsDetailTaskPageQueryParam> requestPage);
	            
		  
	            @Path(GlobalRestApiAction.GET)
	            @POST
	            @ApiOperation(hidden = false, value = "获取单个", notes = "", tags = TAG)
	            public Result<SlsDetailTask> getSlsDetailTask(SlsDetailTaskGetParam slsDetailTaskGetParam);
	            
}
