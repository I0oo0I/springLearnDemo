package com.kxy.demo4_SpringAOP.generalNotice.userXML;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class AOPTest {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/kxy/demo4_SpringAOP/generalNotice/userXML/general-aspect.xml");
			EatFoodService service = (EatFoodService)context.getBean("eatFoodService");
			service.eatFood("西瓜");
		}catch (Exception e) {
			System.out.println("出错了");
		}
	}
}
