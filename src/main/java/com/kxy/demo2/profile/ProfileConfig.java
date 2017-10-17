package com.kxy.demo2.profile;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

//目的: 项目环境配置，开发阶段，测试阶段，生产阶段环境不一样，比如数据库可能不一样。解决应用程序从一个环境切换到另外一个环境时可能出现的问题
//配置三个profile，只有被激活的profile才会生成bean, 这里展示了dev和prod的profile的java配置，激活哪个就会创建哪个的DataSource bean
//还可以使用xml的配置
//激活profile的方法，需要两个属性，spring.profiles.active和spring.profiles.default,如果这两个值一个没有设置，就不会创建在ProfileConfig中bean
//设置以上两值的方式：
//		1).作为dispatcherServet的初始化参数；
//		2).作为web.xml的上下文参数；
//		3).作为JNDI条目；
//		4).作为环境变量；
//		5).作为JVM的系统参数；
//		6).在集成测试类上使用@ActiveProfiles的注解设置。
//现在展示web.xml设置spring.profiles.default，应用程序切换到测试或者生产环境时，
//负责部署的人员根据情况，可以在系统属性、环境变量后JNDI设置spring.profiles.active值，这样默认的default的值就会被覆盖了
//spring.profiles.意味着，可以设置多个profile,可以使用逗号分隔，但是同时激活dev和prod没什么意义
/**
 * 目的: 项目环境配置，开发阶段，测试阶段，生产阶段环境不一样，比如数据库可能不一样。解决应用程序从一个环境切换到另外一个环境时可能出现的问题
 * 配置三个profile，只有被激活的profile才会生成bean, 这里展示了dev和prod的profile的java配置，激活哪个就会创建哪个的DataSource bean
 * 还可以使用xml的配置
 * 激活profile的方法，需要两个属性，spring.profiles.active和spring.profiles.default,如果这两个值一个没有设置，就不会创建在ProfileConfig中bean
 * 设置以上两值的方式：
 * 		1).作为dispatcherServet的初始化参数；
 * 		2).作为web.xml的上下文参数；
 * 		3).作为JNDI条目；
 * 		4).作为环境变量；
 * 		5).作为JVM的系统参数；
 * 		6).在集成测试类上使用@ActiveProfiles的注解设置。
 * 现在展示web.xml设置spring.profiles.default，应用程序切换到测试或者生产环境时，
 * 负责部署的人员根据情况，可以在系统属性、环境变量后JNDI设置spring.profiles.active值，这样默认的default的值就会被覆盖了
 * spring.profiles.意味着，可以设置多个profile,可以使用逗号分隔，但是同时激活dev和prod没什么意义
 * @author Administrator
 *
 */
@Configuration
public class ProfileConfig {

	@Bean(destroyMethod="shutdown")
	@Profile("dev")
	public DataSource embeddedDataSource(){
		return (DataSource) new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:schema.sql")
				.addScript("classpath:test-data.sql")
				.build();
	}
	
	@Bean
	@Profile("prod")
	public DataSource jndiDataSource(){
		JndiObjectFactoryBean factory = new JndiObjectFactoryBean();
		factory.setJndiName("jdbc/MyDs");
		factory.setResourceRef(true);
		factory.setProxyInterface(javax.sql.DataSource.class);
		return (DataSource)factory.getObject();
	}
}
