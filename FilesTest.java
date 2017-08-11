package com.AdJava;



import java.nio.file.*;
import java.nio.file.attribute.UserPrincipal;
import java.io.*;
import java.util.*;


public class FilesTest {
	
	public static void main(String[] args) throws Exception{
		Path p = Paths.get("/Users/Prashanth/First.java");
		Path p1 = Paths.get("/users/prashanth/desktop/Test2.java");
		//Files.copy(p, p1);
		//Files.copy(p, p1);
		Files.move(p, p1,StandardCopyOption.REPLACE_EXISTING);
		
		
		
		UserPrincipal x = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("prashanth");
		
		
	}
}
