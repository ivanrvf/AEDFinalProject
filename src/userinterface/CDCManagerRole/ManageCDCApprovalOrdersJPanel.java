/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDCManagerRole;

import Business.Enterprise.CDCEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.StateNetwork;
import Business.OrderQueue.OrderRequest;
import Business.Organization.CdcOrganization;
import Business.Organization.Organization;
import Business.Transport.TransportDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Doctor.TrackMyOrdersJPanel;

/**
 *
 * @author Varun
 */
public class ManageCDCApprovalOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCDCApprovalOrdersJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    CdcOrganization organization;
    StateNetwork network;
    CDCEnterprise enterprise;
    public ManageCDCApprovalOrdersJPanel(JPanel userProcessContainer, UserAccount account, CdcOrganization organization, CDCEnterprise enterprise,StateNetwork network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.populateEnterpriseJTable();
        myOrdersJButton.setVisible(true);
        assignJButton.setVisible(true);
        refreshJButton.setVisible(true);
        approveOrderJButton.setVisible(true);
        autoApproveOrderJButton.setVisible(false);
        trackOrderJButton.setVisible(true);
        enterpriseOrdersJButton.setVisible(false);
        
    }

    private void populateEnterpriseJTable(){
    
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        tableTypeJLabel.setText("You are currently viewing all CDC Enterprise orders");
        model.setRowCount(0);
        if(enterprise.getOrderQueue()!= null){
        for(OrderRequest request : enterprise.getOrderQueue().getOrderRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getQuantity();
            row[2] = request.getSender();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            
            model.addRow(row);
        }
        }
    
    }
    
    private void populateCDCJTable(){
    
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        tableTypeJLabel.setText("You are currently viewing orders processed by you");
        model.setRowCount(0);
        if(userAccount.getOrderQueue()!= null){
        for(OrderRequest request : userAccount.getOrderQueue().getOrderRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getQuantity();
            row[2] = request.getSender();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            
            model.addRow(row);
        }
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        approveOrderJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        trackOrderJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        autoApproveOrderJButton = new javax.swing.JButton();
        myOrdersJButton = new javax.swing.JButton();
        enterpriseOrdersJButton = new javax.swing.JButton();
        tableTypeJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 630, 96));

        assignJButton.setBackground(new java.awt.Color(153, 153, 153));
        assignJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        approveOrderJButton.setBackground(new java.awt.Color(153, 153, 153));
        approveOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        approveOrderJButton.setText("Approve");
        approveOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveOrderJButtonActionPerformed(evt);
            }
        });
        add(approveOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 160, -1));

        refreshJButton.setBackground(new java.awt.Color(153, 153, 153));
        refreshJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Order Approvals");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 660, 41));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/click-go-back-button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 100, -1));

        trackOrderJButton.setBackground(new java.awt.Color(153, 153, 153));
        trackOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        trackOrderJButton.setText("Track Order");
        trackOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackOrderJButtonActionPerformed(evt);
            }
        });
        add(trackOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));

        autoApproveOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        autoApproveOrderJButton.setText("Auto Approve");
        autoApproveOrderJButton.setEnabled(false);
        autoApproveOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoApproveOrderJButtonActionPerformed(evt);
            }
        });
        add(autoApproveOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 220, -1));

        myOrdersJButton.setBackground(new java.awt.Color(153, 153, 153));
        myOrdersJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myOrdersJButton.setText("My processed Orders");
        myOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myOrdersJButtonActionPerformed(evt);
            }
        });
        add(myOrdersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        enterpriseOrdersJButton.setBackground(new java.awt.Color(153, 153, 153));
        enterpriseOrdersJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseOrdersJButton.setText("Enterprise Orders");
        enterpriseOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseOrdersJButtonActionPerformed(evt);
            }
        });
        add(enterpriseOrdersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        tableTypeJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableTypeJLabel.setText("<Display the table content here>");
        add(tableTypeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 630, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        
        OrderRequest request = (OrderRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if((request.getStatus().equals("Order Placed"))||(request.getStatus().equals("Assigned to a CDC organization"))){
            request.setReceiver(userAccount);
            
            request.setStatus("Assigned to a CDC organization");
            
//            OrderRequest lastRequest = request.getLastOrderRequest();
//            System.out.println("manage");
//            lastRequest.setReceiver(userAccount);
//            lastRequest.setStatus("Assigned to a CDC organization");


            OrderRequest lastRequest = request.getLastOrderRequest();

            lastRequest.setReceiver(userAccount);
            lastRequest.setStatus("Assigned to a CDC organization");
        }
        else{
            JOptionPane.showMessageDialog(null,"This order has not been forwarded to you !");
        }
        
        populateEnterpriseJTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void approveOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveOrderJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        

        OrderRequest request = (OrderRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if( (request.getReceiver()!=null) && (request.getReceiver().equals(userAccount)) ){
            
//            OrderRequest lastRequest = request.getLastOrderRequest();
//            
//            //lastRequest.createAndGetNewOrderRequest().setSender(userAccount);
//            //lastRequest.createAndGetNewOrderRequest().setStatus("Processed by CDC, Forwarded to Pharmacy");
//            OrderRequest nextRequest = new OrderRequest();
//        
//            nextRequest.setSender(userAccount);
//            nextRequest.setStatus("Processed by CDC, Forwarded to Pharmacy");
//            lastRequest.assignOrderRequest(nextRequest);


            OrderRequest lastRequest = request.getLastOrderRequest();
            
            lastRequest.createAndGetNewOrderRequest().setSender(userAccount);
            lastRequest.createAndGetNewOrderRequest().setStatus("Processed by CDC, Forwarded to Pharmacy");
            
        request.setStatus("Processed by CDC, Forwarded to Pharmacy");
        request.setReceiver(null);
        
        for(Enterprise enterpris: network.getEnterpriseDirectory().getEnterpriseList()){
            if (enterpris instanceof PharmacyEnterprise){
            
            enterpris.getOrderQueue().getOrderRequestList().add(request);
                try {
                    Organization org = TransportDirectory.calculateShortestDistance(enterpris.getOrganizationDirectory(),request);
                } catch (Exception ex) {
                    Logger.getLogger(ManageCDCApprovalOrdersJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            userAccount.getOrderQueue().getOrderRequestList().add(request);
        }
        }
        
    }   
        else{
         JOptionPane.showMessageDialog(null,"Please Assign this order to yourself for processing !");
        }
        
        populateCDCJTable();
    }//GEN-LAST:event_approveOrderJButtonActionPerformed

    
    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateEnterpriseJTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

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

    private void autoApproveOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoApproveOrderJButtonActionPerformed
        // TODO add your handling code here:
        
        for(OrderRequest request: enterprise.getOrderQueue().getOrderRequestList()){
        String status = request.getStatus();
        if(status.equals("Order Placed")){
             request.setReceiver(userAccount);
            request.setStatus("Pending CDC Approval");
            
            OrderRequest lastRequest = request.getLastOrderRequest();
            
            lastRequest.setReceiver(userAccount);
            lastRequest.setStatus("Pending CDC Approval");
            //lastRequest.createAndGetNewOrderRequest().setSender(userAccount);
            //lastRequest.createAndGetNewOrderRequest().setStatus("Processed by CDC, Forwarded to Pharmacy");
            
            request.setStatus("Processed by CDC, Forwarded to Pharmacy");
        
            for(Enterprise enterpris: network.getEnterpriseDirectory().getEnterpriseList()){
            if (enterpris instanceof PharmacyEnterprise){
            enterpris.getOrderQueue().getOrderRequestList().add(request);
            userAccount.getOrderQueue().getOrderRequestList().add(request);
            }
        }
            
            
        }
        
        
        
        }
        
        
        
    }//GEN-LAST:event_autoApproveOrderJButtonActionPerformed

    private void myOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myOrdersJButtonActionPerformed
        // TODO add your handling code here:
        populateCDCJTable();
        myOrdersJButton.setVisible(false);
        assignJButton.setVisible(false);
        refreshJButton.setVisible(false);
        approveOrderJButton.setVisible(false);
        autoApproveOrderJButton.setVisible(false);
        trackOrderJButton.setVisible(true);
        enterpriseOrdersJButton.setVisible(true);
        
    }//GEN-LAST:event_myOrdersJButtonActionPerformed

    private void enterpriseOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseOrdersJButtonActionPerformed
        // TODO add your handling code here:
        populateEnterpriseJTable();
        
        myOrdersJButton.setVisible(true);
        assignJButton.setVisible(true);
        refreshJButton.setVisible(true);
        approveOrderJButton.setVisible(true);
        autoApproveOrderJButton.setVisible(false);
        trackOrderJButton.setVisible(true);
        enterpriseOrdersJButton.setVisible(false);
        
        
    }//GEN-LAST:event_enterpriseOrdersJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveOrderJButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton autoApproveOrderJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton enterpriseOrdersJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton myOrdersJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel tableTypeJLabel;
    private javax.swing.JButton trackOrderJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
