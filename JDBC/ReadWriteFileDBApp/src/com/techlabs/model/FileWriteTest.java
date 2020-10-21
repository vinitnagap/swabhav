package com.techlabs.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FileWriteTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		Connection connection = null;
		String data = "";
		try {
			// 2. LOAD AND REGISTER DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			// 3. ESTABLISH A CONNECTION
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");

			// 4. CREATE THE STATEMENT
			java.sql.Statement stmt = connection.createStatement();

			// 5. EXECUTE THE QUERY
			ResultSet rs = stmt.executeQuery("Select * from person");

			// 6. PROCESS THE RESULT
			while (rs.next()) {
				data += rs.getInt(1) + "  " + checkNull(rs.getString(2)) + " " + rs.getInt(3) + "  " + rs.getString(4)
						+ "\n";

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		File file = new File("person.txt");
		FileWriter fw = new FileWriter(file);
		fw.write(data);
		fw.close();
	}

	private static String checkNull(String cell) {
		if (cell == null) {
			return "empty";
		} else
			return cell;
	}
}
