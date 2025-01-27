package com.upsoft.sep.sls.issue.service;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
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
 * 描述：问题服务类&lt;br&gt;
 *
 * @author boyqian
 * Create time 2019/3/4 17:54
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019/3/4   boyqian       1.0      首次新增
 */
@Path("/problem")
@Produces({ "application/json; charset=UTF-8" })
@Consumes(MediaType.APPLICATION_JSON)
public interface ProblemService {
	public static final String TAG = "/problem : 问题";
	
	/**
	 * 新增问题
	 * @author boyqian
	 * @date 2019年3月4日 下午6:20:12
	 * @param proParam
	 * @return
	 */
	@Path(GlobalRestApiAction.ADD)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "新增问题", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> addProblem(ProblemParam proParam);
	/**
	 * 修改问题
	 * @author boyqian
	 * @date 2019年3月5日 上午8:14:54
	 * @param proParam
	 * @return
	 */
	@Path(GlobalRestApiAction.MOD)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "修改问题", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> modProblem(ProblemParam proParam);
	/**
	 * 问题列表查询
	 * @author boyqian
	 * @date 2019年3月5日 上午8:15:45
	 * @param proListParam
	 * @return
	 */
	@Path(GlobalRestApiAction.LIST)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ProblemList.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "问题列表查询", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<ProblemList>> queryProblemList(ProblemListParam proListParam);
	/**
	 * 分页查询
	 * @author boyqian
	 * @date 2019年3月5日 上午8:23:14
	 * @param page
	 * @return
	 */
	@Path(GlobalRestApiAction.PAGE)
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ResponsePage.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "分页查询问题信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<ResponsePage<List<ProblemList>>> queryProblemPage(RequestPage<ProblemListParam> page);
	/**
	 * 问题分布
	 * @author boyqian
	 * @date 2019年3月5日 下午2:35:28
	 * @param 
	 * @return
	 */
	@Path(GlobalRestApiAction.LIST+"Spread")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ProblemSpread.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "问题分布查询", notes = "", tags = TAG)
	public Result<List<ProblemSpread>> queryProblemSpread();
	/**
	 * 问题删除
	 * @author boyqian
	 * @date 2019年3月5日 下午2:50:06
	 * @param proIdsParam
	 * @return
	 */
	@Path(GlobalRestApiAction.DEL_BY+"Ids")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = Boolean.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "删除问题信息", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<Boolean> delProblem(ProblemIdsParam proIdsParam);
	/**
	 * 查询相似问题
	 * @author boyqian
	 * @date 2019年3月5日 下午4:51:51
	 * @param proAlikeParam
	 * @return
	 */
	@Path(GlobalRestApiAction.LIST+"Alike")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ProblemList.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "相似问题查询", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public Result<List<ProblemList>> queryAlikeProblem(ProblemAlikeParam proAlikeParam);
	/**
	 * 调度首页统计
	 * @author boyqian
	 * @date 2019年3月8日 上午10:46:17
	 * @param 
	 * @return
	 */
	@Path(GlobalRestApiAction.GET+"ProCount")
	@POST
	@Produces({ "application/json; charset=UTF-8" })
	@ApiResponse(response = ProblemList.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "调度首页统计查询", notes = "", tags = TAG)
	public Result<ProblemCount> queryProblemCount();
}
