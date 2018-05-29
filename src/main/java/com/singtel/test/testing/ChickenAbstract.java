package com.singtel.test.testing;

public abstract class ChickenAbstract extends Bird implements Chicken{
	public String sing() {
		String sing = "Cluck, cluck";
		System.out.println(sing);
		return sing;
	}
}
