package com.kxy.demo3_AOP.interfaceProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 动态代理，静态代理的升级版（也叫jdk的动态代理，只能是基于接口实现）
 * @author Administrator
 *
 */
public class DoSomethingProxy implements InvocationHandler{
	
	//代理的目标
	private Object target;
	
	public Object bind(Object target) {
		this.target = target;
		//获取代理对象，this代指  DoSomethingProxy
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	/**
	 * 织入切面，将target核心业务和通知绑定在一起
	 * @param proxy		被代理的对象, 具体的介绍  第一个参数的介绍 	 https://www.zhihu.com/question/52551525，下面的invoke没有用到
	 * @param method	要调用的方法
	 * @param args		方法调用时传递的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
		System.out.println("代理的目标：" + target);
		String arg = Arrays.deepToString(args);
		System.out.println("args参数" + arg);
		System.out.println("开始调用目标类的核心业务代码：");
		Object obj = method.invoke(target, args);
		System.out.println("目标类的核心业务代码执行完毕");
		System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
		return obj;
	}

}
