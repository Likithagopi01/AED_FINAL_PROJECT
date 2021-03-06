/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Labadmin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.LabAdmin.Lab;
import Business.LabAdmin.Test;
import Business.LabAdmin.TestDirectory;
import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Ash
 */
public class AddTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddTestJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Lab lab;
    public AddTestJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
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
        nameTxtField = new javax.swing.JTextField();
        priceTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        sampleTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lowerRangeTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        apparatusTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        upperRangeTxtField = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Price: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 150, -1));
        add(priceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, -1));

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Test");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Sample Required:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        add(sampleTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Lower Range:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        add(lowerRangeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Apparatus:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        add(apparatusTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Upper Range:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        upperRangeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperRangeTxtFieldActionPerformed(evt);
            }
        });
        add(upperRangeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ADD TEST");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/P12.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 990, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        if (nameTxtField.getText().isEmpty() || priceTxtField.getText().isEmpty() || sampleTxtField.getText().isEmpty()||lowerRangeTxtField.getText().isEmpty()||upperRangeTxtField.getText().isEmpty()||apparatusTxtField.getText().isEmpty()||priceTxtField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all details of the Test");
            return;
        } else {
            if (!nameTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper Test name");
                nameTxtField.setText("");
                return;
            } else if (!sampleTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper sample required");
                priceTxtField.setText("");
                return;
            }    else if (!lowerRangeTxtField.getText().matches("^-?\\d+(\\.\\d+)?$")) {
                JOptionPane.showMessageDialog(this, "Enter lower range like 4.3");
                lowerRangeTxtField.setText("");
                return;
            } else if (!upperRangeTxtField.getText().matches("^-?\\d+(\\.\\d+)?$")) {
                JOptionPane.showMessageDialog(this, "Enter upper range like 7.3");
                upperRangeTxtField.setText("");
                return;
            } else if (Double.parseDouble(upperRangeTxtField.getText())-Double.parseDouble(lowerRangeTxtField.getText())<0) {
                JOptionPane.showMessageDialog(this, "Upper range cannot be lesser than lower range value");
                upperRangeTxtField.setText("");
                return;
            }else if (!apparatusTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper apparatus required");
                apparatusTxtField.setText("");
                return;
            }else if (!priceTxtField.getText().matches("^-?\\d+(\\.\\d+)?$")) {
                JOptionPane.showMessageDialog(this, "Enter price like :23.5");
                priceTxtField.setText("");
                return;
            }else{}

            Test t = new Test(nameTxtField.getText(),sampleTxtField.getText(),Double.parseDouble(lowerRangeTxtField.getText()),Double.parseDouble(upperRangeTxtField.getText()),apparatusTxtField.getText(), Double.parseDouble(priceTxtField.getText()));
            if( system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName()).getTestlist()==null ||
                system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(t.getName()) == null ) {
                TestDirectory testList = new TestDirectory();
                testList.addTest(t);
                system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName()).setTestlist(testList);
            }
            else {
                system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName()).getTestlist().addTest(t);
                System.out.println("test list is here "+system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getLabDirectory().findLab(userAccount.getEmployee().getName()).getTestlist().getTestList());
            }

        }
        JOptionPane.showMessageDialog(null, "Test added successfully");
        nameTxtField.setText("");
        priceTxtField.setText("");
        sampleTxtField.setText("");
        lowerRangeTxtField.setText("");
        upperRangeTxtField.setText("");
        apparatusTxtField.setText("");
        priceTxtField.setText("");
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void upperRangeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperRangeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperRangeTxtFieldActionPerformed

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
    private javax.swing.JTextField apparatusTxtField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lowerRangeTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JTextField sampleTxtField;
    private javax.swing.JTextField upperRangeTxtField;
    // End of variables declaration//GEN-END:variables
}
