package com.upsoft.sep.sls.grid.param.gridenterprise;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;


/**
 * 修改gridenterprise的参数类
 *
 * @author autoCoder
 */
@Data
public class GridEnterpriseModParam {

    @Id
    @ApiModelProperty(value = "id", required = true)
    private String id;

    @ApiModelProperty(value = "enterpriseId", required = false)
    private String enterpriseId;

    @ApiModelProperty(value = "enterpriseName", required = false)
    private String enterpriseName;

    @ApiModelProperty(value = "enterpriseAddress", required = false)
    private String enterpriseAddress;

    @ApiModelProperty(value = "企业经度坐标", required = false)
    private String longitude;

    @ApiModelProperty(value = "企业纬度坐标", required = false)
    private String latitude;

    @ApiModelProperty(value = "supervisionTypeCode", required = false)
    private String supervisionTypeCode;

    @ApiModelProperty(value = "supervisionTypeName", required = false)
    private String supervisionTypeName;

    @ApiModelProperty(value = "enterpriseTypeCode", required = false)
    private String enterpriseTypeCode;

    @ApiModelProperty(value = "enterpriseTypeName", required = false)
    private String enterpriseTypeName;

    @ApiModelProperty(value = "inspectionStaffId", required = false)
    private String inspectionStaffId;

    @ApiModelProperty(value = "inspectionStaffName", required = false)
    private String inspectionStaffName;

    @ApiModelProperty(value = "gridId", required = true)
    private String gridId;

    @ApiModelProperty(value = "gridName", required = true)
    private String gridName;

    @ApiModelProperty(value = "standby1", required = false)
    private String standby1;

    @ApiModelProperty(value = "standby2", required = false)
    private String standby2;

    @ApiModelProperty(value = "standby3", required = false)
    private String standby3;


}
