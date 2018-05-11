package Accessories;

import Behaviours.Sellable;
import Master.Item;

public class GuitarString extends Item implements Sellable{

    String stringType;

    public GuitarString(String description, double purchasePrice, double salePrice, String stringType) {
        super(description, purchasePrice, salePrice);
        this.stringType = stringType;
    }

    public String getStringType() {
        return stringType;
    }

    public double markUp(){
        double markUp = getSalePrice() - getPurchasePrice();
        return markUp;
    }


}
