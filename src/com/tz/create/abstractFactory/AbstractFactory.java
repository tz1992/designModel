package com.tz.create.abstractFactory;

import com.tz.create.abstractFactory.interfaces.Color;
import com.tz.create.abstractFactory.interfaces.Shape;

public abstract class AbstractFactory {
 public  abstract Color getColor(String color);
 public    abstract Shape getShape(String shape);
}
