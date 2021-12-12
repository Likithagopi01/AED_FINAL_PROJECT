/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.EmergencyAdmin.Emergency;
import Business.Enterprise;
import Business.HospitalAdmin.Hospital;
import Business.Organization;
import Business.Patient.Patient;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.EmergencyWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import com.toedter.calendar.DateUtil;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Mudit Mathur
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAreaJPanel
     */
    
    
     private JPanel userProcessContainer;

    private UserAccount user;
    private EcoSystem system;
    private String hospitalName;
     private String docname;
     private String timings;
    private Hospital resObj;
    ArrayList<Patient> array1;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
 public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount user,EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        array1 = new ArrayList<>();
        jPanel1.setVisible(false);
        //valueLabel.setText(enterprise.getName());
        populateComboBox();
    }

     public void populateRequestTable(){
        
    }

    public void populateComboBox(){
         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Hospital")){
            restList.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
    public void populateComboBox1(String hospname){
         for(Organization org: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getOrganizationList()){
             if(org.getEnterpriseType1().getValue().equals("Doctor")){
            restList1.addItem(org.getName());
             }
        }
        
          
            
    }
    public void populateComboBox2(String docs){
        System.out.println(hospitalName+docs +" asasas");
       
         for(String timings: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).getTimings()){
            restList2.addItem(timings);
         
        }
         


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        restList = new javax.swing.JComboBox<>();
        restList1 = new javax.swing.JComboBox<>();
        restList2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorDetails1 = new javax.swing.JTable();
        InsuranceJButton = new javax.swing.JButton();
        OrderBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Patient Dashboard");

        restList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restListActionPerformed(evt);
            }
        });

        restList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restList1ActionPerformed(evt);
            }
        });

        restList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restList2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(24, 31, 46));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit Appointment");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setBackground(new java.awt.Color(24, 31, 46));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Check prescription");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        doctorDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "medicine 1", "medicine 2", "medicine 3", "comments"
            }
        ));
        doctorDetails1.setPreferredSize(new java.awt.Dimension(375, 100));
        jScrollPane2.setViewportView(doctorDetails1);

        jPanel1.add(jScrollPane2);

        InsuranceJButton.setBackground(new java.awt.Color(24, 31, 46));
        InsuranceJButton.setForeground(new java.awt.Color(255, 255, 255));
        InsuranceJButton.setText("Insurance");
        InsuranceJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        InsuranceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceJButtonActionPerformed(evt);
            }
        });

        OrderBtn.setBackground(new java.awt.Color(24, 31, 46));
        OrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        OrderBtn.setText("Order Medicine");
        OrderBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        OrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBtnActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(24, 31, 46));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book Test ");
        jButton4.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(24, 31, 46));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SOS");
        jButton5.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Time");

        jLabel2.setText("Select Hospital");

        jLabel3.setText("Select Doctor");

        jLabel4.setText("DATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(restList, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(restList1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(restList2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InsuranceJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(294, 294, 294)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel3)
                            .addGap(36, 36, 36)
                            .addComponent(jLabel4)
                            .addGap(36, 36, 36)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(restList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(restList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78)
                            .addComponent(restList2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(OrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(InsuranceJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void restListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restListActionPerformed
        restList1.removeAllItems();
        restList2.removeAllItems();
        hospitalName = String.valueOf(restList.getSelectedItem());
        populateComboBox1(hospitalName);
    }//GEN-LAST:event_restListActionPerformed

    private void restList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restList1ActionPerformed
        // TODO add your handling code here:
        restList2.removeAllItems();
        docname = String.valueOf(restList1.getSelectedItem());
        System.out.println(docname +" asasas");
        populateComboBox2(docname);

    }//GEN-LAST:event_restList1ActionPerformed

    private void restList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restList2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_restList2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        timings = String.valueOf(restList2.getSelectedItem());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        Date d = jDateChooser2.getDate();
        BookAppointment appointment = new BookAppointment();
        appointment.setSender(user);
        System.out.println("ajcjac       "+system.getUserAccountDirectory().findUserAccount(docname));
        appointment.setReceiver( system.getUserAccountDirectory().findUserAccount(docname));
        appointment.setStatus("Appointment Booked");
        appointment.setMessage(jTextArea1.getText());

        appointment.setRequestDate(d);
        system.getWorkQueue().addWorkRequest(appointment);
        system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).updateTimings(timings);
        JOptionPane.showMessageDialog(this, "Appointment fixed");
        dB4OUtil.storeSystem(system);
        //          System.out.println("timings " + timings);
        //        if(system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).getDoctorPatientList()==null){
            //        Patient pa =new Patient();
            //        ArrayList<Patient> paa = new ArrayList<>();
            //        pa.setName(user.getEmployee().getName());
            //        pa.setSymtoms(jTextArea1.getText());
            //        system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).updateTimings(timings);
            //        paa.add(pa);
            //        system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).updateTimings(timings);
            //        system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).setDoctorPatientList(paa);
            //        }else{
            //            Patient pa =new Patient();
            //        pa.setName(user.getEmployee().getName());
            //        pa.setSymtoms(jTextArea1.getText());
            //            System.out.println(system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).getTimings());
            //        system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).updateTimings(timings);
            //
            //         system.getHospitalDirectory().findHospital(hospitalName).getDoctorDirectory().findDoctor(docname).addPatientsToDoctor(pa);
            //        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) doctorDetails1.getModel();
        dtm.setRowCount(0);

        for(WorkRequest wq : system.getWorkQueue().findWorkRequestByRec(user)) {
            if(wq instanceof BookAppointment){
                if(wq.getSender().getEmployee().getName().equals(user.getEmployee().getName())){
                    System.out.println("comm" + ((BookAppointment) wq).getComments());
                    Object row[] = new Object[5];
                    row[0] = wq.getSender().getEmployee().getName();
                    row[1] = ((BookAppointment) wq).getMeds().getMedicines().get(0);
                    row[2] = ((BookAppointment) wq).getMeds().getMedicines().get(1);
                    row[3] = ((BookAppointment) wq).getMeds().getMedicines().get(2);
                    row[4]=((BookAppointment) wq).getComments();
                    dtm.addRow(row);
                }}}

                //System.out.println("Res len "+ system.getDoctorDirectory().getDoctorList());
                //        System.out.println("hooooo" + hospitalName);
                //         for(int i = 0;i< system.getHospitalDirectory().getHospitalList().size();i++){
                    //              for(int j = 0;j< system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().size();j++){
                        //                   for(int k = 0;k< system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getDoctorPatientList().size();k++){
                            //                       System.out.println(system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getDoctorPatientList().get(k).getName());
                            //                       System.out.println(user.getEmployee().getName());
                            //             if(user.getEmployee().getName().equals(system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getDoctorPatientList().get(k).getName())){
                                //                 System.out.println("true1 true1 true1");
                                //
                                //
                                //                array1.add(system.getHospitalDirectory().getHospitalList().get(i).getDoctorDirectory().getDoctorList().get(j).getDoctorPatientList().get(k));
                                //             }else{
                                //                 System.out.println("nothing");
                                //
                                //             }}}
                    //         }
                //        for(Patient pa :array1) {
                    //
                    //            if(pa.getName().equals(user.getEmployee().getName())){
                        //                 Object row[] = new Object[5];
                        //            row[0] = pa;
                        //            row[1] = pa.getMedicine().getMedicines().get(0);
                        //             row[2] = pa.getMedicine().getMedicines().get(1);
                        //              row[3] = pa.getMedicine().getMedicines().get(2);
                        //               row[4] = pa.getComments();
                        //            dtm.addRow(row);
                        //            }
                    //
                    //        }
                jPanel1.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void InsuranceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceJButtonActionPerformed
        // TODO add your handling code here:
        if(this.user.getEmployee().isHasInsurance()){

            ViewCurrentPlans viewCurrentPlans = new ViewCurrentPlans(userProcessContainer, user, system);
            userProcessContainer.add("viewCurentPlans", viewCurrentPlans);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
        else {
            ViewInsurancePlans viewInsurance = new ViewInsurancePlans(userProcessContainer, user, system);
            userProcessContainer.add("viewInsurance", viewInsurance);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_InsuranceJButtonActionPerformed

    private void OrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBtnActionPerformed
        // TODO add your handling code here:
        orderMedJpanel orderJPanel = new orderMedJpanel(userProcessContainer, user, system, user.getEmployee().getName());
        userProcessContainer.add("CreateSupport", orderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_OrderBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        BookTestJPanel bookTest = new BookTestJPanel(userProcessContainer, user, system);
        userProcessContainer.add("BookTest", bookTest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Random random_method = new Random();

        ArrayList<Enterprise> e = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList();

        int index = 0;
        UserAccount name3 = null;
        for (Enterprise res:e)
        {
            System.out.println("sss1" + e);
            System.out.println("sss1" + res.getEnterpriseType().getValue());
            if(res.getEnterpriseType().getValue().equals("Emergency")){
                System.out.println("sss" + res.getName());
                ArrayList<Enterprise> array1 =new ArrayList<>();
                array1.add(res);
                index = random_method.nextInt(array1.size());
                name3 = system.getUserAccountDirectory().findUserAccount(array1.get(index).getName());

            }

        }
        EmergencyWorkRequest emergencyWorkRequest = new EmergencyWorkRequest();

        emergencyWorkRequest.setSender(this.user);

        //            System.out.println("getting sender uname "+name3.getEmployee().getName());
        emergencyWorkRequest.setReceiver(name3);

        System.out.println("asasqqqq555 " + emergencyWorkRequest.getReceiver());
        emergencyWorkRequest.setStatus("emergency assistance needed");

        system.getWorkQueue().addWorkRequest(emergencyWorkRequest);
        System.out.println("wooook" + system.getWorkQueue().getWorkRequestList());
        JOptionPane.showMessageDialog(this, "Help is on the way!");
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsuranceJButton;
    private javax.swing.JButton OrderBtn;
    private javax.swing.JTable doctorDetails1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> restList;
    private javax.swing.JComboBox<String> restList1;
    private javax.swing.JComboBox<String> restList2;
    // End of variables declaration//GEN-END:variables
}
