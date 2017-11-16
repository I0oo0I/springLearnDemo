package com.kxy.demo2.autowire;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DessertConfig.class)
public class Test {

	//自动装配，当coke和iceCream两个bean同时存在时，spring就会不知道装配哪一个，会抛错
	//解决方式：1.在 IceCream 中添加@Primary注释；2.在dessert上面添加@Qualifier("coke")，表明装配哪个bean,通过component，
	//创建的bean的名字是类的首字母变小写的名字；
	//使用@Qualifier缺点：如果重构了类Coke，名字变了，那么@Qualifier("coke")就找不到了，解决方式是，在Coke类上添加@Qualifier（查看 Coke ），
	//自己设置一个Qualifier名字，在AutoWire使用Qualifier时，使用这个名字@Qualifier("cool")
	@SuppressWarnings("unused")
	@Autowired
	//@Qualifier("cool")
	private Dessert dessert;
	
	@org.junit.Test
	public void test(){
		System.out.println("dfsfsd");
	}
}
