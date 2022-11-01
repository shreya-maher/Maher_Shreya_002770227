/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmgmt_assignment2;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

/**
 *
 * @author maher
 */
public class DoctorCreate extends javax.swing.JFrame {

    /**
     * Creates new form PatientCreate
     */
    public DoctorCreate() {
        initComponents();
        
        Color c = new Color(102,102,102);
        getContentPane().setBackground(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientID = new javax.swing.JTextField();
        PatientPassword = new javax.swing.JTextField();
        PatientName = new javax.swing.JTextField();
        PatientAge = new javax.swing.JTextField();
        PatientHouse = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DocComm = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Doctor ID");

        jLabel2.setText("Doctor Password");

        jLabel3.setText("Doctor Name");

        jLabel4.setText("Doctor Age");

        jLabel5.setText("Doctor Specialisation");

        jLabel6.setText("Doctor Community");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        DocComm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Back Bay", "Needham", "East Village", "West Village" }));

        jLabel7.setText("Create Doctor Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton2)
                .addGap(397, 397, 397)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 373, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatientHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton1)))
                .addGap(371, 371, 371))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DocComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addComponent(jButton1)
                .addGap(160, 160, 160))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String match = "";
        String match1 = "";
        
        
        String hosp =  "1";    
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection docConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            String DocSql = ("select doctorid from hospitals where doctorid = '"+PatientID.getText()+"' ");
            PreparedStatement DocPreparedStatement = docConnection.prepareStatement(DocSql);            
            ResultSet commResultSet = DocPreparedStatement.executeQuery();
            while(commResultSet.next())
            {
            hosp = commResultSet.getString("doctorid");
            }
  
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
        
        if(hosp != "1" || PatientID.getText().equals(""))  {
        JOptionPane.showMessageDialog(null,"Doctor ID exists in system or is blank, try another ID");
        PatientID.requestFocus();
        return;
        }
        
        
        
        
        else if(PatientPassword.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"Password Required");
        PatientPassword.requestFocus();
        return;
        }
        
        
        else if(PatientName.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"Doctor Name Required");
        PatientName.requestFocus();
        return;
        }
        
        else if(Pattern.matches("[a-zA-Z ]+", PatientName.getText())){
        match = "1";        
        }
        
        else if(match.equals("")){
        JOptionPane.showMessageDialog(null,"Doctor Name Only In Alphabets");
        PatientName.requestFocus();
        return;
        }
        
        if(PatientAge.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"Doctor Age Required");
        PatientAge.requestFocus();
        return;
        }
        
        if(Pattern.matches("[0-9]{1,3}+", PatientAge.getText())){
        match1 = "1";        
        }      
        
        if(match1.equals("")){
        JOptionPane.showMessageDialog(null,"Make sure to enter only digits and also not more than 3 digits, not accessible to Immortals.");
        PatientAge.requestFocus();
        return;
        }
        
        if(PatientHouse.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"Doctor Specialisation Required");
        PatientHouse.requestFocus();
        return;
        }
        
       
        
         try{   
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection HospitalAdminConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement HospitalAdminStatement = (Statement) HospitalAdminConnection.createStatement();
            
            String HospitalAdminSql = "Insert into doctor values (?,?)";
            PreparedStatement HospitalAdminApp = HospitalAdminConnection.prepareStatement(HospitalAdminSql);
            
            HospitalAdminApp.setString(1, PatientPassword.getText());
            HospitalAdminApp.setString(2, PatientID.getText());           
            HospitalAdminApp.executeUpdate();
            
            
            String PatientSql = "Insert into hospitals values (?,?,?,?,?,?,?)";
            PreparedStatement Patient = HospitalAdminConnection.prepareStatement(PatientSql);
            
            String city = "";
            if(DocComm.getSelectedItem().toString().equals("Back Bay") || DocComm.getSelectedItem().toString().equals("Needham")){
            city = "Boston";
            }
            
            if(DocComm.getSelectedItem().toString().equals("East Village") || DocComm.getSelectedItem().toString().equals("West Village")){
            city = "New York";
            }
            
            Patient.setString(1, city);
            Patient.setString(2, DocComm.getSelectedItem().toString());
            Patient.setString(3, null);
            Patient.setString(4, PatientName.getText());
            Patient.setString(5, PatientHouse.getText());
            Patient.setString(6, PatientID.getText());
            Patient.setString(7, null);
            Patient.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Doctor Profile Created Succesfully");
            HospitalAdminConnection.close();

            
        }    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
   
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new DoctorLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorCreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DocComm;
    private javax.swing.JTextField PatientAge;
    private javax.swing.JTextField PatientHouse;
    private javax.swing.JTextField PatientID;
    private javax.swing.JTextField PatientName;
    private javax.swing.JTextField PatientPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
