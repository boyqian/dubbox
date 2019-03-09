package com.upsoft.sep.sls.task.param.slsruntask;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import javax.persistence.Id;

import lombok.Data;

import com.upsoft.sep.autocoder.client.libs.AutoCoderDataRule;


/**
 * 任务信息修改参数
 * @author chris
 *
 */
@Data
public class SlsRunTaskAndDetailModParam {
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
    
    /**
     * 任务ID
     *
     * sls_detail_task.task_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "任务ID", required = false)
    private String taskId;

    /**
     * 任务标题
     *
     * sls_detail_task.task_title
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "任务标题", required = true)
    private String taskTitle;

    /**
     * 日常任务-企业ID
     *
     * sls_detail_task.daily_enterprise_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-企业ID", required = true)
    private String dailyEnterpriseId;

    /**
     * 日常任务-企业名称
     *
     * sls_detail_task.daily_enterprise_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-企业名称", required = true)
    private String dailyEnterpriseName;

    /**
     * 日常任务-企业所属网格ID
     *
     * sls_detail_task.daily_grid_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-企业所属网格ID", required = true)
    private String dailyGridId;

    /**
     * 日常任务-企业所属网格名称
     *
     * sls_detail_task.daily_grid_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "100",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-企业所属网格名称", required = true)
    private String dailyGridName;

    /**
     * 日常任务-企业详细地址
     *
     * sls_detail_task.daily_enterprise_address
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-企业详细地址", required = true)
    private String dailyEnterpriseAddress;

    /**
     * 日常任务-在建工地ID
     *
     * sls_detail_task.daily_construction_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-在建工地ID", required = true)
    private String dailyConstructionId;

    /**
     * 日常任务-在建工地建设位置
     *
     * sls_detail_task.daily_construction_address
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-在建工地建设位置", required = true)
    private String dailyConstructionAddress;

    /**
     * 日常任务-在建工地建设单位
     *
     * sls_detail_task.daily_construction_unit
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-在建工地建设单位", required = true)
    private String dailyConstructionUnit;

    /**
     * 日常任务-在建工地项目名称
     *
     * sls_detail_task.daily_construction_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-在建工地项目名称", required = true)
    private String dailyConstructionName;

    /**
     * 日常任务-在建工地施工单位
     *
     * sls_detail_task.daily_construction_implement
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-在建工地施工单位", required = true)
    private String dailyConstructionImplement;

    /**
     * 日常任务-巡查内容重点
     *
     * sls_detail_task.daily_inspection_content
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-巡查内容重点", required = true)
    private String dailyInspectionContent;

    /**
     * 日常任务-注意事项
     *
     * sls_detail_task.daily_note
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "日常任务-注意事项", required = true)
    private String dailyNote;

    /**
     * 专项行动-发起单位
     *
     * sls_detail_task.special_initiate_unit
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-发起单位", required = true)
    private String specialInitiateUnit;

    /**
     * 专项行动-开始时间
     *
     * sls_detail_task.special_start_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-开始时间", required = true)
    private Date specialStartTime;

    /**
     * 专项行动-注意事项
     *
     * sls_detail_task.special_note
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-注意事项", required = true)
    private String specialNote;

    /**
     * 专项行动-相关企业ID列表
     *
     * sls_detail_task.special_enterprise_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-相关企业ID列表", required = true)
    private String specialEnterpriseId;

    /**
     * 专项行动-相关企业名称列表
     *
     * sls_detail_task.special_enterprise_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-相关企业名称列表", required = true)
    private String specialEnterpriseName;

    /**
     * 专项行动-相关在建工地ID列表
     *
     * sls_detail_task.special_construction_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-相关在建工地ID列表", required = true)
    private String specialConstructionId;

    /**
     * 专项行动-相关在建工地项目名称列表
     *
     * sls_detail_task.special_construction_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-相关在建工地项目名称列表", required = true)
    private String specialConstructionName;

    /**
     * 专项行动-结束时间
     *
     * sls_detail_task.special_end_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-结束时间", required = true)
    private Date specialEndTime;

    /**
     * 专项行动-行动内容
     *
     * sls_detail_task.special_action_content
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-行动内容", required = true)
    private String specialActionContent;

    /**
     * 专项行动-行动名称
     *
     * sls_detail_task.special_action_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "true")
    @ApiModelProperty(value = "专项行动-行动名称", required = true)
    private String specialActionName;

    /**
     * 临时任务-任务详情
     *
     * sls_detail_task.temporary_task_content
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "500",minLen = "0",require = "true")
    @ApiModelProperty(value = "临时任务-任务详情", required = true)
    private String temporaryTaskContent;

    

}
