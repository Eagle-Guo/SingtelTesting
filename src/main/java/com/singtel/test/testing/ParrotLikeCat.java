package com.singtel.test.testing;

public class ParrotLikeCat implements Parrot{

	public String sing() {
		String sing = new Cat().sing();
		System.out.println(sing);
		return sing;
	}

}
