package com.upsoft.sep.sls.config.schedule.param.configscheduletime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;


import java.util.Date;


/**
 * 添加configscheduletime参数类
 *
 * @author autoCoder
 */
@Data
public class ConfigScheduleTimeAddParam {

    @Id
    @ApiModelProperty(value = "id", hidden = true)
    private String id;

    @ApiModelProperty(value = "sourceCode", required = false)
    private String sourceCode;

    @ApiModelProperty(value = "sourceValue", required = false)
    private String sourceValue;

    @ApiModelProperty(value = "urgencyDegreeCode", required = false)
    private String urgencyDegreeCode;

    @ApiModelProperty(value = "urgencyDegreeName", required = false)
    private String urgencyDegreeName;

    @ApiModelProperty(value = "dayTypeCode", required = false)
    private Byte dayTypeCode;

    @ApiModelProperty(value = "dayTypeName", required = false)
    private String dayTypeName;

    @ApiModelProperty(value = "days", required = false)
    private Byte days;

    @ApiModelProperty(value = "updateTime", required = false)
    private Date updateTime;

    @ApiModelProperty(value = "createTime", required = false)
    private Date createTime;

    @ApiModelProperty(value = "standby1", required = false)
    private String standby1;

    @ApiModelProperty(value = "standby2", required = false)
    private String standby2;

}
