package decorator.impl;

import decorator.Shape;

public class Rectangle  implements Shape{

	@Override
	public void draw() {
		System.out.println("shape:rectangle");
	}

}
