
interface Area1 {
	public void var(int a, int b);
}


interface Areas {
	public void vars(int s);
}

class Square implements Areas{
	public void vars(int s) {
	System.out.println("The area of square is:  " + s*s);
	}
}

class Rectangle implements Area1 {
	public void var(int a, int b) {
		System.out.println("The area of rectangle:  "+a*b);
}
}
class Triangle implements Area1 { 
	public void var(int a, int b) {
		System.out.println("The area of triangle:  " + 0.5*a*b);
	}
}

public class AArea {
	public static void main(String[] args){
		Areas a =  new Square();
		a.vars(10);
		Rectangle a1 = new Rectangle();
		a1.var (5,6);
		Triangle a2 = new Triangle();
		a2.var(5,6);
	}
}
