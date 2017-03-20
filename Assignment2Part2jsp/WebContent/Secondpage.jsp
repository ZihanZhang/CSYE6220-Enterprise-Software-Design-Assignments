<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is the Second Page</title>
</head>
<body>
<%! String title="This is the Second Page"; %>
<h1><%= title%></h1>
<% if(!request.getMethod().equals("POST"))
	response.sendRedirect("/Assignment2Part2jsp/Firstpage.jsp"); %>
</body>
</html>