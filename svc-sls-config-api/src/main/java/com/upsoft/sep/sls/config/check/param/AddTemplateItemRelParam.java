package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.List;

public class AddTemplateItemRelParam {
	private String itemFormId;
	@ApiModelProperty(value = "项目ID", required = true)
	private String checkItemId;
	@ApiModelProperty(value = "检查模板编码", required = true)
	private String checkTemplateId;
	@ApiModelProperty(value = "排序值", required = true)
	private Short orderNum;
	@ApiModelProperty(value = "版本时间", required = true)
	private Timestamp versionTime;
	
	public String getItemFormId() {
		return itemFormId;
	}

	public void setItemFormId(String itemFormId) {
		this.itemFormId = itemFormId;
	}

	public String getCheckItemId() {
		return checkItemId;
	}

	public void setCheckItemId(String checkItemId) {
		this.checkItemId = checkItemId;
	}

	public String getCheckTemplateId() {
		return checkTemplateId;
	}

	public void setCheckTemplateId(String checkTemplateId) {
		this.checkTemplateId = checkTemplateId;
	}

	public Short getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Short orderNum) {
		this.orderNum = orderNum;
	}

	public Timestamp getVersionTime() {
		return versionTime;
	}

	public void setVersionTime(Timestamp versionTime) {
		this.versionTime = versionTime;
	}

}
