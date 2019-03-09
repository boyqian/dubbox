package com.upsoft.sep.sls.config.schedule.entity;

import com.upsoft.sep.autocoder.client.libs.AutoCoderDataRule;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import javax.persistence.Id;

/**
 * 调度时间配置主要用于根据问题来源和紧急程度设置指挥调度首问题处理派发任务的截止时间
 * 
 * sls_config_schedule_time
 *
 */
@Data
public class ConfigScheduleTime {

    /**
     * 主键ID
     *
     * sls_config_schedule_time.id
     *
     */
    @Id
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "主键ID", required = false)
    private String id;

    /**
     * 问题来源编码
     *
     * sls_config_schedule_time.source_code
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "问题来源编码", required = false)
    private String sourceCode;

    /**
     * 问题来源名称
     *
     * sls_config_schedule_time.source_value
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "问题来源名称", required = true)
    private String sourceValue;

    /**
     * 紧急程度代码
     *
     * sls_config_schedule_time.urgency_degree_code
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "紧急程度代码", required = false)
    private String urgencyDegreeCode;

    /**
     * 紧急程度名称
     *
     * sls_config_schedule_time.urgency_degree_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "20",minLen = "0",require = "true")
    @ApiModelProperty(value = "紧急程度名称", required = true)
    private String urgencyDegreeName;

    /**
     * 处理时间类型代码: 0-自然日, 1-工作日
     *
     * sls_config_schedule_time.day_type_code
     *
     */
    @AutoCoderDataRule(type = "Byte", maxLen = "3",minLen = "0",require = "false")
    @ApiModelProperty(value = "处理时间类型代码: 0-自然日, 1-工作日", required = false)
    private Byte dayTypeCode;

    /**
     * 处理时间类型名称
     *
     * sls_config_schedule_time.day_type_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "20",minLen = "0",require = "true")
    @ApiModelProperty(value = "处理时间类型名称", required = true)
    private String dayTypeName;

    /**
     * 处理周期(天)
     *
     * sls_config_schedule_time.days
     *
     */
    @AutoCoderDataRule(type = "Byte", maxLen = "3",minLen = "0",require = "false")
    @ApiModelProperty(value = "处理周期(天)", required = false)
    private Byte days;

    /**
     * 修改时间
     *
     * sls_config_schedule_time.update_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "修改时间", required = true)
    private Date updateTime;

    /**
     * 创建时间
     *
     * sls_config_schedule_time.create_time
     *
     */
    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 备用字段1
     *
     * sls_config_schedule_time.standby1
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段1", required = true)
    private String standby1;

    /**
     * 备用字段2
     *
     * sls_config_schedule_time.standby2
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段2", required = true)
    private String standby2;

}