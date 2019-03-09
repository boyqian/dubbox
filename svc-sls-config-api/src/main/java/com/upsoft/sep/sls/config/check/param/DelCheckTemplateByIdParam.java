package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

public class DelCheckTemplateByIdParam {
	@ApiModelProperty(value = "模板ID", required = true)
	private String checkTemplateId;

	public String getCheckTemplateId() {
		return checkTemplateId;
	}

	public void setCheckTemplateId(String checkTemplateId) {
		this.checkTemplateId = checkTemplateId;
	}
}
