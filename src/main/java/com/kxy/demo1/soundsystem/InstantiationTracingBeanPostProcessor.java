package com.kxy.demo1.soundsystem;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 用来打印创建bean的名字
 * @author Administrator
 *
 */
@Component
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {  
  
    /**
     * 
     */
	@Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {  
        return bean;
	}
	
	/**
	 * 在创建bean后输出bean的信息  
	 */
	@Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {  
        System.out.println("Bean '" + beanName + "' created : " + bean.toString());  
        return bean;  
    }  
}
