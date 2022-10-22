/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

import java.sql.*;
import java.util.*;
public class Cargo {
    public Connection connection;
    
  
    public void connectDB(){
    
    
    try{
    
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Cargos;selectMethod=cursor", "sa", "123456");
            
            
  
            
              System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            Statement statement = connection.createStatement();
            
            
            
           
             
            
                                                                   
            //ResultSet resultSet = statement
              //    .executeQuery("select * from Products");
          //  ResultSet resultSet = statement
                //    .executeQuery("update Products set Quantity = Quantity - 1 ");
                
                String x=Integer.toString(100);
    
        String q = "update Products set Quantity = '"+x+"'";
        PreparedStatement pst = connection.prepareStatement(q);
     /*
            
              if (resultSet.next()) {
             
                System.out.println("prd NAME:" + resultSet.getString("Description") +" "+resultSet.getString("Quantity"));
                
                 String a =(resultSet.getString("Quantity"));
                 int d = Integer.parseInt(a);
                 int s = d + 10;
                     String e = Integer.toString(s);
                     
                    String str = "UPDATE Products SET Quantity= '"+s+"'";
                    
                    
                
            }
            
       
             */
             
            
            
    }catch(Exception e){
    
       e.printStackTrace();
    
    
    }
    
    
    }
    
    
    
    public static void main(String[] args) {
       Cargo cnObj = new Cargo();
        cnObj.connectDB();
    }
    
}