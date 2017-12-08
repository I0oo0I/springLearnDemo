package com.kxy.demo.controller;

import java.lang.annotation.Documented;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

import com.kxy.demo.model.ShoppingCart;
import com.kxy.demo.service.AsynService;
import com.kxy.demo.service.StoreRequestScopeService;
import com.kxy.demo.service.StoreSessionScopeService;
import com.kxy.demo.service.StoreSingtonScopeService;

import nl.bitwalker.useragentutils.Browser;
import nl.bitwalker.useragentutils.OperatingSystem;
import nl.bitwalker.useragentutils.UserAgent;

@Controller
@RequestMapping("api/test")
public class TestController {
	
	@Autowired
	private StoreSessionScopeService sessionScope;
	
	@Autowired
	private StoreRequestScopeService requestScope;
	
	@Autowired
	private StoreSingtonScopeService singtonScope;
	
	@Autowired
	private AsynService asynService;
	
	/**
	 * 演示会话作用域，在同一时刻发起访问，StoreSessionScopeService的bean是否是共用同一实例，即判断在会话范围内bean是否是单例的，
	 * 并且两个不同用户的同时访问同一Service时，在会话作用域类是互不影响（相当于这个Service对当个用户是单例的，在多个用户之间是多例的
	 * 操作： 1.通过打断点的方式来模拟同时访问，Service层使用断点停止，不让访问完，打开另一个浏览器访问同一个地址（必须是另外一个浏览器），解开断点让两次
	 *	               访问都访问完，看结果两次打印的结果，计数有没有累加
	 *	    2.通过打断点的方式来模拟同时访问，Service层使用断点停止，不让访问完，在同一个浏览器中打开一个新标签页，再一次访问这个地址，解开断点让两次
	 *		     访问都访问完，看结果两次打印的结果，计数有没有累加；
	 * 结论：1. 不同浏览器同时访问同一地址，不同回话之间不受影响。 2. 只要同一个会话没有结束，不论访问几次，访问的都是同一个Service的bean实例，从计数累加可以看出
	 * @param request
	 */
	@RequestMapping("sessionScope")
	public void testSessionScope(HttpServletRequest request) {
		UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent")); 
		sessionScope.printResult(userAgent.getBrowserVersion().getVersion());
	}
	
	/**
	 * request作用域，每次访问结束，再发起访问时，计数都会重新开始，request的作用域只是作用在这个请求，只要请求完成，请求内的都会被丢弃，即每一次发起请求，使用request的
	 * scope作用域，每一次请求，这个Service都会创建一个新的实例，请求完成就会被丢弃， 这是和Session作用域的不同，只要项目没有重启，以及浏览器没有关闭，session不会丢，
	 * 重复访问，计数会增加
	 */
	@Description(value="演示会话作用")
	@RequestMapping("requestScope")
	public void testRequestScope(HttpServletRequest request) {
		requestScope.printResult();
	} 
	
	/**
	 * 单例作用域，这个Service实例是共享的，任何操作这个Service都会使这个计数累加，只要服务器不关，这个会一直累加下去
	 * @param request
	 */
	@Description(value="演示会话作用")
	@RequestMapping("singtonScope")
	public void testSingtonScope(HttpServletRequest request) {
		singtonScope.printResult();
	} 
	
	@RequestMapping("testAsyn")
	public void testAsyn() {
		System.out.println("开始执行测试方法");
		asynService.testAysn();
		System.out.println("结束方法测试");
	}
}
