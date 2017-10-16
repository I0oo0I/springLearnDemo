package com.kxy.demo2.condition;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MagicConfig.class)
public class ConditionlTest {

	@Autowired
	private MagicBean magiceBean;
	
	@org.junit.Test
	public void test(){
		System.out.println("dfdsfsd");
	}
}
