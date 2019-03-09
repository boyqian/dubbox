package com.upsoft.sep.sls.grid.param.slsgrid;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;


/**
 * 添加slsgrid参数类
 *
 * @author autoCoder
 */
@Data
public class SlsGridAddParam {

    @Id
    @ApiModelProperty(value = "id", hidden = true)
    private String id;

    @ApiModelProperty(value = "name", required = false)
    private String name;

    @ApiModelProperty(value = "levelCode", required = false)
    private String levelCode;

    @ApiModelProperty(value = "levelName", required = false)
    private String levelName;

    @ApiModelProperty(value = "parentId", required = false)
    private String parentId;

    @ApiModelProperty(value = "gridLayer", required = false)
    private String gridLayer;

    @ApiModelProperty(value = "父节点的层级", required = true)
    private String parentLayer;

    @ApiModelProperty(value = "dutyUnitId", required = false)
    private String dutyUnitId;

    @ApiModelProperty(value = "dutyUnitName", required = false)
    private String dutyUnitName;

    @ApiModelProperty(value = "divisionLeaderId", required = false)
    private String divisionLeaderId;

    @ApiModelProperty(value = "divisionLeaderName", required = false)
    private String divisionLeaderName;

    @ApiModelProperty(value = "gridManagerId", required = false)
    private String gridManagerId;

    @ApiModelProperty(value = "gridManagerName", required = false)
    private String gridManagerName;

    @ApiModelProperty(value = "gridManagerPhone", required = false)
    private String gridManagerPhone;

    @ApiModelProperty(value = "standby1", required = false)
    private String standby1;

    @ApiModelProperty(value = "standby2", required = false)
    private String standby2;

    @ApiModelProperty(value = "standby3", required = false)
    private String standby3;

    @ApiModelProperty(value = "下属监管企业Json", required = false)
    private String enterpriseJson;

}
