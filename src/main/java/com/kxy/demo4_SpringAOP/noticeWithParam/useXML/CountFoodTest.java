package com.kxy.demo4_SpringAOP.noticeWithParam.useXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountFoodTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kxy/demo4_SpringAOP/noticeWithParam/useXML/count-food.xml");
		EatFoodService service = (EatFoodService)context.getBean("eatFood");
		service.eatFood("苹果");
		service.eatFood("香蕉");
		service.eatFood("苹果");
		service.eatFood("荔枝");
		service.eatFood("香蕉");
		service.eatFood("苹果");
	}
}
