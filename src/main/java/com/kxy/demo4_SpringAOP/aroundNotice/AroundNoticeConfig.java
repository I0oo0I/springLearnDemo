package com.kxy.demo4_SpringAOP.aroundNotice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.kxy.PrintBean;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@Import(PrintBean.class)
public class AroundNoticeConfig {

}
