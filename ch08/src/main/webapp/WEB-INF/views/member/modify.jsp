<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>MODIFY</title>
</head>
<body>
<h3>수정하기</h3>
	<hr>
	<form action="/ch08/member/modify" method="post">
		<table border="1">
		<tr>
			<th>아이디</th>
			<td><input type="text" name="uid" readonly="readonly" value="${member.uid}"/></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" value="${member.name}"/></td>
		</tr>
		<tr>
			<th>휴대폰</th>
			<td><input type="text" name="hp" maxlength="13"  value="${member.hp}"/></td>
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
			<th colspan="2">
			<input type="submit" value="수정하기">
			<input type="button" value="뒤로가기" onclick="history.back(-1);">
			</th>
		</tr>				
		</table>
		
		<table border="1">
			<tr>
				<th>아이디</th>
				<td><input type="text"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="${member.name}"/></td>
			</tr>
			<tr>
				<th>연락처</th>
				<td><input type="text" name="hp" value="${member.hp}"/></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="text" name="age" value="${member.age}"/></td>
			</tr>
		
		</table>
	</form>


</body>
</html>