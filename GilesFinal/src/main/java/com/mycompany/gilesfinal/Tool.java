package com.mycompany.gilesfinal;

/*
  @author Scott Giles
 * Liberty University CSIS505
 * Final Project
 */

import java.time.LocalDate;

//stretch goal to create task for blade sharpen based off current date and daysBetweenSharpen
public class Tool {
    private final LocalDate now;
    //attributes that will id the tool and inform tasks
    LocalDate today = LocalDate.now();
    public String toolName;
    public String maintenanceInstructions;
    public int daysBetweenSharpen;

    //constructor
    Tool(String toolName, LocalDate now, String maintenanceInstructions, int daysBetweenSharpen) {
        this.toolName = toolName;
        this.now = now;
        this.maintenanceInstructions = maintenanceInstructions;
        this.daysBetweenSharpen = daysBetweenSharpen;
    }



    //getters for the class attributes
    public String getToolName() {
        return toolName;
    }

    public String getMaintenanceInstructions() {
        return maintenanceInstructions;
    }

    public int getDaysBetweenSharpen() {
        return daysBetweenSharpen;
    }
}
