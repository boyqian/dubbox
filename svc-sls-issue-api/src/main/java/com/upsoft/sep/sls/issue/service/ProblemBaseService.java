package com.upsoft.sep.sls.issue.service;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
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
 * 描述：  问题基本信息服务类                    
 *
 * @author boyqian
 * Create time 2019年3月5日 上午9:11:44
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
@Path("/problem/probase")
@Produces({ "application/json; charset=UTF-8" })
@Consumes(MediaType.APPLICATION_JSON)
public interface ProblemBaseService {

	public static final String TAG = "/problem/probase(problem/问题基本信息)";
	/**
	 * 根据问题id查询问题基本信息
	 * @author boyqian
	 * @date 2019年3月5日 上午9:14:21
	 * @param id
	 * @return
	 */
	@Path(GlobalRestApiAction.GET_BY+"Id")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response=ProblemBaseInfo.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据问题ID查询问题详情", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<ProblemBaseInfo> queryProBaseById(ProblemIdParam proIdParam);
	/**
	 * 根据问题id查询该问题关联的企业信息
	 * @author boyqian
	 * @date 2019年3月6日 下午5:54:44
	 * @param 
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"PollById")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response=ProblemPollInfo.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "根据问题id查询该问题关联的企业信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<ProblemPollInfo> queryProPollInfo(ProblemIdParam proIdParam);
	/**
	 * 通过id查询该问题的投诉信息，若id为null则查询
	 * 该问题点位半径1KM的其他投诉信息
	 * @author boyqian
	 * @date 2019年3月6日 下午5:56:25
	 * @param 
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"CompById")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response=ProblemComplaintInfo.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "通过id查询该问题的投诉信息，若id为null则查询该问题点位半径1KM的其他投诉信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<ProblemComplaintInfo>> queryProCompInfo(ProblemIdParam proIdParam);
	/**
	 * 问题详情中历史问题根据产生问题的该企业查询问题一级来源信息
	 * @author boyqian
	 * @date 2019年3月6日 下午5:58:20
	 * @param 
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"ProParentSorce")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response=ProblemParentSource.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "问题详情中历史问题根据产生问题的该企业查询问题一级来源信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<ProblemParentSource>> queryProParentSource(EnterpriseIdParam enterpriseIdParam);
	/**
	 * 问题详情中历史问题根据产生问题的该企业查询问题二级来源信息
	 * @author boyqian
	 * @date 2019年3月6日 下午5:59:40
	 * @param 
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"ProSource")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response=ProblemSource.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "问题详情中历史问题根据产生问题的该企业查询问题二级来源信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<ProblemSource>> queryProSource(ProbelmSourceParam proSourceParam);
}
