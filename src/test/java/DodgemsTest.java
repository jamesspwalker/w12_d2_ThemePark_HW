import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    public Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Snap, Crackle, Pop", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Snap, Crackle, Pop", dodgems.getName());
    }
}
