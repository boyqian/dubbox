package com.upsoft.sep.sls.grid.param.slsgrid;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.List;


/**
 * 删除slsgrid的参数类
 *
 * @author autoCoder
 */
@Data
public class SlsGridDelParam {

    @Id
    @ApiModelProperty(value = "id", required = true)
    private String id;

    @ApiModelProperty(value = "id集合，用于批量删除", hidden = true)
    private List<String> idList;
}