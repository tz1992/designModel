package com.tz.abstractFactory.impl.shape;

import com.tz.abstractFactory.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("正方");
	}

}
