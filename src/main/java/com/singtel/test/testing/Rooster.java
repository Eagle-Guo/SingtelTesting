package com.singtel.test.testing;

public class Rooster extends ChickenAbstract implements Chicken {
	@Override
	public String sing() {
		String sing = "Cock-a-doodle-doo";
		System.out.println(sing);
		return sing;
	}
}
