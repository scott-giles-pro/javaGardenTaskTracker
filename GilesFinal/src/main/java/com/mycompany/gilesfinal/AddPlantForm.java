/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gilesfinal;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.ArrayList;

/*
  @author Scott Giles
 * Liberty University CSIS505
 * Final Project
 */

//should refactor to only instantiate if selected to conserve memory. ran out of time prior to submission.
public class AddPlantForm extends javax.swing.JFrame {

    //the ArrayList allPlants evolved into being all the tasks.
    ArrayList<Object> allPlants = new ArrayList<>();

        //instantiating objects of classes Plant, Vegetable, Decorative, Tool, and Consumable
        Vegetable artichokes = new Vegetable("Artichoke", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 30 inches apart",
                "Fertilizer five days before planting. Side dress the plants one to three times with 3 ounces.",
                "Keep pruning artichokes during the growing season.",
                "Spray with pest control as needed", 365,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable arugula = new Vegetable("Arugula", false, LocalDate.now(), "1 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 12 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA",
                "Spray with pest control as needed", 45,
                "use needle nose pruners to cut the older, outer leaves");

        Vegetable beansSnapBush = new Vegetable("Beans Snap Bush", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 6 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide monthly", 55,
                "Use two hands to pick, because heavily-laden bean stems are easily broken. Don't yank on the pods; hold the stem in one hand and pick with the other.");

        Vegetable basil = new Vegetable("Basil", false, LocalDate.now(), "1 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 6 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA",
                "Spray with pest control as needed", 45,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable beansSnapPole = new Vegetable("Beans Snap Pole", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 6 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide monthly", 60,
                "Use two hands to pick, because heavily-laden bean stems are easily broken. Don't yank on the pods; hold the stem in one hand and pick with the other.");

        Vegetable beets = new Vegetable("Beets", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 18 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "Keep pruning beet tops during the growing season, focusing on outer leaves and every now and then, the overly-tall central leaf.",
                "Spray with pest control as needed", 55,
                "Loosen the soil around the beet and gently pull it from the earth.");

        Vegetable broccoli = new Vegetable("Broccoli", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 2-4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with pest control as needed", 55,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable brusselsSprouts = new Vegetable("Brussels Sprouts", false, LocalDate.now(), "1 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 14 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with pest control as needed", 45,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable cabbage = new Vegetable("Cabbage", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 12 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with pest control as needed", 65,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable carrots = new Vegetable("Carrots", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 12 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 75,
                "Loosen the soil around the carrot and gently pull it from the earth.");

        Vegetable cauliflower = new Vegetable("Cauliflower", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 18 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 65,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable celery = new Vegetable("Celery", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 8 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 65,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable chardSwiss = new Vegetable("Chard, Swiss", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 6 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 60,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable cilantro = new Vegetable("Cilantro", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 55,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable collardGreens = new Vegetable("Collard Greens", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 18 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 60,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable cornSweet = new Vegetable("Corn, Sweet", false, LocalDate.now(), "4 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 12 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "Prune stalks weekly",
                "Spray with natural herbicide every week", 85,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable cucumbers = new Vegetable("Cucumbers", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 12 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 60,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable dill = new Vegetable("Dill", false, LocalDate.now(), "1 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 55,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable eggplant = new Vegetable("Eggplant", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 24 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 150,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable fennel = new Vegetable("Fennel", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 8 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 75,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable garlic = new Vegetable("Garlic", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 180,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable kale = new Vegetable("Kale", false, LocalDate.now(), "4 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 6 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 45,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable kohlrabi = new Vegetable("Kohlrabi", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 55,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable leek = new Vegetable("Leek", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 120,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable lettuce = new Vegetable("Lettuce", false, LocalDate.now(), "4 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 2 inch deep and 10 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 75,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable onions = new Vegetable("Onions, Bulb", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 100,
                "Loosen the soil around the onion and gently pull it from the earth.");

        Vegetable parsnips = new Vegetable("Parsnips", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 115,
                "Loosen the soil around the parsnip and gently pull it from the earth.");

        Vegetable peanuts = new Vegetable("Peanuts", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 6 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 150,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable peasField = new Vegetable("Peas, Field", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 60,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable peppers = new Vegetable("Peppers", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 18 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 150,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable potatoesIrish = new Vegetable("Potatoes, Irish", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 10 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 110,
                "Loosen the soil around the potato and gently pull it from the earth.");

        Vegetable potatoesSweet = new Vegetable("Potatoes, Sweet", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 110,
                "Loosen the soil around the potato and gently pull it from the earth.");

        Vegetable pumpkin = new Vegetable("Pumpkin", false, LocalDate.now(), "3 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 48 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "Prune weekly far up the vine.",
                "Spray with natural herbicide every week", 120,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable radish = new Vegetable("Radish", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 1 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 25,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable rutabaga = new Vegetable("Rutabaga", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 4 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 75,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable spinach = new Vegetable("Cilantro", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 6 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 55,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable squashSummer = new Vegetable("Squash, Summer", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 24 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 80,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable squashWinter = new Vegetable("Squash, Winter", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 36 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 80,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Decorative sunflower  = new Decorative("Sunflower", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 9 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "Prune as needed.",
                "Spray with natural herbicide every other week", 55, "Display in well lit yard.");

        Vegetable tomatoes = new Vegetable("Tomatoes", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 18 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 125,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        Vegetable turnips = new Vegetable("Turnips", false, LocalDate.now(), "2 inches weekly",
                "Pre-soak seeds to increase germination rates, and plant each seed 1 inch deep and 2 inches apart",
                "Fertilizer seven days before planting. Side dress the plants one to three times with 3 ounces.",
                "NA.",
                "Spray with natural herbicide every other week", 55,
                "Harvest buds while they're tight and firm and hopefully at least 3 inches in diameter");

        //instantiate tools
        Tool shears = new Tool("Shears", LocalDate.now(), "Ensure pivot pin is secure.", 14);
        Tool trowel = new Tool("Trowel", LocalDate.now(), "Clean after use.", 21);
        Tool shovel = new Tool("Shovel", LocalDate.now(), "Clean after use.", 28);
        Tool hoe = new Tool("Hoe", LocalDate.now(), "Clean after use.", 60);
        Tool lawnmower = new Tool("Lawnmower", LocalDate.now(), "Check fuel and oil levels.", 60);
        Tool chainsaw = new Tool("Chainsaw", LocalDate.now(), "Check fuel and oil levels.", 60);

        //instantiate consumables
        Consumable pestSpray = new Consumable("Pest spray", 4);
        Consumable weedKiller = new Consumable("Weed killer", 2);
        Consumable gasoline = new Consumable("Gasoline", 12);
        Consumable oil = new Consumable("Oil", 1);

    /**
     * Creates new form AddPlantForm
     */
    public AddPlantForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        addPlantFormLabel = new javax.swing.JLabel();
        addPlantMainButton = new javax.swing.JButton();
        artichokesBox = new javax.swing.JCheckBox();
        arugulaBox = new javax.swing.JCheckBox();
        basilBox = new javax.swing.JCheckBox();
        beansSnapBushBox = new javax.swing.JCheckBox();
        beansSnapPoleBox = new javax.swing.JCheckBox();
        beetsBox = new javax.swing.JCheckBox();
        broccoliBox = new javax.swing.JCheckBox();
        brusselsSproutsBox = new javax.swing.JCheckBox();
        cabbageBox = new javax.swing.JCheckBox();
        carrotsBox = new javax.swing.JCheckBox();
        cauliflowerBox = new javax.swing.JCheckBox();
        celeryBox = new javax.swing.JCheckBox();
        chardSwissBox = new javax.swing.JCheckBox();
        cilantroBox = new javax.swing.JCheckBox();
        collardGreensBox = new javax.swing.JCheckBox();
        cornSweetBox = new javax.swing.JCheckBox();
        cucumbersBox = new javax.swing.JCheckBox();
        dillBox = new javax.swing.JCheckBox();
        eggplantBox = new javax.swing.JCheckBox();
        fennelBox = new javax.swing.JCheckBox();
        garlicBox = new javax.swing.JCheckBox();
        kaleBox = new javax.swing.JCheckBox();
        kohlrabiBox = new javax.swing.JCheckBox();
        leekBox = new javax.swing.JCheckBox();
        lettuceBox = new javax.swing.JCheckBox();
        onionBulbBox = new javax.swing.JCheckBox();
        parsnipsBox = new javax.swing.JCheckBox();
        peanutsBox = new javax.swing.JCheckBox();
        peasFieldBox = new javax.swing.JCheckBox();
        peppersBox = new javax.swing.JCheckBox();
        potatoesIrishBox = new javax.swing.JCheckBox();
        potatoesSweetBox = new javax.swing.JCheckBox();
        pumpkinBox = new javax.swing.JCheckBox();
        radishBox = new javax.swing.JCheckBox();
        rutabagaBox = new javax.swing.JCheckBox();
        spinachBox = new javax.swing.JCheckBox();
        squashSummerBox = new javax.swing.JCheckBox();
        squashWinterBox = new javax.swing.JCheckBox();
        sunflowerBox = new javax.swing.JCheckBox();
        tomatoesBox = new javax.swing.JCheckBox();
        turnipsBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        shearsCheckBox = new javax.swing.JCheckBox();
        trowelCheckBox = new javax.swing.JCheckBox();
        shovelCheckBox = new javax.swing.JCheckBox();
        hoeBox = new javax.swing.JCheckBox();
        lawnmowerCheckBox = new javax.swing.JCheckBox();
        chainsawCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        pestSprayCheckbox = new javax.swing.JCheckBox();
        weedKillerCheckBox = new javax.swing.JCheckBox();
        gasolineCheckBox = new javax.swing.JCheckBox();
        oilCheckBox = new javax.swing.JCheckBox();

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addPlantFormLabel.setText("Check the plants to add to your task list");

        addPlantMainButton.setText("See Tasks");
        addPlantMainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlantMainButtonActionPerformed(evt);
            }
        });

        artichokesBox.setText("Artichokes");
        artichokesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artichokesBoxActionPerformed(evt);
            }
        });

        arugulaBox.setText("Arugula");
        arugulaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arugulaBoxActionPerformed(evt);
            }
        });

        basilBox.setText("Basil");
        basilBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basilBoxActionPerformed(evt);
            }
        });

        beansSnapBushBox.setText("Beans, Snap/Bush");
        beansSnapBushBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beansSnapBushBoxActionPerformed(evt);
            }
        });

        beansSnapPoleBox.setText("Beans, Snap/Pole");
        beansSnapPoleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beansSnapPoleBoxActionPerformed(evt);
            }
        });

        beetsBox.setText("Beets");
        beetsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beetsBoxActionPerformed(evt);
            }
        });

        broccoliBox.setText("Broccoli");
        broccoliBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broccoliBoxActionPerformed(evt);
            }
        });

        brusselsSproutsBox.setText("Brussels Sprouts");
        brusselsSproutsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brusselsSproutsBoxActionPerformed(evt);
            }
        });

        cabbageBox.setText("Cabbage");
        cabbageBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabbageBoxActionPerformed(evt);
            }
        });

        carrotsBox.setText("Carrots");
        carrotsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrotsBoxActionPerformed(evt);
            }
        });

        cauliflowerBox.setText("Cauliflower");
        cauliflowerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cauliflowerBoxActionPerformed(evt);
            }
        });

        celeryBox.setText("Celery");
        celeryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celeryBoxActionPerformed(evt);
            }
        });

        chardSwissBox.setText("Chard, Swiss");
        chardSwissBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chardSwissBoxActionPerformed(evt);
            }
        });

        cilantroBox.setText("Cilantro");
        cilantroBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilantroBoxActionPerformed(evt);
            }
        });

        collardGreensBox.setText("Collanrd Greens");
        collardGreensBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collardGreensBoxActionPerformed(evt);
            }
        });

        cornSweetBox.setText("Corn, Sweet");
        cornSweetBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cornSweetBoxActionPerformed(evt);
            }
        });

        cucumbersBox.setText("Cucumbers");
        cucumbersBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cucumbersBoxActionPerformed(evt);
            }
        });

        dillBox.setText("Dill");
        dillBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dillBoxActionPerformed(evt);
            }
        });

        eggplantBox.setText("Eggplant");
        eggplantBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggplantBoxActionPerformed(evt);
            }
        });

        fennelBox.setText("Fennel");
        fennelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fennelBoxActionPerformed(evt);
            }
        });

        garlicBox.setText("Garlic");
        garlicBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garlicBoxActionPerformed(evt);
            }
        });

        kaleBox.setText("Kale");
        kaleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaleBoxActionPerformed(evt);
            }
        });

        kohlrabiBox.setText("Kohlrabi");
        kohlrabiBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kohlrabiBoxActionPerformed(evt);
            }
        });

        leekBox.setText("Leek");
        leekBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leekBoxActionPerformed(evt);
            }
        });

        lettuceBox.setText("Lettuce");
        lettuceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lettuceBoxActionPerformed(evt);
            }
        });

        onionBulbBox.setText("Onion, Bulb");
        onionBulbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionBulbBoxActionPerformed(evt);
            }
        });

        parsnipsBox.setText("Parsnips");
        parsnipsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parsnipsBoxActionPerformed(evt);
            }
        });

        peanutsBox.setText("Peanuts");
        peanutsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peanutsBoxActionPerformed(evt);
            }
        });

        peasFieldBox.setText("Peas, Field");
        peasFieldBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peasFieldBoxActionPerformed(evt);
            }
        });

        peppersBox.setText("Peppers");
        peppersBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peppersBoxActionPerformed(evt);
            }
        });

        potatoesIrishBox.setText("Potatoes, Irish");
        potatoesIrishBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potatoesIrishBoxActionPerformed(evt);
            }
        });

        potatoesSweetBox.setText("Potatoes, Sweet");
        potatoesSweetBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potatoesSweetBoxActionPerformed(evt);
            }
        });

        pumpkinBox.setText("Pumpkin");
        pumpkinBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pumpkinBoxActionPerformed(evt);
            }
        });

        radishBox.setText("Radish");
        radishBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radishBoxActionPerformed(evt);
            }
        });

        rutabagaBox.setText("Rutabaga");
        rutabagaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutabagaBoxActionPerformed(evt);
            }
        });

        spinachBox.setText("Spinach");
        spinachBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinachBoxActionPerformed(evt);
            }
        });

        squashSummerBox.setText("Squash, Summer");
        squashSummerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squashSummerBoxActionPerformed(evt);
            }
        });

        squashWinterBox.setText("Squash, Winter");
        squashWinterBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squashWinterBoxActionPerformed(evt);
            }
        });

        sunflowerBox.setText("Sunflower");
        sunflowerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunflowerBoxActionPerformed(evt);
            }
        });

        tomatoesBox.setText("Tomatoes");
        tomatoesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatoesBoxActionPerformed(evt);
            }
        });

        turnipsBox.setText("Turnips");
        turnipsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnipsBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Select the tools you are using");

        shearsCheckBox.setText("Shears");
        shearsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shearsCheckBoxActionPerformed(evt);
            }
        });

        trowelCheckBox.setText("Trowel");
        trowelCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trowelCheckBoxActionPerformed(evt);
            }
        });

        shovelCheckBox.setText("Shovel");
        shovelCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shovelCheckBoxActionPerformed(evt);
            }
        });

        hoeBox.setText("Hoe");
        hoeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoeBoxActionPerformed(evt);
            }
        });

        lawnmowerCheckBox.setText("Lawn Mower");
        lawnmowerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lawnmowerCheckBoxActionPerformed(evt);
            }
        });

        chainsawCheckBox.setText("Chain Saw");
        chainsawCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chainsawCheckBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Select the consumables you are using");

        pestSprayCheckbox.setText("Pest Spray");
        pestSprayCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pestSprayCheckboxActionPerformed(evt);
            }
        });

        weedKillerCheckBox.setText("Weed Killer");
        weedKillerCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weedKillerCheckBoxActionPerformed(evt);
            }
        });

        gasolineCheckBox.setText("Gasoline");
        gasolineCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gasolineCheckBoxActionPerformed(evt);
            }
        });

        oilCheckBox.setText("Oil");
        oilCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addPlantFormLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cilantroBox)
                            .addComponent(chardSwissBox)
                            .addComponent(artichokesBox)
                            .addComponent(arugulaBox)
                            .addComponent(basilBox)
                            .addComponent(beansSnapBushBox)
                            .addComponent(beansSnapPoleBox)
                            .addComponent(beetsBox)
                            .addComponent(broccoliBox)
                            .addComponent(brusselsSproutsBox)
                            .addComponent(cabbageBox)
                            .addComponent(carrotsBox)
                            .addComponent(cauliflowerBox)
                            .addComponent(celeryBox))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(collardGreensBox)
                            .addComponent(eggplantBox)
                            .addComponent(cornSweetBox)
                            .addComponent(cucumbersBox)
                            .addComponent(fennelBox)
                            .addComponent(garlicBox)
                            .addComponent(kaleBox)
                            .addComponent(kohlrabiBox)
                            .addComponent(leekBox)
                            .addComponent(lettuceBox)
                            .addComponent(onionBulbBox)
                            .addComponent(parsnipsBox)
                            .addComponent(dillBox)
                            .addComponent(peanutsBox))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(peasFieldBox))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(potatoesSweetBox)
                                    .addComponent(pumpkinBox)
                                    .addComponent(radishBox)
                                    .addComponent(rutabagaBox)
                                    .addComponent(spinachBox)
                                    .addComponent(squashSummerBox)
                                    .addComponent(squashWinterBox)
                                    .addComponent(sunflowerBox)
                                    .addComponent(tomatoesBox)
                                    .addComponent(turnipsBox)
                                    .addComponent(potatoesIrishBox)
                                    .addComponent(peppersBox))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addPlantMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46))))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shearsCheckBox)
                            .addComponent(trowelCheckBox)
                            .addComponent(shovelCheckBox)
                            .addComponent(hoeBox)
                            .addComponent(lawnmowerCheckBox)
                            .addComponent(chainsawCheckBox)
                            .addComponent(jLabel2)
                            .addComponent(pestSprayCheckbox)
                            .addComponent(weedKillerCheckBox)
                            .addComponent(gasolineCheckBox)
                            .addComponent(oilCheckBox))
                        .addContainerGap(108, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addPlantFormLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(artichokesBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(arugulaBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(basilBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(beansSnapBushBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(beansSnapPoleBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(beetsBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(broccoliBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brusselsSproutsBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cabbageBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carrotsBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cauliflowerBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(celeryBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chardSwissBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cilantroBox))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(collardGreensBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cornSweetBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cucumbersBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dillBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eggplantBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fennelBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(garlicBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kaleBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kohlrabiBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leekBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lettuceBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onionBulbBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parsnipsBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(peanutsBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peasFieldBox)
                            .addComponent(shearsCheckBox))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(peppersBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(potatoesIrishBox))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(trowelCheckBox)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(potatoesSweetBox)
                            .addComponent(shovelCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pumpkinBox)
                            .addComponent(hoeBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radishBox)
                            .addComponent(lawnmowerCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chainsawCheckBox)
                        .addGap(8, 8, 8)
                        .addComponent(rutabagaBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinachBox)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(squashSummerBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(squashWinterBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sunflowerBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tomatoesBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(turnipsBox))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(pestSprayCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(weedKillerCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gasolineCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(oilCheckBox)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(addPlantMainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPlantMainButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addPlantMainButtonActionPerformed
        dispose();
        LandingPage landingPage = new LandingPage();
        landingPage.taskListTextAreaMethod(allPlants);
        landingPage.setVisible(true);

        for (String string : landingPage.taskListTextAreaMethod(allPlants)) {
            landingPage.taskListTextArea.append(string + "\n");
        }

    }//GEN-LAST:event_addPlantMainButtonActionPerformed

    private void artichokesBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_artichokesBoxActionPerformed
        if (artichokesBox.isSelected()) {
            allPlants.add(artichokes);
        }
    }//GEN-LAST:event_artichokesBoxActionPerformed

    private void arugulaBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_arugulaBoxActionPerformed
        if (arugulaBox.isSelected()) {
            allPlants.add(arugula);
        }
    }//GEN-LAST:event_arugulaBoxActionPerformed

    private void basilBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_basilBoxActionPerformed
        if (basilBox.isSelected()) {
            allPlants.add(basil);
        }
    }//GEN-LAST:event_basilBoxActionPerformed

    private void beansSnapBushBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_beansSnapBushBoxActionPerformed
        if (beansSnapBushBox.isSelected()) {
            allPlants.add(beansSnapBush);
        }
    }//GEN-LAST:event_beansSnapBushBoxActionPerformed

    private void beansSnapPoleBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_beansSnapPoleBoxActionPerformed
        if (beansSnapPoleBox.isSelected()) {
            allPlants.add(beansSnapPole);
        }
    }//GEN-LAST:event_beansSnapPoleBoxActionPerformed

    private void beetsBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_beetsBoxActionPerformed
        if (beetsBox.isSelected()) {
            allPlants.add(beets);
        }
    }//GEN-LAST:event_beetsBoxActionPerformed

    private void broccoliBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_broccoliBoxActionPerformed
        if (broccoliBox.isSelected()) {
            allPlants.add(broccoli);
        }
    }//GEN-LAST:event_broccoliBoxActionPerformed

    private void brusselsSproutsBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_brusselsSproutsBoxActionPerformed
        if (brusselsSproutsBox.isSelected()) {
            allPlants.add(brusselsSprouts);
        }
    }//GEN-LAST:event_brusselsSproutsBoxActionPerformed

    private void cabbageBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cabbageBoxActionPerformed
        if (cabbageBox.isSelected()) {
            allPlants.add(cabbage);
        }
    }//GEN-LAST:event_cabbageBoxActionPerformed

    private void carrotsBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_carrotsBoxActionPerformed
        if (carrotsBox.isSelected()) {
            allPlants.add(carrots);
        }
    }//GEN-LAST:event_carrotsBoxActionPerformed

    private void cauliflowerBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cauliflowerBoxActionPerformed
        if (cauliflowerBox.isSelected()) {
            allPlants.add(cauliflower);
        }
    }//GEN-LAST:event_cauliflowerBoxActionPerformed

    private void celeryBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_celeryBoxActionPerformed
        if (celeryBox.isSelected()) {
            allPlants.add(celery);
        }
    }//GEN-LAST:event_celeryBoxActionPerformed

    private void chardSwissBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chardSwissBoxActionPerformed
        if (chardSwissBox.isSelected()) {
            allPlants.add(chardSwiss);
        }
    }//GEN-LAST:event_chardSwissBoxActionPerformed

    private void cilantroBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cilantroBoxActionPerformed
        if (cilantroBox.isSelected()) {
            allPlants.add(cilantro);
        }
    }//GEN-LAST:event_cilantroBoxActionPerformed

    private void collardGreensBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_collardGreensBoxActionPerformed
        if (collardGreensBox.isSelected()) {
            allPlants.add(collardGreens);
        }
    }//GEN-LAST:event_collardGreensBoxActionPerformed

    private void cornSweetBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cornSweetBoxActionPerformed
        if (cornSweetBox.isSelected()) {
            allPlants.add(cornSweet);
        }
    }//GEN-LAST:event_cornSweetBoxActionPerformed

    private void cucumbersBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cucumbersBoxActionPerformed
        if (cucumbersBox.isSelected()) {
            allPlants.add(cucumbers);
        }
    }//GEN-LAST:event_cucumbersBoxActionPerformed

    private void dillBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_dillBoxActionPerformed
        if (dillBox.isSelected()) {
            allPlants.add(dill);
        }
    }//GEN-LAST:event_dillBoxActionPerformed

    private void eggplantBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_eggplantBoxActionPerformed
        if (eggplantBox.isSelected()) {
            allPlants.add(eggplant);
        }
    }//GEN-LAST:event_eggplantBoxActionPerformed

    private void fennelBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_fennelBoxActionPerformed
        if (fennelBox.isSelected()) {
            allPlants.add(fennel);
        }
    }//GEN-LAST:event_fennelBoxActionPerformed

    private void garlicBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_garlicBoxActionPerformed
        if (garlicBox.isSelected()) {
            allPlants.add(garlic);
        }
    }//GEN-LAST:event_garlicBoxActionPerformed

    private void kaleBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_kaleBoxActionPerformed
        if (kaleBox.isSelected()) {
            allPlants.add(kale);
        }
    }//GEN-LAST:event_kaleBoxActionPerformed

    private void kohlrabiBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_kohlrabiBoxActionPerformed
        if (kohlrabiBox.isSelected()) {
            allPlants.add(kohlrabi);
        }
    }//GEN-LAST:event_kohlrabiBoxActionPerformed

    private void leekBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_leekBoxActionPerformed
        if (leekBox.isSelected()) {
            allPlants.add(leek);
        }
    }//GEN-LAST:event_leekBoxActionPerformed

    private void lettuceBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_lettuceBoxActionPerformed
        if (lettuceBox.isSelected()) {
            allPlants.add(lettuce);
        }
    }//GEN-LAST:event_lettuceBoxActionPerformed

    private void onionBulbBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_onionBulbBoxActionPerformed
        if (onionBulbBox.isSelected()) {
            allPlants.add(onions);
        }
    }//GEN-LAST:event_onionBulbBoxActionPerformed

    private void parsnipsBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_parsnipsBoxActionPerformed
        if (parsnipsBox.isSelected()) {
            allPlants.add(parsnips);
        }
    }//GEN-LAST:event_parsnipsBoxActionPerformed

    private void peanutsBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_peanutsBoxActionPerformed
        if (peanutsBox.isSelected()) {
            allPlants.add(peanuts);
        }
    }//GEN-LAST:event_peanutsBoxActionPerformed

    private void peasFieldBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_peasFieldBoxActionPerformed
        if (peasFieldBox.isSelected()) {
            allPlants.add(peasField);
        }
    }//GEN-LAST:event_peasFieldBoxActionPerformed

    private void peppersBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_peppersBoxActionPerformed
        if (peppersBox.isSelected()) {
            allPlants.add(peppers);
        }
    }//GEN-LAST:event_peppersBoxActionPerformed

    private void potatoesIrishBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_potatoesIrishBoxActionPerformed
        if (potatoesIrishBox.isSelected()) {
            allPlants.add(potatoesIrish);
        }
    }//GEN-LAST:event_potatoesIrishBoxActionPerformed

    private void potatoesSweetBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_potatoesSweetBoxActionPerformed
        if (potatoesSweetBox.isSelected()) {
            allPlants.add(potatoesSweet);
        }
    }//GEN-LAST:event_potatoesSweetBoxActionPerformed

    private void pumpkinBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_pumpkinBoxActionPerformed
        if (pumpkinBox.isSelected()) {
            allPlants.add(pumpkin);
        }
    }//GEN-LAST:event_pumpkinBoxActionPerformed

    private void radishBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_radishBoxActionPerformed
        if (radishBox.isSelected()) {
            allPlants.add(radish);
        }
    }//GEN-LAST:event_radishBoxActionPerformed

    private void rutabagaBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rutabagaBoxActionPerformed
        if (rutabagaBox.isSelected()) {
            allPlants.add(rutabaga);
        }
    }//GEN-LAST:event_rutabagaBoxActionPerformed

    private void spinachBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_spinachBoxActionPerformed
        if (spinachBox.isSelected()) {
            allPlants.add(spinach);
        }
    }//GEN-LAST:event_spinachBoxActionPerformed

    private void squashSummerBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_squashSummerBoxActionPerformed
        if (squashSummerBox.isSelected()) {
            allPlants.add(squashSummer);
        }
    }//GEN-LAST:event_squashSummerBoxActionPerformed

    private void squashWinterBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_squashWinterBoxActionPerformed
        if (squashWinterBox.isSelected()) {
            allPlants.add(squashWinter);
        }
    }//GEN-LAST:event_squashWinterBoxActionPerformed

    private void sunflowerBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_sunflowerBoxActionPerformed
        if (sunflowerBox.isSelected()) {
            allPlants.add(sunflower);
        }
    }//GEN-LAST:event_sunflowerBoxActionPerformed

    private void tomatoesBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_tomatoesBoxActionPerformed
        if (tomatoesBox.isSelected()) {
            allPlants.add(tomatoes);
        }
    }//GEN-LAST:event_tomatoesBoxActionPerformed

    private void turnipsBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_turnipsBoxActionPerformed
        if (turnipsBox.isSelected()) {
            allPlants.add(turnips);
        }
    }//GEN-LAST:event_turnipsBoxActionPerformed

    private void pestSprayCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pestSprayCheckboxActionPerformed
        if (pestSprayCheckbox.isSelected()) {
            allPlants.add(pestSpray);
        }
    }//GEN-LAST:event_pestSprayCheckboxActionPerformed

    private void weedKillerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weedKillerCheckBoxActionPerformed
        if (weedKillerCheckBox.isSelected()) {
            allPlants.add(weedKiller);
        }
    }//GEN-LAST:event_weedKillerCheckBoxActionPerformed

    private void gasolineCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gasolineCheckBoxActionPerformed
        if (gasolineCheckBox.isSelected()) {
            allPlants.add(gasoline);
        }
    }//GEN-LAST:event_gasolineCheckBoxActionPerformed

    private void oilCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilCheckBoxActionPerformed
        if (oilCheckBox.isSelected()) {
            allPlants.add(oil);
        }
    }//GEN-LAST:event_oilCheckBoxActionPerformed

    private void shearsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shearsCheckBoxActionPerformed
        if (shearsCheckBox.isSelected()) {
            allPlants.add(shears);
        }
    }//GEN-LAST:event_shearsCheckBoxActionPerformed

    private void trowelCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trowelCheckBoxActionPerformed
        if (trowelCheckBox.isSelected()) {
            allPlants.add(trowel);
        }
    }//GEN-LAST:event_trowelCheckBoxActionPerformed

    private void shovelCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shovelCheckBoxActionPerformed
        if (shovelCheckBox.isSelected()) {
            allPlants.add(shovel);
        }
    }//GEN-LAST:event_shovelCheckBoxActionPerformed

    private void hoeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoeBoxActionPerformed
        if (hoeBox.isSelected()) {
            allPlants.add(hoe);
        }
    }//GEN-LAST:event_hoeBoxActionPerformed

    private void lawnmowerCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lawnmowerCheckBoxActionPerformed
        if (lawnmowerCheckBox.isSelected()) {
            allPlants.add(lawnmower);
        }
    }//GEN-LAST:event_lawnmowerCheckBoxActionPerformed

    private void chainsawCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chainsawCheckBoxActionPerformed
        if (chainsawCheckBox.isSelected()) {
            allPlants.add(chainsaw);
        }
    }//GEN-LAST:event_chainsawCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddPlantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPlantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPlantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPlantForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPlantFormLabel;
    private javax.swing.JButton addPlantMainButton;
    private javax.swing.JCheckBox artichokesBox;
    private javax.swing.JCheckBox arugulaBox;
    private javax.swing.JCheckBox basilBox;
    private javax.swing.JCheckBox beansSnapBushBox;
    private javax.swing.JCheckBox beansSnapPoleBox;
    private javax.swing.JCheckBox beetsBox;
    private javax.swing.JCheckBox broccoliBox;
    private javax.swing.JCheckBox brusselsSproutsBox;
    private javax.swing.JCheckBox cabbageBox;
    private javax.swing.JCheckBox carrotsBox;
    private javax.swing.JCheckBox cauliflowerBox;
    private javax.swing.JCheckBox celeryBox;
    private javax.swing.JCheckBox chainsawCheckBox;
    private javax.swing.JCheckBox chardSwissBox;
    private javax.swing.JCheckBox cilantroBox;
    private javax.swing.JCheckBox collardGreensBox;
    private javax.swing.JCheckBox cornSweetBox;
    private javax.swing.JCheckBox cucumbersBox;
    private javax.swing.JCheckBox dillBox;
    private javax.swing.JCheckBox eggplantBox;
    private javax.swing.JCheckBox fennelBox;
    private javax.swing.JCheckBox garlicBox;
    private javax.swing.JCheckBox gasolineCheckBox;
    private javax.swing.JCheckBox hoeBox;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox kaleBox;
    private javax.swing.JCheckBox kohlrabiBox;
    private javax.swing.JCheckBox lawnmowerCheckBox;
    private javax.swing.JCheckBox leekBox;
    private javax.swing.JCheckBox lettuceBox;
    private javax.swing.JCheckBox oilCheckBox;
    private javax.swing.JCheckBox onionBulbBox;
    private javax.swing.JCheckBox parsnipsBox;
    private javax.swing.JCheckBox peanutsBox;
    private javax.swing.JCheckBox peasFieldBox;
    private javax.swing.JCheckBox peppersBox;
    private javax.swing.JCheckBox pestSprayCheckbox;
    private javax.swing.JCheckBox potatoesIrishBox;
    private javax.swing.JCheckBox potatoesSweetBox;
    private javax.swing.JCheckBox pumpkinBox;
    private javax.swing.JCheckBox radishBox;
    private javax.swing.JCheckBox rutabagaBox;
    private javax.swing.JCheckBox shearsCheckBox;
    private javax.swing.JCheckBox shovelCheckBox;
    private javax.swing.JCheckBox spinachBox;
    private javax.swing.JCheckBox squashSummerBox;
    private javax.swing.JCheckBox squashWinterBox;
    private javax.swing.JCheckBox sunflowerBox;
    private javax.swing.JCheckBox tomatoesBox;
    private javax.swing.JCheckBox trowelCheckBox;
    private javax.swing.JCheckBox turnipsBox;
    private javax.swing.JCheckBox weedKillerCheckBox;
    // End of variables declaration//GEN-END:variables
}
