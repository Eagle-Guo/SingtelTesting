package com.singtel.test.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Bird.
 */
public class ChickenTest{
	
	@Test(expected = UnsupportedOperationException.class)
    public void testRooster() {
		Rooster chicken = new Rooster();
    	System.out.println("RoosterTest");
    	String sing = "Cock-a-doodle-doo";
    	assertEquals( chicken.sing(), sing );
    	chicken.fly();
    	
    }
    
    @Test
    public void testHen()  {
    	Chicken chicken = new Hen();
    	System.out.println("HenTest");
    	String sing = "Cluck, cluck";
    	assertEquals( chicken.sing(), sing );
    }
}
