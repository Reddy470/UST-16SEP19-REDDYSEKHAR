<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./form" method="post">
		<table border="1">
			<tr>
				<td>ID</td>
				<td><input type="number" name="id" placeholder="enter id....">
				</td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"
					placeholder="enter name...."></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password"
					placeholder="enter password...."></td>
			</tr>
			<tr>
				<td>Gender</td>

				<td><input type="radio" name="gender" value="male">Male</td><br>
				<td><input type="radio" name="gender" value="female">Female</td><br>
				<td><input type="radio" name="gender" value="others">Others</td>
			
			</tr>
			
			<tr>
			<td>DOJ</td>
			<td><input type="date" name="doj"></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit"></td>
				<td><input type="submit" name="reset"></td>
				

			</tr>
		</table>


	</form>

</body>
</html>
