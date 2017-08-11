package com.AdJava;

public class FunctionalProgramming {

	private String species;
	private boolean canHop;
	private boolean canSwim;
	private boolean canFly;
	public FunctionalProgramming(String speciesName,boolean hopper, boolean swimmer,boolean flyier){
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
		canFly = flyier;
	}
	public boolean canHop(){ return canHop;}
	public boolean canSwim(){ return canSwim;}
	public boolean canFly(){ return canFly;}
	public String toString(){ return species; }	
}

//interface CheckTrait {
//	public boolean test(FunctionalProgramming a);
//}


