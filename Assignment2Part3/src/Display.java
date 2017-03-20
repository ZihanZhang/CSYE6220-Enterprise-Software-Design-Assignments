import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Display extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String docType = 
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +"Transitional//EN\">\n";
		out.println(
				docType+
				"<HTML>\n"+
				"<HEAD><TITLE>Display</TITLE></HEAD>\n"+
				"<BODY>\n"+
				"<CENTER>\n"+
				"<TABLE BORDER=\"1\">\n"+
				"<TR>\n"+
				"<TD>FirstName</TD>"+
				"<TD>"+request.getParameter("FirstName")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>MiddleName</TD>"+
				"<TD>"+request.getParameter("MiddleName")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>LastName</TD>"+
				"<TD>"+request.getParameter("LastName")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>Address</TD>"+
				"<TD>"+request.getParameter("Address")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>City</TD>"+
				"<TD>"+request.getParameter("City")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>State</TD>"+
				"<TD>"+request.getParameter("State")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>ZipCode</TD>"+
				"<TD>"+request.getParameter("ZipCode")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>Gender</TD>"+
				"<TD>"+request.getParameter("Gender")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>Month</TD>"+
				"<TD>"+request.getParameter("Month")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>Day</TD>"+
				"<TD>"+request.getParameter("Day")+"</TD>"+
				"</TR>"+
				"<TR>\n"+
				"<TD>Year</TD>"+
				"<TD>"+request.getParameter("Year")+"</TD>"+
				"</TR>"
				);
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		
	}
}