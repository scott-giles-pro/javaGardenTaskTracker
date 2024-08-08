package com.mycompany.gilesfinal;

/*
  @author Scott Giles
 * Liberty University CSIS505
 * Final Project
 */

import java.time.LocalDate;

public class Plant {
    //setting the date
    LocalDate today = LocalDate.now();

    //attributes that will id the plant and inform tasks
    public String plantName;
    public static Boolean isChecked = false;
    public LocalDate now;
    public String waterInstructions;
    public String plantingInstructions;
    public String fertilizeInstructions;
    public String pruneInstructions;
    public String pestInstructions;
    public int daysToGrow;
    //public LocalDate harvest = today.plusDays(daysToGrow);

    //constructor
    Plant(String plantName, boolean isChecked, LocalDate now, String waterInstructions, String plantingInstructions,
          String fertilizeInstructions, String pruneInstructions, String pestInstructions, int daysToGrow) {
        this.plantName = plantName;
        Plant.isChecked = isChecked;
        this.now = now;
        this.waterInstructions = waterInstructions;
        this.plantingInstructions = plantingInstructions;
        this.fertilizeInstructions = fertilizeInstructions;
        this.pruneInstructions = pruneInstructions;
        this.pestInstructions = pestInstructions;
        this.daysToGrow = daysToGrow;
    }

    //getters and setters for Plant attributes
    public String getPlantName() {
        return plantName;
    }


    public String getWaterInstructions() {
        return waterInstructions;
    }


    public String getFertilizeInstructions() {
        return fertilizeInstructions;
    }

    public String getPruneInstructions() {
        return pruneInstructions;
    }

    public String getPestInstructions() {
        return pestInstructions;
    }

}
