package com.AdJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test182 {
public static void main(String[] args){
	Comparator < Integer > c = (o1, o2) -> o2-o1; 
	List < Integer > list = Arrays.asList( 5, 4, 7, 1);
	
	Collections.sort( list, c); 
	System.out.println( Collections.binarySearch( list, 1));
	List <Integer> q = new LinkedList<>();
	q.add(10);
	q.add(12);
	q.remove(1);
	System.out.print(q);
	
	
	
	
}
//	Boyarsky, Jeanne; Selikoff, Scott. OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide: Exam 1Z0-809 (p. 167). Wiley. Kindle Edition. 
}
