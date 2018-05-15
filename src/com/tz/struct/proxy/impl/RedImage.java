package com.tz.struct.proxy.impl;

import com.tz.struct.proxy.Image;

public class RedImage implements Image {
private String fileName;

	public RedImage(String fileName) {
	super();
	this.fileName = fileName;
	load();
}

	@Override
	public void draw() {
		System.out.println("draw"+fileName);
		
	}
	
	public void load(){
		System.out.println("load"+fileName);
	}

}
