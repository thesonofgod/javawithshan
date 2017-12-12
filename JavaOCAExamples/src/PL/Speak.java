package PL;

public class Speak {
public static void main(String[] args) {
		Speak speakIt = new Tell();
		Tell tellIt = new Tell();
		//speakIt.tellitLikeItIs();
		//(Truth)speakIt.tellitLikeItIs();
		((Truth)speakIt).tellitLikeItIs();
		tellIt.tellitLikeItIs();
	//	(Truth)tellIt.tellitLikeItIs();
		((Truth)tellIt).tellitLikeItIs();
}		
}
class Tell extends Speak implements Truth {
	public void tellitLikeItIs() {
		System.out.println("Right on!");
		
	}
}
interface Truth { public void tellitLikeItIs(); }
