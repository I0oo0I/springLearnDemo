package com.kxy.demo2.spel.spel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELlTest {

	private Integer i;
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
	private String 从给定的字符串中取出第2个字符;
	private String 集合或数组过滤;
	private String 集合或数组匹配第一个aa;
	private String 集合或数组匹配最后一个aa;
	
	
	@Test
	public void doTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spel-test.xml");
		SpELlTest teset = (SpELlTest)context.getBean("spel");
		System.out.println(teset.toString());
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

	public String get从给定的字符串中取出第2个字符() {
		return 从给定的字符串中取出第2个字符;
	}

	public void set从给定的字符串中取出第2个字符(String 从给定的字符串中取出第2个字符) {
		this.从给定的字符串中取出第2个字符 = 从给定的字符串中取出第2个字符;
	}

	public String get集合或数组过滤() {
		return 集合或数组过滤;
	}

	public void set集合或数组过滤(String 集合或数组过滤) {
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

	@Override
	public String toString() {
		return "SpELlTest [i=" + i + ", name=" + name + ", 布尔值判断=" + 布尔值判断 + ", otherBeanTitle=" + otherBeanTitle
				+ ", otherBeanMethod=" + otherBeanMethod + ", otherBeanMethodNullResult=" + otherBeanMethodNullResult
				+ ", I_am_π=" + I_am_π + ", I_am_面积=" + I_am_面积 + ", compare_A_相等_B=" + compare_A_相等_B
				+ ", compare_A_eq_B=" + compare_A_eq_B + ", 三目运算符=" + 三目运算符 + ", 三目运算符判断null=" + 三目运算符判断null
				+ ", 判断是否是邮件=" + 判断是否是邮件 + ", 集合获数组取值=" + 集合获数组取值 + ", 从给定的字符串中取出第2个字符=" + 从给定的字符串中取出第2个字符
				+ ", 集合或数组过滤=" + 集合或数组过滤 + ", 集合或数组匹配第一个aa=" + 集合或数组匹配第一个aa + ", 集合或数组匹配最后一个aa=" + 集合或数组匹配最后一个aa + "]";
	}
	
}
