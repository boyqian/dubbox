package com.upsoft.sep.sls.task.dao;

import java.util.List;
import java.util.Map;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.task.IDCTaskMarker;
import com.upsoft.sep.sls.task.entity.SlsRunTask;
import com.upsoft.sep.sls.task.param.slsruntask.SlsRunTaskPageQueryParam;

public interface SlsRunTaskDao extends IDCTaskMarker {
    int insert(SlsRunTask slsruntask);

    int delete(String id);

    int update(SlsRunTask slsruntask);

    SlsRunTask getSlsRunTask(String id);

    List<SlsRunTask> getPageSlsRunTask(RequestPage<SlsRunTaskPageQueryParam> pageQuery);
    /**
     * 查询任务详情
     * @param taskId
     * @return
     */
    Map<String, Object> getTaskMap(String taskId);
}