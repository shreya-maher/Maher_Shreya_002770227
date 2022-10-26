/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmgmt_assignment2;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author maher
 */
public class DoctorLogin extends javax.swing.JFrame {

    /**
     * Creates new form DoctorLogin
     */
    public DoctorLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        DoctorUsernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DoctorPasswordField = new javax.swing.JPasswordField();
        Submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Doctor Login");

        DoctorUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorUsernameFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        DoctorPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorPasswordFieldActionPerformed(evt);
            }
        });

        Submit.setText("SUBMIT");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(Submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(599, 599, 599))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoctorUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(423, 423, 423))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(79, 79, 79)
                .addComponent(Submit)
                .addGap(423, 423, 423))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoctorUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorUsernameFieldActionPerformed

    private void DoctorPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorPasswordFieldActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String present;
        present = "0";
        String DoctorUsernameInput = DoctorUsernameField.getText();
        String DoctorPasswordInput = DoctorPasswordField.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection DoctorConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement DoctorStatement = (Statement) DoctorConnection.createStatement();
            String DoctorSql = ("Select * from doctor");

            ResultSet DoctorResult = DoctorStatement.executeQuery(DoctorSql);
            while(DoctorResult.next())
            {
                String DoctorUsernameTable = DoctorResult.getString("username");
                String DoctorPasswordTable = DoctorResult.getString("password");

                if(DoctorUsernameInput.equals(DoctorUsernameTable)&& DoctorPasswordInput.equals(DoctorPasswordTable))
                {
                    present = "1";
                    break;
                }
            }

            if(present.equals("1"))
            {
                new SystemAdminDashboard().setVisible(true);
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Wrong credentials");
            }
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection error");
        }
    }//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField DoctorPasswordField;
    private javax.swing.JTextField DoctorUsernameField;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
