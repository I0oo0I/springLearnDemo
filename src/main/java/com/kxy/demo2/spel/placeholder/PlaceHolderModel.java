package com.kxy.demo2.spel.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class PlaceHolderModel {

	private String title;
	
	private String content;
	
	private Integer age;

	public PlaceHolderModel(String title, String content, Integer age) {
		super();
		this.title = title;
		this.content = content;
		this.age = age;
	}

	public PlaceHolderModel() {
		super();
	}


	@Override
	public String toString() {
		return "PlaceHolderModel [title=" + title + ", content=" + content + ", age=" + age + "]";
	}

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
	
	
}
