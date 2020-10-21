package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MultiTransactionTest {

	private static Statement stmt = null;
	private static Connection conn = null;

	public static void main(String args[]) throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
		stmt = conn.createStatement();
		System.out.println("connection successful");

		try {
			conn.setAutoCommit(false);
			stmt.executeUpdate("update customers set balance= balance-500 where id =1");
			stmt.executeUpdate("update merchant set balance= balance+500 where id =1111");
			stmt.executeUpdate("update customers set balance= balance-1000 where id =2");
			stmt.executeUpdate("update merchant set balance= balance+1000 where id =1111");
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			e.printStackTrace();
		}

	}

}
