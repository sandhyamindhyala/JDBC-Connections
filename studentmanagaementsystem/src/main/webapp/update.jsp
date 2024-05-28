<%@page import="models.studentmodel"%>
<%@page import="dbconnection.studentdb"%>
<%@page import="Services.studentservice"%>
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
String Pinnum = request.getParameter("Pinnum");
studentservice service = new studentservice(studentdb.conn());
studentmodel s= service.getbystu(Pinnum);

%>
<form action="update" method="post">
<input type="text" placeholder="Enter Name" name="Name" value="<%=s.getName()%>">
<input type="email" placeholder="Enter Email" name="Email" value="<%=s.getEmail()%>">
<input type="text" placeholder="Enter Branch" name="Branch" value="<%=s.getBranch()%>">
<input type="hidden" placeholder="Enter Pinnum" name="Pinnum" value="<%=s.getPinnum()%>">
<button>Update</button>

</form>
</body>
</html>