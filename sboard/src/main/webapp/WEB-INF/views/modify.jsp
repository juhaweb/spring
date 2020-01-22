<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글쓰기</title> 
		<link rel="stylesheet" href="/sboard/css/style.css" />
	</head>
	<body>
		<div id="board">
			<h3>글수정</h3>
			<div class="write">
				<form action="/sboard/modify" method="post">
				<input type="hidden" name="seq" value="${article.seq}"/>
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="subject" value="${article.title}" required /></td>
						</tr>				
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" required>${article.content}</textarea>
							</td>
						</tr>
						<tr>
							<td>첨부파일</td>
							<td></td>
						</tr>
					</table>
					<div class="btns">
						<a href="#" class="cancel">취소</a>
						<input type="submit" class="submit" value="수정완료" />
					</div>
				</form>
			</div>
		</div>
	</body>
</html>


