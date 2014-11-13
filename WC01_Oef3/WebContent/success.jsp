<%@page import="wc01.oef3.Persoon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Persoon p = (Persoon)session.getAttribute("user"); %>
	Awel <%= p.getNaam()  %>, login naam <%= p.getLogin() %> jong? nie echt origineel! En dan da paswoord: <%= p.getPassw() %>! Ook niet
	echt veilig é! Pas maar op want ik weet ook u huis wonen é! Hoe zit dat daar op het <%= p.getAdres() %>?
</body>
</html>