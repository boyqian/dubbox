package com.upsoft.sep.sls.issue.entity;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：    历史问题中点击一级问题来源后展示的二级问题分类                      
 *
 * @author boyqian
 * Create time 2019年3月6日 下午4:46:24
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月6日   boyqian       1.0      首次新增
 */
@Data
public class ProblemSource {

	/**
     * @Description 问题二级来源编码
     * */
	@ApiModelProperty(value="问题二级来源编码",required=true)
    private String sourceCode;
    /**
     * @Description 问题二级来源名称
     * */
	@ApiModelProperty(value="问题二级来源名称",required=true)
    private String sourceValue;
	/**
     * @Description 各二级问题数量
     * */
	@ApiModelProperty(value="各二级问题数量",required=true)
	private int proCount;
}
