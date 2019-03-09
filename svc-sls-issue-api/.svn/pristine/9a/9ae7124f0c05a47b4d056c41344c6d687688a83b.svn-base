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
 * 描述：                          
 *
 * @author boyqian
 * Create time 2019年3月5日 上午10:58:49
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月5日   boyqian       1.0      首次新增
 */
@Setter
@Getter
@NoArgsConstructor
public class ProblemPageParam {
	@ApiModelProperty(value="问题来源编码",required=true)
    private String sourceCode;
	@ApiModelProperty(value="问题来源名称",required=false)
    private String sourceValue;
	@ApiModelProperty(value="问题标题",required=false)
    private String title;
	@ApiModelProperty(value="问题类型代码",required=true)
    private String typeCode;
	@ApiModelProperty(value="问题类型名称",required=false)
    private String typeValue;
	@ApiModelProperty(value="问题等级编码",required=true)
    private String levelCode;
	@ApiModelProperty(value="问题等级名称",required=false)
    private String levelValue;
	@ApiModelProperty(value="问题是否已关注 0-未关注 1-已关注",required=false)
	private int isFocused;
	@ApiModelProperty(value="问题产生时间",required=true)
    private Date discoveryTime;
	@ApiModelProperty(value="排序(升序-asc,降序-desc)",required=false)
    private String sortName;
	@ApiModelProperty(value="分页起始",required=false)
    private int limit;
	@ApiModelProperty(value="分页偏移量",required=false)
    private int offset;
}
