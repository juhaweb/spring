<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>LIst</title>
</head>
<body>
	<h3>LIst</h3>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>연락처</th>
			<th>나이</th>
			<th>설정</th>
		</tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.uid}</td>
				<td>${user.name}</td>
				<td>${user.hp}</td>
				<td>${user.age}</td>		
				<td>
					<a href="/ch08/user/modify?uid=${user.uid}">수정</a>
					<a href="/ch08/user/delete?uid=${user.uid}">삭제</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/ch08/user/register">등록하기</a>	

</body>
</html>