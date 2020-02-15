<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>HomePage</h1>
	<table border="1">
		<tr>
			<td>#</td>
			<td>username</td>
			<td>password</td>
			<td>email</td>
		</tr>
		<c:forEach items="${users}" var="users">
			<tr>
				<td>${users.id}</td>
				<td>${users.username}</td>
				<td>${users.password}</td>
				<td>${users.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>