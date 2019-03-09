package com.upsoft.sep.sls.issue.param;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：问题列表查询条件&lt;br&gt;
 *
 * @author boyqian
 * Create time 2019/3/1 10:43
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019/3/1   boyqian       1.0      首次新增
 * 2019/3/6   boyqian       1.0    删除sortTime，新增为sortName、sortType
 */
@Setter
@Getter
@NoArgsConstructor
public class ProblemListParam {
    /**
     * @Description 问题等级
     * */
	@ApiModelProperty(value="问题等级编码",required=false)
    private String levelCode;
	@ApiModelProperty(value="问题等级名称",required=false)
    private String levelValue;
    /**
     * @Description 问题来源
     * */
	@ApiModelProperty(value="问题来源编码",required=false)
    private String sourceCode;
	@ApiModelProperty(value="问题来源名称",required=false)
    private String sourceValue;
    /**
     * @Description 问题类型，产生问题时间
     * */
	@ApiModelProperty(value="问题类型代码",required=false)
    private String typeCode;
	@ApiModelProperty(value="问题类型名称",required=false)
    private String typeValue;
    /**
     * @Description 产生问题时间排序方式
     * */
	@ApiModelProperty(value="问题排序名称(level_code/value)",required=false)
	private String sortName;
	@ApiModelProperty(value="问题排序方式(降序-desc,升序-asc)",required=false)
    private String sortType;
}
