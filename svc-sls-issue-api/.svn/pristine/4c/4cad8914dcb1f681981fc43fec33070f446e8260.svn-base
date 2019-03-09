package com.upsoft.sep.sls.issue.entity;

import lombok.Data;
import io.swagger.annotations.ApiModelProperty;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：问题关联企业信息&lt;br&gt;
 *
 * @author boyqian
 * Create time 2019/3/1 10:56
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019/3/1   boyqian       1.0      首次新增
 * 2019/3/6   boyqian       1.0    有些字段错误，暂等待更正比如企业负责人而不是巡查人
 */
@Data
public class ProblemPollInfo {
    /**
     * @Description 企业Id
     * */
	@ApiModelProperty(value="企业id",required=true)
	private String enterpriseId;
    /**
     * @Description 企业名称
     * */
	@ApiModelProperty(value="企业名称",required=true)
	private String enterpriseName;
    /**
     * @Description 企业负责人
     * */
	@ApiModelProperty(value="巡查人员ID",required=false)
	private String inspectionStaffId;
	@ApiModelProperty(value="巡查人员姓名",required=false)
	private String inspectionStaffName;
    /**
     * @Description 企业地址
     * */
	@ApiModelProperty(value="企业地址",required=true)
	private String enterpriseAddress;
    /**
     * @Description 企业污染类型
     * */
	@ApiModelProperty(value="监管类型编码",required=true)
	private String supervisionTypeCode;
	@ApiModelProperty(value="监管类型名称",required=true)
	private String supervisionTypeName;
	
}
