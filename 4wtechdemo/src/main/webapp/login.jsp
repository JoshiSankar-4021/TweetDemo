<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tweet</title>
</head>
<body>
	<center>
	<table>
		<tr>
			<td>
			 <label for="uname"><b>Username</b></label>
			</td>
			<td>
			<input type="text" placeholder="Enter Username" name="uname" required>
			</td>
		</tr>
		<tr>
			<td>
			 <label for="pwd"><b>Password</b></label>
			</td>
			<td>
			<input type="password" placeholder="Enter Password" name="pwd" required>
			</td>
		</tr>
	</table>
	<button>
	Login
	</button>
	<div>
		Dosen't have Account? 
		<a href='http://localhost:8080/4wtechdemo/index.jsp'>
		Signup
		</a>
	</div>
	</center>
</body>
</html>