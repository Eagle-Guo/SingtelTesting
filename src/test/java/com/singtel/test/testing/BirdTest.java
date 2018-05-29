package com.singtel.test.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Bird.
 */
public class BirdTest{
	Bird bird = new Bird();
    @Test
    public void testApp()  {
    	System.out.println("BirdTest");
    	String sing = "I am singing";
    	assertEquals( bird.sing(), sing );
    }
}
