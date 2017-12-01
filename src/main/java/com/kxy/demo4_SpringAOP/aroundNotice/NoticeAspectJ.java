package com.kxy.demo4_SpringAOP.aroundNotice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 环绕通知，就是将前置通知，后置通知，和错误通知都放在一个方法中，好处
 * 普通的通知中，before方法和after方法是分离的，它们之间共享信息非常的不容易，假如使用成员变量，NoticeAspectJ因为是单例的，
 * 多线程时会出现安全问题，around的通知的好处是，before和after方法在一起
 * @author Administrator
 *
 */
@Component
@Aspect
public class NoticeAspectJ {

	@Pointcut("execution(** com.kxy.demo4_SpringAOP.aroundNotice.EatFoodService.*(..))")
	public void pointCut() {}
	
	/**
	 * 可以多次调用 point.proceed()，相当于多次尝试; 如果一次不调用，核心业务的请求将不会进行
	 * @param point
	 */
	@Around("pointCut()")
	public void aroundNotice(ProceedingJoinPoint point) {
		try {
			System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
			point.proceed();
			System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("-------------------------------我是日志系统，出现错误了-------------------------------");
			try {
				System.out.println("-------------------------------我是日志系统，重试第一次-------------------------------");
				point.proceed();
				System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
			} catch (Throwable e1) {
				System.out.println("-------------------------------我是日志系统，出现错误了-------------------------------");
				try {
					System.out.println("-------------------------------我是日志系统，重试第二次-------------------------------");
					point.proceed();
				} catch (Throwable e2) {
					System.out.println("-------------------------------我是日志系统，出现错误了-------------------------------");
					System.out.println("-------------------------------我是日志系统，请求失败了-------------------------------");
					System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
					e2.printStackTrace();
				}
				e1.printStackTrace();
			}
		}
	}
}
