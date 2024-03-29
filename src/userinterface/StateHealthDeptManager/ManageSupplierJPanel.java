/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateHealthDeptManager;

import Business.EcoSystem;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.VaccineCatalog.VaccineCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ivanr
 */
public class ManageSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSupplierJPanel
     */
    JPanel userProcessContainer;
    VaccineCatalog vaccineCatalog;
    SupplierOrganization supplierOrganization;
    SupplierEnterprise supplierEnterprise;
    UserAccount userAccount;
    StateNetwork network;
    CountryNetwork countryNetwork;
    EcoSystem business;
    public ManageSupplierJPanel(JPanel userProcessContainer, UserAccount userAccount, VaccineCatalog vaccineCatalog, SupplierOrganization supplierOrganization, SupplierEnterprise supplierEnterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        initComponents();
        this. userProcessContainer = userProcessContainer;
        this.vaccineCatalog = vaccineCatalog;
        this.supplierOrganization = supplierOrganization;
        this.supplierEnterprise = supplierEnterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.countryNetwork = countryNetwork;
        this.business = business;
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
        orderjButton = new javax.swing.JButton();
        inventoryjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Supplier");

        orderjButton.setBackground(new java.awt.Color(153, 153, 153));
        orderjButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        orderjButton.setText("Manage Order");
        orderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderjButtonActionPerformed(evt);
            }
        });

        inventoryjButton.setBackground(new java.awt.Color(153, 153, 153));
        inventoryjButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        inventoryjButton.setText("Manage Inventory");
        inventoryjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryjButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inventoryjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(orderjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(inventoryjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderjButtonActionPerformed
        ManageSupplierOrderJPanel manageSupplierOrderJPanel = new ManageSupplierOrderJPanel(userProcessContainer,userAccount,supplierOrganization, supplierEnterprise,network, countryNetwork, this.business);
        userProcessContainer.add("ManageSupplierOrderJPanel", manageSupplierOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orderjButtonActionPerformed

    private void inventoryjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryjButtonActionPerformed
        ManageSupplierInventoryJPanel manageSupplierInventoryJPanel = new ManageSupplierInventoryJPanel(userProcessContainer, userAccount, vaccineCatalog, supplierOrganization, supplierEnterprise);
        userProcessContainer.add("ManageSupplierInventoryJPanel", manageSupplierInventoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_inventoryjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inventoryjButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton orderjButton;
    // End of variables declaration//GEN-END:variables
}
