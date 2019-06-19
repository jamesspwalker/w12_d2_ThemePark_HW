import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    public IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Spicy? No! Icy? Yes!", "Doug", "G32", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Spicy? No! Icy? Yes!", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Doug", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("G32", iceCreamStall.getParkingSpot());
    }
}
