package com.kxy.demo4_SpringAOP.generalNotice.userXML;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class NoticeAspect {

	public  void start() {
		System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
	}
	
	public void after() {
		System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
	}
	
	public void afterThrowing() {
		System.out.println("-------------------------------我是日志系统，出现错误了-------------------------------");
	}

}
