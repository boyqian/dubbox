package com.upsoft.sep.sls.task.dao;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.task.IDCTaskMarker;
import com.upsoft.sep.sls.task.entity.SlsDetailTask;
import com.upsoft.sep.sls.task.param.slsdetailtask.SlsDetailTaskPageQueryParam;
import java.util.List;

public interface SlsDetailTaskDao extends IDCTaskMarker {
    int insert(SlsDetailTask slsdetailtask);

    int delete(String id);

    int update(SlsDetailTask slsdetailtask);

    SlsDetailTask getSlsDetailTask(String id);

    List<SlsDetailTask> getPageSlsDetailTask(RequestPage<SlsDetailTaskPageQueryParam> pageQuery);
}