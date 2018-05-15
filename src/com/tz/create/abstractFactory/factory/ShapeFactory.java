package com.tz.create.abstractFactory.factory;

import com.tz.create.abstractFactory.AbstractFactory;
import com.tz.create.abstractFactory.impl.shape.Circle;
import com.tz.create.abstractFactory.impl.shape.Rectangle;
import com.tz.create.abstractFactory.impl.shape.Square;
import com.tz.create.abstractFactory.interfaces.Color;
import com.tz.create.abstractFactory.interfaces.Shape;

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
