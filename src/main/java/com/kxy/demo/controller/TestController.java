package com.kxy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kxy.demo.model.ShoppingCart;
import com.kxy.demo.service.StoreService;

@Controller
@RequestMapping("api/test")
public class TestController {
	
	@Autowired
	private StoreService storeService;
	
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		ShoppingCart cart = new ShoppingCart();
		return storeService.printResult(cart);
	}
}
