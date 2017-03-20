import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Form extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType = 
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +"Transitional//EN\">\n";
		out.println(
				docType+
				"<HTML>\n"+
				"<HEAD><TITLE>FORM</TITLE></HEAD>"+
				"<BODY>\n"+
				"<CENTER>\n"+
				"<H1>FORM</H1>"+
				"<FORM ACTION=\"/Assignment2Part3/Display\" METHOD=\"POST\">"+
				"<INPUT TYPE=\"TEXT\" NAME=\"FirstName\">"+"FirstName"+"<BR>\n"+
				"<INPUT TYPE=\"TEXT\" NAME=\"MiddleName\">"+"MiddleName"+"<BR>\n"+
				"<INPUT TYPE=\"TEXT\" NAME=\"LastName\">"+"LastName"+"<BR>\n"+
				"<INPUT TYPE=\"TEXT\" NAME=\"Address\">"+"Address"+"<BR>\n"+
				"<INPUT TYPE=\"TEXT\" NAME=\"City\">"+"City"+"<BR>\n"+
				"<INPUT TYPE=\"TEXT\" NAME=\"State\">"+"State"+"<BR>\n"+
				"<INPUT TYPE=\"TEXT\" NAME=\"ZipCode\">"+"ZipCode"+"<BR>\n"+
				"<INPUT TYPE=\"RADIO\" NAME=\"Gender\" VALUE=\"Male\">"+"Male"+
				"<INPUT TYPE=\"RADIO\" NAME=\"Gender\" VALUE=\"Female\">"+"Female"+"<BR>\n");
				
				out.println("BirthDate:");
		
		        out.println("<SELECT NAME=\"Month\">\n");
				for(int i=1;i<=12;i++){
				out.println(
				"<OPTION VALUE=\""+i+"\">"+i+"</OPTION>\n");
				}
				out.println("</SELECT>");
				
				out.println("<SELECT NAME=\"Day\">\n");
				for(int i=1;i<=31;i++){
				out.println(
				"<OPTION VALUE=\""+i+"\">"+i+"</OPTION>\n");
				}
				out.println("</SELECT>");
				
				out.println("<SELECT NAME=\"Year\">\n");
				for(int i=1950;i<2017;i++){
				out.println(
				"<OPTION VALUE=\""+i+"\">"+i+"</OPTION>\n");
				}
				out.println("</SELECT>");
				out.println("<BR>\n");
				
				out.println("<INPUT TYPE=\"SUBMIT\">\n");

				
				out.println("</FORM></CENTER></BODY></HTML>");
	}
}