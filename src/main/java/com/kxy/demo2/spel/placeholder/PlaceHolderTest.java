package com.kxy.demo2.spel.placeholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {PlaceholderConfig.class})
public class PlaceHolderTest {

	@Autowired
	private PlaceHolderModel model;
	
	@Autowired
	private Environment enviroment;
	
	@Test
	public void doTest() {
		System.out.println(enviroment.getProperty("disc.title"));
		System.out.println("------------------------------------------------------------------");
		System.out.println(model.toString());
		System.out.println("------------------------------------------------------------------");
	}
}
