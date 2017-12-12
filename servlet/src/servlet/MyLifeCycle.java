package servlet;

import java.io.*;
import javax.servlet.*;

public class MyLifeCycle extends GenericServlet {

	public void init(ServletConfig config) throws ServletException {
	super.init(config);
	System.out.println("this is init");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException {

	System.out.println("this is service");

	}

	public void destroy(){
	System.out.println("this is destroy");
	}
}
