package com.kxy.demo3_AOP.interfaceProxy;

import java.lang.reflect.Proxy;

import com.kxy.demo3_AOP.DoSomethingServcie;
import com.kxy.demo3_AOP.DoSomethingServiceImpl;

public class TestProxy {

	public static void main(String[] args) {
		DoSomethingProxy proxy = new DoSomethingProxy();
		DoSomethingServcie proxyService = (DoSomethingServcie) proxy.bind(new DoSomethingServiceImpl());
		proxyService.eatFood("西瓜");
		proxyService.doHomework("语文");
	}
}
