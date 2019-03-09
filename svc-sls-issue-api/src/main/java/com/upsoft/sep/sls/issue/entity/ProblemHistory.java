package com.upsoft.sep.sls.issue.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述： 历史问题                         
 *
 * @author boyqian
 * Create time 2019年3月5日 下午3:22:27
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
@Data
public class ProblemHistory {

	@ApiModelProperty(value="问题一级来源信息",required=false)
	private ProblemParentSource proParentSource;
	@ApiModelProperty(value="问题二级来源信息",required=false)
	private ProblemSource proSource;
}
