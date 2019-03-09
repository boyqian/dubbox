package com.upsoft.sep.sls.config.check.param;

import java.util.Date;

import com.upsoft.sep.bp.common.validate.SQLInjectionValidation;

import io.swagger.annotations.ApiModelProperty;

@SQLInjectionValidation
public class QueryCheckItemPageParam {
	@ApiModelProperty(value = "项目ID", required = false)
	private String checkItemId;
	@ApiModelProperty(value = "项目名", required = false)
	private String checkItemName;
	@ApiModelProperty(value = "项目类型", required = false)
	private String itemTypeCode;
	@ApiModelProperty(value = "录入方式", required = false)
	private String optionTypeCode;
	@ApiModelProperty(value = "状态", required = false)
	private String status;
	@ApiModelProperty(value = "是否包括停用选项1、是 ；0、否；默认包括", required = false)
	private String isValid;
	@SQLInjectionValidation
	private String sortName;
	@SQLInjectionValidation
	private String sortOrder;
	@ApiModelProperty(value = "时间戳Long", required = false)
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

	public String getCheckItemId() {
		return checkItemId;
	}

	public void setCheckItemId(String checkItemId) {
		this.checkItemId = checkItemId;
	}

	public String getCheckItemName() {
		return checkItemName;
	}

	public void setCheckItemName(String checkItemName) {
		this.checkItemName = checkItemName;
	}

	public String getItemTypeCode() {
		return itemTypeCode;
	}

	public void setItemTypeCode(String itemTypeCode) {
		this.itemTypeCode = itemTypeCode;
	}

	public String getOptionTypeCode() {
		return optionTypeCode;
	}

	public void setOptionTypeCode(String optionTypeCode) {
		this.optionTypeCode = optionTypeCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	
}
