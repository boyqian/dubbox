package com.upsoft.sep.sls.issue.param;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：           传递经纬度坐标参数，问题地图中投诉半径1KM的投诉信息              
 *
 * @author boyqian
 * Create time 2019年3月6日 下午3:54:31
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月6日   boyqian       1.0      首次新增
 */
@Setter
@Getter
@NoArgsConstructor
public class LngLatParam {
	/**
	 * @Description 问题ID
	 * */
	@ApiModelProperty(value = "问题ID", required = true)
	private String id;
	/**
	 * @Description 经度
	 * */
	@ApiModelProperty(value="经度",required=true)
	private String lng;
	/**
	 * @Description 纬度
	 * */
	@ApiModelProperty(value="纬度",required=true)
	private String lat;
}
