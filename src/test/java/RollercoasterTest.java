import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollercoasterTest {

    public Rollercoaster rollercoaster;
    public Visitor visitor1;
    public Visitor visitor2;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Pepsi Max", 1);
        visitor1 = new Visitor(19, 178, 50);
        visitor2 = new Visitor(5, 85,2 );
    }

    @Test
    public void hasName(){
        assertEquals("Pepsi Max", rollercoaster.getName());
    }

    @Test
    public void canVisitRollercoaster(){
        assertTrue(rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void canNotVisitRollercoaster(){
        assertFalse(rollercoaster.isAllowedTo(visitor2));
    }
}
