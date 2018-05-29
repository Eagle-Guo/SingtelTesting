package com.singtel.test.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Bird.
 */
public class ChickenTest{
	
    @Test
    public void testRooster()  {
    	Chicken chicken = new Rooster();
    	System.out.println("RoosterTest");
    	String sing = "Cock-a-doodle-doo";
    	assertEquals( chicken.sing(), sing );
    }
    
    @Test
    public void testHen()  {
    	Chicken chicken = new Hen();
    	System.out.println("HenTest");
    	String sing = "Cluck, cluck";
    	assertEquals( chicken.sing(), sing );
    }
}
