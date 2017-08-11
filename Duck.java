package com.AdJava;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Prashanth
 */
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function; 


public class Duck implements Comparable <Duck> { 
   
	private String name;
	private int weight;
	//Constructor
public Duck(String name, int weight) {
this.name = name; 
this.weight = weight;
}
 
   //toString method
public String toString() {
return name;
}
	//compare to method
public int compareTo(Duck d) { 
return name.compareTo(d.name);
} 

//public boolean equals(Object o){
	//return false;
//}

public static void main( String[] args) { 
List <Duck> ducks = new LinkedList<>(); 
/*ducks.add(new Duck("xamp"));
ducks.add(new Duck("bbbb"));
ducks.add(new Duck("bb"));
ducks.add(new Duck("cccccccccc"));
ducks.add(new Duck("ccccbbbbcc"));
ducks.add(new Duck("yessss"));
ducks.add(new Duck("yoooo"));
ducks.add(new Duck("mkkly"));
ducks.add(new Duck("yjio"));
ducks.add(new Duck("oksd"));
ducks.add(new Duck("mc"));
ducks.add(new Duck("asmda"));
ducks.add(new Duck("10"));

Collections.sort(ducks);
System.out.println(ducks); 
*/
Duck d1 = new Duck("ABC",11);
Duck d2 = new Duck("DEF",22);
Duck d3 = new Duck("XYZ",33);
Duck d4 = new Duck("123",44);

List<Duck> newlist = new ArrayList<>();
newlist.add(d1);
newlist.add(d2);
newlist.add(d3);
newlist.add(d4);


//newlist.replaceall(o->(o.setWeight(o.getWeight()*2); return o;));
//newlist.forEach(action);


BiFunction<String, String, String> mapper = (v1 , v2) -> null;
Map<String, String> favorites = new HashMap<>();
favorites.put("Jenny","Bus Tour");
favorites.put("Tom","Tram");
favorites.merge("Jenny", "Skyride", mapper);
favorites.merge("Tom","Skyride",mapper);
System.out.println(favorites);
// if the function is null, then the result is null

Map<String,Integer> counts = new HashMap<>();
counts.put("Jenny", 1);
counts.computeIfPresent("jenny", (k,v)-> null);
counts.computeIfAbsent("Sam", k -> null);
System.out.println(counts);

//IfPresent lo if null it overrides
//IfAbsent lo if null it is gone

Map<String,Integer> counts1 =new HashMap<>();
counts1.put("Jenny", 15);
counts1.put("tom", null);


Function<String,Integer> mapper1 = (k) -> 1;
Integer jenny =counts.computeIfAbsent(("Jenny"), mapper1);
Integer sam = counts.computeIfAbsent("Sam", mapper1);
Integer tom = counts.computeIfAbsent("Tom", mapper1);

System.out.println(counts);


 
ArrayDeque<String> greetings = new ArrayDeque<String>();

greetings.pop();
greetings.peek();
}


 


public Duck getName() {
	// TODO Auto-generated method stub
	return null;
}


public int getWeight() {
	// TODO Auto-generated method stub
	return 0;
} 
}

class Arraynew{
}
