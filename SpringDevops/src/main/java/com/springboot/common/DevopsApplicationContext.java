package com.springboot.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class DevopsApplicationContext implements ApplicationContextAware{

	@Autowired
	private static ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		DevopsApplicationContext.context=context;		
	}
	
	public static ApplicationContext getContext() {
		return context;
	}

}
