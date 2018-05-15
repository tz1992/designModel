package com.tz.create.abstractFactory.impl.color;

import com.tz.create.abstractFactory.interfaces.Color;

public class Yellow implements Color {

	@Override
	public void fill() {
		System.out.println("黄");
	}

}
