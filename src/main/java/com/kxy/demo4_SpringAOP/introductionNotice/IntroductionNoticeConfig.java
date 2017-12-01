package com.kxy.demo4_SpringAOP.introductionNotice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.kxy.PrintBean;

@Configuration
@Import(PrintBean.class)
@EnableAspectJAutoProxy
@ComponentScan
public class IntroductionNoticeConfig {

}
