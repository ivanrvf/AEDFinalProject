/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDCManagerRole;

import Business.EcoSystem;
import Business.Enterprise.CDCEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.StateNetwork;
import Business.Organization.CdcOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public class CDCManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CDCMaangerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    CdcOrganization cdcOrganization;
    CDCEnterprise enterprise;
    StateNetwork network;
    EcoSystem business;
    public CDCManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Organization organization,Enterprise enterprise,StateNetwork network,EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.cdcOrganization = (CdcOrganization)organization;
        this.enterprise = (CDCEnterprise)enterprise;
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
        manageDiseasesJButton = new javax.swing.JButton();
        manageVaccinesJButton = new javax.swing.JButton();
        manageApprovalRequestsJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CDC Manager Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 562, 41));

        manageDiseasesJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageDiseasesJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageDiseasesJButton.setText("Manage Diseases");
        manageDiseasesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDiseasesJButtonActionPerformed(evt);
            }
        });
        add(manageDiseasesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 320, 50));

        manageVaccinesJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageVaccinesJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageVaccinesJButton.setText("Manage Vaccines");
        manageVaccinesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccinesJButtonActionPerformed(evt);
            }
        });
        add(manageVaccinesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 320, 50));

        manageApprovalRequestsJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageApprovalRequestsJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageApprovalRequestsJButton.setText("Manage Approval Requests");
        manageApprovalRequestsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageApprovalRequestsJButtonActionPerformed(evt);
            }
        });
        add(manageApprovalRequestsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 320, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageDiseasesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDiseasesJButtonActionPerformed
        // TODO add your handling code here:
        ManageDiseaseCatalogJPanel manageDiseaseCatalogJPanel = new ManageDiseaseCatalogJPanel(userProcessContainer, business.getDiseaseCatalog());
        userProcessContainer.add("ManageDiseaseCatalogJPanel", manageDiseaseCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDiseasesJButtonActionPerformed

    private void manageVaccinesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccinesJButtonActionPerformed
        // TODO add your handling code here:
        ManageVaccineCatalogJPanel manageVaccineCatalogJPanel = new ManageVaccineCatalogJPanel(userProcessContainer,business.getDiseaseCatalog(),business.getVaccineCatalog());
        userProcessContainer.add("ManageVaccineCatalogJPanel", manageVaccineCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVaccinesJButtonActionPerformed

    private void manageApprovalRequestsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageApprovalRequestsJButtonActionPerformed
        // TODO add your handling code here:
        ManageCDCApprovalOrdersJPanel manageCDCApprovalOrdersJPanel = new ManageCDCApprovalOrdersJPanel(userProcessContainer,account,cdcOrganization, (CDCEnterprise) enterprise, network);
        userProcessContainer.add("ManageCDCApprovalOrdersJPanel", manageCDCApprovalOrdersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageApprovalRequestsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageApprovalRequestsJButton;
    private javax.swing.JButton manageDiseasesJButton;
    private javax.swing.JButton manageVaccinesJButton;
    // End of variables declaration//GEN-END:variables
}
