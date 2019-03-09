package com.upsoft.sep.sls.config.check.entity;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;



/**
 * 
 * Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：CheckTemplate.java<br>
 * 摘要：分页显示<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：wang meng <br>
 * 完成日期：2016年10月29日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：wang meng <br>
 * 完成日期：2016年10月29日<br>
 */
public class CheckTemplatePageEntity {
	/**
	 * 检查模板编码
	 */
	@ApiModelProperty(value = "检查模板编码", required = true)
	private String checkTemplateId;
	/**
	 * 检查模板名称
	 */
	@ApiModelProperty(value = "检查模板名称", required = false)
	private String checkTemplateName;
	/**
     * 级别
     */
	@ApiModelProperty(value = "级别", required = false)
	private String levelName;
	/**
	 * 创建人员单位
	 */
	@ApiModelProperty(value = "创建人员单位", required = false)
	private String createrOrgName;
	/**
     * 状态
     */
	@ApiModelProperty(value = "状态", required = false)
	private String status;
	/**
     * 创建时间
     */
	@ApiModelProperty(value = "创建时间", required = false)
	private Timestamp createTime;
	/**
	 * 说明
	 */
	@ApiModelProperty(value = "说明", required = false)
	private String remark;
	

	public String getCheckTemplateId() {
		return checkTemplateId;
	}

	public void setCheckTemplateId(String checkTemplateId) {
		this.checkTemplateId = checkTemplateId == null ? null : checkTemplateId
				.trim();
	}

	public String getCheckTemplateName() {
		return checkTemplateName;
	}

	public void setCheckTemplateName(String checkTemplateName) {
		this.checkTemplateName = checkTemplateName == null ? null
				: checkTemplateName.trim();
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName == null ? null : levelName.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getCreaterOrgName() {
		return createrOrgName;
	}

	public void setCreaterOrgName(String createrOrgName) {
		this.createrOrgName = createrOrgName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}