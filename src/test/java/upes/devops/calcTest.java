package upes.devops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calcTest {
    calc ob = new calc();
    @Test
    public void testMain() 
    {
        
    }
    
    @Test
    public void testMul()
    {
        assertEquals(10, ob.mul(5,2));   
    }
    
    @Test
    public void testSum() 
    {

        assertEquals(10, ob.sum(6,4));
    }
}
