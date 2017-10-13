package com.kxy.demo1.soundSystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={CDConfig.class, CDPlayerConfig.class})
//可以定义一个总的config，将各个config引入，如果只有两个config，也可以在CDPlayConfig中将CDConfig引入
//如果另外一个config，采用混合式的，定义在一个xml里面，可以使用
//@ImportResource("classpath:config.xml")
public class TotalConfig {

}
