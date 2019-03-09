package com.upsoft.sep.sls.grid.param.slsgrid;

import com.upsoft.sep.sls.grid.entity.GridEnterprise;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.util.List;

/**
 * 网格管理
 * 
 * sls_grid
 *
 */
@Data
public class GridAndEnterpriseResultParam {
    /**
     * 主键ID
     *
     * sls_grid.id
     *
     */
    @Id
    @ApiModelProperty(value = "主键ID")
    private String id;

    /**
     * 网格名称
     *
     * sls_grid.name
     *
     */
    @ApiModelProperty(value = "网格名称")
    private String name;

    /**
     * 网格等级编码
     *
     * sls_grid.level_code
     *
     */
    @ApiModelProperty(value = "网格等级编码")
    private String levelCode;

    /**
     * 网格等级名称
     *
     * sls_grid.level_name
     *
     */
    @ApiModelProperty(value = "网格等级名称")
    private String levelName;

    /**
     * 上级网格ID
     *
     * sls_grid.parent_id
     *
     */
    @ApiModelProperty(value = "上级网格ID")
    private String parentId;

    /**
     * 网格层级
     *
     * sls_grid.grid_layer
     *
     */
    @ApiModelProperty(value = "网格层级")
    private String gridLayer;

    /**
     * 责任单位ID
     *
     * sls_grid.duty_unit_id
     *
     */
    @ApiModelProperty(value = "责任单位ID")
    private String dutyUnitId;

    /**
     * 责任单位名称
     *
     * sls_grid.duty_unit_name
     *
     */
    @ApiModelProperty(value = "责任单位名称")
    private String dutyUnitName;

    /**
     * 分管领导ID
     *
     * sls_grid.division_leader_id
     *
     */
    @ApiModelProperty(value = "分管领导ID")
    private String divisionLeaderId;

    /**
     * 分管领导姓名
     *
     * sls_grid.division_leader_name
     *
     */
    @ApiModelProperty(value = "分管领导姓名")
    private String divisionLeaderName;

    /**
     * 网格负责人ID
     *
     * sls_grid.grid_manager_id
     *
     */
    @ApiModelProperty(value = "网格负责人ID")
    private String gridManagerId;

    /**
     * 网格负责人姓名
     *
     * sls_grid.grid_manager_name
     *
     */
    @ApiModelProperty(value = "网格负责人姓名")
    private String gridManagerName;

    /**
     * 网格负责人电话
     *
     * sls_grid.grid_manager_phone
     *
     */
    @ApiModelProperty(value = "网格负责人电话")
    private String gridManagerPhone;

    /**
     * 备用字段1
     *
     * sls_grid.standby1
     *
     */
    @ApiModelProperty(value = "备用字段1")
    private String standby1;

    /**
     * 备用字段2
     *
     * sls_grid.standby2
     *
     */
    @ApiModelProperty(value = "备用字段2")
    private String standby2;

    /**
     * 备用字段3
     *
     * sls_grid.standby3
     *
     */
    @ApiModelProperty(value = "备用字段3")
    private String standby3;


    @ApiModelProperty(value = "网格对应的企业")
    private List<GridEnterprise> gridEnterpriseList;
}