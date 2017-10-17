package com.kxy.demo2.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.kxy.BeanConfig;

/**
 * 即使在类和自动装配时都使用相同的@Qualifier("cool"),目的是找出唯一的bean，但是也有可能找出多个bean
 * 现假设，有两个类，冰和冰淇淋，都可以使用@Qualifier("cool")，都可以用cool特征表示，但还想加一个@Qualifier("solid")表示冰，或者@Qualifier("soft")表示冰淇淋
 * 但是java不支持重复同名注解，编译器会报错;
 * 解决：自定义注解，比如@Cool，@Solid，@soft，来代替@Qualifier，通过之间的两两组合，来分离出唯一的bean
 * @author Administrator
 *
 */
@Configuration
@Import(value=BeanConfig.class)
public class ZFinallyConfig {
	
	@Bean
	@ZFinallyCool
	@ZFinallySolid
	public ZFinallyIceInterface ice(){
		return new ZFinallyIce();
	}
	
	@Bean
	@ZFinallyCool
	@ZFinallySoft
	public ZFinallyIceInterface iceCream(){
		return new ZFinallyIceCream();
	}
}
