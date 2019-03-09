package com.upsoft.sep.sls.issue.entity;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：     问题分布    (问题地图)                
 *
 * @author boyqian
 * Create time 2019年3月5日 下午2:30:33
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 * 2019/3/5    boyqian       1.0   新增地址address,来源编码和来源名称
 */
@Data
public class ProblemSpread {
	/**
     * @Description 问题ID
     * */
	@ApiModelProperty(value="问题ID",required=true)
	private String id;
	/**
     * @Description 问题等级代码
     * */
	@ApiModelProperty(value="问题等级代码",required=true)
	private String levelCode;
	/**
     * @Description 问题等级名称
     * */
	@ApiModelProperty(value="问题等级名称",required=false)
	private String levelValue;
	/**
     * @Description 问题经度
     * */
	@ApiModelProperty(value="问题经度",required=false)
	private String longitude;
	/**
     * @Description 问题纬度
     * */
	@ApiModelProperty(value="问题纬度",required=false)
	private String latitude;
	/**
     * @Description 问题标题
     * */
	@ApiModelProperty(value="问题标题",required=true)
	private String title;
	/**
     * @Description 问题发生地点
     * */
	@ApiModelProperty(value="问题发生地点",required=false)
	private String address;
	/**
     * @Description 企业Id
     * */
	@ApiModelProperty(value="问题来源编码",required=false)
	private String sourceCode;
	/**
     * @Description 企业Id
     * */
	@ApiModelProperty(value="问题来源名称",required=false)
	private String sourceValue;
}
