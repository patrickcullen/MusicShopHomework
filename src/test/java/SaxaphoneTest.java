import Behaviours.Playable;
import Instruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxaphone("Yamaha YAS280", 50.00, 100.00, "Woodwind", "Japan", 2);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("Woodwind", saxaphone.getInstrumentType());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(50.00, saxaphone.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(100.00, saxaphone.getSalePrice(), 0.01);
    }

    @Test
    public void canGetCountryOfOrigin(){
        assertEquals("Japan", saxaphone.getCountryOfOrigin());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Yamaha YAS280", saxaphone.getDescription());
    }

    @Test
    public void canGetNumberOfReeds(){
        assertEquals(2, saxaphone.getNumberOfReeds());
    }

    @Test
    public void canPlay(){
        assertEquals("W-A-I-L!!!", saxaphone.play());
    }
}
