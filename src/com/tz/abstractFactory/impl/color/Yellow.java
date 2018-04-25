package com.tz.abstractFactory.impl.color;

import com.tz.abstractFactory.interfaces.Color;

public class Yellow implements Color {

	@Override
	public void fill() {
		System.out.println("黄");
	}

}
