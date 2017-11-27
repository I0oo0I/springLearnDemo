package com.kxy.demo2.spel.spel;

import java.util.List;

public class SpELModel {

	private String title;
	
	private String [] arrays = {"aa", "bb", "cc"};
	
	private SpELModel [] titleArrays = {new SpELModel("a"), new SpELModel("b"), new SpELModel("c")};

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

	public String[] getArrays() {
		return arrays;
	}

	public void setArrays(String[] arrays) {
		this.arrays = arrays;
	}

	public SpELModel[] getTitleArrays() {
		return titleArrays;
	}

	public void setTitleArrays(SpELModel[] titleArrays) {
		this.titleArrays = titleArrays;
	}
	
	public SpELModel(String title) {
		super();
		this.title = title;
	}

	public SpELModel() {
		super();
	}
}	
