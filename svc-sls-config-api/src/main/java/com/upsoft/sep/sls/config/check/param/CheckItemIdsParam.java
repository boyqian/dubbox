package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class CheckItemIdsParam {
	@ApiModelProperty(value = "检查项ID列表", required = true)
	private List<String>itemIdList;

	public List<String> getItemIdList() {
		return itemIdList;
	}

	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}
	
}
