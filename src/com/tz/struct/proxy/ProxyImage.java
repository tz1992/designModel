package com.tz.struct.proxy;

import com.tz.struct.proxy.impl.RedImage;

public class ProxyImage implements Image {
    private String fileName;
    private RedImage redImage;
    
    
    
	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

    

	@Override
	public void draw() {
		if(redImage==null){
			redImage=new RedImage(fileName);
		}
		redImage.draw();
	}

}
