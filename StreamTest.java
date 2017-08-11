package com.AdJava;


import java.io.*;

public class StreamTest {

	public static void main(String[] args) 	{
		try{
			PrintStream ps = new PrintStream("log.txt");
			
			System.setOut(ps);
			System.out.println("test output to System.out");
			System.out.println("test output to System.out");
			ps.write(1);
			ps.flush();
			ps.close();
			
			
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		
		
	}
	
	
	
}
