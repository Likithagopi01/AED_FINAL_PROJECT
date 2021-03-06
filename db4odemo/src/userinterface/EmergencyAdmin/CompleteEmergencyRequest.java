/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EmergencyAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mudit Mathur
 */
public class CompleteEmergencyRequest extends javax.swing.JPanel {

    /**
     * Creates new form CompleteEmergencyRequestJPanel
     */
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public CompleteEmergencyRequest(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua=ua;
        this.system=system;
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {

            if (request.getReceiver().equals(this.ua)) {
                pNameTxtField.setText(request.getSender().getEmployee().getName());
                pAgeTxtField.setText(request.getStatus());
//                pPhoneTxtField.setText(emergencyWorkRequest.getP().getPhoneNumber());
//                pAddrTxtField.setText(emergencyWorkRequest.getP().getAddress());
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

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pNameTxtField = new javax.swing.JTextField();
        pAgeTxtField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 246, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel5.setText("Patient Status:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));
        add(pNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 170, -1));
        add(pAgeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 170, -1));

        jButton2.setBackground(new java.awt.Color(24, 31, 46));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("MARK AS COMPLETE");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jButton3.setBackground(new java.awt.Color(24, 31, 46));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MARK AS INCOMPLETE");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("COMPLETE EMERGENCY REQUEST");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 320, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/p4.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 850, 480));

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {

            if (request.getReceiver().equals(this.ua)) {
                request.setStatus("Help completed");
            }
                }
             dB4OUtil.storeSystem(system);
             JOptionPane.showMessageDialog(this, "Help completed");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                        
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {

            if (request.getReceiver().equals(this.ua)) {
                request.setStatus("Help awaited!");
            }
                }
                         dB4OUtil.storeSystem(system);
                          JOptionPane.showMessageDialog(this, "Help Awaited.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pAgeTxtField;
    private javax.swing.JTextField pNameTxtField;
    // End of variables declaration//GEN-END:variables
}
