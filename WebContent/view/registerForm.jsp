<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Register Page</title>
</head>

<style>
div.ex {
	text-align: center;
	width: 40%;
	padding: 10px;
	border: 5px solid grey;
	margine: 20px
}
</style>

<body>
	<h1>Register Form</h1>
	
	<div class="ex">
		<form action="/homeworkLogin/doRegister" method="post">
			<table cellpadding="5">
				<h3>Enter Information Here!</h3>
				<tr>
					<td width="45%">���̵�</td>
					<td width="55%"><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>��й�ȣ</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>�̸�</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>����</td>
					<td>
						<input type="radio" name="gender" value="men" />����
						<input type="radio" name="gender" value="women" />����
					</td>
				</tr>
				<tr>
					<td>�̸���</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="register" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>