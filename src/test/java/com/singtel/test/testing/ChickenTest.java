package com.singtel.test.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Bird.
 */
public class ChickenTest{
	Chicken chicken = new Chicken();
    @Test
    public void testSing()  {
    	System.out.println("ChickenTest");
    	String sing = "Cluck, cluck";
    	assertEquals( chicken.sing(), sing );
    }
}
