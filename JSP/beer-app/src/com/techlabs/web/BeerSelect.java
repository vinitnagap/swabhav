package com.techlabs.web;

import com.techlabs.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String c = request.getParameter("color");

		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);

//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Beer Selection Advice <br>");

		request.setAttribute("styles", result);

		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);

	}
}
