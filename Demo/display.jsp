<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey" align="center">
	<h1>
	Username : <%= request.getAttribute("un")%> 
	Password : <%= request.getAttribute("pw")%> 
	E-mail : ${em}
	Phone : ${pn}
	</h1>
</body>
</html>