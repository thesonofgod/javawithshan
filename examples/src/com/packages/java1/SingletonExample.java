package com.packages.java1;


/*
 * 
 * Author: Prashanth
 */
public class SingletonExample {
	
	private static SingletonExample Se;
	// have only one instance of a class
	
	
	// private constructor
	private static void SingletonExample() {	
	}
	
	// static method
	public static SingletonExample method1()
	{
		if (Se == null){
			Se = new SingletonExample();
		}
		return Se;
	}
}

class TestSingleton {
public static void main(String[] args)
{
	SingletonExample.method1();
	
	SingletonExample x = new SingletonExample();
	SingletonExample y = new SingletonExample();
	
	System.out.println(x);
	System.out.println(y);

	
	
}



}