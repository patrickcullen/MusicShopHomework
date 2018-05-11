package Accessories;

import Behaviours.Sellable;
import Master.Item;

public class SheetMusic extends Item implements Sellable {

    String publisher;

    public SheetMusic(String description, double purchasePrice, double salePrice, String publisher) {
        super(description, purchasePrice, salePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public double markUp(){
        double markUp = getSalePrice() - getPurchasePrice();
        return markUp;
    }
}
