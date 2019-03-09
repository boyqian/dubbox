package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;


public class QueryTemplateItemRelParam {
	@ApiModelProperty(value = "时间戳", required = false)
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
	

}
