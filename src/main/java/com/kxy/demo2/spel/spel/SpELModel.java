package com.kxy.demo2.spel.spel;

public class SpELModel {

	private String title;
	
	private String [] arrays = {"aa", "bb", "cc"};

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "我是SpELModel的toString方法";
	}
	
	public String nullMethod() {
		return null;
	}
	
}
