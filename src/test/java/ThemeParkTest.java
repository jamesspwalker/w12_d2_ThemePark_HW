import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    public ThemePark themePark;
    public CandyFlossStall candyFlossStall;
    public Rollercoaster rollercoaster;


    @Before
    public void before(){
        themePark = new ThemePark();
        candyFlossStall = new CandyFlossStall("Candy", "Bob", "G36", 5);
        rollercoaster = new Rollercoaster("Fast", 4);
    }

    @Test
    public void canGetAllReviewed(){
        themePark.addReview(candyFlossStall);
        themePark.addReview(rollercoaster);
        assertEquals(5, themePark.getAllReviewed());
    }
}
