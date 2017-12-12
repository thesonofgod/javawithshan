package com.packages.java1;

import java.util.ArrayList;
import java.util.List;

class A {} 
class B extends A { } 
class C extends B { 

	
	public static void main(String[] args){
		
List <?> list1 = new ArrayList<>();
 
 
 list1.add("c");
 
 
 
//List <? extends A > list2 = new ArrayList < A >(); 
// List <? super A > list3 = new ArrayList < A >(); 
 //List <? extends B > list4 = new ArrayList < A >();  
 //List <? super B > list5 = new ArrayList < A >();
 //List <?> list6 = new ArrayList <? extends A >();
List <String> l2 = (List<String>) list1;
	}
}

