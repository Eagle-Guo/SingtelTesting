package com.singtel.test.testing;

public abstract class ChickenAbstract extends Bird implements Chicken{
	@Override
	public String sing() {
		String sing = "Cluck, cluck";
		System.out.println(sing);
		return sing;
	}
	
	@Deprecated
	@Override
	public void fly() throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Chicken cannot fly");
	}
}
