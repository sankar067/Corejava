package jdbc.homework;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc_db {
	static Connection con = null;
	static Statement st= null;
	static ResultSet rs = null;

	public static Connection getConnection(){
		readPropertyFile p = new readPropertyFile();
		try{
			String url= p.GetPropertyData("URL");
	        String username= p.GetPropertyData ("Uname"); 
	        String password= p.GetPropertyData("password"); 

	        con = DriverManager.getConnection(url, username, password); 
		}catch(Exception e){e.printStackTrace();}
		
		return con;
	}

	public static ResultSet readData(String address){
		readPropertyFile p = new readPropertyFile();
		try{
		con=Jdbc_db.getConnection();
		st= con.createStatement();
		String query = ("select * from "+p.GetPropertyData("db.name")+".employee2 where `eadd`='"+address+"'");
		rs=st.executeQuery(query);

		}catch(SQLException e){
			e.printStackTrace();
		} 
		return rs;
	}
	
	void insertData(int eno,String ename,int esal,int dept,String eadd){
		try{
			con=Jdbc_db.getConnection();
			st= con.createStatement();
			String query = ("INSERT INTO `EMPLOYEE2` (`eno`, `ename`, `esal`, `dept`,`eadd`) VALUES("
			+eno+",'"+ename+"',"+esal+","+dept+",'"+eadd+"')");
			st.execute(query);
			st.execute("commit");
		}catch(SQLException e){e.printStackTrace();}
	}
	
	void createTable(){
		try{
			con=Jdbc_db.getConnection();
			st= con.createStatement();
			String query = ("CREATE TABLE IF NOT EXISTS `EMPLOYEE2` (`ENO` INTEGER(100),`ENAME` VARCHAR(4000),`ESAL` INTEGER(100),`DEPT` INTEGER(100),`EADD` VARCHAR(8000),PRIMARY KEY (`ENO`))");
			st.execute(query);
			st.execute("commit");
		}catch(SQLException e){e.printStackTrace();}
	}
}
