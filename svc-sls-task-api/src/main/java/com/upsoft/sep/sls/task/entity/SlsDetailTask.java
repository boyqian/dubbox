package com.upsoft.sep.sls.task.entity;

import com.upsoft.sep.autocoder.client.libs.AutoCoderDataRule;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import javax.persistence.Id;

import lombok.Data;

/**
 * 任务详情指不同任务类型所包含的具体任务信息, 如日常任务的具体信息有企业和网格信息, 专项行动有行动名称和发起单位等。
 * 
 * sls_detail_task
 *
 */
@Data
public class SlsDetailTask {
    /**
     * 主键ID
     *
     * sls_detail_task.id
     *
     */
    @Id
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "主键ID", required = false)
    private String id;

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

    /**
     * 创建时间
     *
     * sls_detail_task.create_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 修改时间
     *
     * sls_detail_task.update_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "修改时间", required = true)
    private Date updateTime;

    /**
     * 备用字段1
     *
     * sls_detail_task.standby1
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段1", required = true)
    private String standby1;

    /**
     * 备用字段2
     *
     * sls_detail_task.standby2
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段2", required = true)
    private String standby2;

    /**
     * 备用字段3
     *
     * sls_detail_task.standby3
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段3", required = true)
    private String standby3;

}