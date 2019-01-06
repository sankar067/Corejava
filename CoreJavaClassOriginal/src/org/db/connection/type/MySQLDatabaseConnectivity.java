package org.db.connection.type;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MySQLDatabaseConnectivity {

	public static void main(String[] args) throws SQLException {

		Connection connection = null;

		try {
			ResourceBundle bundle = ResourceBundle.getBundle("database");

			String path = bundle.getString("MySQL.path");
			String user = bundle.getString("MySQL.user");
			String pass = bundle.getString("MySQL.pass");

			MysqlDataSource mysqlDataSource = new MysqlDataSource();
			mysqlDataSource.setURL(path);
			mysqlDataSource.setUser(user);
			mysqlDataSource.setPassword(pass);

			DataSource dataSource = mysqlDataSource;
			connection = dataSource.getConnection();

			if (connection != null) {
				System.out.println("Connection successfull.");
			}

		} catch (Exception e) {
			System.out.println("Connection failure. See the console for more details...");
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}
}