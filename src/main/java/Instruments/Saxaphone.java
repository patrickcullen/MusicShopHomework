package Instruments;

import Behaviours.Playable;

public class Saxaphone extends Instrument implements Playable{

    int numberOfReeds;

    public Saxaphone(String description, double purchasePrice, double salePrice, String instrumentType, String countryOfOrigin, int numberOfReeds) {
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
}
