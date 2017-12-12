package PL;

abstract class Animal { String name = "???";
public void printName() { 
	System.out.println( name);
	}
} 

class Lion extends Animal { 
	public void printName() {
		System.out.println(name);	
		} 
	String name = "Leo";
	
	
}

public class PlayWithAnimal  {
	
	public static void main( String... args) { 
		Lion animal = new Lion(); 
		animal.printName(); 
		animal.toString();
		Lion l1 =new Lion();
		int x=animal.hashCode();
		
		System.out.println(x);
		System.out.println(l1.hashCode());
		System.out.println(animal == l1);
		
		StringBuilder animal1 = new StringBuilder("xyz");
		StringBuilder l2 = new StringBuilder("xyz");
		
		System.out.println(animal1 == l2);
		
		System.out.println(animal1.hashCode());
		System.out.println(l2.hashCode());
		
		}

}
