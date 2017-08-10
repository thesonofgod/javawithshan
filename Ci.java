import java.io.*;
import java.util.Scanner;
import java.net.*;


public class Ci{

		
		
		public static void main(String[] args) throws Exception{
		
		
			int temp;
		Scanner sc = new Scanner(System.in);
		
		// Socket is nothing but a interface that used for communication between client and server 
		
		//Simple socket
		//server socket
		
		// ----> Simple Socket
		
		Socket s = new Socket("2601:cb:4100:7e9d:b411:bb4e:681b:bf6",1342);
		Scanner sc1 = new Scanner(s.getInputStream());
		
		System.out.println("Enter any number");
		number = sc.nextInt();
		PrintStream p = new PrintStream(s.getOutputStream());
		
		p.println(number);
		temp = sc1.nextInt();
		System.out.println(temp);
		
		
		
		
		}

}