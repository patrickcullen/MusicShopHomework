import Accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("Gibson Masterbuilt Premium", 10.00, 15.00, "Acoustic");
    }

    @Test
    public void canGetDescription(){
        assertEquals("Gibson Masterbuilt Premium", guitarString.getDescription());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(10.00, guitarString.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(15.00, guitarString.getSalePrice(),0.01);
    }

    @Test
    public void canGetStringType(){
        assertEquals("Acoustic", guitarString.getStringType());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(5.00, guitarString.markUp(), 0.01);
    }

}
