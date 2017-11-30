package com.kxy.demo3_AOP.staticProxy;

import com.kxy.demo3_AOP.DoSomethingServiceImpl;

public class TestStaticProxy {

	public static void main(String[] args) {
		StaticProxy proxy = new StaticProxy(new DoSomethingServiceImpl());
		proxy.eatFood("香蕉");
		proxy.doHomework("英语");
	}
}
