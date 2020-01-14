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
	
	<c:forEach var="bbb" items="${aaa}">
		<p> 
			아이디 : ${bbb.uid} <br/>
			이   름 : ${bbb.name} <br/>
			휴대폰 : ${bbb.hp} <br/>
			나   이 : ${bbb.age} <br/>
		</p>
	</c:forEach>	


</body>
</html>