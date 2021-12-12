/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAdmin;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.InsuranceAdmin.InsurancePlan;
import Business.InsuranceAdmin.InsurancePlanDirectory;
import Business.InsuranceAdmin.InsuranceeAdmin;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mudit Mathur
 */

public class AddInsurancePlanJPanel extends javax.swing.JPanel {
    
     /**
     * Creates new form AddInsurancePlanJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    InsuranceeAdmin ic;
    
    
public AddInsurancePlanJPanel(JPanel userProcessContainer,UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount= userAccount;
        this.system=system;
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yrsTxtField = new javax.swing.JTextField();
        monthlTxtField = new javax.swing.JTextField();
        totalTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Plan Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 96, -1, -1));

        jLabel3.setText("Total years of duration:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 136, 160, -1));

        jLabel4.setText("Monthly premium amount:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 176, -1, 20));

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 86, 170, -1));

        jLabel5.setText("Total premium amount:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 216, -1, -1));

        yrsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrsTxtFieldActionPerformed(evt);
            }
        });
        add(yrsTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 126, 170, -1));

        monthlTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlTxtFieldActionPerformed(evt);
            }
        });
        add(monthlTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 166, 170, -1));

        totalTxtField.setEditable(false);
        totalTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtFieldActionPerformed(evt);
            }
        });
        add(totalTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 206, 170, -1));

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD PLAN");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 266, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ADD INSURANCE PLAN");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 26, 260, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 150, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2021-12-12 at 3.10.30 PM.jpeg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 510));

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void yrsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yrsTxtFieldActionPerformed

    private void monthlTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlTxtFieldActionPerformed

    private void totalTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (nameTxtField.getText().isEmpty() || yrsTxtField.getText().isEmpty() || monthlTxtField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all details of the Insurance Plan");
            return;
        } else {
            if (!nameTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper Insurance Plan name");
                nameTxtField.setText("");
                return;
            } else if (!yrsTxtField.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Enter proper Years duration in integers");
                yrsTxtField.setText("");
                return;
            }    else if (!monthlTxtField.getText().matches("^-?\\d+(\\.\\d+)?$")) {
                JOptionPane.showMessageDialog(this, "Enter monthly premium rate like 14.3");
                monthlTxtField.setText("");
                return;
            }
            double totalAmount = Double.parseDouble(monthlTxtField.getText()) * Integer.parseInt(yrsTxtField.getText());
            totalTxtField.setText(String.valueOf(totalAmount));
            InsurancePlan i = new InsurancePlan(nameTxtField.getText(),Integer.parseInt(yrsTxtField.getText()),Double.parseDouble(monthlTxtField.getText()),Double.parseDouble(totalTxtField.getText()));
            ic = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getInsuranceAdminDirectory().findInsuranceAdmin(userAccount.getEmployee().getName());
            if(ic.getInsurancePlanDirectory()==null ||ic ==null){

                InsurancePlanDirectory pd = new InsurancePlanDirectory();
                ArrayList<InsurancePlan> am  = new ArrayList<>();
                am.add(i);
                pd.setIpDirectory(am);
                ic.setInsurancePlanDirectory(pd);
                JOptionPane.showMessageDialog(null, "Added insurance plan");

            }else{
                InsurancePlanDirectory pd = ic.getInsurancePlanDirectory();
                ArrayList<InsurancePlan> am  = ic.getInsurancePlanDirectory().getIpDirectory();
                am.add(i);
                pd.setIpDirectory(am);
                ic.setInsurancePlanDirectory(pd);
                JOptionPane.showMessageDialog(null, "Added insurance plan");
            }

            //               this.userAccount.getRole();

        }
        // JOptionPane.showMessageDialog(null, "Insurance plan added successfully");
        nameTxtField.setText("");
        yrsTxtField.setText("");
        monthlTxtField.setText("");
        totalTxtField.setText("");
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField monthlTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField totalTxtField;
    private javax.swing.JTextField yrsTxtField;
    // End of variables declaration//GEN-END:variables
}
