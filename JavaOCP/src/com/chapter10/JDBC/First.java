package com.chapter10.JDBC;

import java.sql.*;

public class First {
	public static void main(String[] args) throws SQLException {
	 
		Connection conn = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/");
		System.out.println(conn);
	}
}
