package com.techlabs.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Employee;
import com.techlabs.service.EmployeeService;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Add Controller");
		UUID id = UUID.randomUUID();
		request.setAttribute("id", id);
		String name = request.getParameter("name");
		String role = request.getParameter("role");
		System.out.println(name + " " + role);
		Employee employee = new Employee(id, name, role);
		EmployeeService service = EmployeeService.getInstance();
		service.addEmployee(employee);
		// System.out.println(service.employees.size());
		response.sendRedirect("EmployeeController");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
		rd.forward(request, response);

	}

}
