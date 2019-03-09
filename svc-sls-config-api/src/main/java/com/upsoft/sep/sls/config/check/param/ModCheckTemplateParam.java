package com.upsoft.sep.sls.config.check.param;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.List;

/**
 * 
 * Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
 * All rights reserved.<br>
 *
 * 文件名称：ModCheckTemplateParam.java<br>
 * 摘要：简要描述本文件的内容<br>
 * -------------------------------------------------------<br>
 * 当前版本：1.1.1<br>
 * 作者：wang meng <br>
 * 完成日期：2016年10月29日<br>
 * -------------------------------------------------------<br>
 * 取代版本：1.1.0<br>
 * 原作者：wang meng <br>
 * 完成日期：2016年10月29日<br>
 */
public class ModCheckTemplateParam {
	@ApiModelProperty(value = "模板ID", required = true)
	private String checkTemplateId;
	@ApiModelProperty(value = "模板名", required = true)
	private String checkTemplateName;
	@ApiModelProperty(value = "级别编码", required = true)
	private String levelCode;
	@ApiModelProperty(value = "级别", required = true)
	private String levelName;
	@ApiModelProperty(value = "状态", required = true)
	private String status;
	@ApiModelProperty(value = "备注", required = false)
	private String remark;
	@ApiModelProperty(value = "版本时间", required = false)
	private Timestamp versionTime;
	@ApiModelProperty(value = "检查项目id列表", required = false)
	private List<String> childItemId;
	
	public String getCheckTemplateId() {
		return checkTemplateId;
	}

	public void setCheckTemplateId(String checkTemplateId) {
		this.checkTemplateId = checkTemplateId;
	}

	public String getCheckTemplateName() {
		return checkTemplateName;
	}

	public void setCheckTemplateName(String checkTemplateName) {
		this.checkTemplateName = checkTemplateName;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getVersionTime() {
		return versionTime;
	}

	public void setVersionTime(Timestamp versionTime) {
		this.versionTime = versionTime;
	}

	public List<String> getChildItemId() {
		return childItemId;
	}

	public void setChildItemId(List<String> childItemId) {
		this.childItemId = childItemId;
	}
}
