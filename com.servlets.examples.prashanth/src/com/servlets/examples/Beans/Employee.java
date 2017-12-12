package com.servlets.examples.Beans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
		
	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String pass = request.getParameter("password");
	        String Eid = request.getParameter("employeeid");
	        try{
	        
	        //loading drivers for mysql
	        Class.forName("com.mysql.jdbc.Driver");

		//creating connection with the database 
	          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","atlanta");

	        PreparedStatement ps=con.prepareStatement("insert into login values(?,?,?,?);");

	        ps.setString(1, name);
	        ps.setString(2, email);
	        ps.setString(3, pass);
	        ps.setString(4, Eid);
	        
	        
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
