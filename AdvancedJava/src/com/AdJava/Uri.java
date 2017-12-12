package com.AdJava;

import java .io.*;
import java.nio.file.*;
import java.net.URI;

public class Uri {

	public Uri(File file){}
public static void main(String[] args) throws IOException{
	//Path P1 = Paths.get( new URI(" ftp:// username:password@ ftp.the-ftp-server.com"));
	
	//isabsolute is boolean

	Path p = Paths.get("/users/prashanth/PathTest.java");
	System.out.println(" Filename is: "+ p.getFileName());

	//Boyarsky, Jeanne; Selikoff, Scott. OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide: Exam 1Z0-809 (p. 464). Wiley. Kindle Edition. 
	
//	File f = Files.exists("/users/prashanth/PathTest.java",main);
	System.out.println(p);
	URI U1 = p.toUri();
	System.out.println(U1);
	
	
	
	

//	Boyarsky, Jeanne; Selikoff, Scott. OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide: Exam 1Z0-809 (p. 459). Wiley. Kindle Edition. 
}
}
