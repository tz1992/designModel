package com.tz.struct.decorator;

import com.tz.struct.decorator.impl.Circle;
import com.tz.struct.decorator.impl.Rectangle;

public class DecoratorTest {
public static void main(String[] args) {
	 Shape circle = new Circle();

     Shape redCircle = new RedDecoratedShape(new Circle());

     Shape redRectangle = new RedDecoratedShape(new Rectangle());
     System.out.println("Circle with normal border");
     circle.draw();

     System.out.println("\nCircle of red border");
     redCircle.draw();

     System.out.println("\nRectangle of red border");
     redRectangle.draw();
}
}
