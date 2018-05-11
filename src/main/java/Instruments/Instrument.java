package Instruments;

import Master.Item;

public abstract class Instrument extends Item {

    String instrumentType;
    String countryOfOrigin;

    public Instrument(String description, double purchasePrice, double salePrice, String instrumentType, String countryOfOrigin) {
        super(description, purchasePrice, salePrice);
        this.instrumentType = instrumentType;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
}
