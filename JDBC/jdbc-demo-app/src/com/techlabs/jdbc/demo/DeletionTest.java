package com.techlabs.jdbc.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeletionTest {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet res = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
			System.out.println("Successful Connection");
			stmt = conn.createStatement();

			System.out.println("Before Delete");
			res = stmt.executeQuery("Select * from intern");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}
			int rows = stmt.executeUpdate("Delete from intern where name=\"vinit\";");
			System.out.println("After Delete");
			res = stmt.executeQuery("Select * from intern");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}
		} catch (SQLException e) {
			System.out.println("Unsuccessful");
			e.printStackTrace();
		} finally {
			if (res != null) {
				res.close();
			}
		}
	}

}
