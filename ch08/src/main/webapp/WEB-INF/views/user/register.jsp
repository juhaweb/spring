<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>REGISTER</title>
</head>
<body>
	<h3>REGISTER</h3>
	<hr>
	<form action="/ch08/user/register" method="post">
		<table border="1">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="uid"/></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<th>연락처</th>
				<td><input type="text" name="hp"/></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="text" name="age"/></td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" value="등록하기"/>
				</th>
			</tr>
			
		
		</table>
	</form>

</body>
</html>