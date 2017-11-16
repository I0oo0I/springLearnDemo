package com.kxy.demo1.soundsystem;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PrintBean implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("Bean '" + beanName + "' created : " + bean.toString());  
	     return bean;  
	}

}
