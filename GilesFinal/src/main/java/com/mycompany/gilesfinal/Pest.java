package com.mycompany.gilesfinal;

/*
  @author Scott Giles
 * Liberty University CSIS505
 * Final Project
 */

public class Pest {
    //class attributes
    String pestName;
    String pestInstructions;

    //constructor
    Pest(String pestName, String pestInstructions) {
        this.pestName = pestName;
        this.pestInstructions = pestInstructions;
    }

    //getters for class attributes
    public String getPestName() {
        return  pestName;
    }

    public String getPestInstructions() {
        return pestInstructions;
    }
}
