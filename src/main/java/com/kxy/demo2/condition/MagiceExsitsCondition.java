package com.kxy.demo2.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 可以看做是条件，实现condition接口，覆盖matchs方法，mathces方法return false时，运行ConditionlTest测试方法，发现bean创建失败
 * @author Administrator
 *
 */
public class MagiceExsitsCondition implements Condition{

	/**
	 * ConditionContext功能：
	 * 		getRegistry()返回的BeanDefinitionRegistry检查bean定义
	 * 		getBeanFactory()返回的ConfigurableListableBeanFactory检查bean是否存在，甚至探查bean的属性
	 * 		getEnvironment()返回的Environment检查环境变量是否存在以及它的值是什么
	 * 		getResourceLoader()返回的ResourceLoader所加载的资源；
	 * 		getClassLoader()返回的ClassLoader加载并检查类是否存在。
	 * AnnotatedTypeMetadata功能：
	 * 		isAnnotated()方法，我们能够判断带有@Bean注解的方法是不是还有其他特定的注解，借助其他的那些方法，我们能够检查@Bean注解的方法上其他注解的属性
	 * 详见 ProfileCondition 的match方法
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//判断环境变量中是否有值
//		Environment e = context.getEnvironment();
//		String name = "aa";
//		if(e.containsProperty(name)){
//			return true;
//		}
		System.out.println(Bean.class.getName());
		System.out.println(metadata.isAnnotated(Bean.class.getName()));
		ConfigurableListableBeanFactory  factory = context.getBeanFactory();
		String beanName = "org.springframework.context.event.internalEventListenerProcessor";
		if(factory.containsBean(beanName)){
			return true;
		};
		return false;
	}

}
