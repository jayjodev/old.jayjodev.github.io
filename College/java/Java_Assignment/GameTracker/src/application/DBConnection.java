package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static final String DB_URL = "jdbc:oracle:thin:@oracle1.centennialcollege.ca:1521:SQLD"; //School Network
	static final String DB_USERNAME = "COMP214_F18_006_11"; // The connection of Gangrae Jo DataBase
	static final String DB_PASSWORD = "password";
	static Connection _connection = null;

	/* Represents the DataBase connection
		If a connection already exists, it will return the connection.
	 */

	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			_connection = DriverManager.getConnection(DB_URL ,DB_USERNAME, DB_PASSWORD );
			_connection.setAutoCommit(false);
			System.out.println("SUCCESSFULLY CONNECTED !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return _connection;
	}

	/* Close the current DB Connection */

	public static void closeConnection(){
		if (!(_connection == null)){
			try {
				_connection.close();
				System.out.println("--- CONNECTION CLOSED ---");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

