package com.tz.create.abstractFactory.impl.shape;

import com.tz.create.abstractFactory.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("正方");
	}

}
