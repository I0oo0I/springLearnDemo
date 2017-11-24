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
 * 
 * getPropertyAsClass(disc.class, TestModel.class);  解析为指定类
 * 
 * Environment对profile的操作
 * 		String [] getActiveProfiles();					获取激活的profile数组
 * 		String [] getDefaultProfiles();					获取默认的profile数组
 * 		boolean acceptProfiles(String ... profiles);	给定profile，判断Environment是否支持，应该是Environment中是否有给定的profile
 * 
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
	
	/**
	 * getProperty获取的值进行类型转换
	 * 最后的 20 是默认值，可以不写
	 * 若app.properties 这个文件中并没有定义disc.age， getProperty会是null，如果有默认值，就会取默认值
	 * @return
	 */
	@Bean
	public TestModel modelBean2() {
		return new TestModel(enviroment.getProperty("disc.age", Integer.class, 20));
	}
	
	/**
	 * getRequiredProperty，意思是app.properties中必须有disc.age，否则就会报错 IllegalStateException
	 * 所以这个方法不存在默认值的存在
	 * enviroment.containsProperty("disc.age") 可以检测某个属性是否存在
	 * @return
	 */
	@Bean
	public TestModel modelBean3() {
		return new TestModel(enviroment.getRequiredProperty("disc.age", Integer.class));
	}
}
