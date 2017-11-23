package com.kxy.demo2.spel.propertyByFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.kxy.PrintBean;

/**
 * @PropertySource 通过这个往spring环境中加载属性，将文件中的属性加载到环境中，在通过Environment的getProperty的方法，读取加载进入环境中的属性
 * @author Administrator
 *
 */
@Configuration
@Import(value=PrintBean.class)
@PropertySource(value="classpath:app.properties")
public class PropertyByFileConfig {

	@Autowired
	Environment enviroment;
	
	@Bean
	public TestModel modelBean() {
		return new TestModel(enviroment.getProperty("disc.title"), enviroment.getProperty("disc.content"));
	}
	
	/**
	 * getProperty获取不到值时，可以使用默认值
	 * @return
	 */
	@Bean
	public TestModel modelBean1() {
		return new TestModel(enviroment.getProperty("disc.title", "我是默认title"), 
				enviroment.getProperty("disc.content", "我是默认content"));
	}
}
