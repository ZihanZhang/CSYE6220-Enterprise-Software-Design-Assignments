<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form</title>
</head>
<body>
<center>
<h1>Form</h1>
<FORM ACTION="/Assignment2Part3jsp/Display.jsp" METHOD="POST">
<INPUT TYPE="TEXT" NAME="FirstName">FirstName<BR>
<INPUT TYPE="TEXT" NAME="MiddleName">MiddleName<BR>
<INPUT TYPE="TEXT" NAME="LastName">LastName<BR>
<INPUT TYPE="TEXT" NAME="Address">Address<BR>
<INPUT TYPE="TEXT" NAME="City">City<BR>
<INPUT TYPE="TEXT" NAME="State">State<BR>
<INPUT TYPE="TEXT" NAME="ZipCode">ZipCode<BR>
<INPUT TYPE="RADIO" NAME="Gender" VALUE="Male">Male
<INPUT TYPE="RADIO" NAME="Gender" VALUE="Female">Female<BR>
BirthDate:<SELECT NAME="Month">
<%for(int i=1;i<=12;i++){
	out.println(
	"<OPTION VALUE=\""+i+"\">"+i+"</OPTION>\n");
	} %>
</SELECT>
<SELECT NAME="Day">
<%for(int i=1;i<=31;i++){
	out.println(
	"<OPTION VALUE=\""+i+"\">"+i+"</OPTION>\n");
	} %>
</SELECT>
<SELECT NAME="Year">
<%for(int i=1950;i<2017;i++){
	out.println(
	"<OPTION VALUE=\""+i+"\">"+i+"</OPTION>\n");
	} %>
</SELECT><BR>
<INPUT TYPE="SUBMIT">
</FORM>
</center>
</body>
</html>