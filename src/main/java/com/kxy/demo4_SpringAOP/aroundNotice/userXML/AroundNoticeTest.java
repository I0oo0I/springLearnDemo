package com.kxy.demo4_SpringAOP.aroundNotice.userXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AroundNoticeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kxy/demo4_SpringAOP/aroundNotice/userXML/around-notice.xml");
		EatFoodService service = (EatFoodService)context.getBean("eatService");
		service.eatFood("葡萄");
	}
}
