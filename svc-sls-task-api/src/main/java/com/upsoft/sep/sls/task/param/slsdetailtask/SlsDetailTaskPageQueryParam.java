package com.upsoft.sep.sls.task.param.slsdetailtask;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Id;
	        	
	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

import java.util.Date;	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	


	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	
	        	
/**
 * 分页条件查询slsdetailtask参数类 
 * @author autoCoder
 */
public class SlsDetailTaskPageQueryParam {
	
        @Id
        @ApiModelProperty(value = "id", required = true)
        private String id;
        @ApiModelProperty(value = "taskId", required = false)
        private String taskId;
        @ApiModelProperty(value = "taskTitle", required = false)
        private String taskTitle;
        @ApiModelProperty(value = "dailyEnterpriseId", required = false)
        private String dailyEnterpriseId;
        @ApiModelProperty(value = "dailyEnterpriseName", required = false)
        private String dailyEnterpriseName;
        @ApiModelProperty(value = "dailyGridId", required = true)
        private String dailyGridId;
        @ApiModelProperty(value = "dailyGridName", required = true)
        private String dailyGridName;
        @ApiModelProperty(value = "dailyEnterpriseAddress", required = false)
        private String dailyEnterpriseAddress;
        @ApiModelProperty(value = "dailyConstructionId", required = false)
        private String dailyConstructionId;
        @ApiModelProperty(value = "dailyConstructionAddress", required = false)
        private String dailyConstructionAddress;
        @ApiModelProperty(value = "dailyConstructionUnit", required = false)
        private String dailyConstructionUnit;
        @ApiModelProperty(value = "dailyConstructionName", required = false)
        private String dailyConstructionName;
        @ApiModelProperty(value = "dailyConstructionImplement", required = false)
        private String dailyConstructionImplement;
        @ApiModelProperty(value = "dailyInspectionContent", required = false)
        private String dailyInspectionContent;
        @ApiModelProperty(value = "dailyNote", required = false)
        private String dailyNote;
        @ApiModelProperty(value = "specialInitiateUnit", required = false)
        private String specialInitiateUnit;
        @ApiModelProperty(value = "specialStartTime", required = false)
        private Date specialStartTime;
        @ApiModelProperty(value = "specialNote", required = false)
        private String specialNote;
        @ApiModelProperty(value = "specialEnterpriseId", required = false)
        private String specialEnterpriseId;
        @ApiModelProperty(value = "specialEnterpriseName", required = false)
        private String specialEnterpriseName;
        @ApiModelProperty(value = "specialConstructionId", required = false)
        private String specialConstructionId;
        @ApiModelProperty(value = "specialConstructionName", required = false)
        private String specialConstructionName;
        @ApiModelProperty(value = "specialEndTime", required = false)
        private Date specialEndTime;
        @ApiModelProperty(value = "specialActionContent", required = false)
        private String specialActionContent;
        @ApiModelProperty(value = "specialActionName", required = false)
        private String specialActionName;
        @ApiModelProperty(value = "temporaryTaskContent", required = false)
        private String temporaryTaskContent;
        @ApiModelProperty(value = "createTime", required = false)
        private Date createTime;
        @ApiModelProperty(value = "updateTime", required = false)
        private Date updateTime;
        @ApiModelProperty(value = "standby1", required = false)
        private String standby1;
        @ApiModelProperty(value = "standby2", required = false)
        private String standby2;
        @ApiModelProperty(value = "standby3", required = false)
        private String standby3;
	
	     public String getId() {
			   return id;
			   
		   }
	     public String getDailyEnterpriseId() {
			   return dailyEnterpriseId;
			   
		   }
	     public void setDailyEnterpriseId(String dailyEnterpriseId) {
			   
			   this.dailyEnterpriseId=dailyEnterpriseId;
		   }
	     public String getDailyEnterpriseName() {
			   return dailyEnterpriseName;
			   
		   }
	     public void setDailyEnterpriseName(String dailyEnterpriseName) {
			   
			   this.dailyEnterpriseName=dailyEnterpriseName;
		   }
	     public String getDailyGridId() {
			   return dailyGridId;
			   
		   }
	     public void setDailyGridId(String dailyGridId) {
			   
			   this.dailyGridId=dailyGridId;
		   }
	     public String getDailyGridName() {
			   return dailyGridName;
			   
		   }
	     public void setDailyGridName(String dailyGridName) {
			   
			   this.dailyGridName=dailyGridName;
		   }
	     public String getDailyEnterpriseAddress() {
			   return dailyEnterpriseAddress;
			   
		   }
	     public void setDailyEnterpriseAddress(String dailyEnterpriseAddress) {
			   
			   this.dailyEnterpriseAddress=dailyEnterpriseAddress;
		   }
	     public String getDailyConstructionId() {
			   return dailyConstructionId;
			   
		   }
	     public void setDailyConstructionId(String dailyConstructionId) {
			   
			   this.dailyConstructionId=dailyConstructionId;
		   }
	     public String getDailyConstructionAddress() {
			   return dailyConstructionAddress;
			   
		   }
	     public void setDailyConstructionAddress(String dailyConstructionAddress) {
			   
			   this.dailyConstructionAddress=dailyConstructionAddress;
		   }
	     public String getDailyConstructionUnit() {
			   return dailyConstructionUnit;
			   
		   }
	     public void setDailyConstructionUnit(String dailyConstructionUnit) {
			   
			   this.dailyConstructionUnit=dailyConstructionUnit;
		   }
	     public String getDailyConstructionName() {
			   return dailyConstructionName;
			   
		   }
	     public void setDailyConstructionName(String dailyConstructionName) {
			   
			   this.dailyConstructionName=dailyConstructionName;
		   }
	     public String getDailyConstructionImplement() {
			   return dailyConstructionImplement;
			   
		   }
	     public void setDailyConstructionImplement(String dailyConstructionImplement) {
			   
			   this.dailyConstructionImplement=dailyConstructionImplement;
		   }
	     public String getDailyInspectionContent() {
			   return dailyInspectionContent;
			   
		   }
	     public void setDailyInspectionContent(String dailyInspectionContent) {
			   
			   this.dailyInspectionContent=dailyInspectionContent;
		   }
	     public String getSpecialInitiateUnit() {
			   return specialInitiateUnit;
			   
		   }
	     public void setSpecialInitiateUnit(String specialInitiateUnit) {
			   
			   this.specialInitiateUnit=specialInitiateUnit;
		   }
	     public Date getSpecialStartTime() {
			   return specialStartTime;
			   
		   }
	     public void setSpecialStartTime(Date specialStartTime) {
			   
			   this.specialStartTime=specialStartTime;
		   }
	     public String getSpecialNote() {
			   return specialNote;
			   
		   }
	     public void setSpecialNote(String specialNote) {
			   
			   this.specialNote=specialNote;
		   }
	     public String getSpecialEnterpriseId() {
			   return specialEnterpriseId;
			   
		   }
	     public void setSpecialEnterpriseId(String specialEnterpriseId) {
			   
			   this.specialEnterpriseId=specialEnterpriseId;
		   }
	     public String getSpecialEnterpriseName() {
			   return specialEnterpriseName;
			   
		   }
	     public void setSpecialEnterpriseName(String specialEnterpriseName) {
			   
			   this.specialEnterpriseName=specialEnterpriseName;
		   }
	     public String getSpecialConstructionId() {
			   return specialConstructionId;
			   
		   }
	     public void setSpecialConstructionId(String specialConstructionId) {
			   
			   this.specialConstructionId=specialConstructionId;
		   }
	     public String getSpecialConstructionName() {
			   return specialConstructionName;
			   
		   }
	     public void setSpecialConstructionName(String specialConstructionName) {
			   
			   this.specialConstructionName=specialConstructionName;
		   }
	     public Date getSpecialEndTime() {
			   return specialEndTime;
			   
		   }
	     public void setSpecialEndTime(Date specialEndTime) {
			   
			   this.specialEndTime=specialEndTime;
		   }
	     public String getSpecialActionContent() {
			   return specialActionContent;
			   
		   }
	     public void setSpecialActionContent(String specialActionContent) {
			   
			   this.specialActionContent=specialActionContent;
		   }
	     public String getSpecialActionName() {
			   return specialActionName;
			   
		   }
	     public void setSpecialActionName(String specialActionName) {
			   
			   this.specialActionName=specialActionName;
		   }
	     public String getTemporaryTaskContent() {
			   return temporaryTaskContent;
			   
		   }
	     public void setTemporaryTaskContent(String temporaryTaskContent) {
			   
			   this.temporaryTaskContent=temporaryTaskContent;
		   }
	     public void setId(String id) {
			   
			   this.id=id;
		   }
	     public String getTaskId() {
			   return taskId;
			   
		   }
	     public void setTaskId(String taskId) {
			   
			   this.taskId=taskId;
		   }
	     public String getTaskTitle() {
			   return taskTitle;
			   
		   }
	     public void setTaskTitle(String taskTitle) {
			   
			   this.taskTitle=taskTitle;
		   }
	     public String getDailyNote() {
			   return dailyNote;
			   
		   }
	     public void setDailyNote(String dailyNote) {
			   
			   this.dailyNote=dailyNote;
		   }
	     public Date getCreateTime() {
			   return createTime;
			   
		   }
	     public void setCreateTime(Date createTime) {
			   
			   this.createTime=createTime;
		   }
	     public Date getUpdateTime() {
			   return updateTime;
			   
		   }
	     public void setUpdateTime(Date updateTime) {
			   
			   this.updateTime=updateTime;
		   }
	     public String getStandby1() {
			   return standby1;
			   
		   }
	     public void setStandby1(String standby1) {
			   
			   this.standby1=standby1;
		   }
	     public String getStandby2() {
			   return standby2;
			   
		   }
	     public void setStandby2(String standby2) {
			   
			   this.standby2=standby2;
		   }
	     public String getStandby3() {
			   return standby3;
			   
		   }
	     public void setStandby3(String standby3) {
			   
			   this.standby3=standby3;
		   }
}
