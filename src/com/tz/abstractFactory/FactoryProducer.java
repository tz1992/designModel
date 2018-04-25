package com.tz.abstractFactory;

import com.tz.abstractFactory.factory.ColorFactory;
import com.tz.abstractFactory.factory.ShapeFactory;

public class FactoryProducer {
public static AbstractFactory getFactory(String choice){
	if(choice==null){
		return null;
	}else if(choice=="color"){
		return new ColorFactory();
	}else if(choice=="shape"){
		return new ShapeFactory();
	}
	return null;
}
}
