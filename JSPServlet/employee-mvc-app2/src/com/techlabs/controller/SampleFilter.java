package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.techlabs.model.Employee;
import com.techlabs.service.EmployeeService;

/**
 * Servlet Filter implementation class LoginFilter
 */
//@WebFilter(value = { "/AddController", "/DeleteController", "/EditController", })
public class SampleFilter implements Filter {

	public SampleFilter() {
		// TODO Auto-generated constructor stub
	}


	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Inside Filter");
		EmployeeService service = EmployeeService.getInstance();
		List<Employee> employee = service.getEmployees();
		System.out.println(employee);
		chain.doFilter(request, response);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
