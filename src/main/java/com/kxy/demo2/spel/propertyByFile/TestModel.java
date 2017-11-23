package com.kxy.demo2.spel.propertyByFile;

public class TestModel {

	private String title;
	
	private String content;

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
	
}
