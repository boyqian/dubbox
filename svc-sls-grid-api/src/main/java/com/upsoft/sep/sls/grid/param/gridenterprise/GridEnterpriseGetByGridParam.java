package com.upsoft.sep.sls.grid.param.gridenterprise;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;


/**
 * 查询gridenterprise的参数类
 *
 * @author autoCoder
 */
@Data
public class GridEnterpriseGetByGridParam {

    @ApiModelProperty(value = "网格Id", required = true)
    private String gridId;
}