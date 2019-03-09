package com.upsoft.sep.sls.grid.entity;

import com.upsoft.sep.autocoder.client.libs.AutoCoderDataRule;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

/**
 * 网格管理
 * 
 * sls_grid
 *
 */
@Data
public class SlsGrid {
    /**
     * 主键ID
     *
     * sls_grid.id
     *
     */
    @Id
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "主键ID", required = false)
    private String id;

    /**
     * 网格名称
     *
     * sls_grid.name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "false")
    @ApiModelProperty(value = "网格名称", required = false)
    private String name;

    /**
     * 网格等级编码
     *
     * sls_grid.level_code
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "网格等级编码", required = false)
    private String levelCode;

    /**
     * 网格等级名称
     *
     * sls_grid.level_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "100",minLen = "0",require = "true")
    @ApiModelProperty(value = "网格等级名称", required = true)
    private String levelName;

    /**
     * 上级网格ID
     *
     * sls_grid.parent_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "上级网格ID", required = true)
    private String parentId;

    /**
     * 网格层级
     *
     * sls_grid.grid_layer
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "300",minLen = "0",require = "true")
    @ApiModelProperty(value = "网格层级", required = true)
    private String gridLayer;

    /**
     * 责任单位ID
     *
     * sls_grid.duty_unit_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "责任单位ID", required = true)
    private String dutyUnitId;

    /**
     * 责任单位名称
     *
     * sls_grid.duty_unit_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "100",minLen = "0",require = "true")
    @ApiModelProperty(value = "责任单位名称", required = true)
    private String dutyUnitName;

    /**
     * 分管领导ID
     *
     * sls_grid.division_leader_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "分管领导ID", required = true)
    private String divisionLeaderId;

    /**
     * 分管领导姓名
     *
     * sls_grid.division_leader_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "分管领导姓名", required = true)
    private String divisionLeaderName;

    /**
     * 网格负责人ID
     *
     * sls_grid.grid_manager_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "网格负责人ID", required = false)
    private String gridManagerId;

    /**
     * 网格负责人姓名
     *
     * sls_grid.grid_manager_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "网格负责人姓名", required = true)
    private String gridManagerName;

    /**
     * 网格负责人电话
     *
     * sls_grid.grid_manager_phone
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "网格负责人电话", required = true)
    private String gridManagerPhone;

    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "修改时间", required = true)
    private Date updateTime;

    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 备用字段1
     *
     * sls_grid.standby1
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段1", required = true)
    private String standby1;

    /**
     * 备用字段2
     *
     * sls_grid.standby2
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段2", required = true)
    private String standby2;

    /**
     * 备用字段3
     *
     * sls_grid.standby3
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段3", required = true)
    private String standby3;
}