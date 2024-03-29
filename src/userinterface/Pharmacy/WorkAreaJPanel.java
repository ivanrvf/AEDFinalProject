/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ivanr
 */
public class WorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    PharmacyOrganization organization;
    PharmacyEnterprise enterprise;
    StateNetwork network;
    CountryNetwork countryNetwork;
    EcoSystem business;
    public WorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PharmacyOrganization organization, PharmacyEnterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
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

        jLabel1 = new javax.swing.JLabel();
        manageInventoryJButton = new javax.swing.JButton();
        manageIncomingOrderJButton = new javax.swing.JButton();
        manageOutGoingOrderJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pharmacy WorkArea");

        manageInventoryJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageInventoryJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageInventoryJButton.setText("Manage Inventory");
        manageInventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryJButtonActionPerformed(evt);
            }
        });

        manageIncomingOrderJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageIncomingOrderJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageIncomingOrderJButton.setText("Manage Incoming Order");
        manageIncomingOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageIncomingOrderJButtonActionPerformed(evt);
            }
        });

        manageOutGoingOrderJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageOutGoingOrderJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageOutGoingOrderJButton.setText("Manage Outgoing Order");
        manageOutGoingOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOutGoingOrderJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageInventoryJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageIncomingOrderJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(manageOutGoingOrderJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(manageIncomingOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(manageOutGoingOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(manageInventoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageIncomingOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageIncomingOrderJButtonActionPerformed
        IncomingOrderJPanel incomingOrderJPanel = new IncomingOrderJPanel(userProcessContainer,
                account, organization, enterprise, network, countryNetwork, business);
        userProcessContainer.add("IncomingOrderJPanel", incomingOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageIncomingOrderJButtonActionPerformed

    private void manageOutGoingOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOutGoingOrderJButtonActionPerformed
        OutgoingOrderJPanel outgoingOrderJPanel = new OutgoingOrderJPanel(userProcessContainer,
                account, organization, enterprise, network, countryNetwork, business);
        userProcessContainer.add("OutgoingOrderJPanel", outgoingOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOutGoingOrderJButtonActionPerformed

    private void manageInventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryJButtonActionPerformed
        InventoryJPanel inventoryJPanel = new InventoryJPanel(this.userProcessContainer, account, business.getVaccineCatalog(), business.getDiseaseCatalog(),network, business.getSupplierEnterprisesFromAllCountries(), organization);
        userProcessContainer.add("InventoryJPanel", inventoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageInventoryJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageIncomingOrderJButton;
    private javax.swing.JButton manageInventoryJButton;
    private javax.swing.JButton manageOutGoingOrderJButton;
    // End of variables declaration//GEN-END:variables
}
