/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulb.infoh400.project.view;

import com.ulb.infoh400.project.controller.PatientJpaController;
import com.ulb.infoh400.project.controller.PersonJpaController;
import com.ulb.infoh400.project.controller.exceptions.IllegalOrphanException;
import com.ulb.infoh400.project.controller.exceptions.NonexistentEntityException;
import com.ulb.infoh400.project.model.Patient;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Adrien Foucart
 */
public class Doc_AddPatientWindow extends javax.swing.JFrame {
    private final EntityManagerFactory emfac = Persistence.createEntityManagerFactory("projh400_PU");
    private final PatientJpaController patientCtrl = new PatientJpaController(emfac);
    private final PersonJpaController personCtrl = new PersonJpaController(emfac);
    
    private static final Logger LOGGER = LogManager.getLogger(Doc_AddPatientWindow.class.getName());
    
    Patient patient = null;
    
    /**
     * Creates new form AddPatientWindow
     */
    public Doc_AddPatientWindow() {
        initComponents();
    }
    
    public void setPatient(Patient patient){
        this.patient = patient;
        
        addPersonPanel.setPerson(patient.getIdperson());
        phonenumberTextField.setText(patient.getPhonenumber());
        statusComboBox.setSelectedItem(patient.getStatus());
    }
    
    public Patient getPatient(){
        updatePatient();
                
        return patient;
    }
    
    public void updatePatient(){
        if( patient == null ){
            patient = new Patient();
        }
        
        patient.setIdperson(addPersonPanel.getPerson());
        patient.setPhonenumber(phonenumberTextField.getText());
        patient.setStatus((String) statusComboBox.getSelectedItem());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phonenumberTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        addPersonPanel = new com.ulb.infoh400.project.view.Admin_AddPersonPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Patient");

        jLabel2.setText("Phone Number:");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Status:");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive", "Banned" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPersonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPersonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        updatePatient();

        // Create person if necessary:
        if( patient.getIdperson().getIdperson() == null ){
            personCtrl.create(patient.getIdperson());
            LOGGER.debug("Created new person (id = %d)".formatted(patient.getIdperson().getIdperson()));
        }
        // Create patient if necessary
        if( patient.getIdpatient() == null ){
            patientCtrl.create(patient);
            LOGGER.debug("Created new patient (id = %d)".formatted(patient.getIdpatient()));
        }
        
        // Save changes
        try {
            personCtrl.edit(patient.getIdperson());
            patientCtrl.edit(patient);
            LOGGER.debug("Edited patient (id = %d)".formatted(patient.getIdpatient()));
        } catch (NonexistentEntityException | IllegalOrphanException ex) {
            LOGGER.error("Couldn't edit patient", ex);
        } catch (Exception ex){
            LOGGER.error("Couldn't edit patient", ex);
        }
        
        this.dispose();        
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ulb.infoh400.project.view.Admin_AddPersonPanel addPersonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phonenumberTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
