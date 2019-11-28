package com.ustglobal.webapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/req-att")

public class SetRequestAttributeServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("siri");
		req.setAttribute("obj", e);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/get-bean.jsp");
		dispatcher.forward(req, resp);
	}

}
