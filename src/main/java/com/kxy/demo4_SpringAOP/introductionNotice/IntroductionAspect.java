package com.kxy.demo4_SpringAOP.introductionNotice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class IntroductionAspect {

	/**
	 * 如果以下功能注释掉，IntroductionNoticeTest 中 AddFunctionService food2 = (AddFunctionService) foodService; 强制转换运行时会报错；
	 * 		这个功能，是将两个毫无关系的类连接在一起
	 * @DeclareParents value的值是要引入功能的核心业务类，EatFoodService+ 这个 '+' 表示的是 EatFoodService 的实现类，而不是  EatFoodService 本身，
	 * 		EatFoodService+ 就是指 EatFoodService的所有实现类，所有的实现类要引入功能；
	 * EatFoodService想要引入的功能是接口是 AddFunctionService，AddFunctionService的实现类是 defaultImpl=AddFunctionServiceImpl.class
	 * 		这样操作后，EatFoodService可以强制转换为 AddFunctionService，可以调用 AddFunctionService的功能
	 */
	@DeclareParents(value="com.kxy.demo4_SpringAOP.introductionNotice.EatFoodService+", defaultImpl=AddFunctionServiceImpl.class)
	public static AddFunctionService addFunctionService;
}
