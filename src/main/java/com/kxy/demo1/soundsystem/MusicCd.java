package com.kxy.demo1.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @Component定义为组件类，spring扫描时，可以扫描到，会为这个类创建一个bean
 * @author Administrator
 *
 */
@Component
public class MusicCd implements Cd{

	private String name = "中国民谣";
	
	@Override
	public void play() {
		System.out.println("start play the " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MusicCd(String name) {
		super();
		this.name = name;
	}

	public MusicCd() {
		super();
	}
	
}
