<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ZIHAN SEARCH</title>
</head>
<body>
<%@page import="zihansearch.*" %>
<center>
<h1>ZIHAN SEARCH</h1>
<form action="/Assignment3Part3/ZihanSearch" method="get">
<b>query</b><input type="text" name="query"><br>
<b>begin date(YYYYMMDD)</b><input type="text" name="begin_date"><br>
<b>end date(YYYYMMDD)</b><input type="text" name="end_date"><br>
<input type="submit">
</center>
</body>
</html>