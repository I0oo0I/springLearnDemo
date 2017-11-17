package com.kxy.demo2.autowire.test2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ZFinallyConfig.class)
public class ZFinallyTest {

	@Autowired
	@ZFinallyCool
	@ZFinallySolid
	private ZFinallyIceInterface ice;
	
	@Autowired
	@ZFinallyCool
	@ZFinallySoft
	private ZFinallyIceInterface ice1;
	
	@Test
	public void test(){
	}
}
