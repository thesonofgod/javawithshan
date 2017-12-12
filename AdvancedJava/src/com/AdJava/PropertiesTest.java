package com.AdJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

public class PropertiesTest {

	
	public static void main(String[] args) throws IOException{
		Properties xyz = new Properties();
	//	File f = new File("abc.txt");
		
		
	InputStream	input = new FileInputStream("config.properties");
	OutputStream output = new FileOutputStream("config.properties");
	xyz.load(input);
	System.out.println(xyz.getProperty("Name"));
	System.out.println(xyz.getProperty("Id"));
	
xyz.setProperty("Phone", "8167454214");
xyz.setProperty("Phone2", "98167454214");
	
	System.out.println(xyz.get("Phone"));
	
	System.out.println(xyz.contains("Prashanth"));
	
	xyz.store(output,null);	
	}
	
	
	
}
