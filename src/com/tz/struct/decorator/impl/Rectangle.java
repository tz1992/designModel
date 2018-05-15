package com.tz.struct.decorator.impl;

import com.tz.struct.decorator.Shape;

public class Rectangle  implements Shape{

	@Override
	public void draw() {
		System.out.println("shape:rectangle");
	}

}
