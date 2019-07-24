/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClinicManagerRole;

import Business.DiseaseCatalog.DiseaseCatalog;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.StateNetwork;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.VaccineCatalog.VaccineCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public class ClinicInventoryManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    ClinicOrganization organization;
    HospitalEnterprise enterprise;
    StateNetwork network;
    VaccineCatalog vaccineCatalog;
    DiseaseCatalog diseaseCatalog;
    
    public ClinicInventoryManagerWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,StateNetwork network, VaccineCatalog vaccineCatalog, DiseaseCatalog diseaseCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = (ClinicOrganization)organization;
        this.enterprise = (HospitalEnterprise)enterprise;
        this.network = network;
        this.vaccineCatalog = vaccineCatalog;
        this.diseaseCatalog = diseaseCatalog;
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
        viewInventoryJButton = new javax.swing.JButton();
        myOrdersJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clinic Inventory Manager Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 580, 41));

        viewInventoryJButton.setBackground(new java.awt.Color(153, 153, 153));
        viewInventoryJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewInventoryJButton.setText("View Inventory");
        viewInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInventoryJButtonActionPerformed(evt);
            }
        });
        add(viewInventoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 268, 46));

        myOrdersJButton.setBackground(new java.awt.Color(153, 153, 153));
        myOrdersJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myOrdersJButton.setText("My Orders");
        myOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myOrdersJButtonActionPerformed(evt);
            }
        });
        add(myOrdersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 268, 46));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInventoryJButtonActionPerformed
        // TODO add your handling code here:
        ViewInventoryJPanel viewInventoryJPanel = new ViewInventoryJPanel(userProcessContainer,organization.getInventoryCatalog());
        userProcessContainer.add("ViewInventoryJPanel", viewInventoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewInventoryJButtonActionPerformed

    private void myOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myOrdersJButtonActionPerformed
        // TODO add your handling code here:
        MyOrdersJPanel myOrdersJPanel = new MyOrdersJPanel(userProcessContainer, account, organization, enterprise, network);
        userProcessContainer.add("MyOrdersJPanel", myOrdersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_myOrdersJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton myOrdersJButton;
    private javax.swing.JButton viewInventoryJButton;
    // End of variables declaration//GEN-END:variables
}