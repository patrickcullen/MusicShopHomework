package Instruments;

import Behaviours.Playable;

public class Trombone implements Playable {

    String description;
    int numberOfValves;

    public Trombone(String description, int numberOfValves) {
        this.description = description;
        this.numberOfValves = numberOfValves;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "P-A-R-P!!!";
    }
}
