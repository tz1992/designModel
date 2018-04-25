package com.tz.Factory;

import com.tz.Factory.factoryClass.ShapeFactory;
import com.tz.Factory.interfaces.Shape;

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
