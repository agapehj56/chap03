<!DOCTYPE html>
<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="UTF-8">
<title>currentpage hjmin</title>
</head>
<body>
<h1 onclick="xxx(event)">My name is hjmin</h1>

<%
	String countStr = request.getParameter("count");
	int count = Integer.parseInt(countStr);
	
	for(int i=0; i<count; i++) {
		
%>
<h2><%= new Date() %></h2>
<%
	}
%>

<script type="text/javascript">
	function xxx(event) {
		alert(event.target.innerHTML);
	}
</script>
</body>
</html>