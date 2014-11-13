<%@page import="wc01oef4.Artikel" %>
<%@page import="wc01oef4.Model" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
</head>
<body>
	<% for(Artikel a : Model.getBasket()){
		%> 
			<ul>
				<li>
					<%= a.toString() %>
					<input type="submit" value="delete" onclick="">
				</li>
			</ul>
		<%
	}%>

</body>
</html>