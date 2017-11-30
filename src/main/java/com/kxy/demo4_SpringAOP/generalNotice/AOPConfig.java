package com.kxy.demo4_SpringAOP.generalNotice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.kxy.PrintBean;

/**
 * 启用自动代理 @EnableAspectJAutoProxy，必须开启自动代理，否则，即使使用了 @AspectJ，NoticeAspect 也不会被当做切面
 * 在xml中配置，需要开启  <aop:aspectj-autoproxy>
 * @author Administrator
 *
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
@Import(PrintBean.class)
public class AOPConfig {

}
