package com.kxy.demo4_SpringAOP.introductionNotice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {IntroductionNoticeConfig.class})
public class IntroductionNoticeTest {
	
	@Autowired
	private EatFoodService foodService;
	
	@Test
	public void doTest() {
		foodService.eatFood("菠萝");
		AddFunctionService food2 = (AddFunctionService) foodService;
		food2.addFunction();
		System.out.println(IntroductionAspect.addFunctionService);
	}
}
