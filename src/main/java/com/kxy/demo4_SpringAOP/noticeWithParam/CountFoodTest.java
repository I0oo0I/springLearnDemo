package com.kxy.demo4_SpringAOP.noticeWithParam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {CountFoodConfig.class})
public class CountFoodTest {
	
	@Autowired
	private EatFoodService service;
	
	@Test
	public void doTest() {
		service.eatFood("苹果");
		service.eatFood("香蕉");
		service.eatFood("苹果");
		service.eatFood("荔枝");
		service.eatFood("香蕉");
		service.eatFood("苹果");
	}

}
