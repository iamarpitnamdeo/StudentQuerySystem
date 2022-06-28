<%@page import="java.sql.*" %>
<%@page import="Database.DBConnect" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="TeacherHeader.jsp"></jsp:include>
<table>
<tr>
<td>Query</td>
<td>Posted by</td>
<td>Posted Date</td>
<td>Reply</td>
</tr>
<%
try
{
	DBConnect x= new DBConnect();
	String sql="select * from studentquery";
	ResultSet rs=x.queryReturner(sql);
	while(rs.next())
	{
		
	}
}
catch(Exception ex)
{}

%>
</table>
</body>
</html>