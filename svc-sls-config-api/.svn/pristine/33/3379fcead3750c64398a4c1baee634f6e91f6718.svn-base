package com.upsoft.sep.sls.config.check.param;

import com.upsoft.sep.bp.common.validate.SQLInjectionValidation;

import io.swagger.annotations.ApiModelProperty;

@SQLInjectionValidation
public class QueryCheckTemplatePageParam {
	@ApiModelProperty(value = "模板名", required = false)
	private String checkTemplateName;
	@ApiModelProperty(value = "状态", required = false)
	private String status;
	@ApiModelProperty(value = "级别", required = false)
	private String levelCode;
	
	@SQLInjectionValidation
	private String sortName;
	
	@SQLInjectionValidation
	private String sortOrder;

	public String getCheckTemplateName() {
		return checkTemplateName;
	}

	public void setCheckTemplateName(String checkTemplateName) {
		this.checkTemplateName = checkTemplateName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}
