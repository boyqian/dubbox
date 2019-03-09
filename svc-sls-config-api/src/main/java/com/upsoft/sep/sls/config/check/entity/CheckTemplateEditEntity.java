package com.upsoft.sep.sls.config.check.entity;

import io.swagger.annotations.ApiModelProperty;

public class CheckTemplateEditEntity {
	/**
	 * 模板ID
	 */
	@ApiModelProperty(value = "模板ID", required = true)
	private String checkTemplateId;
	/**
	 * 模板名称
	 */
	@ApiModelProperty(value = "模板名称", required = true)
	private String checkTemplateName;
	/**
	 * 级别
	 */
	@ApiModelProperty(value = "级别", required = true)
	private String levelCode;
	private String levelName;
	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态", required = true)
	private String status;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注", required = true)
	private String remark;

	public String getCheckTemplateId() {
		return checkTemplateId;
	}

	public void setCheckTemplateId(String checkTemplateId) {
		this.checkTemplateId = checkTemplateId;
	}

	public String getCheckTemplateName() {
		return checkTemplateName;
	}

	public void setCheckTemplateName(String checkTemplateName) {
		this.checkTemplateName = checkTemplateName;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
