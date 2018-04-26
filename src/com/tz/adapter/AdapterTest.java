package com.tz.adapter;

import com.tz.adapter.impl.nomal.AudioPlayer;

public class AdapterTest {
public static void main(String[] args) {
	AudioPlayer audioPlayer=new AudioPlayer();
	audioPlayer.play("a1", "mp3");
	audioPlayer.play("a2", "mp4");
	audioPlayer.play("a3", "vlc");
	audioPlayer.play("a4", "avi");
}
}
