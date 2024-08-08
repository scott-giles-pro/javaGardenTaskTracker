package com.mycompany.gilesfinal;

/*
  @author Scott Giles
 * Liberty University CSIS505
 * Final Project
 */

public class Consumable {
    //class attributes
    public String consumableName;
    public int ozPerUse;

    //constructor
    Consumable(String consumableName, int ozPerUse) {
        this.consumableName = consumableName;
        this.ozPerUse = ozPerUse;
    }

    //getters for class attributes
    public String getConsumableName() {
        return consumableName;
    }

    public int getOzPerUse() {
        return ozPerUse;
    }
}
