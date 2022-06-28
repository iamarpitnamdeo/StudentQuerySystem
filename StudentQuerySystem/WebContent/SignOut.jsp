<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
session.removeAttribute("name");
session.removeAttribute("email");
session.removeAttribute("branch");
session.removeAttribute("usertype");

response.sendRedirect("login.html");

%>

</body>
</html>