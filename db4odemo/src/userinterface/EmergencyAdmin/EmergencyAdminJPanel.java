/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EmergencyAdmin;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mudit Mathur
 */
public class EmergencyAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyAdminJPanel
     */
        
    
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem system;
    
    
    public EmergencyAdminJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua=ua;
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

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 244, 226));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(24, 31, 46));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("COMPLETE HELP");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VIEW HISTORY");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EMERGENCY ADMIN");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/p4.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ViewEmergencyRequestsJPanel viewRequest = new ViewEmergencyRequestsJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("ViewEmergencyRequest", viewRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        EmergencyHistoryJPanel emergencyHistoryJPanel = new EmergencyHistoryJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("ViewEmergencyHistory", emergencyHistoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
