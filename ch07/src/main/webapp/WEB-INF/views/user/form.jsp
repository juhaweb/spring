<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>form</title>
</head>
<body>

	<h1>직원 등록하기</h1>
	<hr>

	<form action="/ch07/user/register" method="post" >
		<table border="1">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="uid" /></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<th>휴대폰</th>
				<td><input type="text" name="hp" /></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="등록하기" />
				</td>
			</tr>
		</table>
	</form>
	
	
</body>
</html>