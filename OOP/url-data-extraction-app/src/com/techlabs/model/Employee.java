package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empId;
	private String empName;
	private String role;
	private int managerId;
	private Date joiningDate;
	private int salary;
	private int comm;
	private int deptId;

	Employee(int empId, String empName, String role, int managerId,
			String joiningDate, int salary, int comm, int deptId)
			throws ParseException {
		this.empId = empId;
		this.empName = empName;
		this.role = role;
		this.managerId = managerId;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		this.joiningDate = (Date) dateFormat.parse(joiningDate);
		this.salary = salary;
		this.comm = comm;
		this.deptId = deptId;
	}

	public int getEmployeeId() {
		return empId;
	}

	public String getEmployeeName() {
		return empName;
	}

	public String getRole() {
		return role;
	}

	public int getManagerId() {
		return managerId;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public int getSalary() {
		return salary;
	}

	public int getComm() {
		return comm;
	}

	public int getDeptId() {
		return deptId;
	}
}
