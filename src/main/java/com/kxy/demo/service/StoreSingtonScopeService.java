package com.kxy.demo.service;

import org.springframework.stereotype.Service;

@Service
public class StoreSingtonScopeService {

	private int a = 1;
	
	public void printResult() {
		System.out.println("--------------------------单例作用域，不使用代理-------------------------------");
		System.out.println(a);
		a++;
	}
}
