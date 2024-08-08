package com.mycompany.gilesfinal;

import java.time.LocalDate;

public class Decorative extends Plant {
    String displayInstructions;

    public Decorative(String plantName, boolean isChecked, LocalDate now, String waterInstructions, String plantingInstructions,
                      String fertilizeInstructions, String pruneInstructions, String pestInstructions, int daysToGrow, String displayInstructions) {
        super(plantName, isChecked, now, waterInstructions, plantingInstructions, fertilizeInstructions, pruneInstructions, pestInstructions, daysToGrow);
        this.displayInstructions = displayInstructions;
    }

    //getters and setters for decorative attributes

    public String getDisplayInstructions() {
        return displayInstructions;
    }

    public void setDisplayInstructions(String displayInstructions) {
        this.displayInstructions = displayInstructions;
    }
}
