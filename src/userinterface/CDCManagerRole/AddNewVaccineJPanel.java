/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDCManagerRole;

import Business.DiseaseCatalog.Disease;
import Business.DiseaseCatalog.DiseaseCatalog;
import Business.VaccineCatalog.VaccineCatalog;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public class AddNewVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNewVaccineJPanel
     */
    
    JPanel userProcessContainer;
    DiseaseCatalog diseaseCatalog;
    VaccineCatalog vaccineCatalog;
    
    public AddNewVaccineJPanel(JPanel userProcessContainer,DiseaseCatalog diseaseCatalog, VaccineCatalog vaccineCatalog ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.diseaseCatalog = diseaseCatalog;
        this.vaccineCatalog = vaccineCatalog;
        populateComboBox();
    }
    
    private void populateComboBox(){
    diseasesJComboBox.removeAllItems();
        for (Disease disease : diseaseCatalog.getDiseaseList()){
                diseasesJComboBox.addItem(disease);
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

        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vaccineNameJTextField = new javax.swing.JTextField();
        diseasesJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        addVaccineJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add New Vaccine");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 561, 41));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/click-go-back-button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 100, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Enter Vaccine Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 230, 50));

        vaccineNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(vaccineNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 230, 50));

        diseasesJComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        diseasesJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        add(diseasesJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 240, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Disease Combacted:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 210, 40));

        addVaccineJButton.setBackground(new java.awt.Color(153, 153, 153));
        addVaccineJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addVaccineJButton.setText("Add Vaccine");
        addVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVaccineJButtonActionPerformed(evt);
            }
        });
        add(addVaccineJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageVaccineCatalogJPanel vaccineCatalogJPanel = (ManageVaccineCatalogJPanel) component;
        vaccineCatalogJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVaccineJButtonActionPerformed
        // TODO add your handling code here:
        String vaccineName = vaccineNameJTextField.getText();
        Disease disease = (Disease) diseasesJComboBox.getSelectedItem();
        if (!vaccineName.matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(null, "Vaccine name should contain only letters", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        vaccineCatalog.addNewVaccine(vaccineName, disease);
        JOptionPane.showMessageDialog(null, "Vaccine added successfully");
        
    }//GEN-LAST:event_addVaccineJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVaccineJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox diseasesJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField vaccineNameJTextField;
    // End of variables declaration//GEN-END:variables
}
