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
import com.upsoft.sep.sls.task.entity.SlsHistoryTask;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskAddParam;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskDelParam;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskGetParam;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskModParam;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskPageQueryParam;
import io.swagger.annotations.ApiOperation;
import java.util.List;	        	

/**
 * 接口描述信息
 * @author autoCoder
 */
@Path("/task/slshistorytask")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({ "application/json; charset=UTF-8" })
public interface SlsHistoryTaskService {
	           public static final String TAG = "/task/slshistorytask(task/任务操作相关接口)";
		  
	            @Path(GlobalRestApiAction.DEL)
	            @POST
	            @ApiOperation(hidden = false, value = "删除", notes = "", tags = TAG)
	            public Result<String> delSlsHistoryTask(SlsHistoryTaskDelParam slsHistoryTaskDelParam);
	            
		  
	            @Path(GlobalRestApiAction.ADD)
	            @POST
	            @ApiOperation(hidden = false, value = "新增", notes = "", tags = TAG)
	            public Result<String> saveSlsHistoryTask(SlsHistoryTaskAddParam slsHistoryTaskAddParam);
	            
		  
	            @Path(GlobalRestApiAction.MOD)
	            @POST
	            @ApiOperation(hidden = false, value = "修改", notes = "", tags = TAG)
	            public Result<String> updateSlsHistoryTask(SlsHistoryTaskModParam slsHistoryTaskModParam);
	            
		  
	            @Path(GlobalRestApiAction.GET)
	            @POST
	            @ApiOperation(hidden = false, value = "获取单个", notes = "", tags = TAG)
	            public Result<SlsHistoryTask> getSlsHistoryTask(SlsHistoryTaskGetParam slsHistoryTaskGetParam);
	            
		  
	            @Path(GlobalRestApiAction.PAGE)
	            @POST
	            @ApiOperation(hidden = false, value = "分页查询SlsHistoryTask", notes = "", tags = TAG)
	            public Result<ResponsePage<List<SlsHistoryTask>>> getPageQuery(RequestPage<SlsHistoryTaskPageQueryParam> requestPage);
	            
}
