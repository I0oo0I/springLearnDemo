package com.kxy.demo3_AOP.interfaceProxy;

import java.lang.reflect.Proxy;

import com.kxy.demo3_AOP.DoSomethingServcie;
import com.kxy.demo3_AOP.DoSomethingServiceImpl;

public class TestProxy {

	public static void main(String[] args) {
		DoSomethingServcie target = new DoSomethingServiceImpl();
		DoSomethingProxy handler = new DoSomethingProxy(target);
		DoSomethingServcie proxyService = (DoSomethingServcie)Proxy.newProxyInstance(target.getClass().getClassLoader(), 
							   target.getClass().getInterfaces(), 
							   handler);
		proxyService.eatFood("西瓜");
		proxyService.doHomework("语文");
	}
}
