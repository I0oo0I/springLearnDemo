package com.kxy.demo1.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 1) 原来是将配置信息写在xml文件中，现在采用java的显示配置，因此通常将配置信息的类以config结尾，我们需要在类上使用 @Configuration,
 *    以明确的指出该类是bean配置的信息源
 * 2) 并且 Spring 对标注Configuration 的类有如下要求：
 * 	     	配置类不能是 final 的；
 * 			配置类不能是本地化的，亦即不能将配置类定义在其他类的方法内部；
 * 			配置类必须有一个无参构造函数。
 * 3) AnnotationConfigApplicationContext 将配置类中标注了 @Bean 的方法的返回值识别为 Spring Bean，并注册到容器中，受 IoC 容器管理。
 * 4) @Bean 的作用等价于 XML 配置中的 标签。示例如下：  http://blog.csdn.net/zly9923218/article/details/52150907
 * 	 	@Configuration  
 * 	 	public class BookStoreDaoConfig{  
 * 		 	@Bean  
 * 			 public UserDao userDao(){ 
 * 				return new UserDaoImpl();
 * 		 	}  
 * 		 	@Bean  
 * 		 	public BookDao bookDao(){
 * 				return new BookDaoImpl();
 * 		 	}  
 * 		 }
 * 	  bean的名字就是方法名，例如上面两个bean的名字是userDao和bookDao
 * 5) @ComponentScan(basePackageClasses={MusicCD.class, InstantiationTracingBeanPostProcessor.class})	这么配置也是行的，表示要扫描的类	
	    本例中，并没有显示的申明任何bean，不过通过组件扫描，默认扫描本包下, 相当与xml中 <context:component-scan base-package="com.kxy.demo1.soundsystem" />
 * @author Administrator
 *
 */
@Configuration	
@ComponentScan 
public class CdPlayerConfig {

}
