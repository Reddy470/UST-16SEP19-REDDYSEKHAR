<%@page import="com.ustglobal.webapp.beans.Product"%>
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
		Welcome
		<%=bean.getName()%></h2>

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
	Product productBean = (Product)request.getAttribute("bean");
	
	%>
	<% 
	if(productBean !=null){
		%>
	<table border="1" style="color: green;">
		<tr>
			<th>OrderId</th>
			<th>ProductName</th>
			<th>PricePerUnit</th>
			<th>Quantity</th>
			<th>AmountPayable</th>
			<th>Retailer Id</th>
		</tr>
		<tr>
			<td><%=productBean.getOrderId()%></td>
			<td><%=productBean.getProductName()%></td>
			<td><%=productBean.getPriceperUnit()%></td>
			<td><%=productBean.getQuantity()%></td>
			<td><%=productBean.getAmountPayble()%></td>
			<td><%=bean.getId()%></td>
		</tr>

		<td>
			<form action="./buy">
				<input type="hidden" name="bid" value="<%= productBean.getOrderId() %>" />
				<input type="submit" value="Buy" />
			</form>
		</td>

	</table>

	<%
	} 
	%>
	<h3>${msg}</h3>
</body>
</html>