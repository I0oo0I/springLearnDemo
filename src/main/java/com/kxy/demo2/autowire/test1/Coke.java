package com.kxy.demo2.autowire.test1;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component
//@Qualifier("cool")
public class Coke implements Dessert{

	@Override
	public void whoIsMe() {
		System.out.println("我是coke");
	}

}
