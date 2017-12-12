package com.oca.examples.chapter3;

public class Equality {
	public static void main(String[] args){

StringBuilder one = new StringBuilder(); 
StringBuilder two = new StringBuilder(); 
StringBuilder three = one.append("a");
System.out.println(one==two); // false
System.out.println(one==three); // true

// Example 2: 
String x = "Hello World";
String y = "Hello World"; 
System.out.println(x == y); // true

// Example 3:
String a = "Hello World";
String b = " Hello World".trim(); 
System.out.println(a == b); // false


// Example 4:
String x1 = new String("Hello World"); // points to a new location
String y1 = "Hello World"; 
System.out.println(x1 == y1); // false

// Example 5:
String x2 = "Hello World";
String z2 = " Hello World".trim(); 
System.out.println(x2.equals(z2)); // true

// Example 6:
Equality t1 = new Equality();
Equality t2 = new Equality();
System.out.println(t1 == t2); // false 
System.out.println(t1.equals(t2)); // false


}
	}