package Instruments;

import Behaviours.Playable;

public class Trombone extends Instrument implements Playable {


    int numberOfValves;

    public Trombone(String description, double purchasePrice, double salePrice, InstrumentType instrumentType, String countryOfOrigin, int numberOfValves) {
        super(description, purchasePrice, salePrice, instrumentType, countryOfOrigin);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "P-A-R-P!!!";
    }
}
