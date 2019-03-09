package com.upsoft.sep.sls.config.check.dao;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.config.check.entity.TemplateItemRelEntity;
import com.upsoft.sep.sls.config.check.entity.TemplateItemRelPageEntity;
import com.upsoft.sep.sls.config.check.param.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TemplateItemRelDao{
	void insertTemplateItemRel(AddTemplateItemRelParam param);

	List<TemplateItemRelPageEntity> selectTemplateItemRelByTmpId(
            QueryCheckTemplateByIdParam param);

	void deleteTemplateItemRel(String templateId);

	void deleteRelByCheckItemIds(DelCheckItemByIdsParam param);

	void deleteRelByTemplateId(DelCheckTemplateByIdParam param);
    /**
     * 分页查询
     * @date 2017年3月1日 上午11:01:08
     * @author Tao Wang
     * @param page
     * @return
     */
	List<TemplateItemRelEntity> page(RequestPage<QueryTemplateItemRelParam> page);
	
	List<TemplateItemRelEntity> selectByCheckItemIds(@Param("checkItemIdList") List<String> checkItemIdList);
	
}
