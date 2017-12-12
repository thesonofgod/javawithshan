/*
 * 
 * 	Author: Prashanth 
 *	Date: 	06/06/2017
 */
class Rectangle1	
{  
 int length;  
 int width;  
 void insert(int l, int w){  
  length=l;  
  width=w;  
 }  
 void calculateArea(){System.out.println(length*width);}  
}  
public class TestRectangle1 {  
	 public static void main(String args[]){  
		  Rectangle1 r1=new Rectangle1();  
		  Rectangle1 r2=new Rectangle1();  
		  r1.insert(11,5);  
		  r2.insert(3,15);  
		  r1.calculateArea();  
		  r2.calculateArea();  
}  
}  