package com.upsoft.sep.sls.issue.param;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：    相似问题查询条件                      
 * [同一污染源、同一来源] 同一投诉人、同一天、同一地点、问题标题关键字
 * @author boyqian
 * Create time 2019年3月5日 下午3:44:48
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 * 2019/3/5    boyqian       1.0      删除boolean类型，直接传值，有则表示已选择，无表示没有选择
 */
@Setter
@Getter
@NoArgsConstructor
public class ProblemAlikeParam {

	/*@ApiModelProperty(value = "是否同一污染源", required = false)
	private boolean isSamePollSource;
	@ApiModelProperty(value = "是否同一来源", required = false)
	private boolean isSameSource;
	@ApiModelProperty(value = "是否同一投诉人", required = false)
	private boolean isSameComplainPeople;
	@ApiModelProperty(value = "是否同一天", required = false)
	private boolean isSameDay;
	@ApiModelProperty(value = "是否同一地点", required = false)
	private boolean isSamePlace;*/
	
	@ApiModelProperty(value = "污染源Id", required = false)
	private String enterpriseId;
	
	@ApiModelProperty(value = "来源代码", required = false)
	private String sourceCode;
	
	@ApiModelProperty(value = "投诉人Id", required = false)
	private String complaintId;
	
	@ApiModelProperty(value = "问题发生时间", required = false)
	private Date discoveryTime;
	
	@ApiModelProperty(value = "地点", required = false)
	private String address;
	
	@ApiModelProperty(value = "标题", required = false)
	private String title;
}
