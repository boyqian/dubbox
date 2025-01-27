package com.upsoft.sep.sls.issue.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import lombok.Data;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：问题实体类&lt;br&gt;
 *
 * @author boyqian
 * Create time 2019/3/1 9:54
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019/3/1   boyqian       1.0      首次新增
 * 2019/3/6   boyqian       1.0     新增问题一级来源编码和名称
 * 2019/3/7   boyqian       1.0     新增创建时间和修改时间
 */
@Data
public class Problem {
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
	@ApiModelProperty(value="问题二级来源名称",required=false)
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
     * @Description 问题状态: 0-待处理, 1-处理中, 2-已处理
     * */
	@ApiModelProperty(value="问题状态: 0-待处理, 1-处理中, 2-已处理",required=true)
    private int status;
	/**
     * @Description 问题是否已关注 0-未关注 1-已关注
     * */
	@ApiModelProperty(value="问题是否已关注 0-未关注 1-已关注",required=false)
	private int isFocused;
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
    /**
     * @Description 问题关闭时间
     * */
	@ApiModelProperty(value="问题关闭时间",required=false)
    private Date closeTime;
    /**
     * @Description 问题关闭原因
     * */
	@ApiModelProperty(value="问题关闭原因",required=false)
    private String closeReason;
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
     * @Description 问题所属工地ID
     * */
	@ApiModelProperty(value="问题所属工地ID",required=false)
    private String constructionSiteId;
    /**
     * @Description 问题所属工地项目名称
     * */
	@ApiModelProperty(value="问题所属工地项目名称",required=false)
    private String constructionSiteName;
    /**
     * @Description 问题所属网格ID
     * */
	@ApiModelProperty(value="问题所属网格ID",required=false)
    private String gridId;
    /**
     * @Description 问题所属网格名称
     * */
	@ApiModelProperty(value="问题所属网格名称",required=false)
    private String gridName;
    /**
     * @Description 问题现场经度坐标
     * */
	@ApiModelProperty(value="问题现场经度坐标",required=false)
    private String  longitude;
    /**
     * @Description 问题现场纬度坐标
     * */
	@ApiModelProperty(value="问题现场纬度坐标",required=false)
    private String latitude;
    /**
     * @Description 问题相关任务
     * */
	@ApiModelProperty(value="问题相关任务",required=false)
    private String assignTaskId;
    /**
     * @Description 问题相关任务派发时间
     * */
	@ApiModelProperty(value="问题相关任务派发时间",required=false)
    private String assignTaskTime;
    /**
     * @Description 投诉信息ID
     * */
	@ApiModelProperty(value="投诉信息ID",required=false)
    private String complaintId;
    /**
     * @Description 移动端问题发现人姓名
     * */
	@ApiModelProperty(value="移动端问题发现人姓名",required=false)
    private String discoveryUser;
    /**
     * @Description 移动端问题发现人单位
     * */
	@ApiModelProperty(value="移动端问题发现人单位",required=false)
    private String discoveryOrganization;
    /**
     * @Description 移动端问题取证附件
     * */
	@ApiModelProperty(value="移动端问题取证附件",required=false)
    private String attachment;
	/**
     * @Description 创建时间
     * */
	@ApiModelProperty(value="创建时间",required=false)
    private Date createTime;
	/**
     * @Description 修改时间
     * */
	@ApiModelProperty(value="修改时间",required=false)
    private Date updateTime;
}

