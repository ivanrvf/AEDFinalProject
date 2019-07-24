/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Pharmacy;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Enterprise.TravelAgencyEnterprise;
import Business.InventoryCatalog.InventoryItem;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.OrderQueue.OrderRequest;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Doctor.TrackMyOrdersJPanel;

/**
 *
 * @author ivanr
 */
public class OutgoingOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OutgoingOrderJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    PharmacyOrganization organization;
    PharmacyEnterprise enterprise; 
    StateNetwork network;
    CountryNetwork countryNetwork;
    EcoSystem business;
    public OutgoingOrderJPanel(JPanel userProcessContainer, UserAccount account, PharmacyOrganization organization, PharmacyEnterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        tableTypeJLabel = new javax.swing.JLabel();
        assignJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        trackOrderJButton = new javax.swing.JButton();
        approveOrderJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Incoming Orders");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Item", "Quantity", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        tableTypeJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableTypeJLabel.setText("<Display the table content here>");

        assignJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        trackOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        trackOrderJButton.setText("Track Order");
        trackOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackOrderJButtonActionPerformed(evt);
            }
        });

        approveOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        approveOrderJButton.setText("Approve");
        approveOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveOrderJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 938, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(480, 480, 480)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tableTypeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(assignJButton)
                                    .addGap(359, 359, 359)
                                    .addComponent(refreshJButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(approveOrderJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(310, 310, 310)
                                    .addComponent(trackOrderJButton)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(109, 109, 109)
                    .addComponent(tableTypeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(assignJButton))
                        .addComponent(refreshJButton))
                    .addGap(13, 13, 13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(approveOrderJButton)
                        .addComponent(trackOrderJButton))
                    .addGap(113, 113, 113)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backJButton)
                        .addComponent(jLabel3))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        OrderRequest request = (OrderRequest)workRequestJTable.getValueAt(selectedRow, 0);
        String status = request.getStatus();
        if(status.equals("Processed by CDC, Forwarded to Pharmacy")||status.equals("Assigned to a Pharmacy organization")){
            request.setReceiver(account);
            request.setStatus("Assigned to a Pharmacy organization");

            OrderRequest lastRequest = request.getLastOrderRequest();

            lastRequest.setReceiver(account);
            lastRequest.setStatus("Assigned to a Pharmacy organization");

        }
        else{
            JOptionPane.showMessageDialog(null,"This order has not been forwarded to you !");
        }

        //populateEnterpriseJTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        //populateEnterpriseJTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void trackOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackOrderJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row !");
            return;
        }

        OrderRequest request = (OrderRequest)workRequestJTable.getValueAt(selectedRow, 0);

        TrackMyOrdersJPanel trackOrderJPanel = new TrackMyOrdersJPanel(userProcessContainer, request);
        userProcessContainer.add("TrackOrderJPanel", trackOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_trackOrderJButtonActionPerformed

    private void approveOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveOrderJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        boolean avail = false;
        OrderRequest request = (OrderRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if( (request.getReceiver()!=null) && (request.getReceiver().equals(account)) ){

            for(InventoryItem inventoryItem: organization.getInventoryCatalog().getInventoryList()){
                if(inventoryItem.getVaccine().equals(request.getVaccine())&&(inventoryItem.checkQuantity(request.getQuantity()))){

                    inventoryItem.setQuantity(inventoryItem.getQuantity()-request.getQuantity());
                    avail = true;
                    //
                    //                nextRequest.setSender(account);
                    //                nextRequest.setStatus("Processed by Pharmacy, Forwarded to Travel Agency");
                    //                lastRequest.assignOrderRequest(nextRequest);

                    OrderRequest lastRequest = request.getLastOrderRequest();

                    lastRequest.createAndGetNewOrderRequest().setSender(account);
                    lastRequest.createAndGetNewOrderRequest().setStatus("Processed by Pharmacy, Forwarded to Travel Agency");

                    request.setStatus("Processed by Pharmacy, Forwarded to Travel Agency");
                    request.setReceiver(null);
                    request.setSourceCoordinates(organization.getCoordinates());

                    for(Enterprise enterpris: network.getEnterpriseDirectory().getEnterpriseList()){
                        if (enterpris instanceof TravelAgencyEnterprise){

                            enterpris.getOrderQueue().getOrderRequestList().add(request);
                            account.getOrderQueue().getOrderRequestList().add(request);
                        }
                    }
                    break;
                }

            }
            //populatePharmacyJTable();

        }
        else{
            JOptionPane.showMessageDialog(null,"Please Assign this order to yourself for processing !");
        }
    }//GEN-LAST:event_approveOrderJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveOrderJButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel tableTypeJLabel;
    private javax.swing.JButton trackOrderJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
