package com.singtel.test.testing;

public class Butterfly extends Bird{
	@Override
	public void fly(){
		String fly = "Butterfly is flying";
		System.out.println(fly);
	}

	@Override
	public String sing() {
		throw new UnsupportedOperationException("Butterfly does not make a sound");
	}
}
