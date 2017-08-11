package com.AdJava;

import java.io.*;

public class Echo {
	public static void main(String[] args){
		Console console = System.console();
		//System.err.println();
		if(console == null){
			System.err.println("cannot retrieve console object - are you running your application from an IDE? Exiting the Application ...");
			System.err.println("ERROR");
			System.exit(-1);
		}
		console.printf(console.readLine());
		System.err.println();
		}

}
