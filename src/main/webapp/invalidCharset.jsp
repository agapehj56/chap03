<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.Date"%>
<%
	Date now = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>현재 시간</title>
</head>
<body>
현재 시각: 
<%= now %>
</body>
</html>