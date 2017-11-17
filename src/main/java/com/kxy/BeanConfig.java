package com.kxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 公共，导入之后，可以打印创建的bean的名字
 * @author Administrator
 *
 */
@Configuration
public class BeanConfig {

	@Bean
	public PrintBean beanPrint(){
		return new PrintBean();
	}
}
