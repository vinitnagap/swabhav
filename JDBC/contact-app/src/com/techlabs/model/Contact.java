package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Contact {
	private static java.sql.Statement stmt = null;
	private static ResultSet res = null;

	public Contact() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
		stmt = conn.createStatement();

	}

	public void display() throws SQLException {
		System.out.println("Displaying Data");
		res = stmt.executeQuery("Select * from contact");
		while (res.next()) {
			System.out.println(
					res.getString(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getString(4));
		}
		System.out.println();
	}

	public void add(String fname, String lname, String phone, String email) throws SQLException {
		System.out.println("Inserting Data");
		stmt.executeUpdate("Insert into contact values(\"" + fname + "\",  \"" + lname + "\"  ,  \"" + phone
				+ "\"   ,  \"" + email + "\"   );");
	}

	public void delete(String fname) throws SQLException {
		System.out.println("Deleting Data of " + fname);
		stmt.executeUpdate("Delete from contact where fname=\"" + fname + "\";");
	}

}
