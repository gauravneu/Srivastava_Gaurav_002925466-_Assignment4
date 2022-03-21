/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patients;

import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Patient;
import model.EncounterHistory;
import model.Encounter;
import model.VitalSigns;

/**
 *
 * @author gaurav
 */
public class AddVitalSignsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddVitalSignsJPanel
     */
    JPanel userProcessContainer;
    Patient patient;
    EncounterHistory encounterHistory;
    Encounter encounter;
    VitalSigns vitalSigns;

    public AddVitalSignsJPanel(JPanel userProcessContainer, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        txtPatientName.setText(patient.getPerson().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblBodyTemperature = new javax.swing.JLabel();
        lblPulseRate = new javax.swing.JLabel();
        lblRespirationRate = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblGlucoseLevel = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtBodyTemperature = new javax.swing.JTextField();
        txtPulseRate = new javax.swing.JTextField();
        txtRespirationRate = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtGlucoseLevel = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtPatientName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtComplaint = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(" Add Vital Signs For Patient :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 23, 193, 45));

        lblBodyTemperature.setText("Body Temperature :");
        add(lblBodyTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 104, -1, -1));

        lblPulseRate.setText("Pulse Rate :");
        add(lblPulseRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 148, -1, -1));

        lblRespirationRate.setText("Respiration Rate :");
        add(lblRespirationRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 192, -1, -1));

        lblBloodPressure.setText("Blood Pressure :");
        add(lblBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 236, -1, -1));

        lblHeight.setText("Height :");
        add(lblHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 280, -1, -1));

        lblGlucoseLevel.setText("Glucose Level :");
        add(lblGlucoseLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 324, -1, -1));

        lblWeight.setText("Weight :");
        add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 368, -1, -1));
        add(txtBodyTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 99, 102, -1));
        add(txtPulseRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 143, 102, -1));
        add(txtRespirationRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 187, 102, -1));
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 231, 102, -1));
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 275, 102, -1));
        add(txtGlucoseLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 319, 102, -1));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 363, 102, -1));

        jButton1.setText("Add Vitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 504, -1, -1));
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 32, 138, -1));

        jLabel2.setText("Chief Complaint :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 412, -1, -1));

        txtComplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplaintActionPerformed(evt);
            }
        });
        add(txtComplaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 407, 102, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {

            double bloodPressure = 0;
            double bodyTemperature = 0;
            double glucoseLevel = 0;
            double height = 0;
            double pulseRate = 0;
            double respirationRate = 0;
            double weight = 0;

            try {
                bloodPressure = Double.parseDouble(txtBloodPressure.getText());
                bodyTemperature = Double.parseDouble(txtBodyTemperature.getText());
                glucoseLevel = Double.parseDouble(txtGlucoseLevel.getText());
                height = Double.parseDouble(txtHeight.getText());
                pulseRate = Double.parseDouble(txtPulseRate.getText());
                respirationRate = Double.parseDouble(txtRespirationRate.getText());
                weight = Double.parseDouble(txtWeight.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please provide correct values "
                        + "for bodyTemperature, pulseRate, respirationRate, bloodPressure, "
                        + "height, glucoseLevel, weight");
                return;
            }

            if (bloodPressure < 110 || bloodPressure > 150) {
                JOptionPane.showMessageDialog(this, "Blood Pressure should not be less than 110 and not more than 150.");
                return;
            }

            if (bodyTemperature < 97 || bodyTemperature > 100) {
                JOptionPane.showMessageDialog(this, "Body Temperature should not be less than 97 and not more than 100 F1.");
                return;
            }

            if (glucoseLevel < 120 || glucoseLevel > 220) {
                JOptionPane.showMessageDialog(this, "Glucose Level should not be less than 120 and not more than 220.");
                return;
            }

            if (height < 1 || height > 8) {
                JOptionPane.showMessageDialog(this, "Height should not be less than 1 and not more than 8 ft.");
                return;
            }

            if (pulseRate < 50 || pulseRate > 110) {
                JOptionPane.showMessageDialog(this, "Pulse Rate should not be less than 50 and not more than 110.");
                return;
            }

            if (respirationRate < 10 || respirationRate > 20) {
                JOptionPane.showMessageDialog(this, "Respiration Rate should not be less than 10 and not more than 20.");
                return;
            }

            if (weight < 1 || weight > 300) {
                JOptionPane.showMessageDialog(this, "Weight should not be less than 1 and not more than 300 lbs.");
                return;
            }

            patient.setChiefComplaint(txtComplaint.getText());
            vitalSigns = new VitalSigns();
            encounterHistory = patient.getEncounterHistory();
            encounter = encounterHistory.addNewEncounter();
            vitalSigns.setBloodPressure(bloodPressure);
            vitalSigns.setBodyTemperature(bodyTemperature);
            vitalSigns.setGlucoseLevel(glucoseLevel);
            vitalSigns.setHeight(height);
            vitalSigns.setPulseRate(pulseRate);
            vitalSigns.setRespirationRate(respirationRate);
            vitalSigns.setWeight(weight);
            encounter.setVitalSigns(vitalSigns);

            JOptionPane.showMessageDialog(this, "Vital Signs Are Added.");

        } catch (NumberFormatException ex) {
            Logger.getLogger(ViewPatientJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplaintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplaintActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBodyTemperature;
    private javax.swing.JLabel lblGlucoseLevel;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblPulseRate;
    private javax.swing.JLabel lblRespirationRate;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBodyTemperature;
    private javax.swing.JTextField txtComplaint;
    private javax.swing.JTextField txtGlucoseLevel;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
