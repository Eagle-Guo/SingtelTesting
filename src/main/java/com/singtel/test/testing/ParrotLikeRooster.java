package com.singtel.test.testing;

public class ParrotLikeRooster implements Parrot{

	public String sing() {
		String sing = new Rooster().sing();
		System.out.println(sing);
		return sing;
	}
}
