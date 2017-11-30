package com.kxy.demo4_SpringAOP.noticeWithParam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CountFoodAspect {

	private Map<String, Integer> foodCount = new HashMap<>();
	
	/**
	 * args 的值 fruit 和 @After("countFood(eatFood)") 和  public void eatFood(String food); 名字可以不一样
	 * @param fruit
	 */
	@Pointcut("execution(** com.kxy.demo4_SpringAOP.noticeWithParam.EatFoodService.*(String)) && args(fruit)")
	public void countFood(String fruit) {}
	
	@After("countFood(eatFood)")
	public void afterEat(String eatFood) {
		Set<String> set = foodCount.keySet();
		if(!set.contains(eatFood)) {
			foodCount.put(eatFood, 1);
		}else {
			foodCount.put(eatFood, foodCount.get(eatFood)+1);
		}
		
		Set<String> setd =  foodCount.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String fruit = it.next();
			System.out.println(fruit + ":" + foodCount.get(fruit));
		}
	}
}
