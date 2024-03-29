/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Pharmacy;

import Business.DiseaseCatalog.DiseaseCatalog;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.InventoryCatalog.InventoryItem;
import Business.Network.StateNetwork;
import Business.OrderQueue.OrderRequest;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.VaccineCatalog.Vaccine;
import Business.VaccineCatalog.VaccineCatalog;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivanr
 */
public class InventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    VaccineCatalog vaccineCatalog;
    DiseaseCatalog diseaseCatalog;
    List<SupplierEnterprise> supplierEnterpriseList;
    PharmacyOrganization pharmacyOrganization;
    StateNetwork stateNetwork;
    public InventoryJPanel(JPanel userProcessContainer, UserAccount userAccount, VaccineCatalog vaccineCatalog, DiseaseCatalog diseaseCatalog,StateNetwork stateNetwork, List<SupplierEnterprise> supplierEnterpriseList, PharmacyOrganization pharmacyOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.vaccineCatalog = vaccineCatalog;
        this.diseaseCatalog = diseaseCatalog;
        this.supplierEnterpriseList = supplierEnterpriseList;
        this.pharmacyOrganization = pharmacyOrganization;
        this.stateNetwork = stateNetwork;
        this.popTable();
        this.popComboBoxVaccine();
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
        inventoryJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        vaccineRequestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        qtyJSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        vaccineJCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));

        inventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No", "Vaccine Name", "Quantity Available"
            }
        ));
        jScrollPane1.setViewportView(inventoryJTable);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/click-go-back-button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        vaccineRequestJButton.setBackground(new java.awt.Color(153, 153, 153));
        vaccineRequestJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        vaccineRequestJButton.setText("Raise Request");
        vaccineRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccineRequestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quantity:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Vaccine:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Pharmacy Inventory");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vaccineJCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qtyJSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(vaccineRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(vaccineJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(qtyJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(vaccineRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addComponent(backJButton)
                        .addContainerGap())
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void popComboBoxVaccine(){
        if(vaccineCatalog != null){
            for(Vaccine vaccine: vaccineCatalog.getVaccineList()){
                vaccineJCombo.addItem(vaccine);
            }
        }
    }
    public void popTable(){
        DefaultTableModel model = (DefaultTableModel)inventoryJTable.getModel();
        model.setRowCount(0);
        if(pharmacyOrganization.getInventoryCatalog()!= null){
            for(InventoryItem inventoryItem : pharmacyOrganization.getInventoryCatalog().getInventoryList()){
                Object[] row = new Object[3];
                row[0] = inventoryItem.getItemId();
                row[1] = inventoryItem;
                row[2] = inventoryItem.getQuantity();
                model.addRow(row);
            }
        }
    }
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void vaccineRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccineRequestJButtonActionPerformed
        DistributorEnterprise receiverEnterprise = null;
        if(qtyJSpinner.getValue().toString().matches("[A-Za-z]+")){
            JOptionPane.showMessageDialog(null, "Please enter valid quantity.");
            return;
        }
        int qty = (int)qtyJSpinner.getValue();
        Vaccine vaccine = (Vaccine) vaccineJCombo.getSelectedItem();
        if(qty <= 0){
            JOptionPane.showMessageDialog(null, "Please enter valid quantity.");
            return;
        }
        if(this.stateNetwork.getEnterpriseDirectory().getDistributorEnterprise() != null && this.stateNetwork.getEnterpriseDirectory().getDistributorEnterprise().size() > 0){
            receiverEnterprise = this.stateNetwork.getEnterpriseDirectory().getDistributorEnterprise().get(0);
        }
        if(receiverEnterprise != null){
            OrderRequest orderRequest = receiverEnterprise.getOrderQueue().addOrderRequest();
            orderRequest.setQuantity(qty);
            orderRequest.setVaccine(vaccine);
            orderRequest.setSender(userAccount);
            OrderRequest log = orderRequest.createAndGetNewOrderRequest();
            log.setSender(userAccount);
            log.setStatus("Request sent to distributor");
            OrderRequest userOrderRequest = userAccount.getOrderQueue().addOrderRequest();
            userOrderRequest.setQuantity(qty);
            userOrderRequest.setVaccine(vaccine);
            userOrderRequest.setSender(userAccount);
            userOrderRequest.setStatus("Request sent to distributor!");
            orderRequest.setStatus("Request sent to distributor!");
            JOptionPane.showMessageDialog(null, "Request message sent");
        }
        else{
            JOptionPane.showMessageDialog(null, "Distributor not available");
        }
    }//GEN-LAST:event_vaccineRequestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable inventoryJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner qtyJSpinner;
    private javax.swing.JComboBox vaccineJCombo;
    private javax.swing.JButton vaccineRequestJButton;
    // End of variables declaration//GEN-END:variables
}
