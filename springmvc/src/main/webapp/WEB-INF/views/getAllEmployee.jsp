<%@page import="java.util.List"%>
<%@page import="com.capgemini.springmvc.bean.EmployeePrimaryInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	List<EmployeePrimaryInfo> info = (List<EmployeePrimaryInfo>) request.getAttribute("list");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% if (info != null) { %>
	<div align="center">
		<table border="1" style="width: 70%">
			<tr style="background: navy; color: white;">
				<th>Id</th>
				<th>Name</th>
				<th>Offiacialmail</th>
				<th>mobileno</th>
				<th>Deptno</th>
				<th>Designation</th>
				<th>salary</th>
				<th>bloodgroup</th>

				<th>manager Id</th>
				<th>doj</th>
				<th>password</th>
			</tr>

		<tr>
			<% for(EmployeePrimaryInfo employeeInfoBean : info) { %>
			<tr>
			<td><%=employeeInfoBean.getId() %></td>
			<td><%=employeeInfoBean.getName() %></td>
			<td><%=employeeInfoBean.getOfficialemail() %></td>
			<td><%=employeeInfoBean.getMobileno() %></td>
			
			<td><%=employeeInfoBean.getDeptno() %></td>
			<td><%=employeeInfoBean.getDesignation() %></td>
			<td><%=employeeInfoBean.getSalary() %></td>
			<td><%=employeeInfoBean.getBloodgroup() %></td>
			
			<td><%=employeeInfoBean.getManagerid() %></td>
			<td><%=employeeInfoBean.getDoj() %></td>
			<td><%=employeeInfoBean.getPassword() %></td>
			</tr>
			<%} %>
		
		
		
		</tr>

		</table>
	</div>
	<%} %>
</body>
</html>