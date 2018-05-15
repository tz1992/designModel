package com.tz.create.abstractFactory;

import com.tz.create.abstractFactory.factory.ColorFactory;
import com.tz.create.abstractFactory.factory.ShapeFactory;

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
