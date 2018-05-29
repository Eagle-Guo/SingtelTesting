package com.singtel.test.testing;

class Bird extends Animal {
	public void fly() {
		System.out.println("I am flying");
	}
	
	public String sing() {
		System.out.println("I am singing");
		return "I am singing";
	}
}