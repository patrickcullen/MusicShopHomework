import Instruments.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before(){
        trombone = new Trombone("Vincent Bach TB600", 136.00, 270.00, "Brass", "USA", 3);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Vincent Bach TB600", trombone.getDescription());
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(3, trombone.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("P-A-R-P!!!", trombone.play());
    }
}
