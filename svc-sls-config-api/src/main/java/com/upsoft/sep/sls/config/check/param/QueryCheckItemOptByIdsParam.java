package com.upsoft.sep.sls.config.check.param;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class QueryCheckItemOptByIdsParam {
	@ApiModelProperty(value = "选项目ID", required = true)
	private String checkOptId;
	@ApiModelProperty(value = "项目ID", required = true)
	private String checkItemId;
	@ApiModelProperty(value = "时间戳Long", required = true)
	private Long versionTime;
	@ApiModelProperty(value = "时间戳Date", required = false,hidden=true)
	private Date versionTimeDate;
	
	
	public Long getVersionTime() {
		return versionTime;
	}

	public void setVersionTime(Long versionTime) {
		this.versionTime = versionTime;
	}

	public Date getVersionTimeDate() {
		return versionTimeDate;
	}

	public void setVersionTimeDate(Date versionTimeDate) {
		this.versionTimeDate = versionTimeDate;
	}

	public String getCheckOptId() {
		return checkOptId;
	}

	public void setCheckOptId(String checkOptId) {
		this.checkOptId = checkOptId;
	}

	public String getCheckItemId() {
		return checkItemId;
	}

	public void setCheckItemId(String checkItemId) {
		this.checkItemId = checkItemId;
	}
}
