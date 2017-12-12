package com.oca.examples.chapter3;

import java.util.Arrays.*;

import java.util.*;


public class Arrays123 {


	public static void main(String [] args){
		
		
// Example 1
String [] bugs = { "cricket", "beetle", "ladybug" };
String [] alias = bugs;
System.out.println(bugs.equals(alias)); // true 
System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
	
// Example 2
	
	
	// String builder is not a string
// objects[0] = new StringBuilder(); Does not compile

/*
 * String[] strings = {"stringvalue"};
 * Object[] objects =  strings;
 * String[] againStrings =(String[]) objects;
 * againStrings[0] = new Stringbuilder(); does not compile
 * 
 */
	
// Example 3 01+89- rum4
                  //0123456
String[] mammals = {"monkey", "chimp", "donkey"};
System.out.println(mammals.length); 
System.out.println(mammals[0]);
System.out.println(mammals[1]);
System.out.println(mammals[2]);
int a =new Integer(1);

// Example 4
String[] birds = new String[6];
System.out.println(birds.length);

// Example 5
int[] numbers = new int[10];
for (int i = 0; i < numbers.length; i++) 
	numbers[i] = i + 5;

// Example 6

int[] numbers1 = { 6, 9, 1 };
Arrays.sort(numbers1);
for (int i = 0; i < numbers1.length; i++) 
	System.out.print (numbers1[i] + " ");

// Example 7

int[] numbers2 = {2,4,6,8};
System.out.println(Arrays.binarySearch(numbers2, 2)); // 0 
System.out.println(Arrays.binarySearch(numbers2, 4)); // 1 
System.out.println(Arrays.binarySearch(numbers2, 1)); // -1 
System.out.println(Arrays.binarySearch(numbers2, 3)); // -2 
System.out.println(Arrays.binarySearch(numbers2, 9)); // -5
	
/*
System.out.println(birds.isEmpty()); // true
System.out.println(birds.size()); // 0
birds.add("hawk"); 
birds.add("hawk");
	System.out.println("birds.isEmpty()");//false 
	System.out.println(birds.size();) // 2
birds.clear();
	System.out.println(birds.isEmpty()); // true
	System.out.println(birds.size()); // 0
	boolean contains(Object object)
	List<String> birds = new ArrayList<>();
	birds.add("hawk");
	System.out.println(bird.contains("hawk")); //true
	System.out.println(birds.contains("robin")); //false
	
	5
	
	*/
	}

}
