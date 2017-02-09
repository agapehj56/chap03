package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/current")  // URL Mapping
public class CurrentDateServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String countStr = req.getParameter("count");
		int count = 0;
		if(countStr != null)
			count = Integer.parseInt(countStr);
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>current hjmin</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 onclick='xxx(event)'>My name is hjmin</h1>");
		
		for(int i=0; i<count; i++) {
			out.println("<h2>" + i + " current = " + new Date() + "</h2>");		
		}
		
		out.println("<script>");
		out.println("	function xxx(event) {");
		out.println(" 		alert(event.target.innerHTML);");
		out.println(" 	}");
		out.println("</script>");
		out.println("</body>");
		out.println("</html>");
	}
}
