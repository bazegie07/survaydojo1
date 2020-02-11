<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<ul>
		<li>Name: <c:out value="${myName}" /></li>
		<li>Dojo Location: <c:out value="${myDojo}"/></li>
		<li>Favorite Language: <c:out value="${myLang}"/></li>
		<li>Comment: <c:out value="${myComment}"/></li>
	</ul>
</body>
</html>
