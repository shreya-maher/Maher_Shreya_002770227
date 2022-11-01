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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maher
 */
public class HospitalAdminViewEditDoc extends javax.swing.JFrame {

    /**
     * Creates new form HospitalAdminViewEditDoc
     */
    public HospitalAdminViewEditDoc() {
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
        ViewDocTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        DocCity = new javax.swing.JTextField();
        DocID = new javax.swing.JTextField();
        DocName = new javax.swing.JTextField();
        DocSpec = new javax.swing.JTextField();
        DocComm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ViewDocTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Doctor", "Specialisation", "Hospital", "Community", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ViewDocTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewDocTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ViewDocTable);

        jButton1.setText("View Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DocID.setEditable(false);

        jLabel1.setText("Doctor ID");

        jLabel2.setText("Doctor Name");

        jLabel3.setText("Specialisation");

        jLabel4.setText("Community");

        jLabel5.setText("City");

        jButton2.setText("Edit Doctor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("View And Edit Doctors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DocCity, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(DocID)
                    .addComponent(DocName)
                    .addComponent(DocSpec)
                    .addComponent(DocComm))
                .addGap(441, 441, 441))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(533, 533, 533)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(523, 523, 523)
                        .addComponent(jLabel6)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
            try{                                       
            Class.forName("com.mysql.jdbc.Driver");
            Connection ViewDConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement ViewDStatement = (Statement) ViewDConnection.createStatement();
            String ViewDSql = ("Select doctorid, doctor, specialisation, hospital, community, city from hospitals where hospitalid = '"+HospitalAdminLogin.HospitalUsernameField.getText()+"' ");
            
            PreparedStatement ViewDPS = ViewDConnection.prepareStatement(ViewDSql);
            ResultSet ViewDResult = ViewDPS.executeQuery();
            DefaultTableModel DoctorTableModel = (DefaultTableModel)ViewDocTable.getModel();
            DoctorTableModel.setRowCount(0);
            while(ViewDResult.next()){
            Object doctor[]=   { ViewDResult.getString("doctorid"), 
                ViewDResult.getString("doctor"),
                ViewDResult.getString("specialisation"),
                ViewDResult.getString("hospital"),
                ViewDResult.getString("community"),
                ViewDResult.getString("city"), 
            }    ;
            
            DoctorTableModel.addRow(doctor);
        }                       
                
                
        
        }catch(Exception e)   {                                       
        JOptionPane.showMessageDialog(null, e);
        }                                      
        

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ViewDocTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewDocTableMouseClicked
        // TODO add your handling code here:
            DefaultTableModel DoctorTableModel = (DefaultTableModel)ViewDocTable.getModel();
            int selectedRowIndex = ViewDocTable.getSelectedRow();
            
            DocID.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 0));          
            DocName.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 1));
            DocSpec.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 2));
            DocComm.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 4));
            DocCity.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 5));
    }//GEN-LAST:event_ViewDocTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         if(DocName.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"Name Required");
        DocName.requestFocus();
        return;
        }
         
          if(DocSpec.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"Specialisation Required");
        DocSpec.requestFocus();
        return;
        }
          
          if(DocComm.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"Community Required");
        DocComm.requestFocus();
        return;
        }
           
        if(DocCity.getText().equals("")) {
        JOptionPane.showMessageDialog(null,"City Required");
        DocCity.requestFocus();
        return;
        }
        
        
        String DocID1 = DocID.getText();
        String DocName1 = DocName.getText();
        String DocSpec1 = DocSpec.getText();
        String DocComm1 = DocComm.getText();
        String DocCity1 = DocCity.getText();
        
        try{   
            
            Class.forName("com.mysql.jdbc.Driver");            
            Connection DocEditConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            
            String DocEditSql = ("UPDATE hospitals SET doctor = '"+DocName1+"', specialisation = '"+DocSpec1+"', community = '"+DocComm1+"', city = '"+DocCity1+"' "
                    + "WHERE doctorid = '"+DocID1+"'");
            PreparedStatement DocEditPreparedStatement = DocEditConnection.prepareStatement(DocEditSql);
            DocEditPreparedStatement.execute();
           
           
             JOptionPane.showMessageDialog(null,"Doctor Records Updated succesfully");
             DocID.setText("");
             DocName.setText("");
             DocSpec.setText("");
             DocComm.setText("");
             DocCity.setText("");
             
             DocEditConnection.close();

            
        }    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
   
    }
        
        
        
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
            java.util.logging.Logger.getLogger(HospitalAdminViewEditDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminViewEditDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminViewEditDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminViewEditDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalAdminViewEditDoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DocCity;
    private javax.swing.JTextField DocComm;
    private javax.swing.JTextField DocID;
    private javax.swing.JTextField DocName;
    private javax.swing.JTextField DocSpec;
    private javax.swing.JTable ViewDocTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
