package com.upsoft.sep.sls.task.param.slsruntask;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Id;
	        	
	        	
	        	

	        	

	        	

	        	

	        	

import java.util.Date;	        	

	        	


	        	
	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	

	        	


	        	

	        	

	        	

	        	

	        	


	        	

	        	

	        	

	        	

	        	

	        	
	        	
/**
 * 分页条件查询slsruntask参数类 
 * @author autoCoder
 */
public class SlsRunTaskPageQueryParam {
	
        @Id
        @ApiModelProperty(value = "id", required = true)
        private String id;
        @ApiModelProperty(value = "title", required = false)
        private String title;
        @ApiModelProperty(value = "typeCode", required = false)
        private String typeCode;
        @ApiModelProperty(value = "typeValue", required = false)
        private String typeValue;
        @ApiModelProperty(value = "levelCode", required = false)
        private String levelCode;
        @ApiModelProperty(value = "levelValue", required = false)
        private String levelValue;
        @ApiModelProperty(value = "assigneeId", required = false)
        private String assigneeId;
        @ApiModelProperty(value = "assigneeName", required = false)
        private String assigneeName;
        @ApiModelProperty(value = "assistantId", required = false)
        private String assistantId;
        @ApiModelProperty(value = "assistantName", required = false)
        private String assistantName;
        @ApiModelProperty(value = "schedulerId", required = false)
        private String schedulerId;
        @ApiModelProperty(value = "schedulerName", required = false)
        private String schedulerName;
        @ApiModelProperty(value = "assignTime", required = false)
        private Date assignTime;
        @ApiModelProperty(value = "delivererId", required = false)
        private String delivererId;
        @ApiModelProperty(value = "delivererName", required = false)
        private String delivererName;
        @ApiModelProperty(value = "supervisorId", required = false)
        private String supervisorId;
        @ApiModelProperty(value = "supervisorName", required = false)
        private String supervisorName;
        @ApiModelProperty(value = "deliverNote", required = false)
        private String deliverNote;
        @ApiModelProperty(value = "supervisoryNote", required = false)
        private String supervisoryNote;
        @ApiModelProperty(value = "treatmentSuggestion", required = false)
        private String treatmentSuggestion;
        @ApiModelProperty(value = "detail", required = false)
        private String detail;
        @ApiModelProperty(value = "startTime", required = false)
        private Date startTime;
        @ApiModelProperty(value = "processTime", required = false)
        private Date processTime;
        @ApiModelProperty(value = "endTime", required = false)
        private Date endTime;
        @ApiModelProperty(value = "deadline", required = false)
        private Date deadline;
        @ApiModelProperty(value = "createTime", required = false)
        private Date createTime;
        @ApiModelProperty(value = "updateTime", required = false)
        private Date updateTime;
        @ApiModelProperty(value = "status", required = false)
        private Byte status;
        @ApiModelProperty(value = "templateId", required = false)
        private String templateId;
        @ApiModelProperty(value = "templateName", required = false)
        private String templateName;
        @ApiModelProperty(value = "attachmentTaskAdd", required = false)
        private String attachmentTaskAdd;
        @ApiModelProperty(value = "attachmentTaskClose", required = false)
        private String attachmentTaskClose;
        @ApiModelProperty(value = "scheduledTaskPeriodCode", required = false)
        private String scheduledTaskPeriodCode;
        @ApiModelProperty(value = "scheduledTaskPeriodName", required = false)
        private String scheduledTaskPeriodName;
        @ApiModelProperty(value = "scheduledTaskFirstArrange", required = false)
        private Date scheduledTaskFirstArrange;
        @ApiModelProperty(value = "taskExecutionDays", required = false)
        private Short taskExecutionDays;
        @ApiModelProperty(value = "standby1", required = false)
        private String standby1;
        @ApiModelProperty(value = "standby2", required = false)
        private String standby2;
        @ApiModelProperty(value = "standby3", required = false)
        private String standby3;
	
	     public String getId() {
			   return id;
			   
		   }
	     public String getTypeCode() {
			   return typeCode;
			   
		   }
	     public String getTemplateName() {
			   return templateName;
			   
		   }
	     public void setTemplateName(String templateName) {
			   
			   this.templateName=templateName;
		   }
	     public String getAttachmentTaskAdd() {
			   return attachmentTaskAdd;
			   
		   }
	     public void setAttachmentTaskAdd(String attachmentTaskAdd) {
			   
			   this.attachmentTaskAdd=attachmentTaskAdd;
		   }
	     public String getAttachmentTaskClose() {
			   return attachmentTaskClose;
			   
		   }
	     public void setAttachmentTaskClose(String attachmentTaskClose) {
			   
			   this.attachmentTaskClose=attachmentTaskClose;
		   }
	     public String getScheduledTaskPeriodCode() {
			   return scheduledTaskPeriodCode;
			   
		   }
	     public void setScheduledTaskPeriodCode(String scheduledTaskPeriodCode) {
			   
			   this.scheduledTaskPeriodCode=scheduledTaskPeriodCode;
		   }
	     public String getScheduledTaskPeriodName() {
			   return scheduledTaskPeriodName;
			   
		   }
	     public void setScheduledTaskPeriodName(String scheduledTaskPeriodName) {
			   
			   this.scheduledTaskPeriodName=scheduledTaskPeriodName;
		   }
	     public Date getScheduledTaskFirstArrange() {
			   return scheduledTaskFirstArrange;
			   
		   }
	     public void setScheduledTaskFirstArrange(Date scheduledTaskFirstArrange) {
			   
			   this.scheduledTaskFirstArrange=scheduledTaskFirstArrange;
		   }
	     public Short getTaskExecutionDays() {
			   return taskExecutionDays;
			   
		   }
	     public void setTaskExecutionDays(Short taskExecutionDays) {
			   
			   this.taskExecutionDays=taskExecutionDays;
		   }
	     public void setProcessTime(Date processTime) {
			   
			   this.processTime=processTime;
		   }
	     public String getDetail() {
			   return detail;
			   
		   }
	     public String getAssigneeName() {
			   return assigneeName;
			   
		   }
	     public void setAssigneeName(String assigneeName) {
			   
			   this.assigneeName=assigneeName;
		   }
	     public String getAssistantId() {
			   return assistantId;
			   
		   }
	     public void setAssistantId(String assistantId) {
			   
			   this.assistantId=assistantId;
		   }
	     public String getAssistantName() {
			   return assistantName;
			   
		   }
	     public void setAssistantName(String assistantName) {
			   
			   this.assistantName=assistantName;
		   }
	     public String getSchedulerId() {
			   return schedulerId;
			   
		   }
	     public void setSchedulerId(String schedulerId) {
			   
			   this.schedulerId=schedulerId;
		   }
	     public String getSchedulerName() {
			   return schedulerName;
			   
		   }
	     public void setSchedulerName(String schedulerName) {
			   
			   this.schedulerName=schedulerName;
		   }
	     public String getDelivererId() {
			   return delivererId;
			   
		   }
	     public void setDelivererId(String delivererId) {
			   
			   this.delivererId=delivererId;
		   }
	     public String getDelivererName() {
			   return delivererName;
			   
		   }
	     public void setDelivererName(String delivererName) {
			   
			   this.delivererName=delivererName;
		   }
	     public String getSupervisorId() {
			   return supervisorId;
			   
		   }
	     public void setSupervisorId(String supervisorId) {
			   
			   this.supervisorId=supervisorId;
		   }
	     public String getSupervisorName() {
			   return supervisorName;
			   
		   }
	     public void setSupervisorName(String supervisorName) {
			   
			   this.supervisorName=supervisorName;
		   }
	     public String getDeliverNote() {
			   return deliverNote;
			   
		   }
	     public void setDeliverNote(String deliverNote) {
			   
			   this.deliverNote=deliverNote;
		   }
	     public String getSupervisoryNote() {
			   return supervisoryNote;
			   
		   }
	     public void setSupervisoryNote(String supervisoryNote) {
			   
			   this.supervisoryNote=supervisoryNote;
		   }
	     public String getTreatmentSuggestion() {
			   return treatmentSuggestion;
			   
		   }
	     public void setTreatmentSuggestion(String treatmentSuggestion) {
			   
			   this.treatmentSuggestion=treatmentSuggestion;
		   }
	     public Date getProcessTime() {
			   return processTime;
			   
		   }
	     public void setId(String id) {
			   
			   this.id=id;
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
	     public String getTitle() {
			   return title;
			   
		   }
	     public void setTitle(String title) {
			   
			   this.title=title;
		   }
	     public void setTypeCode(String typeCode) {
			   
			   this.typeCode=typeCode;
		   }
	     public String getTypeValue() {
			   return typeValue;
			   
		   }
	     public void setTypeValue(String typeValue) {
			   
			   this.typeValue=typeValue;
		   }
	     public String getLevelCode() {
			   return levelCode;
			   
		   }
	     public void setLevelCode(String levelCode) {
			   
			   this.levelCode=levelCode;
		   }
	     public String getLevelValue() {
			   return levelValue;
			   
		   }
	     public void setLevelValue(String levelValue) {
			   
			   this.levelValue=levelValue;
		   }
	     public String getAssigneeId() {
			   return assigneeId;
			   
		   }
	     public void setAssigneeId(String assigneeId) {
			   
			   this.assigneeId=assigneeId;
		   }
	     public Date getAssignTime() {
			   return assignTime;
			   
		   }
	     public void setAssignTime(Date assignTime) {
			   
			   this.assignTime=assignTime;
		   }
	     public void setDetail(String detail) {
			   
			   this.detail=detail;
		   }
	     public Date getStartTime() {
			   return startTime;
			   
		   }
	     public void setStartTime(Date startTime) {
			   
			   this.startTime=startTime;
		   }
	     public Date getEndTime() {
			   return endTime;
			   
		   }
	     public void setEndTime(Date endTime) {
			   
			   this.endTime=endTime;
		   }
	     public Date getDeadline() {
			   return deadline;
			   
		   }
	     public void setDeadline(Date deadline) {
			   
			   this.deadline=deadline;
		   }
	     public Byte getStatus() {
			   return status;
			   
		   }
	     public void setStatus(Byte status) {
			   
			   this.status=status;
		   }
	     public String getTemplateId() {
			   return templateId;
			   
		   }
	     public void setTemplateId(String templateId) {
			   
			   this.templateId=templateId;
		   }
}
