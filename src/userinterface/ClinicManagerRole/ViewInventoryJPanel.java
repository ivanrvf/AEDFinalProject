/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClinicManagerRole;

import Business.InventoryCatalog.InventoryCatalog;
import Business.InventoryCatalog.InventoryItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Varun
 */
public class ViewInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewInventoryJPanel
     */
    JPanel userProcessContainer;
    InventoryCatalog inventoryCatalog;
    public ViewInventoryJPanel(JPanel userProcessContainer, InventoryCatalog inventoryCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.inventoryCatalog = inventoryCatalog;
        populateTable();
    }
    
    public void populateTable(){
    
    DefaultTableModel model = (DefaultTableModel) clinicInventoryJTable.getModel();
        
        model.setRowCount(0);
        int i =0;
        for (InventoryItem inventoryItem: inventoryCatalog.getInventoryList()){
            Object[] row = new Object[3];
            row[0] = ++i;
            row[1] = inventoryItem.getVaccine().getName();
            row[2] = inventoryItem.getQuantity();
                       
            model.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clinicInventoryJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Inventory");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 580, 41));

        clinicInventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No", "Vaccine Name", "Quantity Available"
            }
        ));
        jScrollPane1.setViewportView(clinicInventoryJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 600, 196));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/click-go-back-button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 100, 40));

        refreshTestJButton.setBackground(new java.awt.Color(153, 153, 153));
        refreshTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        refreshTestJButton.setText("Refresh Table");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/together-logo.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable clinicInventoryJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    // End of variables declaration//GEN-END:variables
}
