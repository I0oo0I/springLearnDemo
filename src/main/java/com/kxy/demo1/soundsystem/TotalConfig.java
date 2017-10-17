package com.kxy.demo1.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 可以定义一个总的config，将各个config引入，如果只有两个config，也可以在CDPlayConfig中将CDConfig引入
 * 如果另外一个config，采用混合式的，定义在一个xml里面，可以使用
 * @ImportResource("classpath:config.xml")
 * @author Administrator
 *
 */
@Configuration
@Import(value={CdConfig.class, CdPlayerConfig.class})
public class TotalConfig {

}
