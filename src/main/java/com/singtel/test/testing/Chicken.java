package com.singtel.test.testing;

public class Chicken extends Bird {
	
	@Override
	String sing() {
		String sing = "Cluck, cluck";
		System.out.println(sing);
		return sing;
	}
	
	@Deprecated
	@Override
	void fly() {
		System.out.println("chicken cannot fly");
		//throw new Exception("chicken cannot fly");
	}

}
