package com.AdJava;

import javax.swing.Box;

//Generics
public class Generics<t> {

	public static void main(String[] args){
	}
	public static <t, T> Crate<t> ship(T t){
		System.out.println("preparing"+t);
		return new Crate<t>();			
	}
}

class Crate<t> {
	private Object contents; 
	public Object emptyCrate() {
		return contents; 
		} 
	public void packCrate( Object contents) { 
		this.contents = contents;
		} 
	}

