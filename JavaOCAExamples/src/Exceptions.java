
public class Exceptions {

	public Exceptions() {
		// TODO Auto-generated constructor stub
	}
	
	public class Computer{
		public void compute() throws Exception{
			throw new NullPointerException("Null");
		}
	}

public static void main(String args[]) {
	
	try{	
		new Computer().compute();
		System.out.println("prashanth");
	}
	catch(RuntimeException e) {
		System.out.println("monkey");
		throw e;
	}
	
	
	
}
}
