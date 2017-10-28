package com.obob.miniprogram.support;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MiniServerContext implements ApplicationContextAware {
	
	private static ApplicationContext context;
	
	public static ApplicationContext getContext() {
		return context;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

}
