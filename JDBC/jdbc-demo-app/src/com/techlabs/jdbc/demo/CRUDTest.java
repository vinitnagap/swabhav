package com.techlabs.jdbc.demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDTest {

	public static java.sql.Connection conn = null;
	public static java.sql.Statement stmt = null;
	public static ResultSet res = null;

	public static void select() throws SQLException {
		System.out.println("Displaying Data");
		res = stmt.executeQuery("Select * from intern");
		while (res.next()) {
			System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
		}
		System.out.println();
	}

	public static void insert(int id, String name, String lang) throws SQLException {
		System.out.println("Inserting Data");
		int rows = stmt
				.executeUpdate("Insert into intern values(" + id + ",  \"" + name + "\"  ,  \"" + lang + "\"  );");
	}

	public static void update() throws SQLException {
		System.out.println("Updating Data");
		int rows = stmt.executeUpdate("update intern set id=110 where name=\"vinit\";");
	}

	public static void delete() throws SQLException {
		System.out.println("Deleting Data");
		int rows = stmt.executeUpdate("Delete from intern where name=\"vinit\";");
	}

	public static void main(String[] args) throws SQLException {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
			System.out.println("Successful Connection");
			stmt = conn.createStatement();
			select();
			update();
			select();
			delete();
			select();
			insert(123, "virat", "c++");
			select();

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