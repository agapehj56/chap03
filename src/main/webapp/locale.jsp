<%@page import="java.util.Locale"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>locale.jsp</title>
</head>
<body>
<h1>로케일 리스트 locale.jsp</h1>
<strong>현재시간 : <%= new Date() %></strong>
<strong>합계 : <%= 1+2+3 %></strong>
<%
	out.println("<hr>");
	out.println("<hr>");
%>
<ol>
<%
	ArrayList<String> list = getLocaleNames();
	for (int i=0; i<list.size(); i++) {
%>
	<li><%=list.get(i) %></li>
<%
	}
%>
</ol>

<%!
	ArrayList<String> getLocaleNames() {
		ArrayList<String> list = new ArrayList<>();
		Locale[] locales = Locale.getAvailableLocales();
		
		for(Locale l : locales) {
			list.add(l.getDisplayName());
		}
		
		return list;
}
%>
</body>
</html>