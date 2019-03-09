package com.upsoft.sep.sls.issue.param;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：                          
 *
 * @author boyqian
 * Create time 2019年3月5日 上午9:14:59
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
@Setter
@Getter
@NoArgsConstructor
public class ProblemIdParam {
	@ApiModelProperty(value = "问题ID", required = true)
	private String id;	
}
