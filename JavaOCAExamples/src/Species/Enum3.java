package Species;


	enum prashanth { 
	 WINTER(" Low"), SPRING(" Medium"), SUMMER(" High"), FALL(" Medium"); 
private String expectedVisitors; 
private prashanth( String expectedVisitors) {
 this.expectedVisitors = expectedVisitors; 
} 
 public void printExpectedVisitors() { 
 System.out.println(expectedVisitors);
}
}
	

	//Boyarsky, Jeanne; Selikoff, Scott. OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide: Exam 1Z0-809 (p. 21). Wiley. Kindle Edition. 
	 class Enum3 {
		public static void main(String args[]) {
			for( prashanth s: prashanth.values()) { 
				s.printExpectedVisitors();
				System.out.println( s.name() + " " + s.ordinal()); 
				}
		
		}
	}
	

//Boyarsky, Jeanne; Selikoff, Scott. OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide: Exam 1Z0-809 (p. 22). Wiley. Kindle Edition. 