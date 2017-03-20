import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Firstpage extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "This is the First page";
		String docType = 
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +"Transitional//EN\">\n";
		out.println(
				docType+
				"<HTML>\n"+
				"<HEAD><TITLE>"+title+"</TITLE></HEAD>"+
				"<BODY>\n"+
				"<CENTER>\n"+
				"<H1>"+title+"</H1>"+
				"<FORM ACTION=\"/Assignment2Part2/Secondpage\" METHOD=\"POST\">\n"+
				"<INPUT TYPE=\"SUBMIT\">\n"+
				"</FORM>"+
				"</CENTER></BODY></HTML>"
				);
	}
}