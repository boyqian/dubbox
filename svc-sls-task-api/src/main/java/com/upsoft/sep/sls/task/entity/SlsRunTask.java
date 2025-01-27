package com.upsoft.sep.sls.task.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import javax.persistence.Id;

import lombok.Data;

import com.upsoft.sep.autocoder.client.libs.AutoCoderDataRule;

/**
 * 正在运行中的任务
 * 
 * sls_run_task
 *
 */
@Data
public class SlsRunTask {
    /**
     * 主键ID
     *
     * sls_run_task.id
     *
     */
    @Id
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "主键ID", required = false)
    private String id;

    /**
     * 任务标题
     *
     * sls_run_task.title
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务标题", required = false)
    private String title;

    /**
     * 任务类型编码
     *
     * sls_run_task.type_code
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务类型编码", required = false)
    private String typeCode;

    /**
     * 任务类型名称
     *
     * sls_run_task.type_value
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务类型名称", required = true)
    private String typeValue;

    /**
     * 任务紧急程度编码
     *
     * sls_run_task.level_code
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务紧急程度编码", required = false)
    private String levelCode;

    /**
     * 任务紧急程度名称
     *
     * sls_run_task.level_value
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务紧急程度名称", required = true)
    private String levelValue;

    /**
     * 任务负责人
     *
     * sls_run_task.assignee_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务负责人", required = false)
    private String assigneeId;

    /**
     * 任务负责人名字
     *
     * sls_run_task.assignee_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务负责人名字", required = true)
    private String assigneeName;

    /**
     * 任务协助人员, 不能处理任务, 只能收到任务动态消息
     *
     * sls_run_task.assistant_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务协助人员, 不能处理任务, 只能收到任务动态消息", required = true)
    private String assistantId;

    /**
     * 任务协助人员名字
     *
     * sls_run_task.assistant_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务协助人员名字", required = true)
    private String assistantName;

    /**
     * 任务派发人ID
     *
     * sls_run_task.scheduler_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务派发人ID", required = false)
    private String schedulerId;

    /**
     * 任务派发人名字
     *
     * sls_run_task.scheduler_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务派发人名字", required = true)
    private String schedulerName;

    /**
     * 任务派发时间
     *
     * sls_run_task.assign_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务派发时间", required = false)
    private Date assignTime;

    /**
     * 任务转交人ID
     *
     * sls_run_task.deliverer_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务转交人ID", required = true)
    private String delivererId;

    /**
     * 任务转交人名字
     *
     * sls_run_task.deliverer_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务转交人名字", required = true)
    private String delivererName;

    /**
     * 任务督办人ID
     *
     * sls_run_task.supervisor_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务督办人ID", required = true)
    private String supervisorId;

    /**
     * 任务督办人名字
     *
     * sls_run_task.supervisor_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务督办人名字", required = true)
    private String supervisorName;

    /**
     * 任务转交要求说明
     *
     * sls_run_task.deliver_note
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务转交要求说明", required = true)
    private String deliverNote;

    /**
     * 任务督办信息
     *
     * sls_run_task.supervisory_note
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务督办信息", required = true)
    private String supervisoryNote;

    /**
     * 任务处理意见
     *
     * sls_run_task.treatment_suggestion
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务处理意见", required = true)
    private String treatmentSuggestion;

    /**
     * 任务详情
     *
     * sls_run_task.detail
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务详情", required = true)
    private String detail;

    /**
     * 任务开始时间
     *
     * sls_run_task.start_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务开始时间", required = true)
    private Date startTime;

    /**
     * 任务处理时间: 任务在每个步骤处理的实时时间
     *
     * sls_run_task.process_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务处理时间: 任务在每个步骤处理的实时时间", required = false)
    private Date processTime;

    /**
     * 任务完成时间
     *
     * sls_run_task.end_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务完成时间", required = true)
    private Date endTime;

    /**
     * 任务截止时间
     *
     * sls_run_task.deadline
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务截止时间", required = false)
    private Date deadline;

    /**
     * 任务创建时间
     *
     * sls_run_task.create_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务创建时间", required = true)
    private Date createTime;

    /**
     * 任务修改时间: 指拟定任务但未派发的修改时间
     *
     * sls_run_task.update_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务修改时间: 指拟定任务但未派发的修改时间", required = true)
    private Date updateTime;

    /**
     * 任务当前状态: 0-已拟定, 1-已派发, 2-已签收, 3-已退回 , 4-已撤销, 5-已完成
     *
     * sls_run_task.status
     *
     */
    @AutoCoderDataRule(type = "Byte", maxLen = "3",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务当前状态: 0-已拟定, 1-已派发, 2-已签收, 3-已退回 , 4-已撤销, 5-已完成", required = true)
    private Byte status;

    /**
     * 任务检查模板ID
     *
     * sls_run_task.template_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务检查模板ID", required = true)
    private String templateId;

    /**
     * 任务检查模板名称
     *
     * sls_run_task.template_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务检查模板名称", required = true)
    private String templateName;

    /**
     * 任务生成附件: 指新增任务时上传的附件
     *
     * sls_run_task.attachment_task_add
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务生成附件: 指新增任务时上传的附件", required = true)
    private String attachmentTaskAdd;

    /**
     * 任务处理附件: 指处理任务时上传的附件
     *
     * sls_run_task.attachment_task_close
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务处理附件: 指处理任务时上传的附件", required = true)
    private String attachmentTaskClose;

    /**
     * 计划任务周期代码
     *
     * sls_run_task.scheduled_task_period_code
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "计划任务周期代码", required = true)
    private String scheduledTaskPeriodCode;

    /**
     * 计划任务周期名称
     *
     * sls_run_task.scheduled_task_period_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "计划任务周期名称", required = true)
    private String scheduledTaskPeriodName;

    /**
     * 计划任务首次派发时间
     *
     * sls_run_task.scheduled_task_first_arrange
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "计划任务首次派发时间", required = true)
    private Date scheduledTaskFirstArrange;

    /**
     * 计划任务执行时长(天)
     *
     * sls_run_task.task_execution_days
     *
     */
    @AutoCoderDataRule(type = "Short", maxLen = "5",minLen = "0",require = "true")
    @ApiModelProperty(value = "计划任务执行时长(天)", required = true)
    private Short taskExecutionDays;

    /**
     * 备用字段1
     *
     * sls_run_task.standby1
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段1", required = true)
    private String standby1;

    /**
     * 备用字段2
     *
     * sls_run_task.standby2
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段2", required = true)
    private String standby2;

    /**
     * 备用字段3
     *
     * sls_run_task.standby3
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段3", required = true)
    private String standby3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getLevelValue() {
        return levelValue;
    }

    public void setLevelValue(String levelValue) {
        this.levelValue = levelValue;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    public String getSchedulerId() {
        return schedulerId;
    }

    public void setSchedulerId(String schedulerId) {
        this.schedulerId = schedulerId;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public String getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(String delivererId) {
        this.delivererId = delivererId;
    }

    public String getDelivererName() {
        return delivererName;
    }

    public void setDelivererName(String delivererName) {
        this.delivererName = delivererName;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getDeliverNote() {
        return deliverNote;
    }

    public void setDeliverNote(String deliverNote) {
        this.deliverNote = deliverNote;
    }

    public String getSupervisoryNote() {
        return supervisoryNote;
    }

    public void setSupervisoryNote(String supervisoryNote) {
        this.supervisoryNote = supervisoryNote;
    }

    public String getTreatmentSuggestion() {
        return treatmentSuggestion;
    }

    public void setTreatmentSuggestion(String treatmentSuggestion) {
        this.treatmentSuggestion = treatmentSuggestion;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getAttachmentTaskAdd() {
        return attachmentTaskAdd;
    }

    public void setAttachmentTaskAdd(String attachmentTaskAdd) {
        this.attachmentTaskAdd = attachmentTaskAdd;
    }

    public String getAttachmentTaskClose() {
        return attachmentTaskClose;
    }

    public void setAttachmentTaskClose(String attachmentTaskClose) {
        this.attachmentTaskClose = attachmentTaskClose;
    }

    public String getScheduledTaskPeriodCode() {
        return scheduledTaskPeriodCode;
    }

    public void setScheduledTaskPeriodCode(String scheduledTaskPeriodCode) {
        this.scheduledTaskPeriodCode = scheduledTaskPeriodCode;
    }

    public String getScheduledTaskPeriodName() {
        return scheduledTaskPeriodName;
    }

    public void setScheduledTaskPeriodName(String scheduledTaskPeriodName) {
        this.scheduledTaskPeriodName = scheduledTaskPeriodName;
    }

    public Date getScheduledTaskFirstArrange() {
        return scheduledTaskFirstArrange;
    }

    public void setScheduledTaskFirstArrange(Date scheduledTaskFirstArrange) {
        this.scheduledTaskFirstArrange = scheduledTaskFirstArrange;
    }

    public Short getTaskExecutionDays() {
        return taskExecutionDays;
    }

    public void setTaskExecutionDays(Short taskExecutionDays) {
        this.taskExecutionDays = taskExecutionDays;
    }

    public String getStandby1() {
        return standby1;
    }

    public void setStandby1(String standby1) {
        this.standby1 = standby1;
    }

    public String getStandby2() {
        return standby2;
    }

    public void setStandby2(String standby2) {
        this.standby2 = standby2;
    }

    public String getStandby3() {
        return standby3;
    }

    public void setStandby3(String standby3) {
        this.standby3 = standby3;
    }
}