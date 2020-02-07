<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글보기</title> 
		<link rel="stylesheet" href="/www/css/style.css" />
	</head>
	<body>
		<div id="board">
		<p style="display:block;text-align:right; padding:10px;">${member.nick}님! 반갑습니다. <a href="/www/member/logout">[로그아웃]</a></p>
			<h3>글보기</h3>
			<div class="view">
				<form action="#" method="post">
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="subject" value="${boardArticleVO.title}" readonly />
							</td>
						</tr>
						<tr>
							<td>첨부파일</td>
							<td>
								<c:if test="${boardArticleVO.file == 1}">
									<a href="#">${boardArticleVO.file}</a>
									<span>회 다운로드</span>
								</c:if>
							</td>
						</tr>
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" readonly>${boardArticleVO.content}</textarea>
							</td>
						</tr>
					</table>
					<div class="btns">
						<a href="/www/delete?seq=${boardArticleVO.seq}" class="cancel del">삭제</a>
						<a href="/www/modify?seq=${boardArticleVO.seq}" class="cancel mod">수정</a>
						<a href="/www/list" class="cancel">목록</a>
					</div>
				</form>
			</div><!-- view 끝 -->
			
			<!-- 댓글리스트 -->
			<section class="comments">
				<h3>댓글목록</h3>
				
				<c:forEach var="bvo" items="${comments}">
					<div class="comment">
						<span>
							<span>${bvo.uid}</span>
							<span>${bvo.rdate.substring(2,10)}</span>
						</span>
						<textarea>${bvo.content}</textarea>
						<div>
							<a href="/www/comment/delete?seq=${bvo.seq}" class="del">삭제</a>
							<a href="#" class="mod">수정</a>
						</div>
					</div>
				</c:forEach>
				
				<c:if test="${empty comments}">
				<p class="empty">
					등록된 댓글이 없습니다.
				</p>
				</c:if>
			</section>
			
			<!-- 댓글쓰기 -->
			<section class="comment_write">
				<h3>댓글쓰기</h3>
				<div>
					<form action="/www/comment/write" method="post">
						<input type="hidden" name="parent" value="${boardArticleVO.seq}" />
						<textarea name="comment" rows="5"></textarea>
						<div class="btns">
							<a href="#" class="cancel">취소</a>
							<input type="submit" class="submit" value="작성완료" />
						</div>
					</form>
				</div>
			</section>
		</div><!-- board 끝 -->
	</body>

</html>










