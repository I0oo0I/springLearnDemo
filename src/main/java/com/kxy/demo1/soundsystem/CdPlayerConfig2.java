package com.kxy.demo1.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 使用显示的bean配置，不用自动扫描
 * @author Administrator
 *
 */
@Configuration
public class CdPlayerConfig2 {
	
	/**
	 * 创建的bean的名字是方法名，newCD,通常应该和类型一致，也可以用@Bean的name属性修改bean的名字
	 * @return
	 */
	@Bean
	public MusicCd newCd(){
		return new MusicCd();
	}
	
	/**
	 * 这个的功能是用来打印创建bean的名字
	 * @return
	 */
	@Bean
	public PrintBean printBeanName(){
		return new PrintBean();
	}
	
	/**
	 * 
	 * @param cd
	 * @return
	 */
	@Bean
	public CdPlayer cdPlayer1(MusicCd cd){
		return new CdPlayer(cd);
	}
	
	/**
	 * 
	 * @param cd
	 * @return
	 */
	@Bean
	public CdPlayer cdPlayer2(MusicCd cd){
		return new CdPlayer(cd);
	}
}
