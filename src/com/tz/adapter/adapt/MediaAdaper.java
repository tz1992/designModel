package com.tz.adapter.adapt;

import com.tz.adapter.impl.advanced.Mp4Player;
import com.tz.adapter.impl.advanced.VlcPlayer;
import com.tz.adapter.interfaces.AdvancedMediaPlayer;
import com.tz.adapter.interfaces.MediaPlayer;

public class MediaAdaper implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	 public MediaAdaper(String audioType) {
		if(audioType=="mp4"){
			advancedMediaPlayer=new Mp4Player();
		}else if(audioType=="vlc"){
			advancedMediaPlayer=new VlcPlayer();
		}
	}

	@Override
	public void play(String fileName, String audioType) {
		// TODO Auto-generated method stub
		if(audioType=="mp4"){
			advancedMediaPlayer.playMp4(fileName);
		}else if (audioType=="vlc") {
			advancedMediaPlayer.playVlc(fileName);
			
		}
	}

}
