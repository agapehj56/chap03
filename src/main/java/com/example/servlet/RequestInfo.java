package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestinfo")
public class RequestInfo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>클라이언트 및 서버 정보</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h3>클라이언트 IP =" + request.getRemoteAddr() + "</h3>");
		out.println("<h3>요청정보길이 =" + request.getContentLength() + "</h3>");
		out.println("<h3>요청정보 인코딩 =" + request.getCharacterEncoding() + "</h3>");
		out.println("<h3>요청정보 컨텐츠타입 =" + request.getContentType() + "</h3>");
		out.println("<h3>요청정보 프로토콜 =" + request.getProtocol() + "</h3>");
		out.println("<h3>요청정보 전송방식 =" + request.getMethod() + "</h3>");
		out.println("<h3>요청정보 URI =" + request.getRequestURI() + "</h3>");
		out.println("<h3>컨텍스트 경로 =" + request.getContextPath() + "</h3>");
		out.println("<h3>서버이름 =" + request.getServerName() + "</h3>");
		out.println("<h3>서버포트 =" + request.getServerPort() + "</h3>");		
		
		out.println("</body>");
		out.println("</html>");
	}
}
