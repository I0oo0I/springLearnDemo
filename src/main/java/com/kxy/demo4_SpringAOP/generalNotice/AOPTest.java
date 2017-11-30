package com.kxy.demo4_SpringAOP.generalNotice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AOPConfig.class})
public class AOPTest {

	@Autowired
	private EatFoodService eatFoodService1;
	
	@Test
	public void doTest() {
		eatFoodService1.eatFood("西瓜");
		eatFoodService1.eatFood(2);
	}
}
