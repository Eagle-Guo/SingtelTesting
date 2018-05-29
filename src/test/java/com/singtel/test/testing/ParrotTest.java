package com.singtel.test.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParrotTest {
	Dog dog = new Dog();
	Cat cat = new Cat();
	Chicken rooster = new Rooster();
	
    @Test
    public void testParrotWithDog()  {
    	Parrot parrot = new Parrot() {
    		public String sing() {
	    		String sing = dog.sing();
	    		System.out.println(sing);
	    		return sing;
    		}
    	};
    	parrot.sing();
    	assertEquals(dog.sing(), parrot.sing());
    }
    
    @Test
    public void testParrotWithCat()  {
    	Parrot parrot = new Parrot() {
    		public String sing() {
	    		String sing = cat.sing();
	    		System.out.println(sing);
	    		return sing;
    		}
    	};
    	parrot.sing();
    	assertEquals(cat.sing(), parrot.sing());
    }
    
    @Test
    public void testParrotWithRooster()  {
    	Parrot parrot = new Parrot() {
    		public String sing() {
	    		String sing = rooster.sing();
	    		System.out.println(sing);
	    		return sing;
    		}
    	};
    	parrot.sing();
    	assertEquals(rooster.sing(), parrot.sing());
    }

}
