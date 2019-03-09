package com.upsoft.sep.sls.issue.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.bp.common.util.StringUtil;
import com.upsoft.sep.sls.issue.base.CheckBaseConst;
import com.upsoft.sep.sls.issue.dao.ProblemDao;
import com.upsoft.sep.sls.issue.entity.ProblemCount;
import com.upsoft.sep.sls.issue.entity.ProblemList;
import com.upsoft.sep.sls.issue.entity.ProblemSpread;
import com.upsoft.sep.sls.issue.param.ProblemAlikeParam;
import com.upsoft.sep.sls.issue.param.ProblemIdsParam;
import com.upsoft.sep.sls.issue.param.ProblemListParam;
import com.upsoft.sep.sls.issue.param.ProblemParam;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：                          
 *
 * @author boyqian
 * Create time 2019年3月5日 上午9:37:34
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
public class ProblemServiceImpl implements ProblemService{

	private static final LogHandler LOG = LogHandler.getLogHandler("ProblemServiceImpl");
	
	@Autowired
	private ProblemDao problemDao;
	
	@Override
	public Result<Boolean> addProblem(ProblemParam proParam) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			proParam.setId(StringUtil.uuid());
			proParam.setCreateTime(new Date());
			proParam.setStatus(0);
			int line=problemDao.addProblem(proParam);
			if(line>0){
				result.setData(true);
				result.setStatus(Result.STATUS_SUCCES);
				result.setMsg(CheckBaseConst.RESULT_MSG.ADD_SUCCESS.getValue());
				LOG.debug("新增问题成功");
			}else{
				LOG.error("新增问题失败");
				result.setData(false);
				result.setStatus(Result.STATUS_ERROR);
				result.setMsg(CheckBaseConst.RESULT_MSG.ADD_FAIL.getValue());
			}
		} catch (Exception e) {
			LOG.error("新增问题失败", e);
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.ADD_FAIL.getValue());
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<Boolean> modProblem(ProblemParam proParam) {
		Result<Boolean> result = new Result<Boolean>();
		try {
			String id=proParam.getId();
			if(null==id){
				result.setMsg("问题id为空");
				return result;
			}else{
				proParam.setUpdateTime(new Date());
				int line =problemDao.modProblem(proParam);
				if(line>0){
					result.setData(true);
					result.setStatus(Result.STATUS_SUCCES);
					result.setMsg(CheckBaseConst.RESULT_MSG.MOD_SUCCESS.getValue());
					LOG.debug("修改问题成功", id);
				}else{
					result.setData(false);
					result.setStatus(Result.STATUS_ERROR);
					result.setMsg(CheckBaseConst.RESULT_MSG.MOD_FAIL.getValue());
					LOG.error("修改问题失败", id);
				}
			}
		} catch (Exception e) {
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.MOD_FAIL.getValue());
			LOG.error("修改问题失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<List<ProblemList>> queryProblemList(
			ProblemListParam proListParam) {
		Result<List<ProblemList>> result=new Result<List<ProblemList>>();
		try {
			List<ProblemList> list=problemDao.selectProblemList(proListParam);
			result.setData(list);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询问题列表");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("查询问题列表失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Result<ResponsePage<List<ProblemList>>> queryProblemPage(RequestPage<ProblemListParam> page) {
		Result<ResponsePage<List<ProblemList>>> result = new Result<ResponsePage<List<ProblemList>>>();
		try {
			if(null!=page.getParam()){
				
			}
			List<ProblemList> list=problemDao.selectProblemPage(page);
			ResponsePage<List<ProblemList>> responsePage=page.toResponsePage();
			responsePage.setData(list);
			result.setData(responsePage);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("分页查询问题成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("分页查询问题失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<List<ProblemSpread>> queryProblemSpread() {
		Result<List<ProblemSpread>> result=new Result<List<ProblemSpread>>();
		try {
			List<ProblemSpread> list=problemDao.selectProblemSpread();
			result.setData(list);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询问题分布信息成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("查询问题列表失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<Boolean> delProblem(ProblemIdsParam proIdsParam) {
		Result<Boolean> result=new Result<Boolean>();
		try {
			int line=problemDao.delProblem(proIdsParam);
			if(line>0){
				result.setData(true);
				result.setStatus(Result.STATUS_SUCCES);
				result.setMsg(CheckBaseConst.RESULT_MSG.DEL_SUCCESS.getValue());
				LOG.debug("删除问题成功");
			}else{
				result.setData(false);
				result.setStatus(Result.STATUS_ERROR);
				result.setMsg(CheckBaseConst.RESULT_MSG.DEL_FAIL.getValue());
				LOG.error("删除问题失败");
			}
		} catch (Exception e) {
			result.setData(false);
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.DEL_FAIL.getValue());
			LOG.error("删除问题失败",e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<List<ProblemList>> queryAlikeProblem(
			ProblemAlikeParam proAlikeParam) {
		Result<List<ProblemList>> result =new Result<List<ProblemList>>();
		try {
			List<ProblemList> list=problemDao.selectAlikeProblem(proAlikeParam);
			result.setData(list);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("相似问题查询成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("相似问题查询失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<ProblemCount> queryProblemCount() {
		Result<ProblemCount> result =new Result<ProblemCount>();
		try {
			ProblemCount proCount=problemDao.selectProblemCount();
			result.setData(proCount);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("首页问题调度统计查询成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("首页问题调度统计查询失败", e);
			e.printStackTrace();
		}
		return result;
	}
	
}
