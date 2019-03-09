package com.upsoft.sep.sls.config.schedule.param.configscheduletime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;


import java.util.Date;


/**
 * 查询configscheduletime的参数类
 *
 * @author autoCoder
 */
@Data
public class ConfigScheduleTimeGetParam {

    @Id
    @ApiModelProperty(value = "id", required = true)
    private String id;

}