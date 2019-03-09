package com.upsoft.sep.sls.config.check.base;

/**
 * 
* Copyright (c) 2016,重庆扬讯软件技术有限公司<br>
* All rights reserved.<br>
*
* 文件名称：CheckBaseConst.java<br>
* 摘要：常量类<br>
* -------------------------------------------------------<br>
* 当前版本：1.1.1<br>
* 作者：wang meng <br>
* 完成日期：2016年11月23日<br>
* -------------------------------------------------------<br>
* 取代版本：1.1.0<br>
* 原作者：wang meng <br>
* 完成日期：2016年11月23日<br>
 */
public class CheckBaseConst {
	
	/**
	 * 日期:起始时分秒
	 */
	public static final String DATE_MIN_HMS = " 00:00:00";
	
	/**
	 * 日期：结束时分秒
	 */
	public static final String DATE_MAX_HMS = " 23:59:59";

	
	public static enum RESULT_MSG {

		SEARCH_SUCCESS("1000", "查询成功。"), 
		ADD_SUCCESS("1001", "添加成功。"), 
		DEL_SUCCESS("1002", "删除成功。"), 
		MOD_SUCCESS("1003", "修改成功。"), 
		SEARCH_FAIL("1004", "查询失败。"), 
		ADD_FAIL("1005", "添加失败。"), 
		DEL_FAIL("1006", "删除失败。"), 
		MOD_FAIL("1007", "修改失败。");
		
		private String code;
		private String value;

		private RESULT_MSG(String code, String value) {
			this.code = code;
			this.value = value;
		}

		public String getCode() {
			return code;
		}
		public String getValue() {
			return value;
		}
	}
	
	public static enum STATUS_TYPE {
		valid("1", "有效"), invalid("0", "无效"), delete("-1", "删除");
		private String code;
		private String value;

		private STATUS_TYPE(String code, String value) {
			this.code = code;
			this.value = value;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}
}
