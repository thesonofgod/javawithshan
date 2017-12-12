package com.servlets.examples.prashanth;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class Login extends HttpServlet {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public void init(ServletConfig config) throws ServletException{
	super.init(config);
	System.out.println("im done");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        //String email = request.getParameter("email");
        String pass = request.getParameter("password");
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","atlanta");

        PreparedStatement ps=con.prepareStatement("insert into login values(?,?);");

        ps.setString(1, name);
       // ps.setString(2, email);
        ps.setString(2, pass);
        int i=ps.executeUpdate();
        
          if(i>0)
          {
            out.println("You are sucessfully registered");
          }
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	out.close();
      }
	
	
}