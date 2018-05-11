package Instruments;

import Behaviours.Playable;
import Master.Item;

public abstract class Instrument extends Item {

    InstrumentType instrumentType;
    String countryOfOrigin;

    public Instrument(String description, double purchasePrice, double salePrice, InstrumentType instrumentType, String countryOfOrigin) {
        super(description, purchasePrice, salePrice);
        this.instrumentType = instrumentType;
        this.countryOfOrigin = countryOfOrigin;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
}
