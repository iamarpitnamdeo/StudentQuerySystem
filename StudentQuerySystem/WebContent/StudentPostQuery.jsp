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
<jsp:include page="StudentHeader.jsp"></jsp:include>
<form>
Enter Query
<textarea rows="5" cols="40"></textarea>
<input type="submit" name="b1" value="Submit Query">
</form>
<% if(request.getParameter("b1")!=null)
{
	try
    {
	 DBConnect x =new DBConnect();
	String sql="insert into studentquery(query,postbyemail,postbyname)"+"values('"+request.getParameter("q1")+"','"+
	session.getAttribute("email")+"','"+session.getAttribute("name")+"')";
	x.queryExecuter(sql);
	out.println("Query Post Successfully");
    }
catch(Exception ex)
{
	out.println(ex);
}

}

%>


</body>
</html>