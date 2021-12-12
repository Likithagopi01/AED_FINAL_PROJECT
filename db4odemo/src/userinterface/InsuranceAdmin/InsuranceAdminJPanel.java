/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceAdmin;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author Mudit Mathur
 */
public class InsuranceAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAdminJPanel
     */
   JPanel userProcessContainer;
    EcoSystem system;
    UserAccount user;
    public InsuranceAdminJPanel(JPanel userProcessContainer,EcoSystem system,UserAccount user) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.user = user;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJButton.setBackground(new java.awt.Color(24, 31, 46));
        userJButton.setForeground(new java.awt.Color(255, 255, 255));
        userJButton.setText("Manage Insurance Plan");
        userJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 210, -1));

        manageEmployeeJButton.setBackground(new java.awt.Color(24, 31, 46));
        manageEmployeeJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageEmployeeJButton.setText("Add new Insurance");
        manageEmployeeJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 210, -1));

        manageOrganizationJButton.setBackground(new java.awt.Color(24, 31, 46));
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Manage Insurace Orders");
        manageOrganizationJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Insurance Admin");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 260, 30));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 77, 410, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2021-12-12 at 14.12.20.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -10, 780, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ViewUpdateDeleteIPlansJPanel viewUpdateDeleteIPlansJPanel = new ViewUpdateDeleteIPlansJPanel(userProcessContainer, user, system);
        userProcessContainer.add("viewUpdateDeleteIPlans", viewUpdateDeleteIPlansJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        AddInsurancePlanJPanel addInsurancePlanJPanel = new AddInsurancePlanJPanel(userProcessContainer, user, system);
        userProcessContainer.add("AddInusrance", addInsurancePlanJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageInsuranceOrdersJPanel manageInsurancePlan = new ManageInsuranceOrdersJPanel(userProcessContainer, user, system);
        userProcessContainer.add("manageinsurance", manageInsurancePlan);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
