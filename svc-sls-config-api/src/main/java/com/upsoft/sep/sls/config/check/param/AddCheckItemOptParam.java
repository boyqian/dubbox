package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class AddCheckItemOptParam {
	@ApiModelProperty(value = " 选项ID", required = true)
	private String checkOptId;
	@ApiModelProperty(value = "项目ID", required = true)
	private String checkItemId;
	@ApiModelProperty(value = "选项名", required = true)
	private String checkOptName;
	@ApiModelProperty(value = "选项值是否有效", required = true)
	private String isValueValid;
	@ApiModelProperty(value = "选项录入类型", required = true)
	private String optiInputTypeCode;
	@ApiModelProperty(value = "选项录入类型", required = true)
	private String optiInputTypeName;
	@ApiModelProperty(value = "排序号", required = true)
	private Integer orderNumber;
	@ApiModelProperty(value = "提示信息", required = true)
	private String tips;
	@ApiModelProperty(value = "状态", required = true)
	private String status;
	@ApiModelProperty(value = "创建人编号", required = true)
	private String createrId;
	@ApiModelProperty(value = "创建人姓名", required = true)
	private String createrName;
	@ApiModelProperty(value = "创建人单位编码", required = true)
	private String createrOrgCode;
	@ApiModelProperty(value = "创建人单位名称", required = true)
	private String createrOrgName;
	@ApiModelProperty(value = "创建时间", required = true)
	private Timestamp createTime;
	@ApiModelProperty(value = "版本时间", required = true)
	private Timestamp versionTime;
	@ApiModelProperty(value = "问题类别编码", required = true)
	private String eventLevelCode;
	@ApiModelProperty(value = "问题类别", required = true)
	private String eventLevelName;
	@ApiModelProperty(value = "处理期限", required = true)
	private String handPeroiodDate;
	@ApiModelProperty(value = "处理单元", required = true)
	private String dateUnit;
	private String childItemId;
	private String childItemName;

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

	public String getCheckOptName() {
		return checkOptName;
	}

	public void setCheckOptName(String checkOptName) {
		this.checkOptName = checkOptName;
	}

	public String getIsValueValid() {
		return isValueValid;
	}

	public void setIsValueValid(String isValueValid) {
		this.isValueValid = isValueValid;
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

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreaterId() {
		return createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	public String getCreaterOrgCode() {
		return createrOrgCode;
	}

	public void setCreaterOrgCode(String createrOrgCode) {
		this.createrOrgCode = createrOrgCode;
	}

	public String getCreaterOrgName() {
		return createrOrgName;
	}

	public void setCreaterOrgName(String createrOrgName) {
		this.createrOrgName = createrOrgName;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getVersionTime() {
		return versionTime;
	}

	public void setVersionTime(Timestamp versionTime) {
		this.versionTime = versionTime;
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
