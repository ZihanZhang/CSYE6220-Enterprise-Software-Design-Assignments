import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Secondpage extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException{
		response.setContentType("text/html");
		if(!request.getMethod().equals("POST"))
			response.sendRedirect("/Assignment2Part2/Firstpage");
		PrintWriter out = response.getWriter();
		String title = "This is the second page";
		String docType = 
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +"Transitional//EN\">\n";
		out.println(
				docType +
				"<HTML>\n"+
				"<HEAD><TITLE>"+title+"</TITLE><HEAD>\n"+
				"<BODY>\n"+
				"<H1>This is the second page</H1>"+
				"</HTML>");
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		String title = "This is the second page";
		String docType = 
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +"Transitional//EN\">\n";
		out.println(
				docType +
				"<HTML>\n"+
				"<HEAD><TITLE>"+title+"</TITLE><HEAD>\n"+
				"<BODY>\n"+
				"<H1>This is the second page</H1>"+
				"</HTML>");
	}
}