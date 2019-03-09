package com.upsoft.sep.sls.config.check.entity;

import io.swagger.annotations.ApiModelProperty;

public class CheckOptEditEntity {
	/**
	 * 检查选项名
	 */
	@ApiModelProperty(value = "检查选项名", required = true)
	private String checkOptName;
	/**
	 * 录入方式
	 */
	@ApiModelProperty(value = "录入方式", required = true)
	private String optiInputTypeCode;
	/**
	 * 是否正常
	 */
	@ApiModelProperty(value = "是否正常", required = true)
	private String isValueValid;
	/**
	 * 问题类别
	 */
	@ApiModelProperty(value = "问题类别", required = true)
	private String eventLevelCode;
	/**
	 * 处理期限单位
	 */
	@ApiModelProperty(value = "处理期限单位", required = true)
	private String dateUnit;
	/**
	 * 处理期限
	 */
	@ApiModelProperty(value = "处理期限", required = true)
	private String handPeroiodDate;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注", required = true)
	private String tips;

	private String childItemId;

	private Integer orderNumber;

	public String getCheckOptName() {
		return checkOptName;
	}

	public void setCheckOptName(String checkOptName) {
		this.checkOptName = checkOptName;
	}

	public String getOptiInputTypeCode() {
		return optiInputTypeCode;
	}

	public void setOptiInputTypeCode(String optiInputTypeCode) {
		this.optiInputTypeCode = optiInputTypeCode;
	}

	public String getIsValueValid() {
		return isValueValid;
	}

	public void setIsValueValid(String isValueValid) {
		this.isValueValid = isValueValid;
	}

	public String getEventLevelCode() {
		return eventLevelCode;
	}

	public void setEventLevelCode(String eventLevelCode) {
		this.eventLevelCode = eventLevelCode;
	}

	public String getDateUnit() {
		return dateUnit;
	}

	public void setDateUnit(String dateUnit) {
		this.dateUnit = dateUnit;
	}

	public String getHandPeroiodDate() {
		return handPeroiodDate;
	}

	public void setHandPeroiodDate(String handPeroiodDate) {
		this.handPeroiodDate = handPeroiodDate;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getChildItemId() {
		return childItemId;
	}

	public void setChildItemId(String childItemId) {
		this.childItemId = childItemId;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
}
