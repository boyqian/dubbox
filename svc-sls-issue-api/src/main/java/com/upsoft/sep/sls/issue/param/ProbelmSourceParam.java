package com.upsoft.sep.sls.issue.param;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：      问题一级来源代码，默认显示选中的问题类型                    
 *
 * @author boyqian
 * Create time 2019年3月6日 下午4:40:57
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月6日   boyqian       1.0      首次新增
 */
@Setter
@Getter
@NoArgsConstructor
public class ProbelmSourceParam {
	/**
     * @Description 企业Id
     * */
	@ApiModelProperty(value="企业id",required=true)
	private String enterpriseId;
	 /**
     * @Description 问题一级来源编码
     * */
	@ApiModelProperty(value="问题一级来源编码",required=true)
	private String parentSourceCode;
	 /**
     * @Description 问题一级来源名称
     * */
	@ApiModelProperty(value="问题一级来源名称",required=false)
	private String parentSourceValue;
	
	
}
