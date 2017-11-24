package com.kxy.demo.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.kxy.demo.model.ShoppingCart;

@Service
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class StoreSessionScopeService {

	private int a = 1;
	
	/**
	 * 使用不同的浏览器的版本号来区分来自哪个浏览器的访问
	 * @param browerVersion
	 */
	public void printResult(String browerVersion) {
		System.out.println("--------------------------回话作用域，使用代理-------------------------------");
		System.out.println("浏览器的版本号："+ browerVersion);
		System.out.println(a);
		a++;
	}
}
