package com.upsoft.sep.sls.config.schedule.dao;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.config.schedule.IDCScheduleMarker;
import com.upsoft.sep.sls.config.schedule.entity.ConfigScheduleTime;
import com.upsoft.sep.sls.config.schedule.param.configscheduletime.ConfigScheduleTimePageQueryParam;

import java.util.List;

public interface ConfigScheduleTimeDao extends IDCScheduleMarker {
    int insert(ConfigScheduleTime configscheduletime);

    int delete(String id);

    int update(ConfigScheduleTime configscheduletime);

    ConfigScheduleTime getConfigScheduleTime(String id);

    List<ConfigScheduleTime> getPageConfigScheduleTime(RequestPage<ConfigScheduleTimePageQueryParam> pageQuery);
}