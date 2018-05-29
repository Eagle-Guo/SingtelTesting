package com.singtel.test.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Bird.
 */
public class DuckTest{
	Duck duck = new Duck();
    @Test
    public void testApp()  {
    	System.out.println("DuckTest");
    	String sing = "Quack, quack";
    	assertEquals( duck.sing(), sing );
    	
    	String swim = "I am swimming";
    	assertEquals(swim, duck.swim());
    }
}
