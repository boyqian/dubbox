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

import com.upsoft.sep.sls.task.dao.SlsHistoryTaskDao;
import com.upsoft.sep.sls.task.entity.SlsHistoryTask;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskAddParam;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskDelParam;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskGetParam;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskModParam;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskPageQueryParam;

public class SlsHistoryTaskServiceImpl implements SlsHistoryTaskService {
	
	private static final LogHandler LOG = LogHandler.getLogHandler(SlsHistoryTaskServiceImpl.class);
	
	@Autowired
	private SlsHistoryTaskDao slsHistoryTaskDao;
		
	/**
	 * 根据主键删除SlsHistoryTask
	 */
	@Override
	public Result<String> delSlsHistoryTask(SlsHistoryTaskDelParam slsHistoryTaskDelParam) {
		//参数校验
		delParamValidate(slsHistoryTaskDelParam);
		
		try {
			//删除SlsHistoryTask					
			 slsHistoryTaskDao.delete(slsHistoryTaskDelParam.getId());
			return new Result<String>(Result.STATUS_SUCCES, null, "删除SlsHistoryTask成功！", null);
		} catch (Exception e) {
			LOG.error("删除SlsHistoryTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "删除SlsHistoryTask失败！", null);
		}
	}
		
	
	/**
	 * 删除SlsHistoryTask参数校验
	 * 
	 * @param slsHistoryTaskDelParam
	 */
	public void delParamValidate(SlsHistoryTaskDelParam slsHistoryTaskDelParam){
			Assert.notNull(slsHistoryTaskDelParam, "参数错误");
            Assert.notNull(slsHistoryTaskDelParam.getId(), "参数错误");
	}
	
	/**
	 * 新增SlsHistoryTask
	 */
	@Override
	public Result<String> saveSlsHistoryTask(SlsHistoryTaskAddParam slsHistoryTaskAddParam) {
		//参数校验
		addParamValidate(slsHistoryTaskAddParam);
		
		//保存数据		
		try {			
			SlsHistoryTask slsHistoryTask = new SlsHistoryTask();
			BeanUtils.copyProperties(slsHistoryTask, slsHistoryTaskAddParam);
			slsHistoryTask.setId(StringUtil.uuid());
			slsHistoryTask.setCreateTime(new Date());
			slsHistoryTaskDao.insert(slsHistoryTask);	
			return new Result<String>(Result.STATUS_SUCCES, null, "新增slsHistoryTask成功！", null);
		} catch (Exception e) {
			LOG.error("新增slsHistoryTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "新增slsHistoryTask失败！", null);
		}
	} 
	
		
	/**
	 * 新增SlsHistoryTask参数校验
	 * 
	 * @param slsHistoryTaskAddParam
	 */
	public void addParamValidate(SlsHistoryTaskAddParam slsHistoryTaskAddParam){
			Assert.notNull(slsHistoryTaskAddParam, "参数错误");
	}
	
	/**
	 * 修改SlsHistoryTask信息	
	 */
	@Override
	public Result<String> updateSlsHistoryTask(SlsHistoryTaskModParam slsHistoryTaskModParam) {
		//参数校验
		modParamValidate(slsHistoryTaskModParam);
		
		//修改数据		
		try {
		    SlsHistoryTask slsHistoryTask = new SlsHistoryTask();
            BeanUtils.copyProperties(slsHistoryTask, slsHistoryTaskModParam);
            slsHistoryTask.setUpdateTime(new Date());
		    slsHistoryTaskDao.update(slsHistoryTask);
		    return new Result<String>(Result.STATUS_SUCCES, null, "修改slsHistoryTask成功！", null);
		} catch (Exception e) {
			LOG.error("修改SlsHistoryTask失败", e);
			return new Result<String>(Result.STATUS_ERROR, null, "修改SlsHistoryTask失败！", null);
		}
	}
	
	/**
	 * 修改SlsHistoryTask参数校验
	 * 
	 * @param slsHistoryTaskModParam
	 */
	public void modParamValidate(SlsHistoryTaskModParam slsHistoryTaskModParam){
		Assert.notNull(slsHistoryTaskModParam, "参数错误");
		Assert.notNull(slsHistoryTaskModParam.getId(), "参数错误");
		
	}
	
	
	/**
	 * 查询SlsHistoryTask信息
	 */
	@Override
	public Result<SlsHistoryTask> getSlsHistoryTask(SlsHistoryTaskGetParam slsHistoryTaskGetParam) {

		
		Result<SlsHistoryTask> result = new Result<SlsHistoryTask>();
		try {
			SlsHistoryTask slsHistoryTask = slsHistoryTaskDao.getSlsHistoryTask(slsHistoryTaskGetParam.getId());
			result.setStatus(Result.STATUS_SUCCES);
			result.setData(slsHistoryTask);
			result.setMsg("查询slsHistoryTask成功");
		} catch (Exception e) {
			LOG.error("查询slsHistoryTask失败", e);			
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg("查询slsHistoryTask失败");
		}
		return result;
	}
	
	/**
	 * 查询SlsHistoryTask参数校验
	 * 
	 * @param slsHistoryTaskGetParam
	 */
	public void getParamValidate(SlsHistoryTaskGetParam slsHistoryTaskGetParam){
		Assert.notNull(slsHistoryTaskGetParam, "参数错误");
        Assert.notNull(slsHistoryTaskGetParam.getId(), "参数错误");
		
	}
	
	/**
	 * SlsHistoryTask分页查询
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Result<ResponsePage<List<SlsHistoryTask>>> getPageQuery(RequestPage<SlsHistoryTaskPageQueryParam> requestPage) {
		
		Result<ResponsePage<List<SlsHistoryTask>>> result = new Result<ResponsePage<List<SlsHistoryTask>>>();
		try {
			List<SlsHistoryTask> slsHistoryTaskList = slsHistoryTaskDao.getPageSlsHistoryTask(requestPage);
			ResponsePage<List<SlsHistoryTask>> responsePage = requestPage.toResponsePage();
			responsePage.setData(slsHistoryTaskList);
			result.setStatus(Result.STATUS_SUCCES);
			result.setData(responsePage);
			result.setMsg("查询SlsHistoryTask列表成功！");
		} catch (Exception e) {
			LOG.error("查询SlsHistoryTask列表失败！", e);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg("查询SlsHistoryTask列表失败！");
		}		
		return result;
	}
	
	/**
	 * SlsHistoryTask分页查询参数校验
	 * @param requestPage
	 */
	public void pageQueryParamValidate(RequestPage<SlsHistoryTaskPageQueryParam> requestPage){
		Assert.notNull(requestPage, "参数错误");		
	}
}
