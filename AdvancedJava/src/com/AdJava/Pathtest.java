package com.AdJava;

import java.io.*;
import java.net.URI;
import java.nio.file.*;

public class Pathtest {
public static void main(String[] args) throws IOException {
	
/*	Path path3 = Paths.get("E:\\data");
	Path path4 = Paths.get("D:\\user\\home");
	Path path5 = Paths.get("/users/prashanth/PathTest.java");
	Path path6 = Paths.get("prashanth/applications/keynote");
	

	System.out.println(path3.relativize(path4));
	System.out.println(path4.relativize(path3));
	System.out.println(path5.relativize(path6));
	System.out.println(path6.relativize(path5));*/
	final Path path3 = Paths.get("food");
	final Path path4 = Paths.get("/cage");
	System.out.println( path3.resolve(path4));
	
	//FileSystems.getDefault().getPath(first, more);
	//FileSystems.getDefault().
	
	
	final Path path = Paths.get(".").normalize();
	
	System.out.println(path.getNameCount());
	System.out.println(path.toString());
	System.out.println(path.equals("1"));
	
	int count =0;
	for(int i=0; i<path.getNameCount(); ++i){
		count++;
	}
	System.out.println("\n"+count+"\n");

	Path path1 = Paths.get("/user/root");
	Path path2 = Paths.get("/lion");
	
	System.out.println(path1.resolve(path2));
	
/*	Path p = Paths.get("/users/p");
	if(Files.isSameFile(p,Paths.get("/users/zoo/turkey"))){
		Files.createDirectory(p.resolve("/users/zoo/turkey/info")); 
	}*/
	
	//System.out.println(path5.relativize(path3));
	//System.out.println(path5.relativize(path4));
	//System.out.println(path6.relativize(path3));
	//System.out.println(path6.relativize(path3));
	//System.out.println(path3.resolve(relativepath).normalize());
	//Path path199 = Paths.get( new URI("file://c:/ zoo-info/ November/ employees.txt"));

	
//	Files.exists(Paths.get(/Prashanth/Login.class) );
	
/*	try{
		System.out.println(Paths.get("E:\\horse\food.source").toRealPath());
		System.out.println(Paths.get(".././food.txt").toRealPath());
		
	//	path3 = FileInputStream.class();
		
		
		
	boolean P = Files.isSameFile(Paths.get("/Library/Java/JavaVirtualMachine/jdk1.8.0_111.jdk/Contents/Home/bin/java"), Paths.get("/Library/Java/JavaVirtualMachine/jdk1.8.0_111.jdk/Contents/Home/bin/java"));	
	System.out.println(P);
		
	}catch(Exception e){
		
	}
	
	*/
	
	
	
	
	
	
}
}
