package com.kxy.demo4_SpringAOP.introductionNotice.useXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntroductionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kxy/demo4_SpringAOP/introductionNotice/useXML/introduction.xml");
		EatFoodService service1 = (EatFoodService) context.getBean("eatFood");
		AddFunctionService service2 = (AddFunctionService)context.getBean("eatFood");
		service1.eatFood("苹果");
		service2.addFunction();
	}
}
