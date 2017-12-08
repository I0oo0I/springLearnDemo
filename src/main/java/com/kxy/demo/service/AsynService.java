package com.kxy.demo.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AsynService {
	
	@Async
	public void testAysn() {
		try {
			Thread.sleep(5000);
			System.out.println("我是异步方法");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
