package jdbc.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class InsertGetDataFromDB {

	public static void main(String[] args) throws SQLException{
		
		Jdbc_db jdb = new Jdbc_db();
		jdb.createTable();
		jdb.insertData(1, "sankar", 1000, 10, "Miyapur");
		jdb.insertData(2, "Ram", 2000, 10, "Jublihills");
		jdb.insertData(3, "Bala", 3000, 20, "Lingampalli");
		jdb.insertData(4, "Ashok", 4000, 30, "Miyapur");
		
		ResultSet rs=Jdbc_db.readData("Miyapur");
		WriteQueryResult wqs = new WriteQueryResult();
		while(rs.next()){
		
		String str=rs.getInt(1) + " " + rs.getString(2) + " "
                + rs.getString(3)+" "
                        + rs.getString(4);
		wqs.writeData(str);
		}
			
}
}