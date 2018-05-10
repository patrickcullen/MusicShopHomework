package Instruments;

import Behaviours.Playable;

public class Cello implements Playable{

    String description;
    int numberOfEndpins;

    public Cello(String description, int endpin) {
        this.description = description;
        this.numberOfEndpins = endpin;
    }

    public String getDescription() {
        return description;
    }

    public int getEndpin() {
        return numberOfEndpins;
    }

    public String play(){
        return "S-C-R-A-P-E!!!";
    }
}
