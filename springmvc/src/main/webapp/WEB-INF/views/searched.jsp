<%@page import="com.capgemini.springmvc.bean.EmployeePrimaryInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	EmployeePrimaryInfo info = (EmployeePrimaryInfo) request.getAttribute("bean");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeDetailes</title>
</head>
<body>
	<%
		if (info != null) {
	%>
	<div align="center">
		<table border="1" style="width: 70%">

			<tr style="background: navy; color: white;">
				<th>Id</th>
				<th>Name</th>
				<th>Offiacialmail</th>
				<th>mobileno</th>
				<th>Deptno</th>
				<th>bloodgroup</th>
				<th>salary</th>
				<th>Designation</th>
				
				<th>manager Id</th>
				<th>doj</th>
			</tr>
			<tr>
				<td><%=info.getId()%></td>
				<td><%=info.getName()%></td>
				<td><%=info.getOfficialemail()%></td>
				<td><%=info.getMobileno()%></td>
				<td><%=info.getBloodgroup()%></td>
				<td><%=info.getDesignation()%></td>
				<td><%=info.getSalary() %></td>
				<td><%=info.getDeptno() %></td>
				<td><%=info.getDoj()%></td>
				<td><%=info.getManagerid()%></td>

			</tr>

		</table>


	</div>
	<%} %>
</body>
</html>