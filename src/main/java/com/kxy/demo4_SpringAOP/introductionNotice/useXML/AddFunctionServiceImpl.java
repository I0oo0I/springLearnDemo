package com.kxy.demo4_SpringAOP.introductionNotice.useXML;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class AddFunctionServiceImpl implements AddFunctionService{

	@Override
	public void addFunction() {
		System.out.println("我是新增方法");
	}

}
