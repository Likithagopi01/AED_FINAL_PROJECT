/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharamacyAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise;
import Business.Organization;
import Business.Patient.Patient;
import Business.Pharmacist.PharamacyAdmin;
import Business.PharmacyCatalog.PharmacyCatalog;
import Business.PharmacyCatalog.PharmacyCatalogDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyOrder;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ash
 */
public class addMedicineJpanel extends javax.swing.JPanel {

    /**
     * Creates new form addMedicineJpanel
     */
    private JPanel userProcessContainer;
    private UserAccount user;
    private EcoSystem system;
      private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private String pharmName;
    ArrayList<Patient> array1;
    List<PharmacyOrder> orderItemList = new ArrayList<PharmacyOrder>();
    WorkRequest workrequest;
    PharmacyCatalog catalog;
    Patient pat;
    PharamacyAdmin pharm;
    String pharname;
    
    
    public addMedicineJpanel(JPanel userProcessContainer,EcoSystem system,String pharname,UserAccount user) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.pharname = pharname;
        this.user = user;
        System.out.println("user"+pharname);
        viewTable();
        //this.pharm = pharm;
    }
    
    public void viewTable(){
        DefaultTableModel dtm = (DefaultTableModel) addMedTbl.getModel();
        dtm.setRowCount(0);
        
        
        // Restaurant ro1 = system.getRestaurantDirectory().findRestaurant(resName);
        PharamacyAdmin phar = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharname);
            System.out.println("Username"+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharname));
            if(phar.getPharDir()!=null){
            for(PharmacyCatalog m : phar.getPharDir().getCatalog()  ) {
               System.out.println(system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getPharmacyAdminDirectory().getPharmacyList().size());
                Object row[] = new Object[3];
                row[0] = m.getItemName();
                row[1] = m.getItemPrice();

                dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        addMedTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        medNameTxt = new javax.swing.JTextField();
        medPriceTxt = new javax.swing.JTextField();
        addMedBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addMedTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine", "Price"
            }
        ));
        jScrollPane1.setViewportView(addMedTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 408, 103));

        jLabel1.setText("Medicine Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jLabel2.setText("Medicine Price:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        medNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNameTxtActionPerformed(evt);
            }
        });
        add(medNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 170, -1));
        add(medPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 170, -1));

        addMedBtn.setBackground(new java.awt.Color(24, 31, 46));
        addMedBtn.setForeground(new java.awt.Color(255, 255, 255));
        addMedBtn.setText("Add");
        addMedBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        addMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedBtnActionPerformed(evt);
            }
        });
        add(addMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 120, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 90, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Add Medicine");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 260, 30));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 410, 380));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2021-12-12 at 3.10.31 PM.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 870, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void medNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medNameTxtActionPerformed

    private void addMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedBtnActionPerformed
        // TODO add your handling code here:
 if (medNameTxt.getText().isEmpty() || medPriceTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {
            if (!medNameTxt.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper medicine name");
                medNameTxt.setText("");
                return;
            }
            else if(!medPriceTxt.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(this, "Medice price should be in integers");
                medPriceTxt.setText("");
                return;
            }

//            else if (strongUsername() == false) {
//                dUname.setText("");
//                JOptionPane.showMessageDialog(null, "Username should be in the format of aa_aa@aa.aa");
//                return;
//            } 
//            else if (strongPassword() == false) {
//                dPass.setText("");
//                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
//                return;
//            } 
            else {
            }
        String menuIt = medNameTxt.getText();
        Double ip = Double.valueOf(medPriceTxt.getText());
        PharmacyCatalog m = new PharmacyCatalog();
//        System.out.println("Test "+user.getEmployee().getCity());
//        System.out.println(pharname);
//       System.out.println(system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()));     
//       //System.out.println();
//       System.out.println(system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(pharname).getOrganizationDirectory().getPharmacyAdminDirectory().getPharmacyList());
//       System.out.println("trying "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise("phar").getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy("phar"));
        PharamacyAdmin pha = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharname);
        
        m.setItemName(menuIt);
        m.setItemPrice(ip);
//                System.out.println("Directory +++++"+pha.getPharDir());
            
            if( pha.getPharDir()!= null){
            //PharmacyDirectory d = new PharmacyCatalogDirectory();
            PharmacyCatalogDirectory pd = pha.getPharDir();
            ArrayList<PharmacyCatalog> am  = pha.getPharDir().getCatalog();
            am.add(m);
            pd.setCatalog(am);
            pha.setPharDir(pd);
//            system.getPharmacyDirectory().setCatalog(am);
//            System.out.println(system);
//            system.setPharmacyDirectory(system.getPharmacyDirectory());
//            System.out.println(m.getItemName());
        }
            else{
            PharmacyCatalogDirectory d = new PharmacyCatalogDirectory();
            ArrayList<PharmacyCatalog> am  = new ArrayList<>();
            am.add(m);
            d.setCatalog(am);
            pha.setPharDir(d);
//            System.out.println(system);
//            system.setPharmacyDirectory(d);
//            System.out.println(m.getItemName());
            }
            viewTable();
            }
            JOptionPane.showMessageDialog(null, "Medicine Added");
             dB4OUtil.storeSystem(system);  
             medNameTxt.setText("");
             medPriceTxt.setText("");
    
 
    }//GEN-LAST:event_addMedBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedBtn;
    private javax.swing.JTable addMedTbl;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medNameTxt;
    private javax.swing.JTextField medPriceTxt;
    // End of variables declaration//GEN-END:variables
}
