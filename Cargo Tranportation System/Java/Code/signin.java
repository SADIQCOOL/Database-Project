/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SADIQ
 */
public class signin extends javax.swing.JFrame {

   
    public signin() {
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

        jPanel1 = new javax.swing.JPanel();
        textmail = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        textmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textmailActionPerformed(evt);
            }
        });
        jPanel1.add(textmail);
        textmail.setBounds(170, 200, 250, 30);

        resetbtn.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        resetbtn.setText("Clear");
        resetbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetbtn);
        resetbtn.setBounds(330, 290, 100, 30);

        backbtn.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        backbtn.setText("Back");
        backbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn);
        backbtn.setBounds(10, 10, 50, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 200, 90, 30);

        txtpassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtpassword);
        txtpassword.setBounds(170, 240, 250, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 240, 130, 30);

        login.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        login.setText("Login");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(160, 290, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\Cargo\\bkgrnd1.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 510, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
     signin();
    }//GEN-LAST:event_loginActionPerformed
public static String mail;
    private void textmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textmailActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        
        
                Home bk = new Home();
                bk.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed

      cleartxt();
    
       

    }//GEN-LAST:event_resetbtnActionPerformed
     public Connection connection;
   
    public void signin(){
    
    
    mail = textmail.getText();
   String password = txtpassword.getText();
   //String Usertype = usertypecmb.getSelectedItem().toString();
   //String Usertypeaaa = String.valueOf(usertypecmb.getSelectedItem());
   
  
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
              Statement statement = connection.createStatement();
            

       String query ="select Mail,Password from Clients where Mail='"+mail+"' and Password='"+password+"'";
          
           
                ResultSet resultSet = statement
                    .executeQuery(query);
               
              
            
           
              if (resultSet.next()) {
                   
                  
             JOptionPane.showMessageDialog(null,"Sucessfully logged in as Client");
             cleartxt();
             
               searchproductclient cl = new searchproductclient();
                cl.setVisible(true);
                this.dispose();
                  
                  
                
           
        
                  }else{
              
               JOptionPane.showMessageDialog(null,"Wrong Input");
             cleartxt();
             
              
              
              }
            
            
       
            
    
    }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
    
    
    }    
            
            
    }
    
    
    
    
     public void cleartxt(){
     
     
         textmail.setText("");
        txtpassword.setText("");
     
     }
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
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JButton resetbtn;
    public static javax.swing.JTextField textmail;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}