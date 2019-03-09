package com.upsoft.sep.sls.grid.param.gridenterprise;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.List;


/**
 * 删除gridenterprise的参数类
 *
 * @author autoCoder
 */
@Data
public class GridEnterpriseDelParam {

    @ApiModelProperty(value = "gridId", required = true)
    private String gridId;

    @ApiModelProperty(value = "gridId", hidden = true)
    private List<String> gridIdList;
}