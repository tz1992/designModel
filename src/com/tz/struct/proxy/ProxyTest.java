package com.tz.struct.proxy;

public class ProxyTest {
public static void main(String[] args) {
	Image image=new ProxyImage("1.txt");
	image.draw();
	System.out.println("");
	image.draw();
}
}
