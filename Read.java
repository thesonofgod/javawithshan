package com.AdJava;

import java.io.*;
public class Read {
public static void main(String[] args){
	System.out.println("Type a character:");
	int val =0;
	try{
		val = System.in.read();
	}
	catch(IOException ioe){
		System.err.println("cannot read input" +ioe);
		System.exit(-1);
		
	}
	System.out.println("You typed:" +val);
}
}
