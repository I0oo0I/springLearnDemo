package com.kxy.demo2.spel.spel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELlTest {

	private Integer i;
	private String spel_i;
	private String name;
	private String 布尔值判断;
	private String otherBeanTitle;
	private String otherBeanMethod;
	private String otherBeanMethodNullResult;
	private String I_am_π;
	private String I_am_面积;
	private String compare_A_相等_B;
	private String compare_A_eq_B;
	private String 三目运算符;
	private String 三目运算符判断null;
	private String 判断是否是邮件;
	private String 集合获数组取值;
	private String 从给定的字符串中取出第3个字符;
	private SpELModel [] 集合或数组过滤;
	private String 集合或数组匹配第一个aa;
	private String 集合或数组匹配最后一个aa;
	
	
	@Test
	public void doTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spel-test.xml");
		SpELlTest test = (SpELlTest)context.getBean("spel");
		System.out.println("SpEL表达式：#{100}； i：" + test.getI());
		System.out.println("SpEL表达式：#{spel.i}； spel_i：" + test.getSpel_i());
		System.out.println("SpEL表达式：#{'小红'}； name：" + test.getName());
		System.out.println("SpEL表达式：#{true}； 布尔值判断：" + test.get布尔值判断());
		System.out.println("SpEL表达式：#{spelModel.title}； otherBeanTitle：" + test.getOtherBeanTitle());
		System.out.println("SpEL表达式：#{spelModel.toString()}； otherBeanMethod：" + test.getOtherBeanMethod());
		System.out.println("SpEL表达式：#{spelModel.nullMethod()?.toUpperCase()}； otherBeanMethodNullResult：" + test.getOtherBeanMethodNullResult());
		System.out.println("SpEL表达式：#{T(java.lang.Math).PI}； I_am_π：" + test.getI_am_π());
		System.out.println("SpEL表达式：#{T(java.lang.Math).PI*(2^2)}； I_am_面积：" + test.getI_am_面积());
		System.out.println("SpEL表达式：#{100 == 100}； compare_A_相等_B：" + test.getCompare_A_相等_B());
		System.out.println("SpEL表达式：#{100 eq 100}； compare_A_eq_B：" + test.getCompare_A_eq_B());
		System.out.println("SpEL表达式：#{100 > 1000 ? 'i大于1000': 'i小于1000'}； 三目运算符：" + test.get三目运算符());
		System.out.println("SpEL表达式：#{spel.i?: 'i是null,我是默认值'}；三目运算符判断null：" + test.get三目运算符判断null());
		System.out.println("SpEL表达式：#{'123@qq.com' matches '[a-zA-z0-9._%+-]+@[a-zA-z0-9.-]+\\\\.com'； 判断是否是邮件：" + test.get判断是否是邮件());
		System.out.println("SpEL表达式：#{spelModel.arrays[2]}； 集合获数组取值：" + test.get集合获数组取值());
		System.out.println("SpEL表达式：#{'I am String'[2]}； 从给定的字符串中取出第3个字符：" + test.get从给定的字符串中取出第3个字符());
		//System.out.println("SpEL表达式：#{spelModel.titleArrays.?[title eq 'a']}； 集合或数组过滤：" + test.get集合或数组过滤());
		
	}

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOtherBeanTitle() {
		return otherBeanTitle;
	}

	public void setOtherBeanTitle(String otherBeanTitle) {
		this.otherBeanTitle = otherBeanTitle;
	}

	public String getOtherBeanMethod() {
		return otherBeanMethod;
	}

	public void setOtherBeanMethod(String otherBeanMethod) {
		this.otherBeanMethod = otherBeanMethod;
	}

	public String getOtherBeanMethodNullResult() {
		return otherBeanMethodNullResult;
	}

	public void setOtherBeanMethodNullResult(String otherBeanMethodNullResult) {
		this.otherBeanMethodNullResult = otherBeanMethodNullResult;
	}

	public String getI_am_π() {
		return I_am_π;
	}

	public void setI_am_π(String i_am_π) {
		I_am_π = i_am_π;
	}

	public String getI_am_面积() {
		return I_am_面积;
	}

	public void setI_am_面积(String i_am_面积) {
		I_am_面积 = i_am_面积;
	}

	public String getCompare_A_相等_B() {
		return compare_A_相等_B;
	}

	public void setCompare_A_相等_B(String compare_A_相等_B) {
		this.compare_A_相等_B = compare_A_相等_B;
	}

	public String getCompare_A_eq_B() {
		return compare_A_eq_B;
	}

	public void setCompare_A_eq_B(String compare_A_eq_B) {
		this.compare_A_eq_B = compare_A_eq_B;
	}

	public String get三目运算符() {
		return 三目运算符;
	}

	public void set三目运算符(String 三目运算符) {
		this.三目运算符 = 三目运算符;
	}

	public String get三目运算符判断null() {
		return 三目运算符判断null;
	}

	public void set三目运算符判断null(String 三目运算符判断null) {
		this.三目运算符判断null = 三目运算符判断null;
	}

	public String get判断是否是邮件() {
		return 判断是否是邮件;
	}

	public void set判断是否是邮件(String 判断是否是邮件) {
		this.判断是否是邮件 = 判断是否是邮件;
	}

	public String get集合获数组取值() {
		return 集合获数组取值;
	}

	public void set集合获数组取值(String 集合获数组取值) {
		this.集合获数组取值 = 集合获数组取值;
	}

	public String get从给定的字符串中取出第3个字符() {
		return 从给定的字符串中取出第3个字符;
	}

	public void set从给定的字符串中取出第3个字符(String 从给定的字符串中取出第3个字符) {
		this.从给定的字符串中取出第3个字符 = 从给定的字符串中取出第3个字符;
	}

	public SpELModel[] get集合或数组过滤() {
		return 集合或数组过滤;
	}

	public void set集合或数组过滤(SpELModel[] 集合或数组过滤) {
		this.集合或数组过滤 = 集合或数组过滤;
	}

	public String get集合或数组匹配第一个aa() {
		return 集合或数组匹配第一个aa;
	}

	public void set集合或数组匹配第一个aa(String 集合或数组匹配第一个aa) {
		this.集合或数组匹配第一个aa = 集合或数组匹配第一个aa;
	}

	public String get集合或数组匹配最后一个aa() {
		return 集合或数组匹配最后一个aa;
	}

	public void set集合或数组匹配最后一个aa(String 集合或数组匹配最后一个aa) {
		this.集合或数组匹配最后一个aa = 集合或数组匹配最后一个aa;
	}

	public String get布尔值判断() {
		return 布尔值判断;
	}

	public void set布尔值判断(String 布尔值判断) {
		this.布尔值判断 = 布尔值判断;
	}
	
	public String getSpel_i() {
		return spel_i;
	}

	public void setSpel_i(String spel_i) {
		this.spel_i = spel_i;
	}

}
