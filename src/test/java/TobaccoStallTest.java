import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TobaccoStallTest {
    public TobaccoStall tobaccoStall;
    public Visitor visitor1;
    public Visitor visitor2;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Wacky Tabacky no Slacky", "Kurt Russel", "G41", 2);
        visitor1 = new Visitor(19, 178, 50);
        visitor2 = new Visitor(5, 85,2 );
    }

    @Test
    public void hasName(){
        assertEquals("Wacky Tabacky no Slacky", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Kurt Russel", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("G41", tobaccoStall.getParkingSpot());
    }

    @Test
    public void canVisitTobaccoStall(){
        assertTrue(tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void canNotVisitTobaccoStall(){
        assertFalse(tobaccoStall.isAllowedTo(visitor2));
    }
}
