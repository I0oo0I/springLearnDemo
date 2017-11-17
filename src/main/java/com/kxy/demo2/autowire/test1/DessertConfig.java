package com.kxy.demo2.autowire.test1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.kxy.BeanConfig;

/**
 * 配置类，默认扫描本包
 * @component 能扫描到的bean都会创建，在Test.java运行时可以看到
 * @author Administrator
 *
 */
@Configuration
@ComponentScan
@Import(value= {BeanConfig.class})
public class DessertConfig {

}
