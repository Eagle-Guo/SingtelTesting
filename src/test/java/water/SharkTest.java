package water;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Shark.
 */
public class SharkTest{
	Fish fish = new Shark();
    @Test
    public void testApp()  {
    	String swim = "Shark swimming";
    	assertEquals( fish.swim(), swim);
    	
    }
}
