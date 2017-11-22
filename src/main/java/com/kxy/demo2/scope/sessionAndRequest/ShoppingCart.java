package com.kxy.demo2.scope.sessionAndRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * WebApplicationContext.SCOPE_SESSION 当然也可以写作"session"， 在一个回话内，只会创建并公用一个ShoppingCart实例，多个回话也会创建多个
 * 		ShoppingCart实例，但是在一个回话总ShoppingCart是单例的
 * @author Administrator
 *
 */
@Component	//定义为扫描组件，会被扫描到，创建bean
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.INTERFACES)
public class ShoppingCart {

}
