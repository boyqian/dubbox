package com.upsoft.sep.sls.config.schedule.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.bp.common.entity.ResponsePage;
import com.upsoft.sep.bp.common.entity.Result;
import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.bp.common.util.StringUtil;
import org.apache.commons.beanutils.BeanUtils;

import com.upsoft.sep.sls.config.schedule.dao.ConfigScheduleTimeDao;
import com.upsoft.sep.sls.config.schedule.entity.ConfigScheduleTime;
import com.upsoft.sep.sls.config.schedule.param.configscheduletime.ConfigScheduleTimeAddParam;
import com.upsoft.sep.sls.config.schedule.param.configscheduletime.ConfigScheduleTimeDelParam;
import com.upsoft.sep.sls.config.schedule.param.configscheduletime.ConfigScheduleTimeGetParam;
import com.upsoft.sep.sls.config.schedule.param.configscheduletime.ConfigScheduleTimeModParam;
import com.upsoft.sep.sls.config.schedule.param.configscheduletime.ConfigScheduleTimePageQueryParam;


import com.upsoft.sep.sls.config.schedule.entity.ConfigScheduleTime;

import java.util.List;

public class ConfigScheduleTimeServiceImpl implements ConfigScheduleTimeService {

    private static final LogHandler LOG = LogHandler.getLogHandler(ConfigScheduleTimeServiceImpl.class);

    @Autowired
    private ConfigScheduleTimeDao configScheduleTimeDao;

    /**
     * 修改ConfigScheduleTime信息
     */
    @Override
    public Result<String> updateConfigScheduleTime(ConfigScheduleTimeModParam configScheduleTimeModParam) {
        //参数校验
        modParamValidate(configScheduleTimeModParam);

        //修改数据
        try {
            ConfigScheduleTime configScheduleTime = new ConfigScheduleTime();
            BeanUtils.copyProperties(configScheduleTime, configScheduleTimeModParam);
            configScheduleTime.setUpdateTime(new Date());
            configScheduleTimeDao.update(configScheduleTime);
            return new Result<String>(Result.STATUS_SUCCES, null, "修改configScheduleTime成功！", null);
        } catch (Exception e) {
            LOG.error("修改ConfigScheduleTime失败", e);
            return new Result<String>(Result.STATUS_ERROR, null, "修改ConfigScheduleTime失败！", null);
        }
    }

    /**
     * 修改ConfigScheduleTime参数校验
     *
     * @param configScheduleTimeModParam
     */
    public void modParamValidate(ConfigScheduleTimeModParam configScheduleTimeModParam) {
        Assert.notNull(configScheduleTimeModParam, "参数错误");
        Assert.notNull(configScheduleTimeModParam.getId(), "参数错误");

    }


    /**
     * 根据主键删除ConfigScheduleTime
     */
    @Override
    public Result<String> delConfigScheduleTime(ConfigScheduleTimeDelParam configScheduleTimeDelParam) {
        //参数校验
        delParamValidate(configScheduleTimeDelParam);

        try {
            //删除ConfigScheduleTime
            configScheduleTimeDao.delete(configScheduleTimeDelParam.getId());
            return new Result<String>(Result.STATUS_SUCCES, null, "删除ConfigScheduleTime成功！", null);
        } catch (Exception e) {
            LOG.error("删除ConfigScheduleTime失败", e);
            return new Result<String>(Result.STATUS_ERROR, null, "删除ConfigScheduleTime失败！", null);
        }
    }


    /**
     * 删除ConfigScheduleTime参数校验
     *
     * @param configScheduleTimeDelParam
     */
    public void delParamValidate(ConfigScheduleTimeDelParam configScheduleTimeDelParam) {
        Assert.notNull(configScheduleTimeDelParam, "参数错误");
        Assert.notNull(configScheduleTimeDelParam.getId(), "参数错误");
    }

    /**
     * 新增ConfigScheduleTime
     */
    @Override
    public Result<String> saveConfigScheduleTime(ConfigScheduleTimeAddParam configScheduleTimeAddParam) {
        //参数校验
        addParamValidate(configScheduleTimeAddParam);

        //保存数据
        try {
            ConfigScheduleTime configScheduleTime = new ConfigScheduleTime();
            BeanUtils.copyProperties(configScheduleTime, configScheduleTimeAddParam);
            configScheduleTime.setId(StringUtil.uuid());
            configScheduleTime.setCreateTime(new Date());
            configScheduleTimeDao.insert(configScheduleTime);
            return new Result<String>(Result.STATUS_SUCCES, null, "新增configScheduleTime成功！", null);
        } catch (Exception e) {
            LOG.error("新增configScheduleTime失败", e);
            return new Result<String>(Result.STATUS_ERROR, null, "新增configScheduleTime失败！", null);
        }
    }


    /**
     * 新增ConfigScheduleTime参数校验
     *
     * @param configScheduleTimeAddParam
     */
    public void addParamValidate(ConfigScheduleTimeAddParam configScheduleTimeAddParam) {
        Assert.notNull(configScheduleTimeAddParam, "参数错误");
    }


    /**
     * 查询ConfigScheduleTime信息
     */
    @Override
    public Result<ConfigScheduleTime> getConfigScheduleTime(ConfigScheduleTimeGetParam configScheduleTimeGetParam) {


        Result<ConfigScheduleTime> result = new Result<ConfigScheduleTime>();
        try {
            ConfigScheduleTime configScheduleTime = configScheduleTimeDao.getConfigScheduleTime(configScheduleTimeGetParam.getId());
            result.setStatus(Result.STATUS_SUCCES);
            result.setData(configScheduleTime);
            result.setMsg("查询configScheduleTime成功");
        } catch (Exception e) {
            LOG.error("查询configScheduleTime失败", e);
            result.setStatus(Result.STATUS_ERROR);
            result.setMsg("查询configScheduleTime失败");
        }
        return result;
    }

    /**
     * 查询ConfigScheduleTime参数校验
     *
     * @param configScheduleTimeGetParam
     */
    public void getParamValidate(ConfigScheduleTimeGetParam configScheduleTimeGetParam) {
        Assert.notNull(configScheduleTimeGetParam, "参数错误");
        Assert.notNull(configScheduleTimeGetParam.getId(), "参数错误");

    }

    /**
     * ConfigScheduleTime分页查询
     */
    @SuppressWarnings("unchecked")
    @Override
    public Result<ResponsePage<List<ConfigScheduleTime>>> getPageQuery(RequestPage<ConfigScheduleTimePageQueryParam> requestPage) {

        Result<ResponsePage<List<ConfigScheduleTime>>> result = new Result<ResponsePage<List<ConfigScheduleTime>>>();
        try {
            List<ConfigScheduleTime> configScheduleTimeList = configScheduleTimeDao.getPageConfigScheduleTime(requestPage);
            ResponsePage<List<ConfigScheduleTime>> responsePage = requestPage.toResponsePage();
            responsePage.setData(configScheduleTimeList);
            result.setStatus(Result.STATUS_SUCCES);
            result.setData(responsePage);
            result.setMsg("查询ConfigScheduleTime列表成功！");
        } catch (Exception e) {
            LOG.error("查询ConfigScheduleTime列表失败！", e);
            result.setStatus(Result.STATUS_ERROR);
            result.setMsg("查询ConfigScheduleTime列表失败！");
        }
        return result;
    }

    /**
     * ConfigScheduleTime分页查询参数校验
     *
     * @param requestPage
     */
    public void pageQueryParamValidate(RequestPage<ConfigScheduleTimePageQueryParam> requestPage) {
        Assert.notNull(requestPage, "参数错误");
    }
}
