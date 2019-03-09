package com.upsoft.sep.sls.issue.dao;

import java.util.List;

import com.upsoft.sep.sls.issue.IDCIssueMaker;
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
 * 描述：                          
 *
 * @author boyqian
 * Create time 2019年3月5日 上午9:21:08
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
public interface ProblemBaseDao extends IDCIssueMaker{
	/**
	 * 查询问题基本信息(参数不能为空)
	 * @author boyqian
	 * @date 2019年3月5日 上午9:21:15
	 * @param proIdParam
	 * @return
	 */
	ProblemBaseInfo getProBaseById(ProblemIdParam proIdParam);
	/**
	 * 根据问题id查询该问题关联的企业信息(参数不能为空)
	 * @author boyqian
	 * @date 2019年3月6日 下午3:17:23
	 * @param proIdParam
	 * @return
	 */
	ProblemPollInfo getProPollInfo(ProblemIdParam proIdParam);
	/**
	 * 通过id查询该问题的投诉信息，若id为null则查询
	 * 该问题点位半径1KM的其他投诉信息
	 * @author boyqian
	 * @date 2019年3月6日 下午3:39:53
	 * @param proIdParam
	 * @return
	 */
	List<ProblemComplaintInfo> getProComplaintInfo(ProblemIdParam proIdParam);
	/**
	 * 问题详情中历史问题根据产生问题的该企业查询问题一级来源信息
	 * @author boyqian
	 * @date 2019年3月6日 下午5:02:15
	 * @param 
	 * @return
	 */
	List<ProblemParentSource> getProParentSource(EnterpriseIdParam enterpriseIdParam);
	/**
	 * 问题详情中历史问题根据产生问题的该企业查询问题二级来源信息
	 * @author boyqian
	 * @date 2019年3月6日 下午5:02:55
	 * @param 
	 * @return
	 */
	List<ProblemSource> getProSource(ProbelmSourceParam proSourceParam);
}
