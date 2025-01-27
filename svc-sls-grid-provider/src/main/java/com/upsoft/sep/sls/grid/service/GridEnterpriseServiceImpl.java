package com.upsoft.sep.sls.grid.service;

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
import com.upsoft.sep.sls.grid.param.gridenterprise.*;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

public class GridEnterpriseServiceImpl implements GridEnterpriseService {

    private static final LogHandler LOG = LogHandler.getLogHandler(GridEnterpriseServiceImpl.class);

    @Autowired
    private GridEnterpriseDao gridEnterpriseDao;

    @Autowired
    private SlsGridDao slsGridDao;

    /**
     * 修改GridEnterprise信息
     */
    @Override
    public Result<String> updateGridEnterprise(GridEnterpriseModParam gridEnterpriseModParam) {
        //参数校验
        modParamValidate(gridEnterpriseModParam);

        //修改数据
        try {
            GridEnterprise gridEnterprise = new GridEnterprise();
            BeanUtils.copyProperties(gridEnterprise, gridEnterpriseModParam);
            gridEnterprise.setUpdateTime(new Date());
            gridEnterpriseDao.update(gridEnterprise);
            return new Result<String>(Result.STATUS_SUCCES, null, "修改gridEnterprise成功！", null);
        } catch (Exception e) {
            LOG.error("修改GridEnterprise失败", e);
            return new Result<String>(Result.STATUS_ERROR, null, "修改GridEnterprise失败！", null);
        }
    }

    /**
     * 修改GridEnterprise参数校验
     *
     * @param gridEnterpriseModParam
     */
    public void modParamValidate(GridEnterpriseModParam gridEnterpriseModParam) {
        Assert.notNull(gridEnterpriseModParam, "参数错误");
        Assert.notNull(gridEnterpriseModParam.getId(), "参数错误");

    }


    /**
     * 根据网格id删除GridEnterprise
     */
    @Override
    public Result<String> delGridEnterpriseByGridId(GridEnterpriseDelParam gridEnterpriseDelParam) {
        //参数校验
        delParamValidate(gridEnterpriseDelParam);

        try {
            //删除GridEnterprise
            gridEnterpriseDao.deleteByGridId(gridEnterpriseDelParam.getGridId());
            return new Result<String>(Result.STATUS_SUCCES, null, "删除GridEnterprise成功！", null);
        } catch (Exception e) {
            LOG.error("删除GridEnterprise失败", e);
            return new Result<String>(Result.STATUS_ERROR, null, "删除GridEnterprise失败！", null);
        }
    }


    /**
     * 删除GridEnterprise参数校验
     *
     * @param gridEnterpriseDelParam
     */
    public void delParamValidate(GridEnterpriseDelParam gridEnterpriseDelParam) {
        Assert.notNull(gridEnterpriseDelParam, "参数错误");
        Assert.notNull(gridEnterpriseDelParam.getGridId(), "参数错误");
    }

    /**
     * 新增GridEnterprise
     */
    @Override
    public Result<String> saveGridEnterprise(GridEnterpriseAddParam gridEnterpriseAddParam) {
        //参数校验
        addParamValidate(gridEnterpriseAddParam);

        //保存数据
        try {
            GridEnterprise gridEnterprise = new GridEnterprise();
            BeanUtils.copyProperties(gridEnterprise, gridEnterpriseAddParam);
            gridEnterprise.setId(StringUtil.uuid());
            gridEnterprise.setCreateTime(new Date());
            gridEnterpriseDao.insert(gridEnterprise);
            return new Result<String>(Result.STATUS_SUCCES, null, "新增gridEnterprise成功！", null);
        } catch (Exception e) {
            LOG.error("新增gridEnterprise失败", e);
            return new Result<String>(Result.STATUS_ERROR, null, "新增gridEnterprise失败！", null);
        }
    }

    /**
     * 批量新增
     * @param gridEnterpriseList 监管对象业务数据
     * @param gridId 关联的网格
     * @return
     */
    @Override
    public Result<String> saveGridEnterpriseList(List<GridEnterprise> gridEnterpriseList,String gridId,String gridName) {
        //参数校验
        Assert.notNull(gridEnterpriseList, "参数错误");

        // 设置主键，外键
        for (GridEnterprise gridEnterprise:gridEnterpriseList) {
            gridEnterprise.setId(StringUtil.uuid());
            gridEnterprise.setGridName(gridName);
            gridEnterprise.setGridId(gridId);
            gridEnterprise.setCreateTime(new Date());
        }
        //保存数据
        try {
            gridEnterpriseDao.insertCodeBatch(gridEnterpriseList);
            return new Result<String>(Result.STATUS_SUCCES, null, "批量新增gridEnterprise成功！", null);
        } catch (Exception e) {
            LOG.error("批量新增gridEnterprise失败", e);
            throw new BPException(null,"批量新增gridEnterprise失败！");
        }
    }


    /**
     * 新增GridEnterprise参数校验
     *
     * @param gridEnterpriseAddParam
     */
    public void addParamValidate(GridEnterpriseAddParam gridEnterpriseAddParam) {
        Assert.notNull(gridEnterpriseAddParam, "参数错误");
    }

    /**
     * GridEnterprise分页查询
     */
    @SuppressWarnings("unchecked")
    @Override
    public Result<ResponsePage<List<GridEnterprise>>> getPageQuery(RequestPage<GridEnterpriseQueryParam> requestPage) {

        Result<ResponsePage<List<GridEnterprise>>> result = new Result<ResponsePage<List<GridEnterprise>>>();
        try {
            List<GridEnterprise> gridEnterpriseList = gridEnterpriseDao.getPageGridEnterprise(requestPage);
            ResponsePage<List<GridEnterprise>> responsePage = requestPage.toResponsePage();
            responsePage.setData(gridEnterpriseList);
            result.setStatus(Result.STATUS_SUCCES);
            result.setData(responsePage);
            result.setMsg("查询GridEnterprise列表成功！");
        } catch (Exception e) {
            LOG.error("查询GridEnterprise列表失败！", e);
            result.setStatus(Result.STATUS_ERROR);
            result.setMsg("查询GridEnterprise列表失败！");
        }
        return result;
    }

    @Override
    public Result<List<SlsGrid>> getGridByEnterprise(GridEnterpriseQueryParam param) {
        try {
            List<SlsGrid> gridList = slsGridDao.getGridByEnterprise(param);
            return new Result<List<SlsGrid>>(Result.STATUS_SUCCES, null, "根据企业查询其所在网格成功！", gridList);
        } catch (Exception e) {
            LOG.error("根据企业查询其所在网格失败！", e);
            return new Result<List<SlsGrid>>(Result.STATUS_ERROR, null, "根据企业查询其所在网格失败！", null);
        }
    }

    /**
     * GridEnterprise分页查询参数校验
     *
     * @param requestPage
     */
    public void pageQueryParamValidate(RequestPage<GridEnterpriseQueryParam> requestPage) {
        Assert.notNull(requestPage, "参数错误");
    }

    /**
     * 查询GridEnterprise信息
     */
    @Override
    public Result<GridEnterprise> getGridEnterprise(GridEnterpriseGetParam gridEnterpriseGetParam) {
        Result<GridEnterprise> result = new Result<GridEnterprise>();
        try {
            GridEnterprise gridEnterprise = gridEnterpriseDao.getGridEnterprise(gridEnterpriseGetParam.getId());
            result.setStatus(Result.STATUS_SUCCES);
            result.setData(gridEnterprise);
            result.setMsg("查询gridEnterprise成功");
        } catch (Exception e) {
            LOG.error("查询gridEnterprise失败", e);
            result.setStatus(Result.STATUS_ERROR);
            result.setMsg("查询gridEnterprise失败");
        }
        return result;
    }

    @Override
    public Result<List<GridEnterprise>> getGridEnterpriseByGridId(GridEnterpriseGetByGridParam gridEnterpriseGetParam) {
        Result<List<GridEnterprise>> result = new Result<List<GridEnterprise>>();
        try {
            List<GridEnterprise> gridEnterprise = gridEnterpriseDao.getGridEnterpriseByGridId(gridEnterpriseGetParam.getGridId());
            result.setStatus(Result.STATUS_SUCCES);
            result.setData(gridEnterprise);
            result.setMsg("根据网格Id查询gridEnterprise成功");
        } catch (Exception e) {
            LOG.error("根据网格Id查询gridEnterprise失败", e);
            result.setStatus(Result.STATUS_ERROR);
            result.setMsg("根据网格Id查询gridEnterprise失败");
        }
        return result;
    }

    /**
     * 查询GridEnterprise参数校验
     *
     * @param gridEnterpriseGetParam
     */
    public void getParamValidate(GridEnterpriseGetParam gridEnterpriseGetParam) {
        Assert.notNull(gridEnterpriseGetParam, "参数错误");
        Assert.notNull(gridEnterpriseGetParam.getId(), "参数错误");

    }

}
