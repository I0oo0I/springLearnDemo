package com.kxy.demo4_SpringAOP.noticeWithParam.useXML;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountFoodAspect {

	private Map<String, Integer> foodCount = new HashMap<>();
	
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
