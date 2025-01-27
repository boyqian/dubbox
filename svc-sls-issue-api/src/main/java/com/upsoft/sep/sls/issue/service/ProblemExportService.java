package com.upsoft.sep.sls.issue.service;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;





import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.upsoft.sep.bp.common.util.GlobalRestApiAction;
import com.upsoft.sep.sls.issue.entity.ProblemList;
import com.upsoft.sep.sls.issue.param.ProblemIdsParam;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述： 问题导出excle文件                
 *
 * @author boyqian
 * Create time 2019年3月5日 下午2:18:18
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
@Path("/problem/export")
@Produces({ "application/octet-stream; charset=UTF-8" })
@Consumes(MediaType.APPLICATION_JSON)
public interface ProblemExportService {
	
	public static final String TAG = "/problem/export(problem/问题导出)";
	/**
	 * 问题导出excle文件       
	 * @author boyqian
	 * @date 2019年3月6日 上午9:10:33
	 * @param proIdsParam
	 * @return
	 */
	@Path(GlobalRestApiAction.DOWNLOAD)
	@POST
	@Produces({ "application/octet-stream; charset=UTF-8" })
	@ApiResponse(response=ProblemList.class, code = 0, message = "")
	@ApiOperation(hidden = false, value = "问题导出excle文件", notes = "", tags = TAG)
	@Consumes(MediaType.APPLICATION_JSON)
	public void doExportProblem(ProblemIdsParam proIdsParamList);
}
