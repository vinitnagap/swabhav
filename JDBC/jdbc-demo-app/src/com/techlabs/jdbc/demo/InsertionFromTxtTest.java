package com.techlabs.jdbc.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertionFromTxtTest {
	public static void main(String[] args) throws Exception {
		ArrayList<String> data = getData();

		Connection conn = null;
		ResultSet res = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from candidate");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}
			for (String row : data) {
				String[] cell = row.split(",");
				int rows = stmt.executeUpdate("insert into candidate(id,name,location)\r\n" + " values(" + cell[0] + ",'"
						+ cell[1] + "','" + cell[2] + "')");
			}

			res = stmt.executeQuery("select * from candidate");
			System.out.println("After Insertion");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			conn.close();
		}
	}

	private static ArrayList<String> getData() {
		ArrayList<String> rows = new ArrayList<String>();
		try {
			File file = new File("candidate.txt");
			Reader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line;
			while ((line = buffer.readLine()) != null) {
				rows.add(line);
			}
			buffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}
}
