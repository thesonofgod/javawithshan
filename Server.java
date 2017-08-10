import java.net.*;
import java.util.*;
import java.io.IOException;
import java.io.*;

public class Server{
	public static void main(String[] args) throws IOException{
		
		int number,temp;
		
		ServerSocket s1 = new ServerSocket(1342);
		Socket sserver = s1.accept();
		Scanner sc = new Scanner(sserver.getInputStream());
		  
		//accepts some data from the client getInputSteam()
		  
		number = sc.nextInt();
		
		
		temp = number*2; 
			
		PrintStream p = new PrintStream(sserver.getOutputStream());
		p.println(temp);
		
		
	}

}