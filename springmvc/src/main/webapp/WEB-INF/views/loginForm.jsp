<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Auth Employee</legend>
		<form action="./loginEmployee">
			EmployeeId: <input type="number" name="id" required>
			&nbsp;&nbsp;&nbsp;&nbsp;
			Employee Password: <input type="text" name="password" required>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" value="Login">

		</form>

	</fieldset>
</body>
</html>