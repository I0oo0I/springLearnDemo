package com.kxy.demo3_AOP.cglibProxy;

public class TestCglib {

	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		DoSomething doSomethingServiceImpl= (DoSomething)cglibProxy.getIntance(new DoSomething());
		doSomethingServiceImpl.eatFood("苹果");
		doSomethingServiceImpl.doHomework("数学");
	}
}
