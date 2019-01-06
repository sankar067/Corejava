import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	
	public static Connection getConnection(){
		Connection conn = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String Url="jdbc:mysql://localhost:3306/test?useSSL=false";
			conn=DriverManager.getConnection(Url,"sankar","sankar");
			System.out.println("Connection Status: "+conn);
		}catch(Exception e){e.printStackTrace();}
		
		return conn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestJDBC.getConnection();
	}

}
