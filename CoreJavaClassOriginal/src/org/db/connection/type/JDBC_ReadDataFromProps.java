package org.db.connection.type;

import java.io.FileInputStream; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import java.util.Properties; 
  
public class JDBC_ReadDataFromProps { 
  
    public static void main(String[] args) throws Exception { 
        FileInputStream fis=new FileInputStream("../CoreJavaClass/conf/database.properties"); 
        Properties p=new Properties (); 
        p.load (fis); 
        String dname= (String) p.get ("Dname"); 
        String url= (String) p.get ("URL"); 
        String username= (String) p.get ("Uname"); 
        String password= (String) p.get ("password"); 
        System.out.println(dname);
//        Class.forName(dname); 
        Connection con = DriverManager.getConnection( 
                url, username, password); 
        Statement stmt = con.createStatement(); 
        ResultSet rs = stmt.executeQuery("select * from employee"); 
        while (rs.next()) { 
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
                    + rs.getString(3)); 
        } 
        rs.close(); 
        stmt.close(); 
        con.close(); 
    } 
  
} 