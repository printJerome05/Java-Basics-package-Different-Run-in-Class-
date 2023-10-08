/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication5;



import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import  java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import org.w3c.dom.css.RGBColor;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author JeromeMarco
 */
public class REGISTER extends javax.swing.JFrame {
    private Connection connection;
    Border flatTextBorder = BorderFactory.createLineBorder(Color.BLACK);
    /**
     * Creates new form REGISTER
     */
    public REGISTER() {
        initComponents();
         connectToDatabase();
         
      
 
           jUSERNAME.setBorder(flatTextBorder);
           jPASSWORD.setBorder(flatTextBorder);
           jFIRSTNAME.setBorder(flatTextBorder);
           jLASTNAME.setBorder(flatTextBorder);
           
    }
    
    private void connectToDatabase() {
        try {
            // can also do one liner. below statement can do it. just checking if the connection is done right 
            connection = DatabaseConnection.getConnection();
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPASSWORD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jUSERNAME = new javax.swing.JTextField();
        jFIRSTNAME = new javax.swing.JTextField();
        jLASTNAME = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCONFIRM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PASSWORD");

        jLabel2.setText("USERNAME");

        jLabel3.setText("FIRST NAME");

        jLabel4.setText("LAST NAME");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setText("REGISTER");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCONFIRM.setBackground(new java.awt.Color(102, 153, 255));
        jCONFIRM.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jCONFIRM.setText("CONFIRM");
        jCONFIRM.setToolTipText("SUBMIT ");
        jCONFIRM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCONFIRM.setBorderPainted(false);
        jCONFIRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCONFIRMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jCONFIRM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLASTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUSERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFIRSTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jUSERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFIRSTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLASTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jCONFIRM, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            LOGINFORM lf = new LOGINFORM();
            lf.show();
            this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCONFIRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCONFIRMActionPerformed
         String username = jUSERNAME.getText();
       String password = jPASSWORD.getText();
       String firstname = jFIRSTNAME.getText();
       String lastname = jLASTNAME.getText();
       
         // BORDER COLOR IF NO INPUTFIELD
       Border redBorder = new LineBorder(Color.RED);
 
     
 
      
            // validation 
         if(username.isEmpty() || password.isEmpty() || firstname.isEmpty() || lastname.isEmpty()){
             
                        jUSERNAME.setBorder(redBorder);
                           jPASSWORD.setBorder(redBorder);
                            jFIRSTNAME.setBorder(redBorder);
                               jLASTNAME.setBorder(redBorder);
                      JOptionPane.showMessageDialog(null, "EmptyFields");
             
                      
         }else{
          
                  try {
            Statement stmt = connection.createStatement();
             String insert = "INSERT INTO logintest(user_name,pass_word,first_name,last_name) values('"+username+"','"+password+"','"+firstname+"','"+lastname+"')";
             stmt.execute(insert);
             stmt.close();
             
             JOptionPane.showMessageDialog(null, "Registration Complete");
             //after input text field will be cleared
             jUSERNAME.setText("");
             jUSERNAME.setBorder(flatTextBorder);
             jPASSWORD.setText("");
             jPASSWORD.setBorder(flatTextBorder);
             jFIRSTNAME.setText("");
             jFIRSTNAME.setBorder(flatTextBorder);
             jLASTNAME.setText("");
             jLASTNAME.setBorder(flatTextBorder);
                 }
        catch (SQLException ex) {
            Logger.getLogger(REGISTER.class.getName()).log(Level.SEVERE, null, ex);
       
        }
            }
            
             
        
     
      
       
    
    }//GEN-LAST:event_jCONFIRMActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jCONFIRM;
    private javax.swing.JTextField jFIRSTNAME;
    private javax.swing.JTextField jLASTNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jPASSWORD;
    private javax.swing.JTextField jUSERNAME;
    // End of variables declaration//GEN-END:variables
}
