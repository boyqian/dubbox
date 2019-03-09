package com.upsoft.sep.sls.config.check.base;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
	/**
	 * 默认格式化为年-月-日 时：分：秒
	 */
	private static final String DEFAULT_PATTERS ="yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 通过时间字符串转换为TIMESTAMP类型
	 * @author wang meng 
	 * @param str
	 * @param patterns 格式化
	 * @return
	 */
	public static Timestamp getTimeStampByString(String str, String patterns) {
		Timestamp timestamp =null;
		try {
			DateFormat df = new SimpleDateFormat(patterns);
			Date date = df.parse(str);
			Long ms = date.getTime();
			timestamp = new Timestamp(ms);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return timestamp;
	}
	
	/**
	 * 使用默认格式化格式化时间字符
	 * @author wang meng 
	 * @param str
	 * @return
	 */
	public static Timestamp getTimeStampByString(String str){
		return getTimeStampByString(str,DEFAULT_PATTERS);
	}
	
	/**
	 * 将毫秒数时间转为TIMESTAMP类型
	 * @author wang meng 
	 * @param time
	 * @return
	 */
	public static Timestamp getTimeStampByLong(Long time){
		Timestamp stamp = new Timestamp(time);
		return stamp;
	}
	/**
	 * 获取当前时间年月日
	 * @author wang meng 
	 * @return
	 */
	public static String getCurrentTimeYMD(){
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		return df.format(new Date());
	}
	/**
	 *获取当前啊时间时分秒 
	 * @author wang meng 
	 * @return
	 */
	public static String getCurrentTimeHMS(){
		DateFormat df = new SimpleDateFormat("HHmmss");
		return df.format(new Date());
	}
	
}
