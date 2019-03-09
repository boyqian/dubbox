package com.upsoft.sep.sls.issue.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import lombok.Data;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：问题基本信息&lt;br&gt;
 *
 * @author boyqian
 * Create time 2019/3/1 10:38
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019/3/1   boyqian       1.0      首次新增
 * 2019/3/6   boyqian       1.0    将source_code/value(二级来源) 改为parent_source_code/value(一级来源)
 * 2019/3/6   boyqian       1.0      新增二级来源
 */
@Data
public class ProblemBaseInfo {
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
	/**
     * @Description 问题二级来源编码
     * */
	@ApiModelProperty(value="问题二级来源编码",required=true)
    private String sourceCode;
    /**
     * @Description 问题二级来源名称
     * */
	@ApiModelProperty(value="问题一级来源名称",required=false)
    private String sourceValue;
    /**
     * @Description 问题标题
     * */
	@ApiModelProperty(value="问题标题",required=false)
    private String title;
    /**
     * @Description 问题类型代码
     * */
	@ApiModelProperty(value="问题类型代码",required=true)
    private String typeCode;
    /**
     * @Description 问题类型名称
     * */
	@ApiModelProperty(value="问题类型名称",required=false)
    private String typeValue;
    /**
     * @Description 问题等级编码
     * */
	@ApiModelProperty(value="问题等级编码",required=true)
    private String levelCode;
    /**
     * @Description 问题等级名称
     * */
	@ApiModelProperty(value="问题等级名称",required=false)
    private String levelValue;
    /**
     * @Description 问题地址
     * */
	@ApiModelProperty(value="问题地址",required=true)
    private String address;
    /**
     * @Description 问题详情
     * */
	@ApiModelProperty(value="问题详情",required=true)
    private String detail;
    /**
     * @Description 问题产生时间
     * */
	@ApiModelProperty(value="问题产生时间",required=true)
    private Date discoveryTime;
}
