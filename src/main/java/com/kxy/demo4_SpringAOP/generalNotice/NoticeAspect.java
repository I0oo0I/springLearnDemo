package com.kxy.demo4_SpringAOP.generalNotice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 定义一个切面
 * 切点 @Pointcut 和 通知（例如：下面的日志功能），构成了切面
 * @author Administrator
 *
 */
@Aspect
@Component
public class NoticeAspect {
	
	/**
	 * execution 执行的意思，第一个 * 代表任意返回类型，后面是全 限定类名，类型后面的 * 是任意方法名（也可以指定单个），(..)任意参数的可以匹配到
	 */
	@Pointcut("execution(** com.kxy.demo4_SpringAOP.generalNotice.EatFoodService.*(..))")
	public void pointCut() {}
	
	@Before(value="pointCut()")
	public  void start() {
		System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
	}
	
	@After("pointCut()")
	public void after() {
		System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
	}
	
	@AfterReturning(value="pointCut()", returning="returnValue")
	public void afterReturirng(JoinPoint point, Object returnValue) {
		//返回连接点的信息
		Signature signature = point.getSignature();
		System.out.println("signature.getDeclaringType() = " + signature.getDeclaringType());
		System.out.println("signature.getDeclaringTypeName() = " +signature.getDeclaringTypeName());
		System.out.println("signature.getModifiers() = " +signature.getModifiers());
		System.out.println("signature.getName() =" + signature.getName());
		System.out.println("signature.toString() = " +signature.toString());
		System.out.println("signature.toLongString() = " + signature.toLongString());
		System.out.println("signature.toShortString() = " + signature.toShortString());
		
		//获取到拦截的方法的传入的所有的参数
		Object [] args = point.getArgs();
		System.out.println(Arrays.deepToString(args));
		
		System.out.println(point.getTarget().toString());
	}
	
	@AfterThrowing(value="pointCut()", throwing="ex")
	public void afterThrowing(Throwable ex) {
		System.out.println("exception:" + ex.getMessage());
		System.out.println("-------------------------------我是日志系统，出现错误了-------------------------------");
	}


//  以上方法更好，execution不用频繁的使用重复的表达式
//	@Before("execution(** com.kxy.demo4_SpringAOP.EatFoodService.eatFood(..))")
//	public  void start() {
//		System.out.println("-------------------------------我是日志系统，开始记录日志-------------------------------");
//	}
//	
//	@After("execution(** com.kxy.demo4_SpringAOP.EatFoodService.eatFood(..))")
//	public void after() {
//		System.out.println("-------------------------------我是日志系统，结束记录日志-------------------------------");
//	}
//	
//	@AfterThrowing("execution(** com.kxy.demo4_SpringAOP.EatFoodService.eatFood(..))")
//	public void afterThrowing() {
//		System.out.println("-------------------------------我是日志系统，出现错误了-------------------------------");
//	}
}
