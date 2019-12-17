package selenium.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseClass {

	private static Connection conn;
	private static Statement stmt;
	private static ResultSet resultSet;
	private static String dbURl = "jdbc:postgresql://localhost:5432/dvdrental";
	private static String dbUserName = "postgres";
	private static String dbPassword = "root";
	private static String dbQuery = "select * public.city";
	
	//create a method of connection
	public static void setupConnection () {
		try {
			conn = DriverManager.getConnection(dbURl, dbUserName,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//create method to execute of code and run it
	public static void runQuery () {
		try {
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(dbQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//print our code
		System.out.printf("%-10s %-10s %-10s\n", "city_id", "city", "country_id", "last_update");
		
		try {
			while (resultSet.next()) {
				System.out.printf("%-10s %-10s %-10s\n", resultSet.getString("city_id"), resultSet.getString("city"), resultSet.getString("country_id"), resultSet.getString("last_update"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//close db connection
	
	public static void closeConnection () {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	
}
