package com.AdJava;

import java.util.function.*;



public class FindMatchingAnimals {
	
	public static void print(FunctionalProgramming animal,Predicate<FunctionalProgramming> trait){
		if(trait.test(animal))
			System.out.println(animal);
	}
	
	public static void main(String[] args){
		print(new FunctionalProgramming("fish",false,true,false), a -> a.canHop());
		print(new FunctionalProgramming("kangaroo",true,false,false), a -> a.canHop());
		
		print(new FunctionalProgramming("hummingbird",false,false,true), a -> a.canFly()); //prints
		print(new FunctionalProgramming("hummingbird",false,true,false), a -> a.canFly()); //nope
		print(new FunctionalProgramming("hummingbird",true,false,true), a -> a.canFly()); // prints
		print(new FunctionalProgramming("hummingbird",true,true,true), a -> a.canFly()); // prints
		
		print(new FunctionalProgramming("carsCanFly",false,false,true), a -> a.canFly()); //prints



		
	/*	print(new FunctionalProgramming("fish",false,true), a -> a.canSwim());
		print(new FunctionalProgramming("fish",false,true), a -> a.canHop());
		print(new FunctionalProgramming("fish",true,false), a -> a.canSwim());
		print(new FunctionalProgramming("fish",true,false), a -> a.canHop()); */



	}
}
