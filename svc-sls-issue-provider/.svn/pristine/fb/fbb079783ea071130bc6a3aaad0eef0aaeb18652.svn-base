package com.upsoft.sep.sls.issue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.sls.issue.base.CheckBaseConst;
import com.upsoft.sep.sls.issue.dao.ProblemBaseDao;
import com.upsoft.sep.sls.issue.entity.ProblemBaseInfo;
import com.upsoft.sep.sls.issue.entity.ProblemComplaintInfo;
import com.upsoft.sep.sls.issue.entity.ProblemParentSource;
import com.upsoft.sep.sls.issue.entity.ProblemPollInfo;
import com.upsoft.sep.sls.issue.entity.ProblemSource;
import com.upsoft.sep.sls.issue.param.EnterpriseIdParam;
import com.upsoft.sep.sls.issue.param.ProbelmSourceParam;
import com.upsoft.sep.sls.issue.param.ProblemIdParam;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：  问题基本信息服务实现类                        
 *
 * @author boyqian
 * Create time 2019年3月5日 上午9:38:01
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
public class ProblemBaseServiceImpl implements ProblemBaseService{
	
	private static final LogHandler LOG = LogHandler.getLogHandler("ProblemBaseServiceImpl");
	
	@Autowired
	private ProblemBaseDao problemBaseDao;
	
	@Override
	public Result<ProblemBaseInfo> queryProBaseById(ProblemIdParam proIdParam) {
		Result<ProblemBaseInfo> result=new Result<ProblemBaseInfo>();
		try {
			ProblemBaseInfo proBaseInfo=problemBaseDao.getProBaseById(proIdParam);
			result.setData(proBaseInfo);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询问题详情成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("查询问题详情失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<ProblemPollInfo> queryProPollInfo(ProblemIdParam proIdParam) {
		Result<ProblemPollInfo> result=new Result<ProblemPollInfo>();
		try {
			ProblemPollInfo proPollInfo=problemBaseDao.getProPollInfo(proIdParam);
			result.setData(proPollInfo);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询问题关联企业成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("查询问题关联企业失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<List<ProblemComplaintInfo>> queryProCompInfo(
			ProblemIdParam proIdParam) {
		Result<List<ProblemComplaintInfo>> result=new Result<List<ProblemComplaintInfo>>();
		try {
			List<ProblemComplaintInfo> list=problemBaseDao.getProComplaintInfo(proIdParam);
			result.setData(list);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询投诉信息成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("查询投诉信息失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<List<ProblemParentSource>> queryProParentSource(
			EnterpriseIdParam enterpriseIdParam) {
		Result<List<ProblemParentSource>> result=new Result<List<ProblemParentSource>>();
		try {
			List<ProblemParentSource> list=problemBaseDao.getProParentSource(enterpriseIdParam);
			result.setData(list);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询历史问题一级来源信息成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("查询历史问题一级来源信息失败", e);
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result<List<ProblemSource>> queryProSource(
			ProbelmSourceParam proSourceParam) {
		Result<List<ProblemSource>> result=new Result<List<ProblemSource>>();
		try {
			List<ProblemSource> list=problemBaseDao.getProSource(proSourceParam);
			result.setData(list);
			result.setStatus(Result.STATUS_SUCCES);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_SUCCESS.getValue());
			LOG.debug("查询历史问题二级来源信息成功");
		} catch (Exception e) {
			result.setStatus(Result.STATUS_ERROR);
			result.setMsg(CheckBaseConst.RESULT_MSG.SEARCH_FAIL.getValue());
			LOG.error("查询历史问题二级来源信息失败", e);
			e.printStackTrace();
		}
		return result;
	}

}
