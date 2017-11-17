package com.kxy.demo2.condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MagicConfig.class)
public class ConditionlTest {

	@Test
	public void test(){
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("修改 MagiceExsitsCondition 类中 matches 方法的返回值为false，查看控制台分隔线上的bean创建结果，查看 magicBean bean是否创建");
	}
}
