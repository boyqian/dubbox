package com.upsoft.sep.sls.issue.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import lombok.Data;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：  投诉信息                      来自投诉管理系统 暂定  
 *
 * @author boyqian
 * Create time 2019年3月5日 下午3:13:06
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
@Data
public class ProblemComplaintInfo {

	/**
	 * @Description 投诉来源
	 * */
	@ApiModelProperty(value="投诉来源",required=false)
	private String complaintSource;
	
	/**
	 * @Description 投诉类型
	 * */
	@ApiModelProperty(value="投诉类型",required=false)
	private String complaintType;
	/**
	 * @Description 投诉人
	 * */
	@ApiModelProperty(value="投诉人",required=false)
	private String complaintPeople;
	/**
	 * @Description 投诉内容
	 * */
	@ApiModelProperty(value="投诉内容",required=false)
	private String complaintContent;
	/**
	 * @Description 影响程度
	 * */
	@ApiModelProperty(value="影响程度",required=false)
	private String influenceLevel;
	/**
	 * @Description 登记时间
	 * */
	@ApiModelProperty(value="登记时间",required=false)
	private Date registerTime;
	/**
	 * @Description 附件
	 * */
	@ApiModelProperty(value="附件",required=false)
	private String attachment;
	
}
