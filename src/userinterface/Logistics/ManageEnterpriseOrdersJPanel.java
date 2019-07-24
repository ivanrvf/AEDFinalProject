/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Logistics;

import Business.Enterprise.Enterprise;
import Business.Enterprise.StateHealthDeptEnterprise;
import Business.Enterprise.TravelAgencyEnterprise;
import Business.Network.StateNetwork;
import Business.OrderQueue.OrderQueue;
import Business.OrderQueue.OrderRequest;
import Business.Organization.LogisticsOrganization;
import Business.Transport.Ambulance;
import Business.Transport.Drone;
import Business.Transport.ModeOfTransport;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Doctor.TrackMyOrdersJPanel;

/**
 *
 * @author Varun
 */
public class ManageEnterpriseOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCDCApprovalOrdersJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    LogisticsOrganization organization;
    StateNetwork network;
    TravelAgencyEnterprise enterprise;
    OrderQueue orderQueue;
    public ManageEnterpriseOrdersJPanel(JPanel userProcessContainer, UserAccount account, LogisticsOrganization organization, TravelAgencyEnterprise enterprise, OrderQueue orderQueue) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.orderQueue = orderQueue;
        
         populateEnterpriseJTable();
         populateTransportTypeComboBox();

        myOrdersJButton.setVisible(true);
        assignJButton.setVisible(true);
        refreshJButton.setVisible(true);
        approveOrderJButton.setVisible(true);
        autoApproveOrderJButton.setVisible(false);
        trackOrderJButton.setVisible(true);
        enterpriseOrdersJButton.setVisible(false);
        
//        this.populateJTable();
    }
    private void populateTransportTypeComboBox(){
    transportTypeJComboBox.removeAllItems();
        for (ModeOfTransport.Type type : ModeOfTransport.Type.values()){
            transportTypeJComboBox.addItem(type);
        }
    
    }
    
    private void populateEnterpriseJTable(){
    
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        tableTypeJLabel.setText("You are currently viewing all Travel Agency Enterprise orders");
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
    
    private void populateLogisticsOrganizationJTable(){ 
    
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
    

/*    private void populateJTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        model.setRowCount(0);
        if(enterprise.getOrderQueue()!= null){
            for(PackageDeliveryRequest request : this.orderQueue.getPackageDeliveryRequest()){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getModeOfTransport().getName();
                row[2] = request.getInventoryItem();
                row[3] = request.getEda();
                row[4] = request.getStatus();
                model.addRow(row);
            }
        }
    }*/
    
    
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
        enterpriseOrdersJButton = new javax.swing.JButton();
        tableTypeJLabel = new javax.swing.JLabel();
        myOrdersJButton = new javax.swing.JButton();
        transportTypeJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 660, 110));

        assignJButton.setBackground(new java.awt.Color(153, 153, 153));
        assignJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        approveOrderJButton.setBackground(new java.awt.Color(153, 153, 153));
        approveOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        approveOrderJButton.setText("Approve");
        approveOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveOrderJButtonActionPerformed(evt);
            }
        });
        add(approveOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 160, -1));

        refreshJButton.setBackground(new java.awt.Color(153, 153, 153));
        refreshJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, -1));

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
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 110, 50));

        trackOrderJButton.setBackground(new java.awt.Color(153, 153, 153));
        trackOrderJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        trackOrderJButton.setText("Track Order");
        trackOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackOrderJButtonActionPerformed(evt);
            }
        });
        add(trackOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

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
        add(autoApproveOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 220, -1));

        enterpriseOrdersJButton.setBackground(new java.awt.Color(153, 153, 153));
        enterpriseOrdersJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseOrdersJButton.setText("Enterprise Orders");
        enterpriseOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseOrdersJButtonActionPerformed(evt);
            }
        });
        add(enterpriseOrdersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        tableTypeJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tableTypeJLabel.setText("<Display the table content here>");
        add(tableTypeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 630, 30));

        myOrdersJButton.setBackground(new java.awt.Color(153, 153, 153));
        myOrdersJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        myOrdersJButton.setText("My processed Orders");
        myOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myOrdersJButtonActionPerformed(evt);
            }
        });
        add(myOrdersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        transportTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        transportTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportTypeJComboBoxActionPerformed(evt);
            }
        });
        add(transportTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 230, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Select the mode of transport:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        OrderRequest request = (OrderRequest)workRequestJTable.getValueAt(selectedRow, 0);
        String status = request.getStatus();
        if(status.equals("Processed by Pharmacy, Forwarded to Travel Agency")||status.equals("Assigned to a Logistics organization")){
            request.setReceiver(userAccount);
            request.setStatus("Assigned to a Logistics organization");

            OrderRequest lastRequest = request.getLastOrderRequest();

            lastRequest.setReceiver(userAccount);
            lastRequest.setStatus("Assigned to a Logistics organization");
        }
        else{
            JOptionPane.showMessageDialog(null,"This order has not been forwarded to you !");
        }

        populateEnterpriseJTable();
        
        
        
        
        //populateJTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void approveOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveOrderJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        

        OrderRequest request = (OrderRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if( (request.getReceiver()!=null) && (request.getReceiver().equals(userAccount)) ){
            
            
            
            
            
            //OrderRequest nextRequest = new OrderRequest();
            boolean available = false;
            if(transportTypeJComboBox.getSelectedItem().equals(ModeOfTransport.Type.Drone)){
            
            for(ModeOfTransport mode: organization.getTransportDirectory().getTransportList()){
            if(mode instanceof Drone && mode.getStatus().equals("Available")){
            request.setModeOfTransport(mode);
            request.setDist(organization.getTransportDirectory().distance(
                    request.getSourceCoordinates().getLatitude(),
                    request.getSourceCoordinates().getLongitude(),
                    request.getDestinationCoordinates().getLatitude(),
                    request.getDestinationCoordinates().getLongitude(),'M'));
            mode.setStatus("Busy");
            available = true;
            break;
            }
            
            
            }
            
            }
            else {for(ModeOfTransport mode: organization.getTransportDirectory().getTransportList()){
            if(mode instanceof Ambulance && mode.getStatus().equals("Available")){
            request.setModeOfTransport(mode);
            mode.setStatus("Busy");
            available = true;
            break;
            
            }
            }
            }
            if (available==false){
                JOptionPane.showMessageDialog(null,"No available transport vehicles !");
                return;}
//            nextRequest.setSender(userAccount);
//            nextRequest.setStatus("Processed by Logistics, Out for Delivery");
//            lastRequest.assignOrderRequest(nextRequest);
//            
            OrderRequest lastRequest = request.getLastOrderRequest();
            
            lastRequest.createAndGetNewOrderRequest().setSender(userAccount);
            lastRequest.createAndGetNewOrderRequest().setReceiver(request.getSender());
            lastRequest.createAndGetNewOrderRequest().setStatus("Processed by Logistics, Out for Delivery");
            
            
            request.setStatus("Processed by Logistics, Out for Delivery");
            request.setReceiver(null);
        
        
            userAccount.getOrderQueue().getOrderRequestList().add(request);
        
    }   
        else{
         JOptionPane.showMessageDialog(null,"Please Assign this order to yourself for processing !");
        }
        
        populateEnterpriseJTable();
       // populateJTable();
    }//GEN-LAST:event_approveOrderJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        //populateJTable();
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
        userProcessContainer.add("TrackMyOrdersJPanel", trackOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_trackOrderJButtonActionPerformed

    private void autoApproveOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoApproveOrderJButtonActionPerformed
        // TODO add your handling code here:
        
        for(OrderRequest request: enterprise.getOrderQueue().getOrderRequestList()){
        String status = request.getStatus();
        if(status.equals("Order Placed")){
             request.setReceiver(userAccount);
            request.setStatus("Pending Logistics Approval");
            
            OrderRequest lastRequest = request.getLastOrderRequest();
            
            lastRequest.setReceiver(userAccount);
            lastRequest.setStatus("Pending Logistics Approval");
            
            
            //lastRequest.createAndGetNewOrderRequest().setSender(userAccount);
            //lastRequest.createAndGetNewOrderRequest().setStatus("Processed by Travel Agency, Out for delivery !");
            
            
            request.setStatus("Processed by Travel Agency, Out for delivery !");
        
            for(Enterprise enterpris: network.getEnterpriseDirectory().getEnterpriseList()){
            if (enterpris instanceof StateHealthDeptEnterprise){
            enterpris.getOrderQueue().getOrderRequestList().add(request);
            userAccount.getOrderQueue().getOrderRequestList().add(request);
            }
        }
            
            
        }
        
        
        
        }
        
        
        
    }//GEN-LAST:event_autoApproveOrderJButtonActionPerformed

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

    private void myOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myOrdersJButtonActionPerformed
        // TODO add your handling code here:
        populateLogisticsOrganizationJTable();
        myOrdersJButton.setVisible(false);
        assignJButton.setVisible(false);
        refreshJButton.setVisible(false);
        approveOrderJButton.setVisible(false);
        autoApproveOrderJButton.setVisible(false);
        trackOrderJButton.setVisible(true);
        enterpriseOrdersJButton.setVisible(true);
    }//GEN-LAST:event_myOrdersJButtonActionPerformed

    private void transportTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportTypeJComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_transportTypeJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveOrderJButton;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton autoApproveOrderJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton enterpriseOrdersJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton myOrdersJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel tableTypeJLabel;
    private javax.swing.JButton trackOrderJButton;
    private javax.swing.JComboBox transportTypeJComboBox;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
