package com.singtel.test.testing;

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		try {
			bird.fly();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		bird.sing();
	}
}
