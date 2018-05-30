package com.singtel.test.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParrotTest {
	Dog dog = new Dog();
	Cat cat = new Cat();
	Chicken rooster = new Rooster();
	
    @Test
    public void testParrotLikeDog()  {
    	Parrot parrot = new ParrotFactory().getParrot("dog");
    	assertEquals(dog.sing(), parrot.sing());
    }
    
    @Test
    public void testParrotLikeCat()  {
    	Parrot parrot = new ParrotFactory().getParrot("cat");
    	assertEquals(cat.sing(), parrot.sing());
    }
    
    @Test
    public void testParrotLikeRooster()  {
    	Parrot parrot = new ParrotFactory().getParrot("rooster");
    	assertEquals(rooster.sing(), parrot.sing());
    }

}
