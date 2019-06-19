import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VisitorTest {

    public Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(15, 150, 350);
    }

    @Test
    public void hasAge(){
        assertEquals(15, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(150, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney(){
        assertEquals(350, visitor.getMoney(), 0.1);
    }

}
