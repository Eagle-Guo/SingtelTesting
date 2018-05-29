package com.singtel.test.testing;

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
	
	String sing() {
		System.out.println("I am singing");
		return "I am singing";
	}
}