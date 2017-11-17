package com.kxy.demo2.autowire.test1;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kxy.PrintBean;

/**
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DessertConfig.class)
public class Test {

	//现在自动装配的是dessert，Dessert有两个实现Coke和IceCream，都使用了@component，都可以被spring扫描到，这两个bean， coke和iceCream都可以被装配到dessert
	//自动装配，当coke和iceCream两个bean同时存在时，spring就会不知道装配哪一个，会抛错
	//解决方式：1.在 IceCream 中添加@Primary注释；2.在dessert上面添加@Qualifier("coke")，表明装配哪个bean,通过component，
	//创建的bean的名字是类的首字母变小写的名字；
	//使用@Qualifier缺点：如果重构了类Coke，名字变了，那么@Qualifier("coke")就找不到了，解决方式是，在Coke类上也添加@Qualifier（查看 Coke ），两个Qualifier的名字相同，
	//自己设置一个Qualifier名字，在AutoWire使用Qualifier时，使用这个名字@Qualifier("cool")
	@Autowired
	//@Qualifier("cool")
	private Dessert dessert;
	
	@Autowired
	public PrintBean printBean;
	
	@org.junit.Test
	public void test(){
		System.out.println("--------------------------------------------------------------------------------------------------------");
		dessert.whoIsMe();
	}
}
