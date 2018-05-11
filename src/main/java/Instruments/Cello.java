package Instruments;

import Behaviours.Playable;

public class Cello extends Instrument implements Playable{

    int numberOfEndpins;

    public Cello(String description, double purchasePrice, double salePrice, String instrumentType, String countryOfOrigin, int numberOfEndpins) {
        super(description, purchasePrice, salePrice, instrumentType, countryOfOrigin);
        this.numberOfEndpins = numberOfEndpins;
    }


    public int getNumberOfEndpins() {
        return numberOfEndpins;
    }

    public String play(){
        return "S-C-R-A-P-E!!!";
    }
}
