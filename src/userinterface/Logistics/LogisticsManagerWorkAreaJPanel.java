/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Logistics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TravelAgencyEnterprise;
import Business.Network.StateNetwork;
import Business.Organization.LogisticsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public class LogisticsManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    LogisticsOrganization organization;
    TravelAgencyEnterprise enterprise;
    StateNetwork network;
    EcoSystem business;
    
    public LogisticsManagerWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,LogisticsOrganization organization,TravelAgencyEnterprise enterprise,StateNetwork network,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
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
        manageTransportJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        viewEnterpriseOrdersJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Logistics Manager Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 580, 41));

        manageTransportJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageTransportJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageTransportJButton.setText("Manage Transport");
        manageTransportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTransportJButtonActionPerformed(evt);
            }
        });
        add(manageTransportJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 290, 46));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));

        viewEnterpriseOrdersJButton.setBackground(new java.awt.Color(153, 153, 153));
        viewEnterpriseOrdersJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewEnterpriseOrdersJButton.setText("Incoming Orders");
        viewEnterpriseOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEnterpriseOrdersJButtonActionPerformed(evt);
            }
        });
        add(viewEnterpriseOrdersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 290, 46));
    }// </editor-fold>//GEN-END:initComponents

    private void manageTransportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTransportJButtonActionPerformed
        // TODO add your handling code here:
        ManageTransports manageTransports = new ManageTransports(userProcessContainer,organization.getTransportDirectory());
        userProcessContainer.add("ManageTransports", manageTransports);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageTransportJButtonActionPerformed

    private void viewEnterpriseOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEnterpriseOrdersJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseOrdersJPanel manageEnterpriseOrdersJPanel = new ManageEnterpriseOrdersJPanel(userProcessContainer, account, organization, enterprise, this.business.getAllTravelAgencyEnterpriseOrderRequestFromAllCountries());
        userProcessContainer.add("ManageEnterpriseOrdersJPanel", manageEnterpriseOrdersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewEnterpriseOrdersJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageTransportJButton;
    private javax.swing.JButton viewEnterpriseOrdersJButton;
    // End of variables declaration//GEN-END:variables
}
