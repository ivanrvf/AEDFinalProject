/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StateHealthDeptManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.StateHealthDeptEnterprise;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.SHDOrganization;
import Business.UserAccount.UserAccount;
import Business.VaccineCatalog.VaccineCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public class StateHealthDeptManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StateHealthDeptManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    SHDOrganization organization;
    StateHealthDeptEnterprise enterprise;
    StateNetwork network;
    VaccineCatalog vaccineCatalog;
    EcoSystem system;
    
    public StateHealthDeptManagerWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,StateNetwork network, VaccineCatalog vaccineCatalog, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account= account;
        this.organization = (SHDOrganization)organization;
        this.enterprise = (StateHealthDeptEnterprise)enterprise;
        this.network = network;
        this.vaccineCatalog = vaccineCatalog;
        this.system = system;
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
        manageOrdersJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("State Health Department Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 580, 41));

        manageOrdersJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageOrdersJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manageOrdersJButton.setText("Manage Order Approvals");
        manageOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersJButtonActionPerformed(evt);
            }
        });
        add(manageOrdersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 330, 46));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersJButtonActionPerformed
        // TODO add your handling code here:
        ManageOrderApprovalsJPanel manageOrderApprovalsJPanel = new ManageOrderApprovalsJPanel(userProcessContainer, account, organization,enterprise,network);
        userProcessContainer.add("ManageOrderApprovalsJPanel", manageOrderApprovalsJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageOrdersJButton;
    // End of variables declaration//GEN-END:variables
}
