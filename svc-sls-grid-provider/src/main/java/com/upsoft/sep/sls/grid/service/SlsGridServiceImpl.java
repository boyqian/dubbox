package com.upsoft.sep.sls.grid.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.exception.BPException;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.bp.common.util.StringUtil;
import com.upsoft.sep.sls.grid.dao.GridEnterpriseDao;
import com.upsoft.sep.sls.grid.dao.SlsGridDao;
import com.upsoft.sep.sls.grid.entity.GridEnterprise;
import com.upsoft.sep.sls.grid.entity.SlsGrid;
import com.upsoft.sep.sls.grid.param.gridenterprise.GridEnterpriseDelParam;
import com.upsoft.sep.sls.grid.param.slsgrid.*;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

public class SlsGridServiceImpl implements SlsGridService {

    private static final LogHandler LOG = LogHandler.getLogHandler(SlsGridServiceImpl.class);

    /**
     * 层级分隔符
     */
    private static final String LAYER_SPLIT_CHAR = ",";

    /**
     * 网格顶层节点
     */
    private static final String ROOT_GRID = "-1";

    @Autowired
    private SlsGridDao slsGridDao;
    @Autowired
    private GridEnterpriseDao gridEnterpriseDao;

    @Autowired
    private GridEnterpriseService gridEnterpriseService;

    /**
     * 修改SlsGrid信息
     */
    @Override
    public Result<String> updateSlsGrid(SlsGridModParam slsGridModParam) {
        //参数校验
        modParamValidate(slsGridModParam);

        //修改数据
        try {
            SlsGrid slsGrid = new SlsGrid();
            BeanUtils.copyProperties(slsGrid, slsGridModParam);
            // 根据parentId生成层级
            String parentId = slsGridModParam.getParentId();
            String gridId = slsGridModParam.getId();
            if(StringUtil.isEmpty(parentId) || ROOT_GRID.equals(parentId)){
                slsGrid.setParentId(ROOT_GRID);
                slsGrid.setGridLayer(gridId);
            }else{
                slsGrid.setGridLayer(slsGridModParam.getParentLayer() + LAYER_SPLIT_CHAR + gridId);
            }
            slsGrid.setUpdateTime(new Date());
            slsGridDao.update(slsGrid);

            // 删除网格原来对应的企业
            GridEnterpriseDelParam delParam = new GridEnterpriseDelParam();
            delParam.setGridId(gridId);
            gridEnterpriseService.delGridEnterpriseByGridId(delParam);
            // 将Json数据转换为监管对象列表，并新增
            List<GridEnterprise> gridEnterpriseList = JSON.parseArray(slsGridModParam.getEnterpriseJson(), GridEnterprise.class);
            gridEnterpriseService.saveGridEnterpriseList(gridEnterpriseList, gridId, slsGridModParam.getName());
            return new Result<String>(Result.STATUS_SUCCES, null, "修改slsGrid成功！", null);
        }catch (JSONException e) {
            LOG.error("解析监管对象JSON数据失败，无法修改", e);
            throw new BPException(null, "解析监管对象JSON数据失败，无法修改！");
        } catch (Exception e) {
            LOG.error("修改SlsGrid失败", e);
            throw new BPException(null, "修改slsGrid失败！");
        }
    }

    /**
     * 修改SlsGrid参数校验
     *
     * @param slsGridModParam
     */
    public void modParamValidate(SlsGridModParam slsGridModParam) {
        Assert.notNull(slsGridModParam, "参数错误");
        Assert.notNull(slsGridModParam.getId(), "参数错误");

    }


    /**
     * 根据主键删除SlsGrid
     */
    @Override
    public Result<String> delSlsGrid(SlsGridDelParam slsGridDelParam) {
        //参数校验
        delParamValidate(slsGridDelParam);
        // 返回参数
        Result<String> result;
        try {
            // 根据网格id删除SlsGrid
            String gridId = slsGridDelParam.getId();

            // 获取子节点，删除
            List<String> gridTreeIdList = slsGridDao.getGridTreeIdListByGridId(gridId);
            if(gridTreeIdList == null){
                return new Result<String>(Result.STATUS_ERROR, null, "删除SlsGrid失败！", null);
            }
            if(gridTreeIdList.size() > 1){
                SlsGridDelParam delParam = new SlsGridDelParam();
                delParam.setIdList(gridTreeIdList);
                slsGridDao.deleteBatchByGridIds(delParam);

                // 删除网格对应的企业
                GridEnterpriseDelParam entterpriseDelParam = new GridEnterpriseDelParam();
                entterpriseDelParam.setGridIdList(gridTreeIdList);
                gridEnterpriseDao.deleteBatchByGridIds(entterpriseDelParam);
            }else{
                slsGridDao.delete(gridId);

                // 删除网格对应的企业
                gridEnterpriseDao.deleteByGridId(gridId);
            }

            result = new Result<String>(Result.STATUS_SUCCES, null, "删除SlsGrid成功！", null);
        } catch (Exception e) {
            LOG.error("删除SlsGrid失败", e);
            throw new BPException(null, "删除SlsGrid失败！");
        }
        return result;
    }


    /**
     * 删除SlsGrid参数校验
     *
     * @param slsGridDelParam
     */
    public void delParamValidate(SlsGridDelParam slsGridDelParam) {
        Assert.notNull(slsGridDelParam, "参数错误");
        Assert.notNull(slsGridDelParam.getId(), "参数错误");
    }

    /**
     * 新增SlsGrid
     */
    @Override
    public Result<String> saveSlsGrid(SlsGridAddParam slsGridAddParam) {
        //参数校验
        addParamValidate(slsGridAddParam);
        // 返回参数
        Result<String> result;

        //保存数据
        try {
            SlsGrid slsGrid = new SlsGrid();
            BeanUtils.copyProperties(slsGrid, slsGridAddParam);
            String gridId = StringUtil.uuid();
            slsGrid.setId(gridId);
            // 根据parentId生成层级
            String parentId = slsGrid.getParentId();
            if(StringUtil.isEmpty(parentId) || ROOT_GRID.equals(parentId)){
                slsGrid.setParentId(ROOT_GRID);
                slsGrid.setGridLayer(gridId);
            }else{
                slsGrid.setGridLayer(slsGridAddParam.getParentLayer() + LAYER_SPLIT_CHAR + gridId);
            }
            slsGrid.setCreateTime(new Date());
            slsGridDao.insert(slsGrid);

            // 将Json数据转换为监管对象列表，并新增
            List<GridEnterprise> gridEnterpriseList = JSON.parseArray(slsGridAddParam.getEnterpriseJson(), GridEnterprise.class);
            gridEnterpriseService.saveGridEnterpriseList(gridEnterpriseList, gridId, slsGridAddParam.getName());
            result = new Result<String>(Result.STATUS_SUCCES, null, "新增slsGrid成功！", null);
        } catch (JSONException e) {
            LOG.error("解析监管对象JSON数据失败，无法新增", e);
            throw new BPException(null, "解析监管对象JSON数据失败，无法新增！");
        } catch (Exception e) {
            LOG.error("新增slsGrid失败", e);
            throw new BPException(null, "新增slsGrid失败！");
        }
        return result;
    }


    /**
     * 新增SlsGrid参数校验
     *
     * @param slsGridAddParam
     */
    public void addParamValidate(SlsGridAddParam slsGridAddParam) {
        Assert.notNull(slsGridAddParam, "参数错误");
    }

    /**
     * SlsGrid分页查询
     */
    @Override
    public Result<ResponsePage<List<SlsGrid>>> getPageQuery(RequestPage<SlsGridPageQueryParam> requestPage) {

        Result<ResponsePage<List<SlsGrid>>> result = new Result<>();
        try {
            List<SlsGrid> slsGridList = slsGridDao.getPageSlsGrid(requestPage);
            @SuppressWarnings("unchecked")
            ResponsePage<List<SlsGrid>> responsePage = requestPage.toResponsePage();
            responsePage.setData(slsGridList);
            result.setStatus(Result.STATUS_SUCCES);
            result.setData(responsePage);
            result.setMsg("查询SlsGrid列表成功！");
        } catch (Exception e) {
            LOG.error("查询SlsGrid列表失败！", e);
            result.setStatus(Result.STATUS_ERROR);
            result.setMsg("查询SlsGrid列表失败！");
        }
        return result;
    }

    /**
     * SlsGrid分页查询参数校验
     *
     * @param requestPage
     */
    public void pageQueryParamValidate(RequestPage<SlsGridPageQueryParam> requestPage) {
        Assert.notNull(requestPage, "参数错误");
    }

    /**
     * 查询SlsGrid信息
     */
    @Override
    public Result<GridAndEnterpriseResultParam> getGridAndEnterprise(SlsGridGetParam slsGridGetParam) {

        Result<GridAndEnterpriseResultParam> result = new Result<>();
        try {
            GridAndEnterpriseResultParam slsGrid = slsGridDao.getGridAndEnterprise(slsGridGetParam.getId());
            result.setStatus(Result.STATUS_SUCCES);
            result.setData(slsGrid);
            result.setMsg("查询slsGrid成功");
        } catch (Exception e) {
            LOG.error("查询slsGrid失败", e);
            result.setStatus(Result.STATUS_ERROR);
            result.setMsg("查询slsGrid失败");
        }
        return result;
    }

    @Override
    public Result<List<SlsGrid>> getGridTree(GridTreeQueryParam param) {
        try {
            List<SlsGrid> slsGrid = slsGridDao.getGridTree(param);
            return new Result<List<SlsGrid>>(Result.STATUS_SUCCES, null, "查询网格树成功！", slsGrid);
        } catch (Exception e) {
            LOG.error("查询网格树失败", e);
            return new Result<List<SlsGrid>>(Result.STATUS_ERROR, null, "查询网格树失败！", null);
        }
    }

    @Override
    public Result<List<SlsGrid>> getNextGridList(String gridId) {
        if(StringUtils.isEmpty(gridId)){
            throw new IllegalArgumentException("参数为网格id，不能为空");
        }
        GridTreeQueryParam param = new GridTreeQueryParam();
        param.setParentId(gridId);
        return getGridTree(param);
    }

    /**
     * 查询SlsGrid参数校验
     *
     * @param slsGridGetParam
     */
    public void getParamValidate(SlsGridGetParam slsGridGetParam) {
        Assert.notNull(slsGridGetParam, "参数错误");
        Assert.notNull(slsGridGetParam.getId(), "参数错误");

    }

    @Override
    public Result<Boolean> validateGridIfExist(ValidateGridIfExistParam param) throws BPException {
        try {
            int rows = slsGridDao.countByValidateParam(param);
            boolean ifExist = rows > 0 ? true : false;
            return new Result<>(Result.STATUS_SUCCES, null, "查询是否有重复数据成功！", ifExist);
        }catch (Exception e){
            LOG.error("查询是否有重复数据失败", e);
            return new Result<>(Result.STATUS_ERROR, null, "查询是否有重复数据失败！", false);
        }
    }

}
