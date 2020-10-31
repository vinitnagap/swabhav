package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Employee;
import com.techlabs.service.EmployeeService;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/EditController")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
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
		PrintWriter out = response.getWriter();
		String id = (String) request.getParameter("empId");
		EmployeeService service = EmployeeService.getInstance();
		out.print(id);

		for (Employee employee : service.getEmployees()) {
			if (employee.getId().equals(id)) {
				request.setAttribute("editEmployee", employee);
				RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
				rd.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("Name");
		String role = request.getParameter("Role");
		String id = request.getParameter("id");
		EmployeeService service = EmployeeService.getInstance();
		for (Employee employee : service.getEmployees()) {
			if (employee.getId().equals(id)) {
				employee.setName(name);
				employee.setRole(role);
				RequestDispatcher rd = request.getRequestDispatcher("EmployeeController");
				rd.forward(request, response);
			}
		}
	}

}
