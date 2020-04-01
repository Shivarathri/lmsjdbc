<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./forward" method="POST">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" placeholder="Enter Id"></td>
			</tr>

			<tr>
				<td>NAME:</td>
				<td><input type="text" name="name" placeholder="Enter Name"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" placeholder="Enter Email"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>


		</table>
	</form>
</body>
</html>