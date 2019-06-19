import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    public CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Floss those teeth boyo", "Adrian Chiles", "G36", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Floss those teeth boyo", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Adrian Chiles", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("G36", candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasReview(){
        assertEquals(4, candyFlossStall.getRating());
    }
}
