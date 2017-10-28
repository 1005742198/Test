package com.obob.miniprogram.util;

import org.springframework.beans.BeanUtils;

public class BeanConvertors {
	
	public static void copyProperties(Object source, Object target, String ... ignoreProperties) {  
		try { 
			BeanUtils.copyProperties(source, target, ignoreProperties);
		}catch (Exception e) {
			//TODO 日志
		}
	}
}
