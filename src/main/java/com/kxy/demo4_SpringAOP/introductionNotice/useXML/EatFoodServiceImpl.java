package com.kxy.demo4_SpringAOP.introductionNotice.useXML;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class EatFoodServiceImpl implements EatFoodService{

	@Override
	public void eatFood(String food) {
		System.out.println("我吃了一个" + food);
	}

}
