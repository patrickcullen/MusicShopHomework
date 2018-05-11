package Master;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> stock;

    public Shop(ArrayList<Item> items) {
        this.stock = new ArrayList<>();
    }

    public int getSizeOfStock(){
        return stock.size();
    }


}
