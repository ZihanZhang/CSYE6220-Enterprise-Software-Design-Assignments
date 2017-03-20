<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display</title>
</head>
<body>
<center>
<TABLE BORDER=\"1\">
<TR>
<TD>FirstName</TD>
<TD><%= request.getParameter("FirstName") %></TD>
</TR>
<TR>
<TD>MiddleName</TD>
<TD><%= request.getParameter("MiddleName") %></TD>
</TR>
<TR>
<TD>LastName</TD>
<TD><%= request.getParameter("LastName") %></TD>
</TR>
<TR>
<TD>Address</TD>
<TD><%= request.getParameter("Address") %></TD>
</TR>
<TR>
<TD>City</TD>
<TD><%= request.getParameter("City") %></TD>
</TR>
<TR>
<TD>State</TD>
<TD><%= request.getParameter("State") %></TD>
</TR>
<TR>
<TD>ZipCode</TD>
<TD><%= request.getParameter("ZipCode") %></TD>
</TR>
<TR>
<TD>Gender</TD>
<TD><%= request.getParameter("Gender") %></TD>
</TR>
<TR>
<TD>Month</TD>
<TD><%= request.getParameter("Month") %></TD>
</TR>
<TR>
<TD>Day</TD>
<TD><%= request.getParameter("Day") %></TD>
</TR>
<TR>
<TD>Year</TD>
<TD><%= request.getParameter("Year") %></TD>
</TR>
</center>
</body>
</html>