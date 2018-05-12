package Instruments;

import Behaviours.Playable;
import Behaviours.Sellable;

public class Cello extends Instrument implements Playable{

    int numberOfEndpins;

    public Cello(String description, double purchasePrice, double salePrice, InstrumentType instrumentType, String countryOfOrigin, int numberOfEndpins) {
        super(description, purchasePrice, salePrice, instrumentType, countryOfOrigin);
        this.numberOfEndpins = numberOfEndpins;
    }


    public int getNumberOfEndpins() {
        return numberOfEndpins;
    }

    public String play(){
        return "S-C-R-A-P-E!!!";
    }

    public double markUp(){
        double markUp = getSalePrice() - getPurchasePrice();
        return markUp;
    }
}
