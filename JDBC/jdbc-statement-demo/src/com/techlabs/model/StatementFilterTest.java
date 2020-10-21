package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StatementFilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		String empNo = sc.nextLine();
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			java.sql.Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from emp where EMPNO=" + empNo);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
						+ " " + rs.getDate(5) + " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
