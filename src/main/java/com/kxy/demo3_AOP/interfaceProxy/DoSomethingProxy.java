package com.kxy.demo3_AOP.interfaceProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 我是代理类
 * @author Administrator
 *
 */
public class DoSomethingProxy implements InvocationHandler{
	
	//代理的目标
	private Object target;
	
	public DoSomethingProxy(Object target) {
		super();
		this.target = target;
	}

	/**
	 * 织入切面，将target核心业务和通知绑定在一起
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
		System.out.println("代理的目标：" + target);
		String arg = Arrays.deepToString(args);
		System.out.println("args参数" + arg);
		System.out.println("开始调用目标类的核心业务代码");
		Object obj = method.invoke(target, args);
		System.out.println("目标类的核心业务代码执行完毕");
		System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
		return obj;
	}

}
