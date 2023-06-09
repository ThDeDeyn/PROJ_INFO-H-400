/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulb.infoh400.project.view;

import com.ulb.infoh400.project.controller.DoctorJpaController;
import com.ulb.infoh400.project.controller.PersonJpaController;
import com.ulb.infoh400.project.controller.exceptions.IllegalOrphanException;
import com.ulb.infoh400.project.controller.exceptions.NonexistentEntityException;
import com.ulb.infoh400.project.model.Doctor;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 * @author Adrien Foucart
 */
public class Admin_AddDoctorWindow extends javax.swing.JFrame {
    private final EntityManagerFactory emfac = Persistence.createEntityManagerFactory("projh400_PU");
    private final DoctorJpaController doctorCtrl = new DoctorJpaController(emfac);
    private final PersonJpaController personCtrl = new PersonJpaController(emfac);
    
    private static final Logger LOGGER = LogManager.getLogger(Admin_AddDoctorWindow.class.getName());
    
    Doctor doctor = null;
    
    /**
     * Creates new form AddDoctorWindow
     */
    public Admin_AddDoctorWindow() {
        initComponents();
    }
    
    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
        
        addPersonPanel.setPerson(doctor.getIdperson());
        INAMITextField.setText(doctor.getInami());
        SpecialtyTextField.setText(doctor.getSpecialty());
    }
    
    public Doctor getDoctor(){
        updateDoctor();
                
        return doctor;
    }
    
    public void updateDoctor(){
        if( doctor == null ){
            doctor = new Doctor();
        }
        
        doctor.setIdperson(addPersonPanel.getPerson());
        doctor.setInami(INAMITextField.getText());
        doctor.setSpecialty( INAMITextField.getText());
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
        SpecialtyTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        INAMITextField = new javax.swing.JTextField();
        addPersonPanel = new com.ulb.infoh400.project.view.Admin_AddPersonPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Physician");

        jLabel2.setText("INAMI");

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

        jLabel3.setText("Specialty");

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
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(INAMITextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpecialtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(addPersonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(INAMITextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecialtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        updateDoctor();

        // Create person if necessary:
        if( doctor.getIdperson().getIdperson() == null ){
            personCtrl.create(doctor.getIdperson());
            LOGGER.debug("Created new person (id = %d)".formatted(doctor.getIdperson().getIdperson()));
        }
        // Create doctor if necessary
        if( doctor.getIddoctor() == null ){
            doctorCtrl.create(doctor);
            LOGGER.debug("Created new doctor (id = %d)".formatted(doctor.getIddoctor()));
        }
        
        // Save changes
        try {
            personCtrl.edit(doctor.getIdperson());
            doctorCtrl.edit(doctor);
            LOGGER.debug("Edited doctor (id = %d)".formatted(doctor.getIddoctor()));
        } catch (NonexistentEntityException | IllegalOrphanException ex) {
            LOGGER.error("Couldn't edit doctor", ex);
        } catch (Exception ex){
            LOGGER.error("Couldn't edit doctor", ex);
        }
        
        this.dispose();        
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField INAMITextField;
    private javax.swing.JTextField SpecialtyTextField;
    private com.ulb.infoh400.project.view.Admin_AddPersonPanel addPersonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
