package com.kxy.demo2.spel.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.kxy.PrintBean;

/**
 * 使用占位符获取属性
 * @author Administrator
 *
 */
@Configuration
@Import(value=PrintBean.class)
//@PropertySource("classpath:app.properties")
public class PlaceholderConfig {
	
	@Value("${disc.title}")
	private String title;
	
	@Value("${disc.content}")
	private String content;
	
	// @Value("${disc.age}") 静态变量无法直接获取到，可以使用其非静态的set方法获取
	private static Integer age;
	
	@Value("${disc.age}")
	public void setAge(Integer age) {
		PlaceholderConfig.age = age;
	}

	/**
	 * 1. 可以直接使用上面注销的  @PropertySource("classpath:app.properties")，这个 PropertySourcesPlaceholderConfigurer 的bean可以不需要了。
	 * 2. 若使用以下的 PropertySourcesPlaceholderConfigurer，那么 PlaceHolderTest 中的 enviroment.getProperty("disc.title")获取不到，
	 * 	  1 中的  @PropertySource("classpath:app.properties") 加载方式可以获取到。
	 * 3. 可以使用xml的配置
	 * 		<bean id="propertyConfigurer" class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
				<property name="locations">
		            <list>
		                <value>classpath:localhost.app.properties</value>
		                <value>classpath:test.jdbc.properties</value>
		                <value>classpath:test.redis.properties</value>
		            </list>
		        </property>
				<property name="fileEncoding" value="utf-8" />
				<property name="ignoreResourceNotFound" value="true"/>
				<property name="ignoreUnresolvablePlaceholders" value="true"/>
			</bean>  
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		PropertySourcesPlaceholderConfigurer property = new PropertySourcesPlaceholderConfigurer();
		Resource location = new ClassPathResource("app.properties");
		property.setLocation(location);
		return property;
	}
	
	@Bean
	public PlaceHolderModel model() {
		System.out.println("------------------------------------------------------------");
		System.out.println(title);
		System.out.println(content);
		System.out.println(age);
		System.out.println("------------------------------------------------------------");
		return new PlaceHolderModel(title, content, age);
	}

}
