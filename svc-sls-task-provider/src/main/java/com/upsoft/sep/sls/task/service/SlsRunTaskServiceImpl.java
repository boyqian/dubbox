package com.upsoft.sep.sls.task.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.bp.common.util.StringUtil;
import com.upsoft.sep.sls.task.dao.SlsDetailTaskDao;
import com.upsoft.sep.sls.task.dao.SlsRunTaskDao;
import com.upsoft.sep.sls.task.entity.SlsDetailTask;
import com.upsoft.sep.sls.task.entity.SlsRunTask;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskAddParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskAndDetailAddParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskAndDetailModParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskDelParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskGetParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskModParam;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskPageQueryParam;

public class SlsRunTaskServiceImpl implements SlsRunTaskService {
	
	private static final LogHandler LOG = LogHandler.getLogHandler(SlsRunTaskServiceImpl.class);
	
	@Autowired
	private SlsRunTaskDao slsRunTaskDao;
	
	@Autowired
	private SlsDetailTaskDao slsDetailTaskDao;
		
	/**
	 * 根据主键删除SlsRunTask
	 */
	@Override
	public Result<String> delSlsRunTask(SlsRunTaskDelParam slsRunTaskDelParam) {
		//参数校验
		delParamValidate(slsRunTaskDelParam);
		
		try {
			//删除SlsRunTask					
			 slsRunTaskDao.delete(slsRunTaskDelParam.getId());
			return new Result<String>(Result.STATUS_SUCCES, null, "删除SlsRunTask成功！", null);
		} catch (Exception e) {
			LOG.error("删除SlsRunTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "删除SlsRunTask失败！", null);
		}
	}
		
	
	/**
	 * 删除SlsRunTask参数校验
	 * 
	 * @param slsRunTaskDelParam
	 */
	public void delParamValidate(SlsRunTaskDelParam slsRunTaskDelParam){
			Assert.notNull(slsRunTaskDelParam, "参数错误");
            Assert.notNull(slsRunTaskDelParam.getId(), "参数错误");
	}
	
	/**
	 * 新增SlsRunTask
	 */
	@Override
	public Result<String> saveSlsRunTask(SlsRunTaskAddParam slsRunTaskAddParam) {
		//参数校验
		addParamValidate(slsRunTaskAddParam);
		
		//保存数据		
		try {			
			SlsRunTask slsRunTask = new SlsRunTask();
			BeanUtils.copyProperties(slsRunTask, slsRunTaskAddParam);
			slsRunTask.setId(StringUtil.uuid());
			slsRunTask.setCreateTime(new Date());
			slsRunTaskDao.insert(slsRunTask);	
			return new Result<String>(Result.STATUS_SUCCES, null, "新增slsRunTask成功！", null);
		} catch (Exception e) {
			LOG.error("新增slsRunTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "新增slsRunTask失败！", null);
		}
	} 
	
		
	/**
	 * 新增SlsRunTask参数校验
	 * 
	 * @param slsRunTaskAddParam
	 */
	public void addParamValidate(SlsRunTaskAddParam slsRunTaskAddParam){
			Assert.notNull(slsRunTaskAddParam, "参数错误");
	}
	
	/**
	 * 修改SlsRunTask信息	
	 */
	@Override
	public Result<String> updateSlsRunTask(SlsRunTaskModParam slsRunTaskModParam) {
		//参数校验
		modParamValidate(slsRunTaskModParam);
		
		//修改数据		
		try {
		    SlsRunTask slsRunTask = new SlsRunTask();
            BeanUtils.copyProperties(slsRunTask, slsRunTaskModParam);
            slsRunTask.setUpdateTime(new Date());
		    slsRunTaskDao.update(slsRunTask);
		    return new Result<String>(Result.STATUS_SUCCES, null, "修改slsRunTask成功！", null);
		} catch (Exception e) {
			LOG.error("修改SlsRunTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "修改SlsRunTask失败！", null);
		}
	}
	
	/**
	 * 修改SlsRunTask参数校验
	 * 
	 * @param slsRunTaskModParam
	 */
	public void modParamValidate(SlsRunTaskModParam slsRunTaskModParam){
		Assert.notNull(slsRunTaskModParam, "参数错误");
		Assert.notNull(slsRunTaskModParam.getId(), "参数错误");
		
	}
	
	/**
	 * SlsRunTask分页查询
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Result<ResponsePage<List<SlsRunTask>>> getPageQuery(RequestPage<SlsRunTaskPageQueryParam> requestPage) {
		
		Result<ResponsePage<List<SlsRunTask>>> result = new Result<ResponsePage<List<SlsRunTask>>>();
		try {
			List<SlsRunTask> slsRunTaskList = slsRunTaskDao.getPageSlsRunTask(requestPage);
			ResponsePage<List<SlsRunTask>> responsePage = requestPage.toResponsePage();
			responsePage.setData(slsRunTaskList);
			result.setStatus(Result.STATUS_SUCCES);
			result.setData(responsePage);
			result.setMsg("查询SlsRunTask列表成功！");
		} catch (Exception e) {
			LOG.error("查询SlsRunTask列表失败！", e);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg("查询SlsRunTask列表失败！");
		}		
		return result;
	}
	
	/**
	 * SlsRunTask分页查询参数校验
	 * @param requestPage
	 */
	public void pageQueryParamValidate(RequestPage<SlsRunTaskPageQueryParam> requestPage){
		Assert.notNull(requestPage, "参数错误");		
	}
	
	/**
	 * 查询SlsRunTask信息
	 */
	@Override
	public Result<SlsRunTask> getSlsRunTask(SlsRunTaskGetParam slsRunTaskGetParam) {

		
		Result<SlsRunTask> result = new Result<SlsRunTask>();
		try {
			SlsRunTask slsRunTask = slsRunTaskDao.getSlsRunTask(slsRunTaskGetParam.getId());
			result.setStatus(Result.STATUS_SUCCES);
			result.setData(slsRunTask);
			result.setMsg("查询slsRunTask成功");
		} catch (Exception e) {
			LOG.error("查询slsRunTask失败", e);			
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg("查询slsRunTask失败");
		}
		return result;
	}
	
	/**
	 * 查询SlsRunTask参数校验
	 * 
	 * @param slsRunTaskGetParam
	 */
	public void getParamValidate(SlsRunTaskGetParam slsRunTaskGetParam){
		Assert.notNull(slsRunTaskGetParam, "参数错误");
        Assert.notNull(slsRunTaskGetParam.getId(), "参数错误");
		
	}

	/**
	 * 新增调度任务单
	 */
	@Override
	public Result<String> saveSchedulingTaskList(
			SlsRunTaskAndDetailAddParam param) {
		//保存数据		
		try {			
			//保存任务信息
			SlsRunTask slsRunTask = new SlsRunTask();
			BeanUtils.copyProperties(slsRunTask, param);
			String taskId = StringUtil.uuid();
			Date createTime = new Date();
			slsRunTask.setId(taskId);
			slsRunTask.setCreateTime(createTime);
			slsRunTaskDao.insert(slsRunTask);	
			
			//保存任务详情信息
			SlsDetailTask detailTask = new SlsDetailTask();
			BeanUtils.copyProperties(detailTask, param);
			detailTask.setId(StringUtil.uuid());
			detailTask.setTaskId(taskId);
			detailTask.setCreateTime(createTime);
			slsDetailTaskDao.insert(detailTask);
			return new Result<String>(Result.STATUS_SUCCES, null, "新增任务成功！", null);
		} catch (Exception e) {
			LOG.error("新增任务失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "新增任务失败！", null);
		}
	}

	
	/**
	 * 查询任务详情map
	 */

	@Override
	public Result<Map<String, Object>> getTaskMap(String taskId) {
		Result<Map<String, Object>> res = new Result<Map<String,Object>>();
		try {
			Map<String, Object> taskMap = slsRunTaskDao.getTaskMap(taskId);
			res.setData(taskMap);
			res.setStatus(Result.STATUS_SUCCES);
			res.setMsg("查询任务成功");
			return res;
		} catch (Exception e) {
			LOG.error("查询任务失败", e);
			res.setStatus(Result.STATUS_ERROR);
			res.setMsg("查询任务失败");
			return res;
		}
		
	}

	
	/**
	 * 修改任务详情接口
	 */

	@Override
	public Result<String> updateTaskMap(SlsRunTaskAndDetailModParam taskParam) {
			try {
				String taskId = taskParam.getTaskId();
				if(StringUtils.isEmpty(taskId)){
					LOG.info("任务id为空");
					return new Result<String>(Result.STATUS_SUCCES, null, "任务id为空", null);
				}
				//修改任务信息
				SlsRunTask slsRunTask = new SlsRunTask();
				BeanUtils.copyProperties(slsRunTask, taskParam);
				Date updateTime = new Date();
				slsRunTask.setUpdateTime(updateTime);;
				slsRunTaskDao.update(slsRunTask);	
				
				//修改任务详情信息
				SlsDetailTask detailTask = new SlsDetailTask();
				BeanUtils.copyProperties(detailTask, taskParam);
				detailTask.setUpdateTime(updateTime);
				slsDetailTaskDao.update(detailTask);
				return new Result<String>(Result.STATUS_SUCCES, null, "修改任务成功！", null);
			} catch (Exception e) {
				LOG.error("修改任务失败", e);
				return new Result<String>(Result.STATUS_ERROR, null, "修改任务失败！", null);
			}
	}


	/**
	 * 修改任务状态
	 */
	@Override
	public Result<String> updateTaskStatus(String taskId, Byte status) {
		try {
			SlsRunTask runTask = slsRunTaskDao.getSlsRunTask(taskId);
			runTask.setStatus(status);
			runTask.setUpdateTime(new Date());
			slsRunTaskDao.update(runTask);
			return new Result<String>(Result.STATUS_SUCCES, null, "修改任务状态成功！", null);
		} catch (Exception e) {
			LOG.error("修改任务状态失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "修改任务状态失败！", null);
		}
	}
	
}
