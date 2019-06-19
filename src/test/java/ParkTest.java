import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    public Park park;

    @Before
    public void before(){
        park = new Park("Park Chan-wook", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Park Chan-wook", park.getName());
    }
}
