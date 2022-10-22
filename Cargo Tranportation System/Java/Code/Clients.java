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
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SADIQ
 */
public class Clients extends javax.swing.JFrame {

    /**
     * Creates new form Clients
     */
    public Clients() {
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
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtdname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        qtntxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        paymenttype = new javax.swing.JComboBox<>();
        ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search Product");

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productname", "quantity", "price", "total cost", "Payment"
            }
        ));
        jScrollPane1.setViewportView(table);

        txtdname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdnameActionPerformed(evt);
            }
        });
        txtdname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdnameKeyPressed(evt);
            }
        });

        jLabel3.setText("Quantity");

        jLabel2.setText("Client");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        paymenttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Select Payment---", "Cash", "bKash", " " }));

        ok.setText("ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(qtntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Add)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ok)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtdname, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paymenttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(paymenttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ok)
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qtntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdnameKeyPressed

    private void txtdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdnameActionPerformed
   
    }//GEN-LAST:event_txtdnameActionPerformed
 Connection connection;

  
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
      search();
    }//GEN-LAST:event_AddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         signin prd = new signin();
                prd.setVisible(true);
                this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
      
        /*
        try{
        
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
            

            Statement statement = connection.createStatement();
        String x=Integer.toString(100);
    
        String q = "update Products set Quantity = '"+x+"'";
        PreparedStatement pst = connection.prepareStatement(q);
     
        
        
        }catch(Exception e){
            
         JOptionPane.showMessageDialog(null,e);
        
        
        }
        */
        
        
        
    }//GEN-LAST:event_okActionPerformed

    
    
  
    
    public void search(){
    
      
       
       
       
       String prdname = txtdname.getText();
          String quantity = qtntxt.getText();
         int qtn = Integer.parseInt(quantity);
        
       
           try{
    
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
            

            Statement statement = connection.createStatement();
            
                   
             int c;
            
                  ResultSet resultSet = statement
                    .executeQuery("SELECT Description,Quantity,Price FROM Products where Description = '"+prdname+"'");
                   ResultSetMetaData rss= resultSet.getMetaData();
            
            c=rss.getColumnCount();
            
             DefaultTableModel tbmodel = (DefaultTableModel)table.getModel();
              tbmodel.setRowCount(0);
              
        
              
              while(resultSet.next()){
              
              String s =(resultSet.getString("Description"));
               String p =(resultSet.getString("Quantity"));
               String pr = (resultSet.getString("Price"));
               int prr = Integer.parseInt(pr); 
                 int q = Integer.parseInt(p);
                if(prdname.equalsIgnoreCase(s) && qtn<=q){
                    
                
                Vector v2 = new Vector();
              
        
                  
                     
                    for(int a=1;a<=c;a++){
                    
                      
                      v2.add(prdname);
                      v2.add(quantity);
                      v2.add(resultSet.getString("Price"));
                      v2.add(prr*qtn);
                      if( paymenttype.getSelectedIndex()==1){
                      v2.add(paymenttype.getSelectedItem().toString());
                      }
                       if( paymenttype.getSelectedIndex()==2){
                      v2.add(paymenttype.getSelectedItem().toString());
                      }
                      
                   
                  
                
                 
                  }
                   tbmodel.addRow(v2);
                  int w =q-qtn;
                   String x = Integer.toString(w);
                 
                     /*
                    String str = "UPDATE Products SET Quantity= '"+w+"'";
               
              //  resultSet = statement
                //    .executeQuery("update Products set Quantity = Quantity - '"+x+"' where Description = '"+prdname+"'");
                
     
               // up(x);
               
                 String k=Integer.toString(100);
    
        String l = "update Products set Quantity = '"+x+"'";
        PreparedStatement pst = connection.prepareStatement(str);
                */
                }
               
                  
              
              }
             
             
            
            
    }catch(Exception e){
    
     JOptionPane.showMessageDialog(null,e);
    
    
    }
    }
    
    /*
    public void up(String x){
    
    
    
        try {
            
            
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
            

            Statement statement = connection.createStatement();
            
             ResultSet resultSet = statement
                    .executeQuery("update Products set Quantity = Quantity - 1 where Description = brush");
             
            
           
            
            
        } catch (Exception e) {
        }
    
    
    
    
    
    
    
    }
    /*
    
    
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
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox<String> paymenttype;
    private javax.swing.JTextField qtntxt;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtdname;
    // End of variables declaration//GEN-END:variables
}
