package com.singtel.test.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Bird.
 */
public class BirdTest{
    @Test
    public void testApp()  {
    	Bird bird = new Bird();
    	String sing = "I am singing";
    	assertEquals( bird.sing(), sing );
    }
}
