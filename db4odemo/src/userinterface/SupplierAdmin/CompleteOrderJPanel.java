/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import userinterface.Labadmin.*;
import Business.EcoSystem;
import Business.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderInventoryWorkRequest;
import Business.WorkQueue.PlaceNewOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ash
 */


public class CompleteOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GenerateTestReport
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem system;
    OrderInventoryWorkRequest request;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    String selectedPharmacy;
    
    
public CompleteOrderJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system, OrderInventoryWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount= userAccount;
        this.system=system;
        this.request= request;
        patientNameTxtField.setText(request.getInventoryList().toString());
        DateBookedTxtField.setText(String.valueOf(request.getRequestDate()));
        populatetable();
        populateComboBox();
           
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
        patientNameTxtField = new javax.swing.JTextField();
        DateBookedTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InventoryTable = new javax.swing.JTable();
        acceptOrder = new javax.swing.JButton();
        declineOrder = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        delManCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Items:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 75, -1));

        patientNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameTxtFieldActionPerformed(evt);
            }
        });
        add(patientNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 150, -1));
        add(DateBookedTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 150, -1));

        jLabel5.setText("Date Ordered");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 90, -1));

        InventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Items", "Date ordered", "status"
            }
        ));
        jScrollPane1.setViewportView(InventoryTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 410, 111));

        acceptOrder.setBackground(new java.awt.Color(24, 31, 46));
        acceptOrder.setForeground(new java.awt.Color(255, 255, 255));
        acceptOrder.setText("Accept");
        acceptOrder.setPreferredSize(new java.awt.Dimension(156, 43));
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });
        add(acceptOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        declineOrder.setBackground(new java.awt.Color(24, 31, 46));
        declineOrder.setForeground(new java.awt.Color(255, 255, 255));
        declineOrder.setText("Decline");
        declineOrder.setPreferredSize(new java.awt.Dimension(156, 43));
        declineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineOrderActionPerformed(evt);
            }
        });
        add(declineOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabel8.setText("Assign DeliveryMan:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        delManCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        delManCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delManComboActionPerformed(evt);
            }
        });
        add(delManCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 180, -1));

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Assign");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Complete Order");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 260, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 80, 410, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void patientNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameTxtFieldActionPerformed

    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = InventoryTable.getSelectedRow();
//        System.out.println("Status "+InventoryTable.getValueAt(selectedRow, 3));
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        } else {
            if (InventoryTable.getValueAt(selectedRow, 3).equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Order is already completed!");
            } else {
                WorkRequest request = (WorkRequest) InventoryTable.getValueAt(selectedRow, 0);
                request.setStatus("Accepted");
                populatetable();
            }

        }
        
          dB4OUtil.storeSystem(system); 

    }//GEN-LAST:event_acceptOrderActionPerformed

    private void declineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = InventoryTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        }

        WorkRequest request = (WorkRequest) InventoryTable.getValueAt(selectedRow, 0);
        if (InventoryTable.getValueAt(selectedRow, 1).equals("Completed")) {
            JOptionPane.showMessageDialog(null, "Order is already processed and completed!");
        } else {

            request.setStatus("Declined");
            populatetable();
        }
        
         dB4OUtil.storeSystem(system); 
         
         
    }//GEN-LAST:event_declineOrderActionPerformed

    private void delManComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delManComboActionPerformed
        // TODO add your handling code here:
        selectedPharmacy = String.valueOf(delManCombo.getSelectedItem());
    }//GEN-LAST:event_delManComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        PlaceNewOrderWorkRequest p = new PlaceNewOrderWorkRequest();
        System.out.println("Selected del++"+selectedPharmacy+"++");
        System.out.println("Testing "+system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy).getOrganizationDirectory().getDeliveryManDirectory().getDeliveryList().get(0).getDeliveryManName());
        System.out.println("Testing111 "+system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy).getOrganizationDirectory().getDeliveryManDirectory().getDeliveryList().size());
        int selectedValue = delManCombo.getSelectedIndex();
        if (selectedValue >= 0) {
            DeliveryMan deliveryMan = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy).getOrganizationDirectory().getDeliveryManDirectory().findDeliveryMan(selectedPharmacy);
           
            p.setDeliveryMan(system.getUserAccountDirectory().findUserAccount(deliveryMan.getDeliveryManName()));
            p.setStatus("Assigned");
                        request.setDeliveryMan(system.getUserAccountDirectory().findUserAccount(deliveryMan.getDeliveryManName()));
            request.setStatus("Assigned");
            System.out.println("assignment");
            System.out.println(request.getDeliveryMan().getUsername());
            JOptionPane.showMessageDialog(null, "Delivery man has been assigned");

        }
        populatetable();
        dB4OUtil.storeSystem(system); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateBookedTxtField;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JButton acceptOrder;
    private javax.swing.JButton declineOrder;
    private javax.swing.JComboBox<String> delManCombo;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientNameTxtField;
    // End of variables declaration//GEN-END:variables
   
    
    
    private void populatetable(){
        DefaultTableModel dtm = (DefaultTableModel) InventoryTable.getModel();
        dtm.setRowCount(0);

                Object row[] = new Object[4];
                row[0] = request;
                row[1] = request.getInventoryList().toString();
                row[2] = request.getRequestDate();
                row[3] = request.getStatus();

                dtm.addRow(row);
                        
    }
    
    
    public void populateComboBox(){
         for(Enterprise res: system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Delivery")){
            delManCombo.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
    
}

