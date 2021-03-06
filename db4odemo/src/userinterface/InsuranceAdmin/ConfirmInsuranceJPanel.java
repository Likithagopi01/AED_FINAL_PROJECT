/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAdmin;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BuyInsuranceWorkRequest;
import java.awt.CardLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mudit Mathur
 */
public class ConfirmInsuranceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConfirmInsuranceJPanel
     */
    
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    BuyInsuranceWorkRequest buyInsurance;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ConfirmInsuranceJPanel(JPanel userProcessContainer,UserAccount userAccount, EcoSystem system, BuyInsuranceWorkRequest buyInsurance) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount= userAccount;
        this.system=system;
        this.buyInsurance = buyInsurance;
        pnameTxtField.setText(buyInsurance.getSender().getEmployee().getName());
        planNameTxtField.setText(buyInsurance.getPlan().getName());
        yrsTxtField.setText(String.valueOf(buyInsurance.getPlan().getTotalYears()));
        monthTxtField.setText(String.valueOf(buyInsurance.getPlan().getMonthlyPremium()));
        totalTxtField.setText(String.valueOf(buyInsurance.getPlan().getTotalPremium()));
        purchaseDateTxtField.setText(String.valueOf(buyInsurance.getRequestDate()));
        Calendar c = Calendar.getInstance();
        c.setTime(buyInsurance.getRequestDate());
        c.add(Calendar.YEAR, buyInsurance.getPlan().getTotalYears());
        Date validity = c.getTime();
        validityTxtField.setText(String.valueOf(validity));
        statusTxtField.setText(buyInsurance.getStatus());
        
        
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
        pnameTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        planNameTxtField = new javax.swing.JTextField();
        yrsTxtField = new javax.swing.JTextField();
        monthTxtField = new javax.swing.JTextField();
        totalTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        purchaseDateTxtField = new javax.swing.JTextField();
        validityTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        statusTxtField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 121, -1, -1));
        add(pnameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 160, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Plan Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 161, -1, -1));

        planNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planNameTxtFieldActionPerformed(evt);
            }
        });
        add(planNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 160, -1));

        yrsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrsTxtFieldActionPerformed(evt);
            }
        });
        add(yrsTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 160, -1));
        add(monthTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 160, -1));
        add(totalTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 160, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Total Years duration:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 191, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Monthly Premium Amount:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 221, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Total Premium Amount:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 261, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Purchased on:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 301, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Validity");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 351, -1, -1));
        add(purchaseDateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 160, -1));
        add(validityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 160, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Status:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 391, -1, -1));
        add(statusTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 160, -1));

        jButton2.setBackground(new java.awt.Color(24, 31, 46));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Confirm Purchase");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        jButton3.setBackground(new java.awt.Color(24, 31, 46));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Decline purchase");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 100, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("CONFIRM INSURANCE");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 260, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2021-12-12 at 3.10.30 PM.jpeg"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 310, 540));

        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void planNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planNameTxtFieldActionPerformed

    private void yrsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yrsTxtFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(this, " Purchase confirmed");
        buyInsurance.setStatus("Purchase confirmed");
        buyInsurance.getSender().getEmployee().setHasInsurance(true);
        statusTxtField.setText(buyInsurance.getStatus());
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, " Purchase declined! If money deducted refund will be initiated");
        buyInsurance.setStatus("Purchase declined : refund initiated");
        buyInsurance.getSender().getEmployee().setHasInsurance(false);
        statusTxtField.setText(buyInsurance.getStatus());
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField monthTxtField;
    private javax.swing.JTextField planNameTxtField;
    private javax.swing.JTextField pnameTxtField;
    private javax.swing.JTextField purchaseDateTxtField;
    private javax.swing.JTextField statusTxtField;
    private javax.swing.JTextField totalTxtField;
    private javax.swing.JTextField validityTxtField;
    private javax.swing.JTextField yrsTxtField;
    // End of variables declaration//GEN-END:variables
}
