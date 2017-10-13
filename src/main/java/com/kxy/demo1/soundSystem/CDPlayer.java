package com.kxy.demo1.soundSystem;

public class CDPlayer {

	private MusicCD cd;
	
	public CDPlayer(MusicCD cd){
		this.cd = cd;
	}
	
	public CDPlayer() {
		super();
	}

	public void playNewCd(){
		cd.play();
		cd.setName("中国古典音乐");
	}
	
	public void playCD(){
		cd.play();
	}
}
