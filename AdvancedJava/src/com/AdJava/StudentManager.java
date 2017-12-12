package com.AdJava;


	import java.io.*;
import java.util.stream.Stream;

	/**
	 * Created by Prashanth on 18/07/17.
	 */
	public class StudentManager {

	    public static void main(String[] args) throws IOException {
	        File f = new File("Prashanth:\\test.txt");
	        f.createNewFile();
	        f.delete();
	        f.mkdir();
	        System.getProperty("file separator");

	        Console console = System.console();

	        console.writer().format("prashanth");

	        final String response = console.readLine("Are you Human?");
	        System.err.print(response);
	        Stream.of();
	    }
	}


