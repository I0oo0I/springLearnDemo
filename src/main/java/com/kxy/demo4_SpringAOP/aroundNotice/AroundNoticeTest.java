package com.kxy.demo4_SpringAOP.aroundNotice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AroundNoticeConfig.class})
public class AroundNoticeTest {

	@Autowired
	private EatFoodService eatFoodService;
	
	@Test
	public void doTest() {
		eatFoodService.eatFood("桔子");
	}
}
