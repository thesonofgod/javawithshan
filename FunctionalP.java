package com.AdJava;

public class FunctionalP {

	public static void main(String[] args){
		Thread th = new Thread(()->System.out.println("in another Thread"));
		th.start();
	System.out.println("in main");	
	}
	
}
