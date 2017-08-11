package com.AdJava;

import java.util.*;
import java.util.ArrayList;


class Dragon{}

class Unicorn{}

public class LegacyUnicorns<l> { 
	 public static void main( String[] args) { 
		//  java.util.List <Unicorn> unicorns = new java.util.ArrayList < >(); 
		//  addUnicorn( unicorns); 
		  List<? extends Exception> l = new ArrayList<RuntimeException>();
		//  Unicorn unicorn = unicorns.get( 0);// ClassCastException 
		  
	 }}

	 
//private static void addUnicorn(java.util.List<Unicorn> unicorns){
//	unicorns.add(new Dragon());
//}}

//Boyarsky, Jeanne; Selikoff, Scott. OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide: Exam 1Z0-809 (p. 116). Wiley. Kindle Edition. 