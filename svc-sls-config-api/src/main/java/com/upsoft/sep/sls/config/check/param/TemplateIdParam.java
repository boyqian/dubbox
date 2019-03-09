package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

public class TemplateIdParam {
	@ApiModelProperty(value = "模板ID", required = true)
	private String templateId;

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
