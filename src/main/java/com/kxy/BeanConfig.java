package com.kxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public PrintBean beanPrint(){
		return new PrintBean();
	}
}
