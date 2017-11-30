package com.kxy.demo3_AOP.staticProxy;

import java.util.Arrays;

import com.kxy.demo3_AOP.DoSomethingServcie;
import com.kxy.demo3_AOP.DoSomethingServiceImpl;

/**
 * 静态代理，这是静态代理的原理，实现和目标类相同的接口，覆盖接口的方法，将日志的加入其中，绑定目标类，实际的调用核心业务逻辑的还是目标类
 * 弊端：静态代理每一个目标类都需要写一个代理类，不合理，后面会使用动态代理代替
 * @author Administrator
 *
 */
public class StaticProxy implements DoSomethingServcie{

	private DoSomethingServiceImpl serviceImpl;

	//绑定需要代理的类
	public StaticProxy(DoSomethingServiceImpl serviceImpl) {
		super();
		this.serviceImpl = serviceImpl;
	}

	//添加日志服务，但是调用核心业务逻辑的还是serviceImpl， serviceImpl.eatFood(food);
	@Override
	public void eatFood(String food) {
		System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
		System.out.println("代理的目标：" + serviceImpl);
		System.out.println("args参数" + food);
		System.out.println("开始调用目标类的核心业务代码:");
		serviceImpl.eatFood(food);
		System.out.println("目标类的核心业务代码执行完毕");
		System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
	}

	//添加日志服务，但是调用核心业务逻辑的还是serviceImpl， serviceImpl.eatFood(food);
	@Override
	public void doHomework(String homeword) {
		System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
		System.out.println("代理的目标：" + serviceImpl);
		System.out.println("args参数" + homeword);
		System.out.println("开始调用目标类的核心业务代码:");
		serviceImpl.doHomework(homeword);
		System.out.println("目标类的核心业务代码执行完毕");
		System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
	}
	
}
