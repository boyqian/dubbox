package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

public class QueryCheckTemplateByIdParam {
	@ApiModelProperty(value = "模板ID", required = true)
	private String checkTemplateId;
	@ApiModelProperty(value = "是否是移动端，是：传非空", required = false)
	private String isApp;
	@ApiModelProperty(value = "项目类型，-1为所有数据", required = false)
	private String itemTypeCode;

	public String getCheckTemplateId() {
		return checkTemplateId;
	}

	public void setCheckTemplateId(String checkTemplateId) {
		this.checkTemplateId = checkTemplateId;
	}

	public String getIsApp() {
		return isApp;
	}

	public void setIsApp(String isApp) {
		this.isApp = isApp;
	}

	public String getItemTypeCode() {
		return itemTypeCode;
	}

	public void setItemTypeCode(String itemTypeCode) {
		this.itemTypeCode = itemTypeCode;
	}
	
	
}
