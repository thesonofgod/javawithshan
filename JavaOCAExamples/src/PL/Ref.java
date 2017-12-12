package PL;
//233


import java.awt.List;
import java.util.*;

interface Contract {}
class Super implements Contract{}
class Sub extends Super{}
public class Ref {
	public static void main(String[] args) {
		final int x=10;
		//List objs = new ArrayList();
		//List obss=new LinkedList<>();
		Contract c1= new Super();
		Contract c2 = new Sub();
		Super s1 = new Sub();
		
		objs.add(c1);
		objs.add(c2);
		objs.add(s1);
		for(Object itm: objs){
			System.out.println(itm.getClass().getName());
		}
	}
}
