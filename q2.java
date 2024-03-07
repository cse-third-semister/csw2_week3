package map_classwork;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map <String,Long> phone  = new HashMap<>();
		
		while(true) {
			System.out.println("Enter 0  to exit otherwise enter any key ");
			 int i = sc.nextInt();
			 if(i==0) {
				 break;
			 }
			 else {
				 System.out.println("Enter your name");
				 
				 String s = sc.next();
				 System.out.println("Enter your Phone number");
				 
				 long c = sc.nextLong();
				 phone.put(s, c);
				 
				 
			 }
			 
			
			 
			 
			
		}
		System.out.println("Enter your name to find the phone number");
		String s1  = sc.next();
		
		
		System.out.println("Your number is "+ phone.get(s1));
		
		
		
		

	}

}