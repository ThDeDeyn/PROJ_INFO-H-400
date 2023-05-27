/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ulb.infoh400.project.view;

import com.ulb.infoh400.project.controller.NoteJpaController;
import com.ulb.infoh400.project.model.Doctor;
import com.ulb.infoh400.project.model.Note;
import com.ulb.infoh400.project.model.Patient;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Thomas
 */
public class Doc_PatDesc extends javax.swing.JFrame {
    private final EntityManagerFactory emfac = Persistence.createEntityManagerFactory("projh400_PU");
    private final NoteJpaController noteCtrl = new NoteJpaController(emfac);
    private final Patient patient; 
    private final Doctor doctor; 
    /**
     * Creates new form Doc_PatDesc
     * @param pat
     */
    public Doc_PatDesc(Patient pat, Doctor doc) {
        initComponents();
        
        NameLabel.setText( pat.getIdperson().getFamilyname().toUpperCase() + "  " + pat.getIdperson().getFirstname());
        DOBLabel.setText(pat.getIdperson().getDateofbirth().toString());
        patient = pat; 
        doctor = doc; 
        jLabel8.setText("Patient : " + pat.toString());
        
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NotesList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        NewMsgButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NewPrescButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        prescList = new javax.swing.JList<>();
        Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel8.setBackground(new java.awt.Color(102, 153, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Patient details");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name :");

        NotesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(NotesList);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Messaging service");

        NewMsgButton.setText("New");
        NewMsgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMsgButtonActionPerformed(evt);
            }
        });

        NameLabel.setText("jLabel4");

        DOBLabel.setText("jLabel4");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("D.o.B. :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Prescription service");

        NewPrescButton.setText("New");
        NewPrescButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPrescButtonActionPerformed(evt);
            }
        });

        prescList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        prescList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(prescList);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewMsgButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refresh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewPrescButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(NewPrescButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Refresh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewMsgButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewMsgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMsgButtonActionPerformed
        Doc_SendNote Doc_NotePopUp = new Doc_SendNote(doctor, patient);
        Doc_NotePopUp.setVisible(true);        
    }//GEN-LAST:event_NewMsgButtonActionPerformed

    private void NewPrescButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPrescButtonActionPerformed
        // TODO add your handling code here:
        Doc_SendPresc Presc_PopUp = new Doc_SendPresc(patient); 
        Presc_PopUp.setVisible(true);
    }//GEN-LAST:event_NewPrescButtonActionPerformed

    private void refresh(){
        EntityListModel<Note> model = new EntityListModel(updateNoteList("msg"));        
        NotesList.setModel(model);
        EntityListModel<Note> model2 = new EntityListModel(updateNoteList("presc"));        
        prescList.setModel(model2);
    
    }
    private List<Note> updateNoteList(String str){

        List<Note> notes = noteCtrl.findNoteEntities();
        for(int i = 0; i < notes.size() ;){  
            
            if(str.equals(notes.get(i).getType()) && notes.get(i).getPatientKey().equals(patient.getIdperson().getIdperson())){
                i++;
            }else{ notes.remove(i); }
        }
        return notes;
    }
    private void prescListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescListMouseClicked
                
        if(prescList.getSelectedIndex() < 0) { return; }
        
        EntityListModel<Note> model = (EntityListModel) prescList.getModel();
        Note selected = model.getList().get(prescList.getSelectedIndex());
        
        if(evt.getClickCount() == 2){
            Admin_PrescWindow Presc_Popup= new Admin_PrescWindow(selected, doctor, patient);
            Presc_Popup.setVisible(true);
        }
    }//GEN-LAST:event_prescListMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        refresh();
    }//GEN-LAST:event_RefreshActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton NewMsgButton;
    private javax.swing.JButton NewPrescButton;
    private javax.swing.JList<String> NotesList;
    private javax.swing.JButton Refresh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> prescList;
    // End of variables declaration//GEN-END:variables
}
