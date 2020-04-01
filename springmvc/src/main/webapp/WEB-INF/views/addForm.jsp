<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./added" method="POST">
		<table>
			<tr>
				<td>EMPID:</td>
				<td><input type="text" name="id" placeholder="Enter Id"></td>
			</tr>

			<tr>
				<td>NAME:</td>
				<td><input type="text" name="name" placeholder="Enter Name"></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="text" name="mobileno" placeholder="Enter mobile"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="officialemail" placeholder="Enter Email"></td>
			</tr>
			<tr>
				<td>Designation:</td>
				<td><input type="text" name="designation" placeholder="Enter designation"></td>
			</tr>
			<tr>
				<td>Bloodgroup:</td>
				<td><input type="text" name="bloodgroup" placeholder="Enter bloodgroup"></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="salary" placeholder="Enter salary"></td>
			</tr>
			<tr>
				<td>Deptno:</td>
				<td><input type="text" name="deptno" placeholder="Enter deptId"></td>
			</tr>
			<tr>
				<td>DOJ:</td>
				<td><input type="text" name="doj" placeholder="Enter DOJ"></td>
			</tr>
			<tr>
				<td>ManagerId:</td>
				<td><input type="text" name="managerid" placeholder="Enter managerid"></td>
			</tr>
			<tr>
				<td>Password::</td>
				<td><input type="text" name="password" placeholder="Enter password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>


		</table>
	</form>
</body>
</html>