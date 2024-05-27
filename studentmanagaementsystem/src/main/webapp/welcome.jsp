<%@page import="dbconnection.studentdb"%>
<%@page import="Services.studentservice"%>
<%@page import="models.studentmodel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="registe">
<button>REGISTER</button>
</a>
<table border= 1>
<thead>
<tr>
<th>PIN</th>
<th>NAME</th>
<th>EMAIL</th>
<th>BRANCH</th>
<th>ACTIONS</th>
</tr>
</thead>
<tbody>
<%
studentservice service = new studentservice(studentdb.conn());
List<studentmodel> st = service.getallstu();
for(studentmodel s:st){
	
 %>
 <tr>
<td><%= s.getPinnum()%></td>
<td><%= s.getName()%></td>
<td><%= s.getEmail()%></td>
<td><%= s.getBranch()%></td>
<td>
<button>UPDATE</button>
<button>DELETE</button>
</td>
</tr>
<% } %>


</tbody>
</table>
</body>
</html>