package com.upsoft.sep.sls.config.check.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 
* Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
* All rights reserved.<br>
*
* 文件名称：CheckItemOptEntity.java<br>
* 摘要：sls_check_item_opt 实体类<br>
* -------------------------------------------------------<br>
* 当前版本：1.1.1<br>
* 作者：wang meng <br>
* 完成日期：2016年10月29日<br>
* -------------------------------------------------------<br>
* 取代版本：1.1.0<br>
* 原作者：wang meng <br>
* 完成日期：2016年10月29日<br>
 */
public class CheckItemOptReturnEntity {
	/**
	 * 检查选项ID
	 */
	@ApiModelProperty(value = "检查选项ID", required = true)
	private String checkOptId;
	/**
	 * 检查项ID
	 */
	@ApiModelProperty(value = "检查项ID", required = false)
	private String checkItemId;
	/**
	 * 检查选项名
	 */
	@ApiModelProperty(value = "检查选项名", required = false)
	private String checkOptName;
	/**
	 * 是否正常
	 */
	@ApiModelProperty(value = "是否正常", required = false)
	private String isValueValid;
	/**
	 * 检查选项值
	 */
	@ApiModelProperty(value = "检查选项值", required = false)
	private String checkOptValue;
	/**
	 * 是否标星
	 */
	@ApiModelProperty(value = "是否标星", required = false)
	private String isMark;
	/**
	 * 录入类型
	 */
	@ApiModelProperty(value = "录入类型", required = false)
	private String optiInputTypeCode;
	private String optiInputTypeName;
	/**
	 * 排序号
	 */
	@ApiModelProperty(value = "排序号", required = false)
	private Short orderNumber;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注", required = false)
	private String tips;
	/**
	 * 预置结论
	 */
	@ApiModelProperty(value = "预置结论", required = false)
	private String summary;
	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态1000:异常；1001异常", required = false)
	private String status;
	/**
	 * 处理期限
	 */
	@ApiModelProperty(value = "处理期限", required = false)
	private String handPeroiodDate;
	/**
	 * 处理期限单位
	 */
	@ApiModelProperty(value = "处理期限单位", required = false)
	private String dateUnit;
	/**
	 * 问题类别
	 */
	@ApiModelProperty(value = "问题类别", required = false)
	private String eventLevelCode;
	private String eventLevelName;
	@ApiModelProperty(value = "子检查项ID", required = false)
	private String childItemId;
	private String childItemName;
	

	public String getCheckOptId() {
		return checkOptId;
	}

	public void setCheckOptId(String checkOptId) {
		this.checkOptId = checkOptId == null ? null : checkOptId.trim();
	}

	public String getCheckItemId() {
		return checkItemId;
	}

	public void setCheckItemId(String checkItemId) {
		this.checkItemId = checkItemId == null ? null : checkItemId.trim();
	}

	public String getCheckOptName() {
		return checkOptName;
	}

	public void setCheckOptName(String checkOptName) {
		this.checkOptName = checkOptName == null ? null : checkOptName.trim();
	}

	public String getIsValueValid() {
		return isValueValid;
	}

	public void setIsValueValid(String isValueValid) {
		this.isValueValid = isValueValid == null ? null : isValueValid.trim();
	}

	public String getCheckOptValue() {
		return checkOptValue;
	}

	public void setCheckOptValue(String checkOptValue) {
		this.checkOptValue = checkOptValue == null ? null : checkOptValue
				.trim();
	}

	public String getIsMark() {
		return isMark;
	}

	public void setIsMark(String isMark) {
		this.isMark = isMark == null ? null : isMark.trim();
	}


	public String getOptiInputTypeCode() {
		return optiInputTypeCode;
	}

	public void setOptiInputTypeCode(String optiInputTypeCode) {
		this.optiInputTypeCode = optiInputTypeCode;
	}

	public String getOptiInputTypeName() {
		return optiInputTypeName;
	}

	public void setOptiInputTypeName(String optiInputTypeName) {
		this.optiInputTypeName = optiInputTypeName;
	}

	public Short getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Short orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips == null ? null : tips.trim();
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary == null ? null : summary.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}


	public String getHandPeroiodDate() {
		return handPeroiodDate;
	}

	public void setHandPeroiodDate(String handPeroiodDate) {
		this.handPeroiodDate = handPeroiodDate;
	}

	public String getDateUnit() {
		return dateUnit;
	}

	public void setDateUnit(String dateUnit) {
		this.dateUnit = dateUnit;
	}

	public String getEventLevelCode() {
		return eventLevelCode;
	}

	public void setEventLevelCode(String eventLevelCode) {
		this.eventLevelCode = eventLevelCode;
	}

	public String getEventLevelName() {
		return eventLevelName;
	}

	public void setEventLevelName(String eventLevelName) {
		this.eventLevelName = eventLevelName;
	}

	public String getChildItemId() {
		return childItemId;
	}

	public void setChildItemId(String childItemId) {
		this.childItemId = childItemId;
	}

	public String getChildItemName() {
		return childItemName;
	}

	public void setChildItemName(String childItemName) {
		this.childItemName = childItemName;
	}
}