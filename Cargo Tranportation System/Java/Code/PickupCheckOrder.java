/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

import static cargo.PickupLogin.contct;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SADIQ
 */
public class PickupCheckOrder extends javax.swing.JFrame {

    /**
     * Creates new form PickupCheckOrder
     */
    public PickupCheckOrder() {
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
        jTable1 = new javax.swing.JTable();
        display = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtadrs = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();
        btnconfirm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        idbtn = new javax.swing.JButton();
        txtdeliverid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtclientid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtproductid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClientId", "ClientName", "ProductId", "ProductName", "Qtn", "Client Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        display.setText("Display Order ");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("adrs");

        jLabel2.setText("Date");

        jLabel3.setText("Time");

        btnconfirm.setText("Confirm Order");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        idbtn.setText("id");
        idbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbtnActionPerformed(evt);
            }
        });

        jLabel4.setText("pickupid");

        jLabel5.setText("Deliverid");

        jLabel6.setText("client id");

        jLabel8.setText("ProductId");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idbtn))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtadrs)
                            .addComponent(txtdate)
                            .addComponent(txttime, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(txtdeliverid, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtproductid))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtclientid, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(249, 249, 249))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(display)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnconfirm))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtadrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdeliverid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtclientid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txttime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(display))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtproductid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnconfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection connection;
    ResultSet rs;
     
    PreparedStatement insert;
    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
        table_update();
       id();
       deliverid();
      
    }//GEN-LAST:event_displayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbmodel = (DefaultTableModel)jTable1.getModel();
        int selectedindex = jTable1.getSelectedRow();

        try{
            int id = Integer.parseInt(tbmodel.getValueAt(selectedindex,0).toString());

            int dialogResult = JOptionPane.showConfirmDialog(null,"Do you want to Accepth the Order","Warning",JOptionPane.YES_NO_OPTION);

            if(dialogResult == JOptionPane.YES_OPTION){

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");

                Statement statement = connection.createStatement();
                

                insert = connection.prepareStatement("delete FROM buy where Productid =?");
                 
                insert.setInt(1, id);

                insert.executeUpdate();
                JOptionPane.showMessageDialog(this,"Record Deleted");
                table_update();

            }

        }catch(Exception e){

            e.printStackTrace();

        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        txtadrs.setText(model.getValueAt(i, 5).toString());
        txtclientid.setText(model.getValueAt(i, 0).toString());
        txtproductid.setText(model.getValueAt(i, 2).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
        
        
        confirm();
        //insertpkid();
       
       checkorderpick();
       
        
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              PickupLogin bk = new PickupLogin();
                bk.setVisible(true);
                this.dispose();       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
           
      
        
        
    }//GEN-LAST:event_txtidActionPerformed

    private void idbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbtnActionPerformed
id();        // TODO add your handling code here:
    }//GEN-LAST:event_idbtnActionPerformed

    
    
    
    
    
    public void checkorderpick(){
    
    
         
          try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
              Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO checkorderpick (Deliveryid,Productid,Clientid,Pickupid) VALUES('"+txtdeliverid.getText()+"','"+txtproductid.getText()+"','"+txtclientid.getText()+"','"+txtid.getText()+"')");
             
            txtdeliverid.setText("");
                
              
       
 
            
    
    }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
    
    
    }   
    
    
    
    
    
    
    
    
    
    
    
    }
    public void confirm(){
    
    
    
    
    String dt  = txtdate.getText();
       String tm = txttime.getText();
       String f = dt + " " + tm;
       String adrs = txtadrs.getText();
       
       try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
              Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Delivery (DAddress,DeliveryTime) VALUES('"+adrs+"','"+f+"')");
              JOptionPane.showMessageDialog(null, "Confirmed order");
              cleartxt();
               
       
 
            
    
    }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
    
    
    }    
    
    
    
    }
       public void cleartxt(){
     
     
         txtadrs.setText("");
        txtdate.setText("");
    
        txttime.setText("");
        
      
        
        
         
 
     
     }
       
       
       
       
       public void insertpkid(){
       
           
          try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
              Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO deliver (Pickupid,Deliveryid) VALUES('"+txtid.getText()+"','"+txtdeliverid.getText()+"')");
             
            txtdeliverid.setText("");
                
              
       
 
            
    
    }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
    
    
    }  
       
       
       }
       
       
       public void deliverid(){
       
       
         try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");

                insert = connection.prepareStatement("select Deliveryid from Delivery");

             
              rs = insert.executeQuery();
              
              
               if(rs.next() == false){
           
               
               }else{
               
               
                   
               String pkid = rs.getString("Deliveryid");
               txtdeliverid.setText(pkid);
               
               
               }
       
 
            
    
    }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
    
    
    } 
       
       
       
       
       }
       
       
       public void id(){
           
            System.out.println("contact:  "+PickupLogin.contct);
       
         try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");

                insert = connection.prepareStatement("select Pickupid from Pickup where DContactNo = '"+PickupLogin.contct+"'");

             
              rs = insert.executeQuery();
              
              
               if(rs.next() == false){
           
               
               }else{
               
               
                   
               String pkid = rs.getString("Pickupid");
               txtid.setText(pkid);
               
               
               }
       
 
            
    
    }catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
    
    
    } 
       
       
       }
       
       
    
    
     public void table_update(){
         
         
          try{
    
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
            

            Statement statement = connection.createStatement();
            
                   
             int c;
            
                   ResultSet resultSet = statement
                    .executeQuery("select C.Clinetid,C.ClinetName,P.Productid,P.Description,PP.Qtn,C.CAddress\n" +
"from Clients C, buy PP, Products P\n" +
"where C.Clinetid = PP.Clinetid\n" +
"and   PP.Productid = P.Productid");
                   ResultSetMetaData rss= resultSet.getMetaData();
            
            c=rss.getColumnCount();
            
             DefaultTableModel tbmodel = (DefaultTableModel)jTable1.getModel();
              tbmodel.setRowCount(0);
              while (resultSet.next()) {
             
        Vector v2 = new Vector();
              
        
                  
                 
                 
                  
                  
                    for(int a=1;a<=c;a++){
                      v2.add(resultSet.getString("Clinetid"));
                      
                      v2.add(resultSet.getString("ClinetName"));
                      v2.add(resultSet.getString("Productid"));
                      v2.add(resultSet.getString("Description"));
                  v2.add(resultSet.getString("Qtn"));
                 v2.add(resultSet.getString("CAddress"));
                 
                  
                  
                  }
                   tbmodel.addRow(v2);
                   
                  
                  
    
                
                
                
            }
            
       
             
             
            
            
    }catch(Exception e){
    
       e.printStackTrace();
    
    
    }
     }
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
            java.util.logging.Logger.getLogger(PickupCheckOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PickupCheckOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PickupCheckOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PickupCheckOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PickupCheckOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfirm;
    private javax.swing.JButton display;
    private javax.swing.JButton idbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadrs;
    private javax.swing.JTextField txtclientid;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdeliverid;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtproductid;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables
}
