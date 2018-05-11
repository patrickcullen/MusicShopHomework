package Accessories;

import Behaviours.Sellable;
import Master.Item;

public class ClarinetReed extends Item implements Sellable {

    String material;
    int itemsInPackage;

    public ClarinetReed(String description, double purchasePrice, double salePrice, String material, int itemsInPackage) {
        super(description, purchasePrice, salePrice);
        this.material = material;
        this.itemsInPackage = itemsInPackage;
    }

    public String getMaterial() {
        return material;
    }

    public int getItemsInPackage() {
        return itemsInPackage;
    }

    public double markUp(){
        double markUp = getSalePrice() - getPurchasePrice();
        return markUp;
    }
}
