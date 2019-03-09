package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.List;

public class AddItemOptRelParam {
	@ApiModelProperty(value = "检查项ID", required = true)
	private String  checkItemId;
	@ApiModelProperty(value = "检查选项ID", required = true)
	private String checkOptId;
	@ApiModelProperty(value = "版本时间", required = true)
	private Timestamp versionTime;
	private String pcItemId;


	public String getCheckItemId() {
		return checkItemId;
	}

	public void setCheckItemId(String checkItemId) {
		this.checkItemId = checkItemId;
	}

	public String getCheckOptId() {
		return checkOptId;
	}

	public void setCheckOptId(String checkOptId) {
		this.checkOptId = checkOptId;
	}

	public Timestamp getVersionTime() {
		return versionTime;
	}

	public void setVersionTime(Timestamp versionTime) {
		this.versionTime = versionTime;
	}

	public String getPcItemId() {
		return pcItemId;
	}

	public void setPcItemId(String pcItemId) {
		this.pcItemId = pcItemId;
	}
}
