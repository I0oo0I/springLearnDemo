package com.kxy.demo2.autowire.test1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 使用@Primary，表明在出现歧义的时候，首选的是有primary标注的bean，查看 Test.java
 * @author Administrator
 *
 */
@Component
@Primary
public class IceCream implements Dessert{

	@Override
	public void whoIsMe() {
		System.out.println("我是iceCream");
	}

}
