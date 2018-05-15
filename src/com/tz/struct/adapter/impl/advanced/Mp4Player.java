package com.tz.struct.adapter.impl.advanced;

import com.tz.struct.adapter.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("mp4"+fileName);
		
	}

}
