package com.upsoft.sep.sls.task.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import javax.persistence.Id;

import lombok.Data;

import com.upsoft.sep.autocoder.client.libs.AutoCoderDataRule;

/**
 * 任务历史信息
 * 
 * sls_history_task
 *
 */
@Data
public class SlsHistoryTask {
    /**
     * 主键ID
     *
     * sls_history_task.id
     *
     */
    @Id
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "主键ID", required = false)
    private String id;

    /**
     * 任务编号
     *
     * sls_history_task.task_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务编号", required = false)
    private String taskId;

    /**
     * 任务标题
     *
     * sls_history_task.task_title
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务标题", required = true)
    private String taskTitle;

    /**
     * 任务操作编码: 0-派发任务, 1-受理任务, 2-退回任务, 3-撤销任务, 4-转交任务, 5-审核任务, 6-完成任务
     *
     * sls_history_task.task_action_code
     *
     */
    @AutoCoderDataRule(type = "Byte", maxLen = "3",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务操作编码: 0-派发任务, 1-受理任务, 2-退回任务, 3-撤销任务, 4-转交任务, 5-审核任务, 6-完成任务", required = false)
    private Byte taskActionCode;

    /**
     * 任务操作名称
     *
     * sls_history_task.task_action_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "20",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务操作名称", required = true)
    private String taskActionName;

    /**
     * 操作人ID
     *
     * sls_history_task.executor_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "操作人ID", required = false)
    private String executorId;

    /**
     * 操作人姓名
     *
     * sls_history_task.executor_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "操作人姓名", required = true)
    private String executorName;

    /**
     *
     * sls_history_task.execution_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "false")
    @ApiModelProperty(value = "", required = false)
    private Date executionTime;

    /**
     * 创建时间
     *
     * sls_history_task.create_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 修改时间
     *
     * sls_history_task.update_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "修改时间", required = true)
    private Date updateTime;

    /**
     * 备用字段1
     *
     * sls_history_task.standby1
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段1", required = true)
    private String standby1;

    /**
     * 备用字段2
     *
     * sls_history_task.standby2
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段2", required = true)
    private String standby2;

    /**
     * 备用字段3
     *
     * sls_history_task.standby3
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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public Byte getTaskActionCode() {
        return taskActionCode;
    }

    public void setTaskActionCode(Byte taskActionCode) {
        this.taskActionCode = taskActionCode;
    }

    public String getTaskActionName() {
        return taskActionName;
    }

    public void setTaskActionName(String taskActionName) {
        this.taskActionName = taskActionName;
    }

    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public String getExecutorName() {
        return executorName;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public Date getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
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