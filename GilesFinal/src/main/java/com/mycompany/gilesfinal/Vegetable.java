package com.mycompany.gilesfinal;

/*
  @author Scott Giles
 * Liberty University CSIS505
 * Final Project
 */

import java.time.LocalDate;

public class Vegetable extends Plant {
    public LocalDate harvestDate;
    public String harvestInstructions;

    public Vegetable(String plantName, boolean isChecked, LocalDate now, String waterInstructions, String plantingInstructions,
                     String fertilizeInstructions, String pruneInstructions, String pestInstructions, int daysToGrow, String harvestInstructions) {
        super(plantName, isChecked, now, waterInstructions, plantingInstructions, fertilizeInstructions, pruneInstructions,
                pestInstructions, daysToGrow);
        this.harvestInstructions = harvestInstructions;
        this.harvestDate = today.plusDays(daysToGrow);
    }

}
