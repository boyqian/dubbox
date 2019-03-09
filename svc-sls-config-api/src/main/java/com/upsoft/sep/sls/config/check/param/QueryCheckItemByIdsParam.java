package com.upsoft.sep.sls.config.check.param;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class QueryCheckItemByIdsParam {
	@ApiModelProperty(value = "选项目ID", required = true)
	private List<String> checkItemId;

	public List<String> getCheckItemId() {
		return checkItemId;
	}

	public void setCheckItemId(List<String> checkItemId) {
		this.checkItemId = checkItemId;
	}

}
