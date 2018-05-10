package Instruments;

import Behaviours.Playable;

public class Saxaphone implements Playable{

    String description;
    int numberOfReeds;

    public Saxaphone(String description, int numberOfReeds) {
        this.description = description;
        this.numberOfReeds = numberOfReeds;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfReeds() {
        return numberOfReeds;
    }

    public String play(){
        return "W-A-I-L!!!";
    }
}
