package com.upsoft.sep.sls.grid.param.slsgrid;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;


/**
 * 获取网格树的参数类
 *
 * @author autoCoder
 */
@Data
public class GridTreeQueryParam {

    @ApiModelProperty(value = "网格名称", required = false)
    private String name;

    @ApiModelProperty(value = "网格等级", required = false)
    private String levelCode;

    @ApiModelProperty(value = "parentId", required = false)
    private String parentId;

    @ApiModelProperty(value = "参数中的父节点是否是直接父节点：1是、0否", hidden = true)
    private int ifDirectParent;
}
