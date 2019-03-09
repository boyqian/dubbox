package com.upsoft.sep.sls.task.dao;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.task.IDCTaskMarker;
import com.upsoft.sep.sls.task.entity.SlsHistoryTask;
import com.upsoft.sep.sls.task.param.slshistorytask.SlsHistoryTaskPageQueryParam;
import java.util.List;

public interface SlsHistoryTaskDao extends IDCTaskMarker {
    int insert(SlsHistoryTask slshistorytask);

    int delete(String id);

    int update(SlsHistoryTask slshistorytask);

    SlsHistoryTask getSlsHistoryTask(String id);

    List<SlsHistoryTask> getPageSlsHistoryTask(RequestPage<SlsHistoryTaskPageQueryParam> pageQuery);
}