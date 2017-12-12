package com.AdJava;

import java.util.*;
import java.util.function.BiFunction;
public class AnimalBuilder { 
	private String species; 
private int age; 
private List <String> favoriteFoods; 
public AnimalBuilder setAge( int age) {
	this.age = age; 
	return this; 
	} 
public AnimalBuilder setSpecies( String species) {
	this.species = species; 
	return this;
	}
public AnimalBuilder setFavoriteFoods(List < String > favoriteFoods) { 
	this.favoriteFoods = favoriteFoods; 
	return this; 
	} 
public Animal build() { 
	System.out.println(species+" "+ age+" "+favoriteFoods);
	return new Animal( species, age, favoriteFoods);
	}


public static void main(String[] args){
	/*AnimalBuilder duckBuilder = new AnimalBuilder();
	duckBuilder.setAge(23).setFavoriteFoods(Arrays.asList("glass","fish","cool")).setSpecies("duck");
	Animal duck = duckBuilder.build();
	Animal flamingo = new AnimalBuilder().setAge(22).setFavoriteFoods(Arrays.asList("algae","insects")).setSpecies("flamingo").build();
	*/
List<Integer> List= Arrays.asList(1,2,3);
List.stream().map(s-> s * 2).peek(System.out::println).count();

//BiFunction<Integer,Double,Integer> val = (t1,T2) -> t1+T2;
// cannot convert Integer to Double




	}
	
}


//Boyarsky, Jeanne; Selikoff, Scott. OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide: Exam 1Z0-809 (pp. 87-88). Wiley. Kindle Edition. 