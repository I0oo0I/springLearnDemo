package com.kxy.demo2.spel.propertyByFile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {PropertyByFileConfig.class})
public class PropertyTest {

	@Autowired
	private TestModel modelBean;
	
	@Test
	public void name() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println(modelBean.toString());
		System.out.println("-------------------------------------------------------------------");
	}
}
