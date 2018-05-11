import Accessories.ClarinetReed;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClarinetReedTest {

    ClarinetReed clarinetReed;

    @Before
    public void before(){
        clarinetReed = new ClarinetReed("Rico Daddario",4.00, 8.00, "Cane",3);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Rico Daddario", clarinetReed.getDescription());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(4.00, clarinetReed.getPurchasePrice());
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(8.00, clarinetReed.getSalePrice());
    }

    @Test
    public void canGetCountryOfOrigin(){
        assertEquals("Cane", clarinetReed.getMaterial());
    }

    @Test
    public void canGetItemsInPackage(){
        assertEquals(3, clarinetReed.getItemsInPackage());
    }
}
