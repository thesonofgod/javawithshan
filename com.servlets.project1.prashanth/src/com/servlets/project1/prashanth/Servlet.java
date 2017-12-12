package com.servlets.project1.prashanth;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class Servlet extends HttpServlet {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public void init(ServletConfig config) throws ServletException{
	super.init(config);
	System.out.println("im done");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("Firstname"+"Lastname");
        String Mailid = request.getParameter("Mail-Id");
        String PhoneNumber = request.getParameter("Phonenumber");
        String DateofBirth = request.getParameter("DOB");
        try{
        
        //loading drivers for mysql
        Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database 
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/USERDETAILS","root","atlanta");

        PreparedStatement ps=con.prepareStatement("insert into USERDETAILS values(?,?,?,?);");

        ps.setString(1, name);
        ps.setString(2, Mailid);
        ps.setString(3, PhoneNumber);
        ps.setString(4,  DateofBirth);
     
        
        int i=ps.executeUpdate();
          if(i>0)
          {
            out.println("REGISTERED");
            out.println();
            out.println(name);
            out.println(Mailid);
            out.println(PhoneNumber);
            out.println(DateofBirth);
          }
        
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
	out.close();
      }
}
