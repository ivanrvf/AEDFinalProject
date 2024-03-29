/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDCManagerRole;

import Business.DiseaseCatalog.Disease;
import Business.DiseaseCatalog.DiseaseCatalog;
import Business.VaccineCatalog.Vaccine;
import Business.VaccineCatalog.VaccineCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varun
 */
public class ManageVaccineCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccineCatalogJPanel
     */
    JPanel userProcessContainer;
    DiseaseCatalog diseaseCatalog;
    VaccineCatalog vaccineCatalog;
    
    public ManageVaccineCatalogJPanel(JPanel userProcessContainer,DiseaseCatalog diseaseCatalog, VaccineCatalog vaccineCatalog ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.diseaseCatalog = diseaseCatalog;
        this.vaccineCatalog = vaccineCatalog;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) vaccineCatalogJTable.getModel();
        
        model.setRowCount(0);
        
        int i = 0;
        for(Vaccine vaccine: vaccineCatalog.getVaccineList()){
            Object[] row = new Object[3];
            row[0] = ++i;
            row[1] = vaccine;
            row[2] = vaccine.getDiseaseProtectedAgainst();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineCatalogJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        addNewVaccineJButton = new javax.swing.JButton();
        removeVaccineJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vaccineCatalogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl. No", "Vaccine Name", "Disease combacted"
            }
        ));
        jScrollPane1.setViewportView(vaccineCatalogJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 710, 178));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Vaccine Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 79, 190, 30));

        addNewVaccineJButton.setBackground(new java.awt.Color(153, 153, 153));
        addNewVaccineJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addNewVaccineJButton.setText("Add New Vaccine");
        addNewVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewVaccineJButtonActionPerformed(evt);
            }
        });
        add(addNewVaccineJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 311, 240, -1));

        removeVaccineJButton.setBackground(new java.awt.Color(153, 153, 153));
        removeVaccineJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        removeVaccineJButton.setText("Remove Vaccine");
        removeVaccineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeVaccineJButtonActionPerformed(evt);
            }
        });
        add(removeVaccineJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 210, -1));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/click-go-back-button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 100, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Vaccine Catalog ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 580, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addNewVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewVaccineJButtonActionPerformed
        // TODO add your handling code here:
        AddNewVaccineJPanel addNewVaccineJPanel = new AddNewVaccineJPanel(userProcessContainer,diseaseCatalog, vaccineCatalog);
        userProcessContainer.add("manageOrganizationJPanel", addNewVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_addNewVaccineJButtonActionPerformed

    private void removeVaccineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVaccineJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = vaccineCatalogJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        Disease disease = (Disease) vaccineCatalogJTable.getValueAt(selectedRow, 1);
        diseaseCatalog.removeDisease(disease);
        populateTable();

    }//GEN-LAST:event_removeVaccineJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewVaccineJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeVaccineJButton;
    private javax.swing.JTable vaccineCatalogJTable;
    // End of variables declaration//GEN-END:variables
}
