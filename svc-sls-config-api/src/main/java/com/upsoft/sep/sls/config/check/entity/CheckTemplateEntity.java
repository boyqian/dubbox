package com.upsoft.sep.sls.config.check.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：CheckTemplate.java<br>
 * 摘要：sls_check_template 实体类<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：wang meng <br>
 * 完成日期：2016年10月29日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：wang meng <br>
 * 完成日期：2016年10月29日<br>
 */
public class CheckTemplateEntity {
	/**
	 * 检查模板编码
	 */
	@ApiModelProperty(value = "检查模板编码", required = true)
	private String checkTemplateId;
	/**
	 * 检查模板名称
	 */
	@ApiModelProperty(value = "检查模板名称", required = true)
	private String checkTemplateName;
	/**
     * 级别
     */
	@ApiModelProperty(value = "级别", required = true)
	private String levelCode;
	private String levelName;
	/**
     * 描述
     */
	@ApiModelProperty(value = "描述", required = true)
	private String remark;
	/**
     * 状态
     */
	@ApiModelProperty(value = "状态", required = true)
	private String status;
	/**
     * 创建人
     */
	@ApiModelProperty(value = "创建人", required = true)
	private String createrId;
	private String createrName;
	private String createrOrgCode;
	private String createrOrgName;
	/**
     * 创建时间
     */
	@ApiModelProperty(value = "创建时间", required = true)
	private Long createTime;
	/**
     * 版本时间
     */
	@ApiModelProperty(value = "版本时间", required = true)
	private Long versionTime;

	public String getCheckTemplateId() {
		return checkTemplateId;
	}

	public void setCheckTemplateId(String checkTemplateId) {
		this.checkTemplateId = checkTemplateId == null ? null : checkTemplateId
				.trim();
	}

	public String getCheckTemplateName() {
		return checkTemplateName;
	}

	public void setCheckTemplateName(String checkTemplateName) {
		this.checkTemplateName = checkTemplateName == null ? null
				: checkTemplateName.trim();
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode == null ? null : levelCode.trim();
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName == null ? null : levelName.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getCreaterId() {
		return createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId == null ? null : createrId.trim();
	}

	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName == null ? null : createrName.trim();
	}

	public String getCreaterOrgCode() {
		return createrOrgCode;
	}

	public void setCreaterOrgCode(String createrOrgCode) {
		this.createrOrgCode = createrOrgCode == null ? null : createrOrgCode
				.trim();
	}

	public String getCreaterOrgName() {
		return createrOrgName;
	}

	public void setCreaterOrgName(String createrOrgName) {
		this.createrOrgName = createrOrgName == null ? null : createrOrgName
				.trim();
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getVersionTime() {
		return versionTime;
	}

	public void setVersionTime(Long versionTime) {
		this.versionTime = versionTime;
	}
}