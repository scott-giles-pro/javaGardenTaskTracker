package com.mycompany.gilesfinal;

/*
  @author Scott Giles
 * Liberty University CSIS505
 * Final Project
 */

//main class to provide entry point for application
public class GilesFinal {

    //main method creates a new instance of the LandingPage Swing Form
    //be aware that the form will not appear if the instance is not set to visible (see line 16)
    public static void main(String[] args) {
        LandingPage landingPage = new LandingPage();
        landingPage.setVisible(true);
    }
}
