package com.tz.abstractFactory;

import com.tz.abstractFactory.interfaces.Color;
import com.tz.abstractFactory.interfaces.Shape;

public abstract class AbstractFactory {
 public  abstract Color getColor(String color);
 public    abstract Shape getShape(String shape);
}
