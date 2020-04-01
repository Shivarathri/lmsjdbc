<%@page import="java.util.Date"%>
<jsp:useBean id="user" class="com.capgemini.webapp.dto.User" scope="application"></jsp:useBean>
<%
	Date date = new Date();
%>

<% 
String msg="I MISS U";
%>

<html>
<body>
<h1 style="color:green"><%=date %></h1>
<h3><%=msg %></h3>
<h3><%=user.getId() %></h3>
<h3><%=user.getName() %></h3>
<h3><%=user.getEmail() %></h3>
</body>
</html>
