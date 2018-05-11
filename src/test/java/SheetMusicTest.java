import Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("The Joy of Sax", 4.00, 19.00, "Naxos");
    }

    @Test
    public void canGetDescription(){
        assertEquals("The Joy of Sax", sheetMusic.getDescription());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(4.00, sheetMusic.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(19.00, sheetMusic.getSalePrice(), 0.01);
    }

    @Test
    public void canGetPublisher(){
        assertEquals("Naxos", sheetMusic.getPublisher());
    }
}
