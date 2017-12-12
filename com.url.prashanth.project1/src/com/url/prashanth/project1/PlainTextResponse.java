package com.url.prashanth.project1;

import java.io.*;
import javax.servlet.*;

	public class PlainTextResponse extends GenericServlet {

		
		public void init(ServletConfig config) throws ServletException {
		}

		public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {
		res.setContentType("text/plain");
		PrintWriter Out = res.getWriter();
		Out.println("this is plain text");
		}

		public void destroy(){
		}
	}

