package com.kxy.demo1.soundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//使用显示的bean配置，不用自动扫描
@Configuration
public class CDPlayerConfig2 {

	@Bean							//创建的bean的名字是方法名，newCD,通常应该和类型一致，也可以用@Bean的name属性修改bean的名字
	public MusicCD newCD(){
		return new MusicCD();
	}
	
	@Bean							//这个的功能是用来打印创建bean的名字
	public InstantiationTracingBeanPostProcessor ins(){
		return new InstantiationTracingBeanPostProcessor();
	}
	
	@Bean
	public CDPlayer cdPlayer1(MusicCD cd){
		return new CDPlayer(cd);
	}
	
	@Bean
	public CDPlayer cdPlayer2(MusicCD cd){
		return new CDPlayer(cd);
	}
}
