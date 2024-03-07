package map_classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	Map <String,Character> obj = new HashMap<>();

	while(true) {
		System.out.println("Enter 0  to exit otherwise enter input ");
		 int i = sc.nextInt();
		 if(i==0) {
			 break;
		 }
		 else {
			 System.out.println("Enter your name");
			 
			 String s = sc.next();
			 System.out.println("Enter your grade");
			 
			 char c = sc.next().charAt(0);
			 obj.put(s, c);
			 
			 
		 }
		 
		
		 
		 
		
	}
	System.out.println(obj);
	
	
	

	}

}