package com.kxy.demo3_AOP.cglibProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGlib采用非常底层的字节码技术，可以为一个类创建子类，
 * 并在子类中采用方法拦截技术拦截父类方法的调用，并顺势进行增强，即是织入横切逻辑
 * @author Administrator
 *
 */
public class CglibProxy implements MethodInterceptor{

    public Object getProxy(Class clazz){
    	Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz); //设者要创建子类的类
        enhancer.setCallback(this); //设置回调的对象
        return enhancer.create(); //通过字节码技术动态创建子类实例
    }
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
		System.out.println("代理的目标：" + obj);
		String arg = Arrays.deepToString(args);
		System.out.println("args参数" + arg);
		System.out.println("开始调用目标类的核心业务代码");
		Object result = proxy.invokeSuper(obj, args);
		System.out.println("目标类的核心业务代码执行完毕");
		System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
		return result;
	}

	
}
