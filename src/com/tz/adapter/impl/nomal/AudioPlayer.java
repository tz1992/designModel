package com.tz.adapter.impl.nomal;

import com.tz.adapter.adapt.MediaAdaper;
import com.tz.adapter.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
          MediaAdaper adapter;
	@Override
	public void play(String fileName, String audioType) {
		if(audioType=="mp3"){
			System.out.println("mp3"+fileName);
		}else if(audioType=="mp4"||audioType=="vlc"){
			adapter=new MediaAdaper(audioType);
			adapter.play(fileName, audioType);
		}else{
			System.out.println("invalid");
		}
		
	}

}
