<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>LIst</title>
	<style>
	table{width:100%; border:1px solid #efefef; max-width:1000px;}
	table tr{display:block;border-bottom:1px solid #efefef;}
	table tr:first-child{background:#333;color:#fff;}
	table tr:last-child{border-bottom:none;}
	table tr:nth-of-type(2n){background:#f7f8f9;}		
	table th:nth-of-type(1),td:nth-of-type(1) {width:10%;}
	table th:nth-of-type(2),td:nth-of-type(2) {width:10%;}
	table th:nth-of-type(3),td:nth-of-type(3) {width:20%;}
	table th:nth-of-type(4),td:nth-of-type(4) {width:10%;}
	table th:nth-of-type(5),td:nth-of-type(5) {width:20%;}
	table th:nth-of-type(6),td:nth-of-type(6) {width:10%;}
	table th:nth-of-type(7),td:nth-of-type(7) {width:20%;}
	
	</style>
</head>
<body>
	<h3>LIst</h3>
	
	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>연락처</th>
			<th>직급</th>
			<th>부서</th>
			<th>입사일</th>
			<th>설정</th>
		</tr>
		<c:forEach var="member" items="${members}">
			<tr>
				<td>${member.uid}</td>
				<td>${member.name}</td>
				<td>${member.hp}</td>
				<td>${member.pos}</td>
				<td>${member.dep}</td>		
				<td>${member.rdate.substring(0, 10)}</td>		
				<td>
					<a href="/ch08/member/modify?uid=${member.uid}">수정</a>
					<a href="/ch08/member/delete?uid=${member.uid}">삭제</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/ch08/member/register">등록하기</a>	

</body>
</html>