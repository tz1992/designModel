package com.tz.abstractFactory.factory;

import com.tz.abstractFactory.AbstractFactory;
import com.tz.abstractFactory.impl.shape.Circle;
import com.tz.abstractFactory.impl.shape.Rectangle;
import com.tz.abstractFactory.impl.shape.Square;
import com.tz.abstractFactory.interfaces.Color;
import com.tz.abstractFactory.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if(shape==null){
			return null;
		}else if(shape=="circle") {
			return new Circle();
			
		}else if(shape=="rectangle") {
			return new Rectangle();
			
		}else if(shape=="square") {
			return new Square();
			
		}
		return null;
	}
	
   
}
