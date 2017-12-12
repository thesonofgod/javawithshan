

package com.packages.java1;

public class Course {
String s1;
String s2;
String s3;
public String subject3;

public Course(String subject1, String subject2,String subject3){
	this.s1 = subject1;
	this.s2 = subject2;
	this.s3 = subject3;
}
}

class Jumm implements Cloneable{

	int id;
	String name;
	Course course;
	
	public Jumm(int id, String name,Course course)
	    {
	        this.id = id;
	        this.name = name;
	    }
	
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}


public static class C{
	
	public static void main(String[] args){
		 
		Course science = new Course("Physics", "Chemistry", "Biology");
		  
	        Jumm student1 = new Jumm(111, "John", science);
	 
	        Jumm student2 = null;
		 try
	        {
	 
	            student2 = (Jumm) student1.clone();
	        }
	        catch (CloneNotSupportedException e)
	        {
	            e.printStackTrace();
	        }
	 
		 System.out.println(student1.course.subject3);         //Output : Biology
		 
	 
	        student2.course.subject3 = "Maths";
	 
	 
	        System.out.println(student1.course.subject3);       //Output : Maths
	    
	}
}
	
	// http://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/
}