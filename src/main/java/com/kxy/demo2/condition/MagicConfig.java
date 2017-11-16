package com.kxy.demo2.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.kxy.PrintBean;

/**
 * 目的：一个或多个bean在包含某库（jar包）时才创建，某bean在另一bean申明后才创建，或一beab在某特定环境下才创建，spring4.0的@conditionl解决这个问题
 * @author Administrator
 *
 */
@Configuration
public class MagicConfig {

	//@Conditional 这个条件返回true时，才创建bean，否则不创建，查看MagiceExsitsCondition
	@Bean
	@Conditional(MagiceExsitsCondition.class) 
	public MagicBean magicBean(){
		return new MagicBean();
	}
	
	//打印创建的bean的名字
	@Bean
	public PrintBean beanPrint(){
		return new PrintBean();
	}
}
