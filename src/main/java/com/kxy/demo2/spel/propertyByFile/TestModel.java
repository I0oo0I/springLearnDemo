package com.kxy.demo2.spel.propertyByFile;

public class TestModel {

	private String title;
	
	private String content;
	
	private Integer age;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public TestModel(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public TestModel() {
		super();
	}

	@Override
	public String toString() {
		return "TestModel [title=" + title + ", content=" + content + "]";
	}

	public TestModel(Integer age) {
		super();
		this.age = age;
	}
	
}
