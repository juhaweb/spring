<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글목록</title> 
		<link rel="stylesheet" href="/sboard/css/style.css" />
	</head>
	<body>
		<div id="board">
			<h3>글목록</h3>
			<!-- 리스트 -->
			<div class="list">
				<p class="logout">${member.nick}님! 반갑습니다. <a href="/sboard/member/logout">[로그아웃]</a><p>
				<table>
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>글쓴이</td>
						<td>날짜</td>
						<td>조회</td>
					</tr>
				<c:forEach var="bvo" items="${articles}">
					<tr>
						<td>${count=count-1}</td>
						<td><a href="/sboard/view?seq=${bvo.seq}">${bvo.title}</a>&nbsp;[${bvo.comment}]</td>
						<td>${bvo.nick}</td>
						<td>${bvo.rdate.substring(2,10)}</td>
						<td>${bvo.hit}</td>
					</tr>
				</c:forEach>
				</table>
			</div>
			<!-- 페이징 -->
			<nav class="paging">
				<span> 
				<a href="#" class="prev">이전</a>
				<c:forEach var="n" begin="1" end="${pageEnd}">
					<a href="/sboard/list?pg=${n}" class="num">${n}</a>
				</c:forEach>
				<a href="#" class="next">다음</a>
				</span>
			</nav>
			<a href="/sboard/write" class="btnWrite">글쓰기</a>
		</div>
	</body>

</html>










