package com.upsoft.sep.sls.grid.entity;

import com.upsoft.sep.autocoder.client.libs.AutoCoderDataRule;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.Date;

/**
 * 网格和企业的关联表
 * 
 * sls_grid_enterprise
 *
 */
@Data
public class GridEnterprise {
    /**
     * 主键ID
     *
     * sls_grid_enterprise.id
     *
     */
    @Id
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "主键ID", required = false)
    private String id;

    /**
     * 企业ID
     *
     * sls_grid_enterprise.enterprise_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "企业ID", required = false)
    private String enterpriseId;

    /**
     * 企业名称
     *
     * sls_grid_enterprise.enterprise_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "200",minLen = "0",require = "false")
    @ApiModelProperty(value = "企业名称", required = false)
    private String enterpriseName;

    /**
     * 企业地址
     *
     * sls_grid_enterprise.enterprise_address
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "300",minLen = "0",require = "false")
    @ApiModelProperty(value = "企业地址", required = false)
    private String enterpriseAddress;

    @ApiModelProperty(value = "企业经度坐标", required = false)
    private String longitude;

    @ApiModelProperty(value = "企业纬度坐标", required = false)
    private String latitude;

    /**
     * 监管类型编码
     *
     * sls_grid_enterprise.supervision_type_code
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "监管类型编码", required = true)
    private String supervisionTypeCode;

    /**
     * 监管类型名称
     *
     * sls_grid_enterprise.supervision_type_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "监管类型名称", required = true)
    private String supervisionTypeName;

    /**
     * 企业类型编码
     *
     * sls_grid_enterprise.enterprise_type_code
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "企业类型编码", required = true)
    private String enterpriseTypeCode;

    /**
     * 企业类型名称
     *
     * sls_grid_enterprise.enterprise_type_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "企业类型名称", required = true)
    private String enterpriseTypeName;

    /**
     * 巡查人员ID
     *
     * sls_grid_enterprise.inspection_staff_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "巡查人员ID", required = true)
    private String inspectionStaffId;

    /**
     * 巡查人员姓名
     *
     * sls_grid_enterprise.inspection_staff_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "巡查人员姓名", required = true)
    private String inspectionStaffName;

    /**
     * 所属网格ID
     *
     * sls_grid_enterprise.grid_id
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "false")
    @ApiModelProperty(value = "所属网格ID", required = false)
    private String gridId;

    /**
     * 所属网格名称
     *
     * sls_grid_enterprise.grid_name
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "100",minLen = "0",require = "false")
    @ApiModelProperty(value = "所属网格名称", required = false)
    private String gridName;

    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "修改时间", required = true)
    private Date updateTime;

    @AutoCoderDataRule(type = "Date", maxLen = "19",minLen = "0",require = "true")
    @ApiModelProperty(value = "创建时间", required = true)
    private Date createTime;

    /**
     * 备用字段1
     *
     * sls_grid_enterprise.standby1
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段1", required = true)
    private String standby1;

    /**
     * 备用字段2
     *
     * sls_grid_enterprise.standby2
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段2", required = true)
    private String standby2;

    /**
     * 备用字段3
     *
     * sls_grid_enterprise.standby3
     *
     */
    @AutoCoderDataRule(type = "String", maxLen = "50",minLen = "0",require = "true")
    @ApiModelProperty(value = "备用字段3", required = true)
    private String standby3;
}