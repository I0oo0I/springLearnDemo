package com.kxy.demo4_SpringAOP.aroundNotice.userXML;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundNotice {

	public void aroundNotice(ProceedingJoinPoint point) {
		try {
			System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
			point.proceed();
			System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("-------------------------------我是日志系统，出现错误了-------------------------------");
		}
	}
	
}
