<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>list</title>
</head>
<body>
	<h1>List</h1>
	<hr>
	<ul>
	<li> 아이디 / 이름 / 휴대폰 / 나이
		<c:forEach var="bbb" items="${aaa}">
			<li> ${bbb.uid} | ${bbb.name} | ${bbb.hp} | ${bbb.age} </li>
		</c:forEach>	
	</ul>

</body>
</html>