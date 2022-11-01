/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmgmt_assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maher
 */
public class SystemAdminPatient extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminPatient
     */
    public SystemAdminPatient() {
        initComponents();
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
        SystemPatient = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PatientText = new javax.swing.JTextField();
        NameText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        HouseText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CommunityText = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        SystemPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "House", "Community", "Diagnosed At", "Blood Pressure", "Body Temperature", "Pulse Rate", "Diagnoses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SystemPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SystemPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SystemPatient);

        jLabel4.setText("Patient ID");

        jLabel5.setText("Name");

        jLabel6.setText("Age");

        jLabel7.setText("House");

        jLabel8.setText("Community");

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jLabel1.setText("Manage Patients");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(177, 177, 177)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(HouseText, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(AgeText)
                                    .addComponent(NameText)
                                    .addComponent(PatientText)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(Edit)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Delete)
                                    .addComponent(CommunityText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addComponent(jLabel1)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PatientText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(HouseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CommunityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(Delete))
                .addContainerGap(272, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
         try{                                       
            Class.forName("com.mysql.jdbc.Driver");
            Connection ViewPatientConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement ViewPatientStatement = (Statement) ViewPatientConnection.createStatement();
            String ViewPatientSql = ("Select * from patientrecords ");
            
            PreparedStatement ViewPatientPS = ViewPatientConnection.prepareStatement(ViewPatientSql);
            ResultSet ViewPatientResult = ViewPatientPS.executeQuery();
            DefaultTableModel PatientTableModel = (DefaultTableModel)SystemPatient.getModel();
            PatientTableModel.setRowCount(0);
            while(ViewPatientResult.next()){
            Object patient[]=   { ViewPatientResult.getString("patientid"), 
                ViewPatientResult.getString("name"),
                ViewPatientResult.getString("age"),
                ViewPatientResult.getString("house"),
                ViewPatientResult.getString("community"),
                ViewPatientResult.getString("hospital_encounter"),
                ViewPatientResult.getString("blood_pressure"),
                ViewPatientResult.getString("body_temperature"),
                ViewPatientResult.getString("pulse_rate"),
                ViewPatientResult.getString("previous_diagnoses")
                }    ;
            
            PatientTableModel.addRow(patient);
        }                       
                
                
        
        }catch(Exception e)   {                                       
        JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel PatientTableModel = (DefaultTableModel)SystemPatient.getModel();
         int selectedRowIndex = SystemPatient.getSelectedRow();
         String Pat1 = (String)PatientTableModel.getValueAt(selectedRowIndex, 0);
        
        try{   
            
            Class.forName("com.mysql.jdbc.Driver");            
            Connection PatientEditConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            
            String PatientEditSql = ("UPDATE patientrecords SET patientid = '"+PatientText.getText()+"' , name = '"+NameText.getText()+"', age = '"+AgeText.getText()+"', house = '"+HouseText.getText()+"',"
            + "community = '"+CommunityText.getText()+"' "
                    + "where patientid = '"+Pat1+"' ");
            PreparedStatement PatientEditPreparedStatement = PatientEditConnection.prepareStatement(PatientEditSql);
            PatientEditPreparedStatement.execute();
           
           
             JOptionPane.showMessageDialog(null,"Patient Data Updated succesfully");
             PatientText.setText("");
             NameText.setText("");
             AgeText.setText("");
             HouseText.setText("");
             CommunityText.setText("");
             
                     
                         
             PatientEditConnection.close();

            
        }    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
   
    }
        
    }//GEN-LAST:event_EditActionPerformed

    private void SystemPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SystemPatientMouseClicked
        // TODO add your handling code here:
        
          DefaultTableModel PatientTableModel = (DefaultTableModel)SystemPatient.getModel();
            int selectedRowIndex = SystemPatient.getSelectedRow();
            
            PatientText.setText((String) PatientTableModel.getValueAt(selectedRowIndex, 0));          
            NameText.setText((String) PatientTableModel.getValueAt(selectedRowIndex, 1));
            AgeText.setText((String) PatientTableModel.getValueAt(selectedRowIndex, 2));
            HouseText.setText((String) PatientTableModel.getValueAt(selectedRowIndex, 3));
            CommunityText.setText((String) PatientTableModel.getValueAt(selectedRowIndex, 4));           
            
      
        
    }//GEN-LAST:event_SystemPatientMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel PatientTableModel = (DefaultTableModel)SystemPatient.getModel();
         int selectedRowIndex = SystemPatient.getSelectedRow();
         String Pat1 = (String)PatientTableModel.getValueAt(selectedRowIndex, 0);
        
        
        try{                                       
            Class.forName("com.mysql.jdbc.Driver");
            Connection RemovePatientConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement RemovePatientStatement = (Statement) RemovePatientConnection.createStatement();
            
            String RemovePatientSql = ("Delete from patientrecords where patientid = '"+Pat1+"' ");
            
            
            PreparedStatement RemovePatientPS = RemovePatientConnection.prepareStatement(RemovePatientSql);
            RemovePatientPS.executeUpdate();                    
            JOptionPane.showMessageDialog(null," '"+Pat1+"' record deleted " );
               
                
        
        }catch(Exception e)   {                                       
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeText;
    private javax.swing.JTextField CommunityText;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField HouseText;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField PatientText;
    private javax.swing.JTable SystemPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
