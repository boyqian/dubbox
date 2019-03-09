package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class DelCheckItemOptParam {
	@ApiModelProperty(value = "检查项项ID", required = true)
	private List<String>optIdList;

	public List<String> getOptIdList() {
		return optIdList;
	}

	public void setOptIdList(List<String> optIdList) {
		this.optIdList = optIdList;
	}
}
