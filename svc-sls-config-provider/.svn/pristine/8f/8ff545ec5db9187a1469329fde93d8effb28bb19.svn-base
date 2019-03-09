package com.upsoft.sep.sls.config.check.dao;

import com.upsoft.sep.bp.common.entity.RequestPage;
import com.upsoft.sep.sls.config.check.entity.CheckTemplateEditEntity;
import com.upsoft.sep.sls.config.check.entity.CheckTemplatePageEntity;
import com.upsoft.sep.sls.config.check.param.*;

import java.util.List;

public interface CheckTemplateDao{
	List<CheckTemplatePageEntity> selectCheckTemplateByPage(
            RequestPage<QueryCheckTemplatePageParam> param);
	
	CheckTemplateEditEntity selectCheckTemplateInfoById(QueryCheckTemplateByIdParam param);
	
	void insertCheckTemplateInfo(AddCheckTemplateParam param);
	
	void deleteCheckTemplateInfoById(DelCheckTemplateByIdParam param);

	void updateCheckTemplateInfo(ModCheckTemplateParam param);

	List<CheckTemplateEditEntity> selectCheckTemplateListByIds(
            QueryCheckTemplateListIdsParam param);
	
	/**
	 * 获取所有的检查模板
	 * @date 2017年3月17日 上午10:01:16
	 * @author IT_Debug
	 * @return
	 */
	List<CheckTemplatePageEntity> getAllCheckTemplate();

}
