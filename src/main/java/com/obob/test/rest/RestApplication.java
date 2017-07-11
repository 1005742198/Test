package com.obob.test.rest;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.Application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * @author obob
 */
@Component
public class RestApplication extends Application implements ApplicationContextAware {
	
	private static final Log log = LogFactory.getLog(RestApplication.class);
	
	private static Set<Object> singletons = new HashSet<Object>();
	private static Set<Class<?>> classes = new HashSet<Class<?>>();
	
	private static ApplicationContext ctx;
	
	public RestApplication() {
	}
	
	@PostConstruct
	public void init() {
		
		singletons.add(ctx.getBean("bizorderApplyRest"));
		
		String sList = "";
		for (Object o : singletons) {
			sList += o.getClass().getSimpleName() + ",";
		}
		log.info("add Rest Interface:[" + sList + "]");
//		classes.add(RestBaseLogInterceptor.class);
//		classes.add(RestExceptionHandler.class);
	}
	

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}
}
