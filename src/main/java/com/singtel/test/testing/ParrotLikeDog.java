package com.singtel.test.testing;

public class ParrotLikeDog implements Parrot{
	
	public String sing() {
		String sing = new Dog().sing();
		System.out.println(sing);
		return sing;
	}
}
