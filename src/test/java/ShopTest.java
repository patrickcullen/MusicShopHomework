import Accessories.GuitarString;
import Behaviours.Sellable;
import Instruments.InstrumentType;
import Instruments.Saxaphone;
import Instruments.Trombone;
import Master.Item;
import Master.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;
    Item item2;
    Item item3;
    ArrayList stock;

    @Before
    public void before(){
        shop = new Shop("Music for the Tone Deaf");
        stock = new ArrayList<>();
        item = new GuitarString("Gibson Masterbuilt Premium", 10.00, 16.00, "Acoustic");
        item2 = new Saxaphone("Yamaha YAS280", 50.00, 100.00, InstrumentType.WOODWIND , "Japan", 2);
        item3 = new Trombone("Vincent Bach TB600", 136.00, 270.00, InstrumentType.BRASS, "USA", 3);
    }

    @Test
    public void canGetShopName(){
        assertEquals("Music for the Tone Deaf", shop.getShopName());
    }

    @Test
    public void canGetSizeOfStock(){
        assertEquals(0, shop.getSizeOfStock());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(item);
        assertEquals(1, shop.getSizeOfStock());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(item);
        shop.removeFromStock();
        assertEquals(0, shop.getSizeOfStock());
    }

    @Test
    public void canAccumulateValue(){
        shop.addToStock(item);
        shop.addToStock(item);
        shop.addToStock(item);
        shop.addToStock(item3);
        shop.addToStock(item);
        shop.addToStock(item2);
        assertEquals(208.00,shop.accumulateValue(), 0.01);
    }


}
