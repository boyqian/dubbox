package com.upsoft.sep.sls.task.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.bp.common.util.StringUtil;
import org.apache.commons.beanutils.BeanUtils;

import com.upsoft.sep.sls.task.dao.SlsDetailTaskDao;
import com.upsoft.sep.sls.task.entity.SlsDetailTask;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskAddParam;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskDelParam;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskGetParam;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskModParam;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskPageQueryParam;

public class SlsDetailTaskServiceImpl implements SlsDetailTaskService {
	
	private static final LogHandler LOG = LogHandler.getLogHandler(SlsDetailTaskServiceImpl.class);
	
	@Autowired
	private SlsDetailTaskDao slsDetailTaskDao;
		
	/**
	 * 根据主键删除SlsDetailTask
	 */
	@Override
	public Result<String> delSlsDetailTask(SlsDetailTaskDelParam slsDetailTaskDelParam) {
		//参数校验
		delParamValidate(slsDetailTaskDelParam);
		
		try {
			//删除SlsDetailTask					
			 slsDetailTaskDao.delete(slsDetailTaskDelParam.getId());
			return new Result<String>(Result.STATUS_SUCCES, null, "删除SlsDetailTask成功！", null);
		} catch (Exception e) {
			LOG.error("删除SlsDetailTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "删除SlsDetailTask失败！", null);
		}
	}
		
	
	/**
	 * 删除SlsDetailTask参数校验
	 * 
	 * @param slsDetailTaskDelParam
	 */
	public void delParamValidate(SlsDetailTaskDelParam slsDetailTaskDelParam){
			Assert.notNull(slsDetailTaskDelParam, "参数错误");
            Assert.notNull(slsDetailTaskDelParam.getId(), "参数错误");
	}
	
	/**
	 * 新增SlsDetailTask
	 */
	@Override
	public Result<String> saveSlsDetailTask(SlsDetailTaskAddParam slsDetailTaskAddParam) {
		//参数校验
		addParamValidate(slsDetailTaskAddParam);
		
		//保存数据		
		try {			
			SlsDetailTask slsDetailTask = new SlsDetailTask();
			BeanUtils.copyProperties(slsDetailTask, slsDetailTaskAddParam);
			slsDetailTask.setId(StringUtil.uuid());
			slsDetailTask.setCreateTime(new Date());
			slsDetailTaskDao.insert(slsDetailTask);	
			return new Result<String>(Result.STATUS_SUCCES, null, "新增slsDetailTask成功！", null);
		} catch (Exception e) {
			LOG.error("新增slsDetailTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "新增slsDetailTask失败！", null);
		}
	} 
	
		
	/**
	 * 新增SlsDetailTask参数校验
	 * 
	 * @param slsDetailTaskAddParam
	 */
	public void addParamValidate(SlsDetailTaskAddParam slsDetailTaskAddParam){
			Assert.notNull(slsDetailTaskAddParam, "参数错误");
	}
	
	/**
	 * 修改SlsDetailTask信息	
	 */
	@Override
	public Result<String> updateSlsDetailTask(SlsDetailTaskModParam slsDetailTaskModParam) {
		//参数校验
		modParamValidate(slsDetailTaskModParam);
		
		//修改数据		
		try {
		    SlsDetailTask slsDetailTask = new SlsDetailTask();
            BeanUtils.copyProperties(slsDetailTask, slsDetailTaskModParam);
            slsDetailTask.setUpdateTime(new Date());
		    slsDetailTaskDao.update(slsDetailTask);
		    return new Result<String>(Result.STATUS_SUCCES, null, "修改slsDetailTask成功！", null);
		} catch (Exception e) {
			LOG.error("修改SlsDetailTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "修改SlsDetailTask失败！", null);
		}
	}
	
	/**
	 * 修改SlsDetailTask参数校验
	 * 
	 * @param slsDetailTaskModParam
	 */
	public void modParamValidate(SlsDetailTaskModParam slsDetailTaskModParam){
		Assert.notNull(slsDetailTaskModParam, "参数错误");
		Assert.notNull(slsDetailTaskModParam.getId(), "参数错误");
		
	}
	
	/**
	 * SlsDetailTask分页查询
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Result<ResponsePage<List<SlsDetailTask>>> getPageQuery(RequestPage<SlsDetailTaskPageQueryParam> requestPage) {
		
		Result<ResponsePage<List<SlsDetailTask>>> result = new Result<ResponsePage<List<SlsDetailTask>>>();
		try {
			List<SlsDetailTask> slsDetailTaskList = slsDetailTaskDao.getPageSlsDetailTask(requestPage);
			ResponsePage<List<SlsDetailTask>> responsePage = requestPage.toResponsePage();
			responsePage.setData(slsDetailTaskList);
			result.setStatus(Result.STATUS_SUCCES);
			result.setData(responsePage);
			result.setMsg("查询SlsDetailTask列表成功！");
		} catch (Exception e) {
			LOG.error("查询SlsDetailTask列表失败！", e);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg("查询SlsDetailTask列表失败！");
		}		
		return result;
	}
	
	/**
	 * SlsDetailTask分页查询参数校验
	 * @param requestPage
	 */
	public void pageQueryParamValidate(RequestPage<SlsDetailTaskPageQueryParam> requestPage){
		Assert.notNull(requestPage, "参数错误");		
	}
	
	/**
	 * 查询SlsDetailTask信息
	 */
	@Override
	public Result<SlsDetailTask> getSlsDetailTask(SlsDetailTaskGetParam slsDetailTaskGetParam) {

		
		Result<SlsDetailTask> result = new Result<SlsDetailTask>();
		try {
			SlsDetailTask slsDetailTask = slsDetailTaskDao.getSlsDetailTask(slsDetailTaskGetParam.getId());
			result.setStatus(Result.STATUS_SUCCES);
			result.setData(slsDetailTask);
			result.setMsg("查询slsDetailTask成功");
		} catch (Exception e) {
			LOG.error("查询slsDetailTask失败", e);			
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg("查询slsDetailTask失败");
		}
		return result;
	}
	
	/**
	 * 查询SlsDetailTask参数校验
	 * 
	 * @param slsDetailTaskGetParam
	 */
	public void getParamValidate(SlsDetailTaskGetParam slsDetailTaskGetParam){
		Assert.notNull(slsDetailTaskGetParam, "参数错误");
        Assert.notNull(slsDetailTaskGetParam.getId(), "参数错误");
		
	}
	
}
