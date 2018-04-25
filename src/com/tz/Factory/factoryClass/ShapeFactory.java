package com.tz.Factory.factoryClass;

import com.tz.Factory.impl.shape.Circle;
import com.tz.Factory.impl.shape.Rectangle;
import com.tz.Factory.impl.shape.Square;
import com.tz.Factory.interfaces.Shape;

public class ShapeFactory {
public Shape getShape(String shapeType){
	if(shapeType==null){
		return null;
	}
	if(shapeType.equalsIgnoreCase("Rectangle")){
		return new Rectangle();
	}else if(shapeType.equalsIgnoreCase("Circle")){
		return new Circle();
	}else if(shapeType.equalsIgnoreCase("Square")){
		return new Square();
	}
	
	return null;
}
}
