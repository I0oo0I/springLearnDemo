package com.kxy.demo4_SpringAOP.aroundNotice;

import org.springframework.stereotype.Service;

@Service
public class EatFoodServiceImpl implements EatFoodService{

	@Override
	public void eatFood(String food) {
		System.out.println("测试环绕通知，我吃了一个" + food);
	}

}
