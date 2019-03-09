package com.upsoft.sep.sls.config.check.base;

import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;

public class StringUtil {
	/**
	 * 将驼峰命名方式装换为下划线分割的命名方式，以便数据库读取
	 * @author wang meng 
	 * @param property
	 * @return
	 */
	public static String propertyToField(String property) {
		if (null == property) {
			return "";
		}
		char[] chars = property.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char c : chars) {
			if (CharUtils.isAsciiAlphaUpper(c)) {
				sb.append("_" + StringUtils.lowerCase(CharUtils.toString(c)));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
