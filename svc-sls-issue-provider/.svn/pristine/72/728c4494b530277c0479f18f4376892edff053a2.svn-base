package com.upsoft.sep.sls.issue.service;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import com.upsoft.sep.bp.common.log.LogHandler;
import com.upsoft.sep.sls.issue.dao.ProblemDao;
import com.upsoft.sep.sls.issue.entity.ProblemList;
import com.upsoft.sep.sls.issue.param.ProblemIdParam;
import com.upsoft.sep.sls.issue.param.ProblemIdsParam;

/**
 * Copyright (c) 2019,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：                          
 *
 * @author boyqian
 * Create time 2019年3月6日 上午9:07:21
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2019年3月6日   boyqian       1.0      首次新增
 */
public class ProblemExportServiceImpl implements ProblemExportService{

	private static final LogHandler LOG = LogHandler.getLogHandler("ProblemExportServiceImpl");
	
	@Autowired
	private ProblemDao problemDao;
	
	
	@SuppressWarnings("resource")
	@Override
	public void doExportProblem(ProblemIdsParam proIdsParamList) {
		//1、创建一个webbook,表示一个Excel文件
		HSSFWorkbook wb=new HSSFWorkbook();
		//2、在Excel文件中添加一个sheet页
        HSSFSheet sheet = wb.createSheet("问题信息表");
		//3、在sheet页中添加表头，第一行
		HSSFRow row=sheet.createRow(0);
		//4、设置单元格样式
		HSSFCellStyle style=wb.createCellStyle();
		//5、样式居中显示
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		//6、创建单元格开始写入一行每列数据元素
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("问题编号");
		cell.setCellStyle(style);
		cell = row.createCell(1);
		cell.setCellValue("问题标题");
		cell.setCellStyle(style);
		cell = row.createCell(2);
		cell.setCellValue("问题来源");
		cell.setCellStyle(style);
		cell = row.createCell(3);
		cell.setCellValue("问题等级");
		cell.setCellStyle(style);
		cell = row.createCell(4);
		cell.setCellValue("问题类型");
		cell.setCellStyle(style);
		cell = row.createCell(5);
		cell.setCellValue("问题状态");
		cell.setCellStyle(style);
		cell = row.createCell(6);
		cell.setCellValue("问题产生时间");
		try {
			List<ProblemList> list=problemDao.selectProblemExport(proIdsParamList);
			for(int i=0;i<list.size();i++){
				row=sheet.createRow(i+1);
				ProblemList proList=list.get(i);
				String status="";
				row.createCell(0).setCellValue(proList.getId());//问题编号
				row.createCell(1).setCellValue(proList.getTitle());//问题标题
				row.createCell(2).setCellValue(proList.getParentSourceValue());//问题来源
				row.createCell(3).setCellValue(proList.getLevelValue());//问题等级
				row.createCell(4).setCellValue(proList.getTypeValue());//问题类型
				if(proList.getStatus()=="0"){
					status="待处理";
				}else if(proList.getStatus()=="1"){
					status="处理中";
				}else if(proList.getStatus()=="2"){
					status="已处理";			
				}else if(proList.getStatus()=="3"){
					status="已关闭";	
				}
				row.createCell(5).setCellValue(status);//问题状态
				row.createCell(6).setCellValue(new SimpleDateFormat("yyyy-mm-dd").format(proList.getDiscoveryTime()));//问题产生时间
			}
		FileOutputStream opt=new FileOutputStream("C:/问题信息表"+new SimpleDateFormat("yyyy-mm-dd").format(new Date())+".xls");
		wb.write(opt);
		opt.close();
		LOG.debug("导出问题成功");
		} catch (Exception e) {
			LOG.error("导出问题失败",e);
			e.printStackTrace();
		}
	}
}
