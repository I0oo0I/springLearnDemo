package com.kxy.demo3_AOP;

public class DoSomethingServiceImpl implements DoSomethingServcie{

	@Override
	public void eatFood(String food) {
		System.out.println("我要吃" + food);
	}

	@Override
	public void doHomework(String homeword) {
		System.out.println("我要做" + homeword + "作业");
	}

}
