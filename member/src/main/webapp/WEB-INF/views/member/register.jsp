<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>REGISTER</title>
</head>
<body>
	<h3>REGISTER : 직원등록</h3>
	<hr>
	<form action="/member/member/register" method="post">

		<table border="1">
		<tr>
			<th>아이디</th>
			<td><input type="text" name="uid"></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>휴대폰</th>
			<td><input type="text" name="hp" maxlength="13"></td>
		</tr>
		<tr>
			<th>직급</th>
			<td>
				<select name="pos">
					<option>사원</option>
					<option>대리</option>
					<option>과장</option>
					<option>차장</option>
					<option>부장</option>			
				</select>
			</td>
		</tr>
		<tr>
			<th>부서</th>
			<td>
				<select name="dep">
					<option value="101">영업1부</option>
					<option value="102">영업2부</option>
					<option value="103">영업3부</option>
					<option value="104">영업4부</option>
					<option value="105">영업지원부</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>입사일</th>
			<td><input type="date" name="rdate"></td>
		</tr>
		<tr>
			<th colspan="2">
			<input type="submit" value="등록하기">
			<input type="button" value="뒤로가기" onclick="history.back(-1);">
			</th>
		</tr>				
		</table>
	</form>

</body>
</html>