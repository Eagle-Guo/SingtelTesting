package com.singtel.test.testing;

public class Duck extends Bird{

	@Override
	String sing() {
		String sing = "Quack, quack";
		System.out.println(sing);
		return sing;
	}
	
	String swim() {
		String swim = "I am swimming";
		System.out.println(swim);
		return swim;
	}
}
