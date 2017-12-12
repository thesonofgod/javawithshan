package PL;

import Species.BigCat;

public class SmallCat extends BigCat {
	
	public static void main( String[] args) {
		SmallCat cat = new SmallCat();
		System.out.println( cat.name);
		System.out.println( cat.hasFur); 
		System.out.println( cat.hasPaws); 
		System.out.println( cat.id);
	}

//	Boyarsky, Jeanne; Selikoff, Scott. OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide: Exam 1Z0-809 (pp. 2-3). Wiley. Kindle Edition. 
}
