package com.techlabs.jdbc.demo;

// 1. IMPORT ALL PACKAGES
import java.sql.*;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection = null;
		try {
			// 2. LOAD AND REGISTER DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			// 3. ESTABLISH A CONNECTION
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");

			// 4. CREATE THE STATEMENT
			java.sql.Statement stmt = connection.createStatement();

			// 5. EXECUTE THE QUERY
			ResultSet rs = stmt.executeQuery("Select * from student");

			// 6. PROCESS THE RESULT
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}
