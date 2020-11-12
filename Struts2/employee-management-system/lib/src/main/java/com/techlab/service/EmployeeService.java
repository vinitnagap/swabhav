package com.techlab.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Employee;

public class EmployeeService {
	private static EmployeeService instance;

	private EmployeeService() {

	}

	public static EmployeeService getInstance() {
		if (instance == null) {
			instance = new EmployeeService();
		}
		return instance;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from employee2");

			while (res.next()) {
				System.out.println(res.getInt(1) + res.getString(2) + res.getString(3) + res.getDouble(4));

				employees.add(new Employee(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4)));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employees;
	}

	public void updateEmployee(int id, String name, String designation, double salary) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			int rows = stmt.executeUpdate("update employee2 set name='" + name + "',designation='" + designation
					+ "',salary='" + salary + "' where id='" + id + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertEmployee(String name, String designation, double salary) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			System.out.println("Inside Insert");
			int rows = stmt.executeUpdate("insert into employee2(name,designation,salary) values('" + name + "','"
					+ designation + "','" + salary + "')");
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Employee getEmployeeById(int id) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from employee2 where id='" + id + "'");

			while (res.next()) {
				// System.out.println(res.getInt(1) + res.getString(2) + res.getString(3));
				return new Employee(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4));
			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void deleteEmployee(int id) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			System.out.println("Delete Employee");
			int rows = stmt.executeUpdate("delete from employee2 where id ='" + id + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
