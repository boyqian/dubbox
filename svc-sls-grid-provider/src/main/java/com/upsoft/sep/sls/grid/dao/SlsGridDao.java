package com.upsoft.sep.sls.grid.dao;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.grid.IDCGridMarker;
import com.upsoft.sep.sls.grid.entity.SlsGrid;
import com.upsoft.sep.sls.grid.param.gridenterprise.GridEnterpriseQueryParam;
import com.upsoft.sep.sls.grid.param.slsgrid.*;

import java.util.List;

public interface SlsGridDao extends IDCGridMarker {

    int insert(SlsGrid slsgrid);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 根据网格id批量删除
     * @param delParam
     * @return
     */
    int deleteBatchByGridIds(SlsGridDelParam delParam);

    /**
     * 根据gridId获取其子树列表
     * @param gridId
     * @return
     */
    List<String> getGridTreeIdListByGridId(String gridId);

    int update(SlsGrid slsgrid);

    /**
     * 根据id获取指定网格及对应企业
     * @param id
     * @return
     */
    GridAndEnterpriseResultParam getGridAndEnterprise(String id);

    List<SlsGrid> getPageSlsGrid(RequestPage<SlsGridPageQueryParam> pageQuery);

    /**
     * 获取网格树（参数为空，获取所有）
     * @param param
     * @return
     */
    List<SlsGrid> getGridTree(GridTreeQueryParam param);

    /**
     * 根据企业信息筛选，找到企业对应的网格
     * @param param
     * @return
     */
    List<SlsGrid> getGridByEnterprise(GridEnterpriseQueryParam param);

    /**
     * 验证是否有重复数据
     * @param param
     * @return
     */
    int countByValidateParam(ValidateGridIfExistParam param);
}