package Master;

import java.util.ArrayList;

public class Shop{

    String shopName;
    ArrayList<Item> stock;
    Item item;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.stock = new ArrayList<Item>();
    }

    public String getShopName() {
        return shopName;
    }

    public int getSizeOfStock(){
        return this.stock.size();
    }

    public void addToStock(Item stock){
        this.stock.add(stock);
    }

    public void removeFromStock(){
        this.stock.remove(0);
    }

    public double accumulateValue(){
        double accumulateValue = 0;
        for(Item item : this.stock) {
            accumulateValue += item.markUp();
        }
        
//        for(int i = 0; i=getSizeOfStock(); ++i) {
//            accumulateValue += 1;
//        }
        return accumulateValue;
    }


}
