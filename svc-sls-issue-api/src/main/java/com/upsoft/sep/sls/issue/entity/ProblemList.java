package com.upsoft.sep.sls.issue.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import lombok.Data;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：问题列表(台账)实体&lt;br&gt;
 *
 * @author boyqian
 * Create time 2019/3/1 10:27
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019/3/1   boyqian       1.0      首次新增
 * 2019/3/5   boyqian       1.0      新增status问题状态,地址address（相似问题需要）
 * 2019/3/6   boyqian       1.0      相似问题中复制任务按钮 新增assignTaskId
 * 2019/3/6   boyqian       1.0      将source_code/value(二级来源) 改为parent_source_code/value(一级来源)
 * 2019/3/6   boyqian       1.0      新增二级来源
 */
@Data
public class ProblemList {
    /**
     * @Description 问题id
     * */
	@ApiModelProperty(value="问题id",required=true)
    private String id;
    /**
     * @Description 问题一级来源编码
     * */
	@ApiModelProperty(value="问题一级来源编码",required=true)
    private String parentSourceCode;
	 /**
     * @Description 问题一级来源名称
     * */
	@ApiModelProperty(value="问题二级来源名称",required=false)
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
     * @Description 问题状态
     * */
	@ApiModelProperty(value="问题状态",required=false)
    private String status;
	/**
     * @Description 问题是否已关注 0-未关注 1-已关注
     * */
	@ApiModelProperty(value="问题是否已关注 0-未关注 1-已关注",required=false)
	private int isFocused;
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
     * @Description 问题产生时间
     * */
	@ApiModelProperty(value="问题产生时间",required=true)
    private Date discoveryTime;
	/**
     * @Description 问题产生地址
     * */
	@ApiModelProperty(value="问题产生地址",required=false)
	private String address;
    /**
     * @Description 问题相关企业ID
     * */
	@ApiModelProperty(value="问题相关企业ID",required=false)
    private String enterpriseId;
    /**
     * @Description 问题相关企业名称
     * */
	@ApiModelProperty(value="问题相关企业名称",required=false)
    private String enterpriseName;
	/**
     * @Description 问题是否相关任务ID
     * */
	@ApiModelProperty(value="问题是否相关任务ID",required=false)
	private String assignTaskId;
}
