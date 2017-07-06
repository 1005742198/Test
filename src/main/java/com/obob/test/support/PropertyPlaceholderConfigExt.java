package com.obob.test.support;

import java.util.Properties;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;


public class PropertyPlaceholderConfigExt extends PropertyPlaceholderConfigurer {
	
	private static final String dbUrl = "Core_DB.url";
	private static final String dbUser = "Core_DB.user";
	private static final String dbPassword = "Core_DB.password";
	
	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) {
		String url = props.getProperty(dbUrl);
		String user = props.getProperty(dbUser);
		String password = props.getProperty(dbPassword);
		props.setProperty(dbUrl, url);
		props.setProperty(dbUser, user);
		props.setProperty(dbPassword, password);
		super.processProperties(beanFactory, props);
	}
}
