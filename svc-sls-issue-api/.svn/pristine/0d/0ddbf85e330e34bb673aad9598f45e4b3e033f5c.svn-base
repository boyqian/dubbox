package com.upsoft.sep.sls.issue.param;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：                          
 *
 * @author boyqian
 * Create time 2019年3月5日 上午11:34:43
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
@Setter
@Getter
@NoArgsConstructor
public class ProblemStatusParam {
	@ApiModelProperty(value="问题id",required=true)
	private String id;
	@ApiModelProperty(value="问题状态: 0-待处理, 1-处理中, 2-已处理",required=true)
	private int status;
	@ApiModelProperty(value="问题是否已关注 0-未关注 1-已关注",required=false)
	private int isFocused;
	@ApiModelProperty(value="问题关闭时间",required=false)
	private Date closeTime;
	@ApiModelProperty(value="问题关闭原因",required=false)
	private String closeReason;
}
