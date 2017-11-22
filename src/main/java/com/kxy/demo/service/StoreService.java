package com.kxy.demo.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import com.kxy.demo.model.ShoppingCart;

@Service
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class StoreService {

	private int a = 1;
	
	public String printResult(ShoppingCart cart) {
		System.out.println(a);
		a++;
		return cart.toString();
	}
}
