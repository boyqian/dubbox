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
 * Create time 2019年3月4日 下午6:14:09
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月4日   boyqian       1.0      首次新增
 * 2019/3/6   boyqian        1.0    新增create_time,update_time
 */
@Setter
@Getter
@NoArgsConstructor
public class ProblemParam {
	/**
     * @Description 问题id
     * */
	@ApiModelProperty(value="问题id",required=false)
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
	@ApiModelProperty(value="问题标题",required=true)
    private String title;
    /**
     * @Description 问题类型代码
     * */
	@ApiModelProperty(value="问题类型代码",required=true)
    private String typeCode;
    /**
     * @Description 问题类型名称
     * */
	@ApiModelProperty(value="问题类型名称",required=true)
    private String typeValue;
    /**
     * @Description 问题等级编码
     * */
	@ApiModelProperty(value="问题等级编码",required=true)
    private String levelCode;
    /**
     * @Description 问题等级名称
     * */
	@ApiModelProperty(value="问题等级名称",required=true)
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
	@ApiModelProperty(value="问题所属网格ID",required=true)
    private String gridId;
    /**
     * @Description 问题所属网格名称
     * */
	@ApiModelProperty(value="问题所属网格名称",required=true)
    private String gridName;
    /**
     * @Description 问题现场经度坐标
     * */
	@ApiModelProperty(value="问题现场经度坐标",required=true)
    private String  longitude;
    /**
     * @Description 问题现场纬度坐标
     * */
	@ApiModelProperty(value="问题现场纬度坐标",required=true)
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
    private Date assignTaskTime;
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
