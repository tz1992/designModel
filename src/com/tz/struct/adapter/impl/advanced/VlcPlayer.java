package com.tz.struct.adapter.impl.advanced;

import com.tz.struct.adapter.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Vlc"+fileName);

	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
