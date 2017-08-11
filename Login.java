package com.AdJava;

import java.io.*;
import java.util.Arrays;

//code to illustrate the use of readPassword method
public class Login {
public static void main(String[] args){
	Console console = System.console();
	if(console!= null){
		String userName = null;
		char[] password = null;
		userName = console.readLine("Enter your username:");
		password = console.readPassword("Enter your password:"); //typed password will not be displayed in the console
		//password is a char[]: convert it to a string
if(userName.equals("scrat")&&new String(password).equals("nuts")){
	
	console.printf("login successful\n");
}
else{
	console.printf("login unsuccessful");
}
Arrays.fill(password,' ');
	}
	
	
}
	
}
