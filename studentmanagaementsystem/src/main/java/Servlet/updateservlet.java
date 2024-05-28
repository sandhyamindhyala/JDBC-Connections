package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.studentservice;
import dbconnection.studentdb;
import models.studentmodel;
@WebServlet("/update")
public class updateservlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("Name");
		String email = req.getParameter("Email");
		String branch = req.getParameter("Branch");
		String pinnum = req.getParameter("Pinnum");
		studentmodel std = new studentmodel(name,email,branch,pinnum);
		studentservice service = new studentservice(studentdb.conn());
		boolean f = service.updatestu(std);
		if(f) {
			resp.sendRedirect("welcome.jsp");
		}
		else {
			resp.sendRedirect("welcome.jsp");
		}
		
	}

}
