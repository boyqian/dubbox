package com.upsoft.sep.sls.issue.dao;

import java.util.List;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.issue.IDCIssueMaker;
import com.upsoft.sep.sls.issue.entity.ProblemCount;
import com.upsoft.sep.sls.issue.entity.ProblemList;
import com.upsoft.sep.sls.issue.entity.ProblemSpread;
import com.upsoft.sep.sls.issue.param.ProblemAlikeParam;
import com.upsoft.sep.sls.issue.param.ProblemIdsParam;
import com.upsoft.sep.sls.issue.param.ProblemListParam;
import com.upsoft.sep.sls.issue.param.ProblemParam;
import com.upsoft.sep.sls.issue.param.ProblemStatusParam;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：   问题dao层                       
 *
 * @author boyqian
 * Create time 2019年3月5日 上午8:34:26
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
public interface ProblemDao  extends IDCIssueMaker{
	/**
	 * 新增问题
	 * @author boyqian
	 * @date 2019年3月5日 上午8:36:19
	 * @param proParam
	 * @return
	 */
	int addProblem(ProblemParam proParam);
	/**
	 * 修改问题
	 * @author boyqian
	 * @date 2019年3月5日 上午8:46:26
	 * @param proParam
	 * @return
	 */
	int modProblem(ProblemParam proParma);
	/**
	 * 查询问题列表
	 * @author boyqian
	 * @date 2019年3月5日 上午8:50:55
	 * @param proListParam
	 * @return
	 */
	List<ProblemList> selectProblemList(ProblemListParam proListParam);
	/**
	 * 分页查询问题
	 * @author boyqian
	 * @date 2019年3月5日 上午10:50:08
	 * @param page
	 * @return
	 */
	List<ProblemList> selectProblemPage(RequestPage<ProblemListParam> page);
	/**
	 * 关闭问题+更新问题状态
	 * @author boyqian
	 * @date 2019年3月5日 上午11:33:38
	 * @param proStatusParam
	 * @return
	 */
	int modProblemStatus(ProblemStatusParam proStatusParam);
	/**
	 * 问题分布查询
	 * @author boyqian
	 * @date 2019年3月5日 下午2:39:37
	 * @param 
	 * @return
	 */
	List<ProblemSpread> selectProblemSpread();
	/**
	 * 问题删除(单删+多删)
	 * @author boyqian
	 * @date 2019年3月5日 下午2:54:51
	 * @param proIdsParam
	 * @return
	 */
	int  delProblem(ProblemIdsParam proIdsParam);
	/**
	 * 相似问题查询
	 * @author boyqian
	 * @date 2019年3月5日 下午3:39:45
	 * @param proAlikeParam
	 * @return
	 */
	List<ProblemList> selectAlikeProblem(ProblemAlikeParam proAlikeParam);
	/**
	 * 问题导出
	 * @author boyqian
	 * @date 2019年3月6日 上午9:15:34
	 * @param proIdParamList
	 * @return
	 */
	List<ProblemList> selectProblemExport(ProblemIdsParam proIdsParamList);
	/**
	 * 调度首页问题统计
	 * @author boyqian
	 * @date 2019年3月8日 上午10:59:43
	 * @param 
	 * @return
	 */
	ProblemCount selectProblemCount();
}
