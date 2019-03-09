package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

public class QueryCheckItemByNameParam {
	@ApiModelProperty(value = "选项目名", required = true)
	private String checkItemName;

	public String getCheckItemName() {
		return checkItemName;
	}

	public void setCheckItemName(String checkItemName) {
		this.checkItemName = checkItemName;
	}
}
