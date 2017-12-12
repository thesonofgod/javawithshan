package com.url.prashanth.project1;

import java.io.*;
import javax.servlet.*;
public class HtmlTextResponse extends GenericServlet {

	public void init(ServletConfig config) throws ServletException {
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {

	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	out.println("<html><body>");
	out.println("<h1 align=center>Prashanth</h1>");
	out.println("</body></html>");
	}

	public void destroy(){
	}
}

