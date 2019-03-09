package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class DelCheckItemByIdsParam {
	@ApiModelProperty(value = "检查项ID", required = true)
	private List<String> checkItemIdList;
	
	@ApiModelProperty(value = "检查模板ID", required = true)
	private String checktemplateId;

	public List<String> getCheckItemIdList() {
		return checkItemIdList;
	}

	public void setCheckItemIdList(List<String> checkItemIdList) {
		this.checkItemIdList = checkItemIdList;
	}

	public String getChecktemplateId() {
		return checktemplateId;
	}

	public void setChecktemplateId(String checktemplateId) {
		this.checktemplateId = checktemplateId;
	}
}
