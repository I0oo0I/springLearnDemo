package com.kxy.demo4_SpringAOP.generalNotice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EatFoodServiceImpl implements EatFoodService{

	@Override
	public void eatFood(String food) {
		System.out.println("我是food1，我要吃" + food);
	}

	@Override
	public void eatFood(Integer count) {
		System.out.println("我是food1，我吃了" + count + "个苹果");
	}

}
