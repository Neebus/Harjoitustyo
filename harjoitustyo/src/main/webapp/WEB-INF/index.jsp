<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<title>List of Artist names</title>
	<link rel="stylesheet" href="/styles/demo.css">
</head>

<body>

	<h1>List of Artist names</h1>

	<c:forEach items="${artistit}" var="artisti">
		<c:out value="${artisti.name}"/><br/>
	</c:forEach> 
	

</body>
</html>