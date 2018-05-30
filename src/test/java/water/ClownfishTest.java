package water;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Clownfish.
 */
public class ClownfishTest{
	Fish fish = new Clownfish();
    @Test
    public void testApp()  {
    	String swim = "Clownfish swimming";
    	assertEquals( fish.swim(), swim);
    	
    }
}
