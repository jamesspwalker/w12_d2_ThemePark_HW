import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaygroundTest {
    public Playground playground;
    public Visitor visitor1;
    public Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Swings and Waterslides", 4);
        visitor1 = new Visitor(19, 178, 50);
        visitor2 = new Visitor(5, 85,2 );
    }

    @Test
    public void hasName(){
        assertEquals("Swings and Waterslides", playground.getName());
    }

    @Test
    public void canVisitPlayground(){
        assertTrue(playground.isAllowedTo(visitor2));
    }

    @Test
    public void canNotVisitPlayground(){
        assertFalse(playground.isAllowedTo(visitor1));
    }
}
