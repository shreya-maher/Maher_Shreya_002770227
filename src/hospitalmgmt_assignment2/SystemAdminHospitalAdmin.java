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
import javax.crypto.Cipher;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//age = phone no
/**
 *
 * @author maher
 */
public class SystemAdminHospitalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminHospitalAdmin
     */
    public SystemAdminHospitalAdmin() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalTable = new javax.swing.JTable();
        AdminField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();
        HospitalField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Submit1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AgeField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        HospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hospital Admin", "Admin Password", "Hospital Name", "Admin Name", "Admin Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HospitalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HospitalTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HospitalTable);

        jLabel1.setText("Admin");

        jLabel2.setText("Password");

        jLabel3.setText("Hospital Name");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Submit1.setText("Create");
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Phone Number");

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Manage Hospital Admin");

        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(Submit)
                        .addGap(108, 108, 108)
                        .addComponent(Delete)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminField)
                    .addComponent(PasswordField)
                    .addComponent(HospitalField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeField)
                    .addComponent(NameField))
                .addGap(385, 385, 385))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Submit1)
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(425, 425, 425)
                .addComponent(jButton2)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(Delete))
                .addGap(65, 65, 65)
                .addComponent(Submit1)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
         try{                                       
            Class.forName("com.mysql.jdbc.Driver");
            Connection ViewHAConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement ViewHAStatement = (Statement) ViewHAConnection.createStatement();
            String ViewHASql = ("Select * from hospitaladmin ");
            
            PreparedStatement ViewHAPS = ViewHAConnection.prepareStatement(ViewHASql);
            ResultSet ViewHAResult = ViewHAPS.executeQuery();
            DefaultTableModel HospitalTableModel = (DefaultTableModel)HospitalTable.getModel();
            HospitalTableModel.setRowCount(0);
            while(ViewHAResult.next()){
            Object hospital[]=   { ViewHAResult.getString("username"), 
                ViewHAResult.getString("name"), 
                ViewHAResult.getString("age"), 
                ViewHAResult.getString("password"), 
                ViewHAResult.getString("hospital")
                }    ;
            
            HospitalTableModel.addRow(hospital);
        }                       
                
                
        
        }catch(Exception e)   {                                       
        JOptionPane.showMessageDialog(null, e);
        }                                      
        

        
        
    }//GEN-LAST:event_formWindowActivated

    private void HospitalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospitalTableMouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel HospitalTableModel = (DefaultTableModel)HospitalTable.getModel();
            int selectedRowIndex = HospitalTable.getSelectedRow();
            
            AdminField.setText((String) HospitalTableModel.getValueAt(selectedRowIndex, 0));          
            NameField.setText((String) HospitalTableModel.getValueAt(selectedRowIndex, 1));          
            AgeField.setText((String) HospitalTableModel.getValueAt(selectedRowIndex, 2));          
            PasswordField.setText((String) HospitalTableModel.getValueAt(selectedRowIndex, 3));
            HospitalField.setText((String) HospitalTableModel.getValueAt(selectedRowIndex, 4));
            
    }//GEN-LAST:event_HospitalTableMouseClicked

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        
        String Admin = AdminField.getText();
        String Name = NameField.getText();
        String Age= AgeField.getText();
        String Pwd = PasswordField.getText();
        String Hospital = HospitalField.getText();
        
        DefaultTableModel HospitalTableModel = (DefaultTableModel)HospitalTable.getModel();
            int selectedRowIndex = HospitalTable.getSelectedRow();
        String Admin1 = (String)HospitalTableModel.getValueAt(selectedRowIndex, 0); 
        
        try{   
            
            Class.forName("com.mysql.jdbc.Driver");            
            Connection HospitalEditConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            
            String HospitalEditSql = ("UPDATE hospitaladmin SET username = '"+Admin+"', name = '"+Name+"', age = '"+Age+"', password = '"+Pwd+"', hospital = '"+Hospital+"' "
                    + "where username = '"+Admin1+"' ");
            PreparedStatement HospitalEditPreparedStatement = HospitalEditConnection.prepareStatement(HospitalEditSql);
            HospitalEditPreparedStatement.execute();
           
           
             JOptionPane.showMessageDialog(null,"Hospital Admin Data Updated succesfully");
             AdminField.setText("");
             PasswordField.setText("");
             HospitalField.setText("");
             NameField.setText("");
             AgeField.setText("");
                         
             HospitalEditConnection.close();

            
             
             
        }    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
   
    }
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
        // TODO add your handling code here:
        new SystemAdminCreateHospitalAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_Submit1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel HospitalTableModel = (DefaultTableModel)HospitalTable.getModel();
            int selectedRowIndex = HospitalTable.getSelectedRow();
        String Admin1 = (String)HospitalTableModel.getValueAt(selectedRowIndex, 0); 
        
         try{                                       
            Class.forName("com.mysql.jdbc.Driver");
            Connection RemoveHAConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement RemoveHAStatement = (Statement) RemoveHAConnection.createStatement();
            
            String RemoveHASql = ("Delete from hospitaladmin where username = '"+Admin1+"' ");
            
            
            PreparedStatement RemoveHAPS = RemoveHAConnection.prepareStatement(RemoveHASql);
            RemoveHAPS.executeUpdate();                    
            JOptionPane.showMessageDialog(null," '"+Admin1+"' record deleted " );
               
                
        
        }catch(Exception e)   {                                       
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new SystemAdminDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
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
            java.util.logging.Logger.getLogger(SystemAdminHospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminHospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminHospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminHospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminHospitalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminField;
    private javax.swing.JTextField AgeField;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField HospitalField;
    private javax.swing.JTable HospitalTable;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
