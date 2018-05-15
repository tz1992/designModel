package com.tz.create.Factory;

import com.tz.create.Factory.factoryClass.ShapeFactory;
import com.tz.create.Factory.interfaces.Shape;

public class FactoryTest {
public static void main(String[] args) {
	
	ShapeFactory factory=new ShapeFactory();
	
	Shape shape=factory.getShape("Circle");
	shape.draw();
	Shape shape1=factory.getShape("Rectangle");
	shape1.draw();
	Shape shape2=factory.getShape("Square");
	shape2.draw();
}
}
