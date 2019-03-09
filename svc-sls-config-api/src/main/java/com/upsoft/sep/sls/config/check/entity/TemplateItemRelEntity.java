package com.upsoft.sep.sls.config.check.entity;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class TemplateItemRelEntity {
    private String itemFormId;
    /**
     * 项目ID
     */
    @ApiModelProperty(value = "项目ID", required = false)
    private String checkItemId;
    /**
     * 检查模板编码
     */
    @ApiModelProperty(value = "检查模板编码", required = false)
    private String checkTemplateId;
    /**
     * 排序值
     */
    @ApiModelProperty(value = "排序值", required = false)
    private Short orderNum;
    /**
     * 版本时间
     */
    @ApiModelProperty(value = "版本时间", required = false)
    private Timestamp versionTime;

    public String getItemFormId() {
        return itemFormId;
    }

    public void setItemFormId(String itemFormId) {
        this.itemFormId = itemFormId == null ? null : itemFormId.trim();
    }

    public String getCheckItemId() {
        return checkItemId;
    }

    public void setCheckItemId(String checkItemId) {
        this.checkItemId = checkItemId == null ? null : checkItemId.trim();
    }

    public String getCheckTemplateId() {
        return checkTemplateId;
    }

    public void setCheckTemplateId(String checkTemplateId) {
        this.checkTemplateId = checkTemplateId == null ? null : checkTemplateId.trim();
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