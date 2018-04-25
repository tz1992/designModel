package com.tz.abstractFactory.factory;

import com.tz.abstractFactory.AbstractFactory;
import com.tz.abstractFactory.impl.color.Blue;
import com.tz.abstractFactory.impl.color.Red;
import com.tz.abstractFactory.impl.color.Yellow;
import com.tz.abstractFactory.interfaces.Color;
import com.tz.abstractFactory.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if(color==null){
			return null;
		}else if(color=="red"){
			return new Red();
		}else if(color=="blue"){
			return new Blue();
		}else if(color=="yellow"){
			return new Yellow();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
