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
public class SystemAdminDoctor extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminDoctor
     */
    public SystemAdminDoctor() {
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
        SystemDoctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        DoctorIDText1 = new javax.swing.JTextField();
        SpecialisationText = new javax.swing.JTextField();
        HospitalText = new javax.swing.JTextField();
        CommunityText = new javax.swing.JTextField();
        CityText = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        SystemDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Name", "Specialisation", "Hospital", "Community", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SystemDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SystemDoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SystemDoctor);

        jLabel1.setText("Doctor ID");

        jLabel2.setText("Name");

        jLabel3.setText("Specialisation");

        jLabel4.setText("Hospital");

        jLabel5.setText("Community");

        jLabel6.setText("City");

        DoctorIDText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorIDText1ActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CityText, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CommunityText, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HospitalText, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpecialisationText, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorIDText1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(Update)
                        .addGap(111, 111, 111)
                        .addComponent(Delete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DoctorIDText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SpecialisationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(HospitalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CommunityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try{                                       
            Class.forName("com.mysql.jdbc.Driver");
            Connection ViewDoctorConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement ViewDoctorStatement = (Statement) ViewDoctorConnection.createStatement();
            String ViewDoctorSql = ("Select * from hospitals ");
            
            PreparedStatement ViewDoctorPS = ViewDoctorConnection.prepareStatement(ViewDoctorSql);
            ResultSet ViewDoctorResult = ViewDoctorPS.executeQuery();
            DefaultTableModel DoctorTableModel = (DefaultTableModel)SystemDoctor.getModel();
            DoctorTableModel.setRowCount(0);
            while(ViewDoctorResult.next()){
            Object doctor[]=   { ViewDoctorResult.getString("doctorid"), 
                ViewDoctorResult.getString("doctor"),
                ViewDoctorResult.getString("specialisation"),
                ViewDoctorResult.getString("hospital"),
                ViewDoctorResult.getString("community"),
                ViewDoctorResult.getString("city"),
                }    ;
            
            DoctorTableModel.addRow(doctor);
        }                       
                
                
        
        }catch(Exception e)   {                                       
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void SystemDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SystemDoctorMouseClicked
        // TODO add your handling code here:
         DefaultTableModel DoctorTableModel = (DefaultTableModel)SystemDoctor.getModel();
            int selectedRowIndex = SystemDoctor.getSelectedRow();
            
            DoctorIDText1.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 0));          
            NameText.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 1));
            SpecialisationText.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 2));
            HospitalText.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 3));
            CommunityText.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 4));    
            CityText.setText((String) DoctorTableModel.getValueAt(selectedRowIndex, 5));    
    }//GEN-LAST:event_SystemDoctorMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel DoctorTableModel = (DefaultTableModel)SystemDoctor.getModel();
         int selectedRowIndex = SystemDoctor.getSelectedRow();
         String Doc1 = (String)DoctorTableModel.getValueAt(selectedRowIndex, 0);
        
        
         try{                                       
            Class.forName("com.mysql.jdbc.Driver");
            Connection RemoveDoctorConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            Statement RemoveDoctorStatement = (Statement) RemoveDoctorConnection.createStatement();
            
            String RemoveDoctorSql = ("Delete from hospitals where doctorid = '"+Doc1+"' ");
            
            
            PreparedStatement RemoveDoctorPS = RemoveDoctorConnection.prepareStatement(RemoveDoctorSql);
            RemoveDoctorPS.executeUpdate();                    
            JOptionPane.showMessageDialog(null," '"+Doc1+"' record deleted " );
               
                
        
        }catch(Exception e)   {                                       
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         DefaultTableModel DoctorTableModel = (DefaultTableModel)SystemDoctor.getModel();
         int selectedRowIndex = SystemDoctor.getSelectedRow();
         String Doc1 = (String)DoctorTableModel.getValueAt(selectedRowIndex, 0);
        
         try{   
            
            Class.forName("com.mysql.jdbc.Driver");            
            Connection DoctorEditConnection = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root", "");
            
            String DoctorEditSql = ("UPDATE hospitals SET doctorid ='"+DoctorIDText1.getText()+"', doctor = '"+NameText.getText()+"', specialisation = '"+SpecialisationText.getText()+"', hospital = '"+HospitalText.getText()+"',"
            + "community = '"+CommunityText.getText()+"',  city = '"+CityText.getText()+"' where doctorid = '"+Doc1+"' ");
            PreparedStatement DoctorEditPreparedStatement = DoctorEditConnection.prepareStatement(DoctorEditSql);
            DoctorEditPreparedStatement.execute();
           
           
             JOptionPane.showMessageDialog(null,"Doctor Data Updated succesfully");
             DoctorIDText1.setText("");
             NameText.setText("");
             SpecialisationText.setText("");
             HospitalText.setText("");
             CommunityText.setText("");
             CityText.setText("");
             
                     
                         
             DoctorEditConnection.close();

            
        }    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
   
    }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void DoctorIDText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorIDText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorIDText1ActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CityText;
    private javax.swing.JTextField CommunityText;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField DoctorIDText1;
    private javax.swing.JTextField HospitalText;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField SpecialisationText;
    private javax.swing.JTable SystemDoctor;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
