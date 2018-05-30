package com.singtel.test.testing;

public class Bird extends Animal {
	public void fly() throws Exception {
		System.out.println("I am flying");
	}
	
	public String sing() {
		System.out.println("I am singing");
		return "I am singing";
	}
}