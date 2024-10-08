/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gilesfinal;

import java.util.ArrayList;
import java.util.List;

/*
  @author Scott Giles
 * Liberty University CSIS505
 * Final Project
 */
//stretch goal: create jButtons for each task instead of adding to jList
public class LandingPage extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    public LandingPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        landingPageLabel = new javax.swing.JLabel();
        plantingCalendarButton = new javax.swing.JButton();
        addPlantButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskListTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        landingPageLabel.setText("Gardening Tasks");

        plantingCalendarButton.setText("Planting Calendar");
        plantingCalendarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantingCalendarButtonActionPerformed();
            }
        });

        addPlantButton.setText("Add Plant");
        addPlantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlantButtonActionPerformed();
            }
        });

        taskListTextArea.setColumns(20);
        taskListTextArea.setRows(5);
        jScrollPane1.setViewportView(taskListTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(landingPageLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(plantingCalendarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(addPlantButton)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(landingPageLabel)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plantingCalendarButton)
                    .addComponent(addPlantButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //action listener for plantingCalendar button to navigate to the PlantingCalendar jForm
    private void plantingCalendarButtonActionPerformed() {//GEN-FIRST:event_plantingCalendarButtonActionPerformed
        dispose();
        PlantingCalendarForm plantingCalendarForm = new PlantingCalendarForm();
        plantingCalendarForm.setVisible(true);
    }//GEN-LAST:event_plantingCalendarButtonActionPerformed

    private void addPlantButtonActionPerformed() {//GEN-FIRST:event_addPlantButtonActionPerformed
        dispose();
        AddPlantForm addPlantForm = new AddPlantForm();
        addPlantForm.setVisible(true);
    }//GEN-LAST:event_addPlantButtonActionPerformed

    //method to pull weekly gardening tasks from selected plants
    public List<String> taskListTextAreaMethod(List<Object> objects) {
        List<String> taskStrings = new ArrayList<>();
        for (Object object : objects) {
            if (object instanceof Plant) {
                Plant plant = (Plant) object;
                taskStrings.add(plant.getPlantName() + " Water: " + plant.getWaterInstructions());
                taskStrings.add(plant.getPlantName() + " Fertilizer: " + plant.getFertilizeInstructions());
                taskStrings.add(plant.getPlantName() + " Pruning: " + plant.getPruneInstructions());
                taskStrings.add(plant.getPlantName() + " Pests: " + plant.getPestInstructions() + "\n");
            }

            if (object instanceof Tool) {
                Tool tool = (Tool) object;
                taskStrings.add(tool.getToolName() + " " + tool.getMaintenanceInstructions() + "\n");
            }

            if (object instanceof Pest) {
                Pest pest = (Pest) object;
                taskStrings.add(pest.getPestName() + " " + pest.getPestInstructions() + "\n");
            }

            if (object instanceof Consumable) {
                Consumable consumable = (Consumable) object;
                taskStrings.add(consumable.getConsumableName() + ": Refill after every 8 uses" + "\n");
            }

        }
        return taskStrings;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPlantButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel landingPageLabel;
    private javax.swing.JButton plantingCalendarButton;
    public javax.swing.JTextArea taskListTextArea;
    // End of variables declaration//GEN-END:variables
}
