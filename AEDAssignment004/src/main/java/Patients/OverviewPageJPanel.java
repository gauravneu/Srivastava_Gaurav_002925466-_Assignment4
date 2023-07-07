/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Patients;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.PatientDirectory;
import model.Encounter;
import model.VitalSigns;

/**
 *
 * @author gaurav
 */
public class OverviewPageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OverviewPageJPanel
     */
    JPanel userProcessContainer;
    PatientDirectory pd;
    Patient patient;
    ArrayList<Patient> pL;

    public OverviewPageJPanel(JPanel userProcessContainer, PatientDirectory pd) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.pd = pd;
        refreshTableBloodPressure();
        refreshTableGlucoseLevel();
        refreshTablePulseRate();

    }

    public void refreshTableBloodPressure() {
        pL = pd.getPatientList();
        DefaultTableModel model = (DefaultTableModel) tblBloodPressure.getModel();
        model.setRowCount(0);

        int id = 1;
        for (Patient p : pL) {

            for (Encounter e : p.getEncounterHistory().getEncounterHistory()) {
                if (e.getVitalSigns().getBloodPressure() < 130) {
                    Object row[] = new Object[5];
                    row[0] = id;
                    row[1] = p.getPatientNo();
                    row[2] = e.getVitalSigns().getBloodPressure();
                    row[3] = p.getPerson().getHouse().getCommunity().getCommunityName();
                    row[4] = p.getPerson().getHouse().getCity().getcityName();
                    model.addRow(row);
                    id++;
                }
            }
        }
    }

    public void refreshTableGlucoseLevel() {
        pL = pd.getPatientList();
        DefaultTableModel model = (DefaultTableModel) tblGlucoseLevel.getModel();
        model.setRowCount(0);

        int id = 1;
        for (Patient p : pL) {

            for (Encounter e : p.getEncounterHistory().getEncounterHistory()) {
                if (e.getVitalSigns().getGlucoseLevel() < 140) {
                    Object row[] = new Object[5];
                    row[0] = id;
                    row[1] = p.getPatientNo();
                    row[2] = e.getVitalSigns().getGlucoseLevel();
                    row[3] = p.getPerson().getHouse().getCommunity().getCommunityName();
                    row[4] = p.getPerson().getHouse().getCity().getcityName();
                    model.addRow(row);
                    id++;
                }
            }
        }
    }

    public void refreshTablePulseRate() {
        pL = pd.getPatientList();
        DefaultTableModel model = (DefaultTableModel) tblPulseRate.getModel();
        model.setRowCount(0);

        int id = 1;
        for (Patient p : pL) {

            for (Encounter e : p.getEncounterHistory().getEncounterHistory()) {
                if (e.getVitalSigns().getPulseRate() < 70) {
                    Object row[] = new Object[5];
                    row[0] = id;
                    row[1] = p.getPatientNo();
                    row[2] = e.getVitalSigns().getPulseRate();
                    row[3] = p.getPerson().getHouse().getCommunity().getCommunityName();
                    row[4] = p.getPerson().getHouse().getCity().getcityName();
                    model.addRow(row);
                    id++;
                }
            }
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGlucoseLevel = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBloodPressure = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPulseRate = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("<<Patient With Blood Pressure Below 130 ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel2.setText("<<Patient With Glucose Level Below 140 ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 551, -1, -1));

        jLabel3.setText("Patient With Pulse Rate Below 70 >> ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 345, -1, -1));

        tblGlucoseLevel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.No.", "Patient Id", "Glucose Level", "Community", "City"
            }
        ));
        jScrollPane2.setViewportView(tblGlucoseLevel);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 484, 498, 160));

        tblBloodPressure.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.No.", "Patient Id", "Blood Pressure", "Community", "City"
            }
        ));
        jScrollPane3.setViewportView(tblBloodPressure);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 91, 498, 160));

        tblPulseRate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.No.", "Patient Id", "Pulse Rate", "Community", "City"
            }
        ));
        jScrollPane4.setViewportView(tblPulseRate);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 287, 540, 160));

        jLabel4.setText("Patients With Abnormal Vital Signs");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 57, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblBloodPressure;
    private javax.swing.JTable tblGlucoseLevel;
    private javax.swing.JTable tblPulseRate;
    // End of variables declaration//GEN-END:variables
}
