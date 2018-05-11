import Instruments.Cello;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void before(){
       cello = new Cello("Eastman Strings VC305", 20.00, 40.00, "String", "USA",  1);
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(20.00, cello.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(40.00, cello.getSalePrice(), 0.01);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Eastman Strings VC305", cello.getDescription());
    }

    @Test
    public void canGetNumberOfEndpins(){
        assertEquals(1, cello.getNumberOfEndpins());
    }

    @Test
    public void canPlay(){
        assertEquals("S-C-R-A-P-E!!!", cello.play());
    }


}