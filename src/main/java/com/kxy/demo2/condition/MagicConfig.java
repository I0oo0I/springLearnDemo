package com.kxy.demo2.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.kxy.demo1.soundSystem.InstantiationTracingBeanPostProcessor;

//目的：一个或多个bean在包含某库（jar包）时才创建，某bean在另一bean申明后才创建，或一beab在某特定环境下才创建，spring4.0的@conditionl解决这个问题
@Configuration
public class MagicConfig {

	@Bean
	@Conditional(MagiceExsitsCondition.class) //这个提交返回true时，才创建bean，否则不创建，查看MagiceExsitsCondition
	public MagicBean magicBean(){
		return new MagicBean();
	}
	
	@Bean
	public InstantiationTracingBeanPostProcessor beanPrint(){
		return new InstantiationTracingBeanPostProcessor();
	}
}
