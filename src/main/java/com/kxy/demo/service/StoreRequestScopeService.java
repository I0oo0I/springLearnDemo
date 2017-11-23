package com.kxy.demo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.kxy.demo.model.ShoppingCart;

@Service
@Scope(value=WebApplicationContext.SCOPE_REQUEST, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class StoreRequestScopeService {

	private int a = 1;
	
	public void printResult() {
		System.out.println("--------------------------请求作用域，使用代理-------------------------------");
		System.out.println(a);
		a++;
	}
}
