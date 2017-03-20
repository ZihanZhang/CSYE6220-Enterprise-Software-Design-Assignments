package zihansearch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

import zihansearch.zihanhttpclient;

@WebServlet("/ZihanSearch")
public class ZihanSearch extends HttpServlet {
	static String q,fq,begin_date,end_date,url="https://api.nytimes.com/svc/search/v2/articlesearch.json";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		q=request.getParameter("query");
		this.begin_date=request.getParameter("begin_date");
		this.end_date=request.getParameter("end_date");
		url +='?'+"q="+q+'&'+"begin_date="+begin_date+'&'+"end_date"+end_date;
		zihanhttpclient zc=new zihanhttpclient();
		try {
			zc.run(url);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		out.println("Query:"+q+" "+"Begin date:"+begin_date+" "+"End date:"+end_date);
		out.println("************************************************************");
		for(int i=0;i<zc.len;i++){
			out.println(zc.headline[i]);
			out.println(zc.web_url[i]);
			out.println();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
