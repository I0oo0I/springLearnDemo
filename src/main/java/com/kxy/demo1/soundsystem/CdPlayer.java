package com.kxy.demo1.soundsystem;

/**
 * 
 * @author Administrator
 *
 */
public class CdPlayer {

	private MusicCd cd;
	
	public CdPlayer(MusicCd cd){
		this.cd = cd;
	}
	
	public CdPlayer() {
		super();
	}

	/**
	 * 
	 */
	public void playNewCd(){
		cd.setName("中国古典音乐");
		cd.play();
	}
	
	/**
	 * 
	 */
	public void playCD(){
		cd.play();
	}
}
