package com.AdJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arraylists {

	
	public static void main(String[] args){
		
		List<String> l1= new ArrayList<>();
		l1.add(null);
		l1.add("prashanth");
		
		List<?> l2 = new ArrayList<>(l1);
		System.out.println(l2);
		System.out.println(l1);
		
		List <? extends Object> l3 = new ArrayList<>(l2);
		System.out.println(l3);
		
		List <? super Object> l4 = new ArrayList<>(l3);
		System.out.println(l4);
		
		List l5 = new ArrayList<>();
		l5.add("prashanth");
		System.out.println("l5: "+ l5);
		
		System.out.println(l2.toString());
		

		List<String> l6 = new ArrayList<String>();
		l6.add("prashanth");
		System.out.println("l6: "+ l6);
		

		List l7 = new ArrayList<String>();
		l7.add("prashanth");
		System.out.println("l7: "+ l7);
		

		List<String> l8 = new ArrayList<>();
		l8.add("prashanth");
		System.out.println("l8: "+ l8);
		
		List<? super Double> l9 = new ArrayList<>();
		l9.add(null);
		l9.add(10.50);
		System.out.println(l9);
		
		System.out.println("l9:" +l9.toString());
		

		List<? super String> l10 = new ArrayList<>();
		l10.add("prashanth");
		l10.add(null);
		l10.add("0");
		System.out.println("l10: "+ l10);
		
		System.out.println(l10.toString());
		

		List<? extends Double> l11 = new ArrayList<>();
		l11.add(null);
		System.out.println(l11);
		
		List<?> l12 = new ArrayList<>(l11);
		System.out.println("l12: " + l12);
		
		List<? super Object> l13 = new ArrayList<>();
		System.out.println("l13 " + l13 );
		System.out.println(l13.add(null));
		
	//	List<? extends String> l14 = new ArrayList<>(l11);
	//	System.out.println("l14 " + l14 );
		
		
		//Defining a set and adding elements into it:
		Set< String > set = new HashSet < >();

		System.out.println(set.add(null));
		System.out.println(set.add(null));
		System.out.println(set.add(null));
		
		List<Object> e = new ArrayList<>();
		e.add("Mahesh");
		e.add("prashanth");
		e.add("Mahesh");
		System.out.println("Mahesh " +e.contains("Mahesh"));
		System.out.println("Mahesh " +e.contains("Mahesh"));
		System.out.println("Empty :" +e.isEmpty());
		
		List<Object> o = new ArrayList<>();
		o.add(e);
		System.out.println("prashanth: " +o.contains("prashanth"));
		System.out.println("Mahesh: " +o.contains("Mahesh"));
		
		
		List<Object> x = e;
		System.out.println("prashanth: " +x.contains("prashanth"));
		System.out.println("Mahesh: " +x.contains("Mahesh"));
		
		System.out.println("New Object to E :"+o.equals(e));
		System.out.println("Same Object to E :"+x.equals(e));
		
		
	//	List<Shan> list = new ArrayList<>(); 
		//list.add(new Shan("prashanth",10));
		//list.add(new Shan("is learning Java",30));
		
	//	System.out.println("\n"+list);
		

}


}