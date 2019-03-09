package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

public class QueryCheckItemOptByIdAndNameParam {
	@ApiModelProperty(value = "项目ID", required = true)
	private String checkItemId;
	@ApiModelProperty(value = "选项名", required = true)
	private String checkOptName;

	public String getCheckItemId() {
		return checkItemId;
	}

	public void setCheckItemId(String checkItemId) {
		this.checkItemId = checkItemId;
	}

	public String getCheckOptName() {
		return checkOptName;
	}

	public void setCheckOptName(String checkOptName) {
		this.checkOptName = checkOptName;
	}
	
}
