package com.upsoft.sep.sls.grid.dao;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.grid.IDCGridMarker;
import com.upsoft.sep.sls.grid.entity.GridEnterprise;
import com.upsoft.sep.sls.grid.entity.SlsGrid;
import com.upsoft.sep.sls.grid.param.gridenterprise.GridEnterpriseDelParam;
import com.upsoft.sep.sls.grid.param.gridenterprise.GridEnterpriseQueryParam;
import java.util.List;

public interface GridEnterpriseDao extends IDCGridMarker {
    int insert(GridEnterprise gridenterprise);

    int deleteByGridId(String id);

    /**
     * 根据网格id批量删除
     * @param delParam
     * @return
     */
    int deleteBatchByGridIds(GridEnterpriseDelParam delParam);

    int update(GridEnterprise gridenterprise);

    int insertCodeBatch(List<GridEnterprise> gridEnterpriseList);

    /**
     * 根据主键获取企业
     * @param id
     * @return
     */
    GridEnterprise getGridEnterprise(String id);

    /**
     * 根据网格id获取企业列表
     * @param gridId
     * @return
     */
    List<GridEnterprise> getGridEnterpriseByGridId(String gridId);

    List<GridEnterprise> getPageGridEnterprise(RequestPage<GridEnterpriseQueryParam> pageQuery);

}