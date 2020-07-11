package com.techlabs.model.test;

import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import com.techlabs.model.Employee;

public class EmployeeHierarchy extends JFrame {

	Employee emp;
	Set<Employee> employees = emp.getEmployees();
	DefaultMutableTreeNode style;

	public EmployeeHierarchy() {
		// TODO Auto-generated constructor stub
		showData();
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void showData() {
		for (Employee employee : employees) {
			style = new DefaultMutableTreeNode(employee.getEmployeeName());
		}
		JTree jt = new JTree(style);
		this.add(jt);
	}
}
