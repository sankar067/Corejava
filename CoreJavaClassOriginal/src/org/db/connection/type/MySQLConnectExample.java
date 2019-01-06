package org.db.connection.type;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
public class MySQLConnectExample {
    public static void main(String[] args) {
 
        // creates three different Connection objects
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/test?useSSL=false";
            String user = "sankar";
            String password = "sankar";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
            }
 
            // connect way #2
            String url2 = "jdbc:mysql://localhost:3306/test?useSSL=false&user=sankar&password=sankar";
            conn2 = DriverManager.getConnection(url2);
            if (conn2 != null) {
                System.out.println("Connected to the database test2");
            }
 
            // connect way #3
            String url3 = "jdbc:mysql://localhost:3306/test?useSSL=false";
            Properties info = new Properties();
            info.put("user", "sankar");
            info.put("password", "sankar");
 
            conn3 = DriverManager.getConnection(url3, info);
            if (conn3 != null) {
                System.out.println("Connected to the database test3");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}