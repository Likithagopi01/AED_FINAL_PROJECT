/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import userinterface.HospitalAdminRole.AddPatientJPanel;
import Business.EcoSystem;
import Business.Enterprise;
import Business.Network;

import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount user;
       Network network;
        Enterprise enterprise;
        Organization organization;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem system,UserAccount user) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.user = user;
        
        populateTree();
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        
    }
    
    public void populateTree(){
       // DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
      DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

    

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnManageNetwork1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        manPhar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1825, 1000));
        jPanel2.setLayout(null);

        jLabel1.setText("Selected Node:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 31, 73, 14);

        lblSelectedNode.setText("<View_selected_node>");
        jPanel2.add(lblSelectedNode);
        lblSelectedNode.setBounds(168, 31, 114, 14);

        btnManageNetwork.setBackground(new java.awt.Color(24, 31, 46));
        btnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnManageNetwork.setText("Add Hospital");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageNetwork);
        btnManageNetwork.setBounds(100, 160, 156, 43);

        btnManageAdmin.setBackground(new java.awt.Color(24, 31, 46));
        btnManageAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAdmin.setText("Add Deliveryman");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageAdmin);
        btnManageAdmin.setBounds(100, 290, 156, 43);

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Labs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(100, 230, 156, 43);

        jButton2.setBackground(new java.awt.Color(24, 31, 46));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Manage Labs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(100, 350, 156, 43);

        btnManageNetwork1.setBackground(new java.awt.Color(24, 31, 46));
        btnManageNetwork1.setForeground(new java.awt.Color(255, 255, 255));
        btnManageNetwork1.setText("Add Pharmacy");
        btnManageNetwork1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageNetwork1);
        btnManageNetwork1.setBounds(350, 160, 156, 43);

        jButton3.setBackground(new java.awt.Color(24, 31, 46));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add Insurance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(610, 160, 156, 43);

        jButton4.setBackground(new java.awt.Color(24, 31, 46));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Add Emergency");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(350, 230, 156, 43);

        jButton5.setBackground(new java.awt.Color(24, 31, 46));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add Supplier");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(610, 230, 156, 43);

        jButton6.setBackground(new java.awt.Color(24, 31, 46));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Manage Insurance");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(610, 290, 156, 43);

        jButton7.setBackground(new java.awt.Color(24, 31, 46));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Manage Emergency");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(350, 350, 156, 43);

        jButton8.setBackground(new java.awt.Color(24, 31, 46));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Manage Supplier");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(610, 350, 156, 43);

        manPhar.setBackground(new java.awt.Color(24, 31, 46));
        manPhar.setForeground(new java.awt.Color(255, 255, 255));
        manPhar.setText("Manage Pharmacy");
        manPhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manPharActionPerformed(evt);
            }
        });
        jPanel2.add(manPhar);
        manPhar.setBounds(350, 290, 160, 43);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("ADMIN DASHBOARD");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(280, 70, 380, 40);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(-20, 140, 0, 0);

        jButton9.setBackground(new java.awt.Color(24, 31, 46));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Chart Enterprises ");
        jButton9.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(100, 410, 156, 43);

        jButton10.setBackground(new java.awt.Color(24, 31, 46));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Chart Organizations");
        jButton10.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(610, 410, 156, 43);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(20, 490, 380, 310);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(410, 460, 430, 340);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        populateData1();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        populateData();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void manPharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manPharActionPerformed
        // TODO add your handling code here:
        UpdateDeletePharmacy updatePharJPanel = new UpdateDeletePharmacy(userProcessContainer, system, user);
        userProcessContainer.add("CreateHospital", updatePharJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manPharActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        UpdateDeleteSupplier AddHospitalJPanel = new UpdateDeleteSupplier(userProcessContainer, system, user);
        userProcessContainer.add("CreateHospital", AddHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        UpdateDeleteEmergencyUnit AddHospitalJPanel = new UpdateDeleteEmergencyUnit(userProcessContainer, system, user);
        userProcessContainer.add("CreateHospital", AddHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        UpdateDeleteInsuranceCompany AddHospitalJPanel = new UpdateDeleteInsuranceCompany(userProcessContainer, system, user);
        userProcessContainer.add("CreateHospital", AddHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        AddSupplierJPanel AddHospitalJPanel = new AddSupplierJPanel(userProcessContainer, system);
        userProcessContainer.add("CreateHospital", AddHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AddEmergencyUnitJPanel AddHospitalJPanel = new AddEmergencyUnitJPanel(userProcessContainer, system);
        userProcessContainer.add("CreateHospital", AddHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AddInsuranceCompanyJPanel AddHospitalJPanel = new AddInsuranceCompanyJPanel(userProcessContainer, system);
        userProcessContainer.add("CreateHospital", AddHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnManageNetwork1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork1ActionPerformed
        // TODO add your handling code here:
        AddPharmacy addPharmacyJPanel = new AddPharmacy(userProcessContainer, system);
        userProcessContainer.add("Add Pharmacy", addPharmacyJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetwork1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        UpdateDeleteLab updateDeleteJPanel = new UpdateDeleteLab(userProcessContainer, system, user);
        userProcessContainer.add("UpdateDeleteLab", updateDeleteJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddLabJPanel AddHospitalJPanel = new AddLabJPanel(userProcessContainer, system);
        userProcessContainer.add("CreateLab", AddHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        AddDelivery AddDeliveryJPanel = new AddDelivery(userProcessContainer, system);
        userProcessContainer.add("CreateHospital", AddDeliveryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        AddHospital AddHospitalJPanel = new AddHospital(userProcessContainer, system);
        userProcessContainer.add("CreateHospital", AddHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed


    
         public void populateData() {
         
        
        DefaultPieDataset dataSet = new DefaultPieDataset();
        int Hospital = 0;
        int Pharmacy = 0;
        int Lab = 0;
        int Delivery = 0;
        int Insurance = 0;
        int Emergency = 0;
        int Supplier = 0;
        
        
        try {

            for(Network network:system.getNetworkList()){
            System.out.println("nett"+network);
            for(Enterprise org : network.getEnterpriseDirectory().getEnterpriseList()){
                   System.out.println("nett"+network.getEnterpriseDirectory().getEnterpriseList());
               

                     if (org.getEnterpriseType().getValue().equals("Hospital")) {
                          System.out.println("nett111"+org);
                    Hospital++;
                } else if (org.getEnterpriseType().getValue().equals("Pharmacy")) {
                    Pharmacy++;
                } else if (org.getEnterpriseType().getValue().equals("Lab")) {
                  Lab++;
                } else if (org.getEnterpriseType().getValue().equals("Delivery")) {
                    Delivery++;
                } else if (org.getEnterpriseType().getValue().equals("Insurance")) {
                   Insurance++;
                } else if (org.getEnterpriseType().getValue().equals("Emergency")){
                    Emergency++;
                } else if (org.getEnterpriseType().getValue().equals("Supplier")) {
                     Supplier++;
                } 
                }
            
        }
            System.out.println("asss"+Hospital);
            dataSet.setValue("Hospitals", Hospital);
            dataSet.setValue("Pharmacy", Pharmacy);
            dataSet.setValue("Lab", Lab);
            dataSet.setValue("Delivery", Delivery);
            dataSet.setValue("Insurance", Insurance);
            dataSet.setValue("Emergency", Emergency);
            dataSet.setValue("Supplier", Supplier);

            JFreeChart chart = ChartFactory.createPieChart3D("Enterprises", dataSet, true, true, Locale.ENGLISH);
            chart.setBackgroundPaint(Color.WHITE);
            chart.getTitle().setPaint(Color.DARK_GRAY);
            ChartPanel chartpanel = new ChartPanel(chart);
            chartpanel.setDomainZoomable(true);

            jPanel4.setLayout(new BorderLayout());
            jPanel4.add(chartpanel, BorderLayout.EAST);
            jPanel4.setVisible(true);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, " No Data to display");
            return;
        }

    }
      public void populateData1() {
         
        
        DefaultPieDataset dataSet = new DefaultPieDataset();
        int Doctor = 0;
        int Patient = 0;
        int DeliveryMan = 0;
        int InsuranceAdmin = 0;
        int PharamacyAdmin = 0;
        int LabAdmin = 0;
        int SupplierAdmin = 0;
        int EmergencyAdmin=0;
        
        
        try {
         
       for(Network network:system.getNetworkList()){
            System.out.println("nett"+network);
            for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
                   System.out.println("nett"+network.getEnterpriseDirectory().getEnterpriseList());
               
                   for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org.getEnterpriseType1().getValue().equals("Doctor")) {
                   Doctor++;
                } else if (org.getEnterpriseType1().getValue().equals("Patient")) {
                    Patient++;
                } else if (org.getEnterpriseType1().getValue().equals("DeliveryMan")) {
                 DeliveryMan++;
                } else if (org.getEnterpriseType1().getValue().equals("InsuranceAdmin")) {
                   InsuranceAdmin++;
                } else if (org.getEnterpriseType1().getValue().equals("PharamacyAdmin")) {
                   PharamacyAdmin++;
                } else if (org.getEnterpriseType1().getValue().equals("LabAdmin")){
                    LabAdmin++;
                } else if (org.getEnterpriseType1().getValue().equals("SupplierAdmin")) {
                   SupplierAdmin++;
                } else if (org.getEnterpriseType1().getValue().equals("EmergencyAdmin")) {
                 EmergencyAdmin++;
                }
                
            
        }
       
            }
       
       }

            dataSet.setValue("Doctor Organization", Doctor);
            dataSet.setValue("Patient Organization", Patient);
            dataSet.setValue("Delivery Organization", DeliveryMan);
            dataSet.setValue("Insurance Organization", InsuranceAdmin);
            dataSet.setValue("Pharamacy Organization", PharamacyAdmin);
            dataSet.setValue("Lab Organization", LabAdmin);
            dataSet.setValue("Emergency Organization", EmergencyAdmin);
            dataSet.setValue("Supplier Organization", SupplierAdmin);

            JFreeChart chart = ChartFactory.createPieChart3D("Organizations", dataSet, true, true, Locale.ENGLISH);
            chart.setBackgroundPaint(Color.WHITE);
            chart.getTitle().setPaint(Color.DARK_GRAY);
            ChartPanel chartpanel = new ChartPanel(chart);
            chartpanel.setDomainZoomable(true);

            jPanel3.setLayout(new BorderLayout());
            jPanel3.add(chartpanel, BorderLayout.EAST);
            jPanel3.setVisible(true);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(null, " No Data to display");
            return;
        }

    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnManageNetwork1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JButton manPhar;
    // End of variables declaration//GEN-END:variables
}
