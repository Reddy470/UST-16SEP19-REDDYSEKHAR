<%@page import="com.ustglobal.webapp.beans.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Retailer bean = (Retailer) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./logout" style="float: right;">LogOut</a>
	<h2>
		Welcome <%=bean.getName()%></h2>

	<fieldset>
		<legend>Search Product</legend>
		<form action="./search">
			<table>
				<tr>
					<td>ID</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
	Retailer retailerBean = (Retailer)request.getAttribute("bean");
	
	%>
	<% 
	if(retailerBean !=null){
		%>
	<table border="1" style="color: green;">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
		</tr>

		<tr>
			<td><%= retailerBean.getId()%></td>
			<td><%= retailerBean.getName()%></td>
			<td><%= retailerBean.getEmail()%></td>
		</tr>

	</table>

	<%
	} 
	%>
	<h3>${msg}</h3>
</body>
</html>