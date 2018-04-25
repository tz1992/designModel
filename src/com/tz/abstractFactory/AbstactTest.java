package com.tz.abstractFactory;

import com.tz.abstractFactory.interfaces.Color;
import com.tz.abstractFactory.interfaces.Shape;

public class AbstactTest {
public static void main(String[] args) {
	AbstractFactory colorFactory=FactoryProducer.getFactory("color");
	Color color1=colorFactory.getColor("red");
	color1.fill();
	Color color2=colorFactory.getColor("blue");
	color2.fill();
	Color color3=colorFactory.getColor("yellow");
	color3.fill();
	
	AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
        Shape shape1=shapeFactory.getShape("rectangle");
        Shape shape2=shapeFactory.getShape("circle");
        Shape shape3=shapeFactory.getShape("square");
        shape1.draw();
        shape2.draw();
        shape3.draw();
}
}
