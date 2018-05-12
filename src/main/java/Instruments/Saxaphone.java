package Instruments;

import Behaviours.Playable;
import Behaviours.Sellable;

public class Saxaphone extends Instrument implements Playable{

    int numberOfReeds;

    public Saxaphone(String description, double purchasePrice, double salePrice, InstrumentType instrumentType, String countryOfOrigin, int numberOfReeds) {
        super(description, purchasePrice, salePrice, instrumentType, countryOfOrigin);
        this.numberOfReeds = numberOfReeds;
    }

    public int getNumberOfReeds() {
        return numberOfReeds;
    }

//  Interface: Playable Method
    public String play(){
        return "W-A-I-L!!!";
    }

    public double markUp(){
        double markUp = getSalePrice() - getPurchasePrice();
        return markUp;
    }


}
