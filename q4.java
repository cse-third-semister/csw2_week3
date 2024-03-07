package map_classwork;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class q4 {

	public static void main(String[] args) {
		Map <Character,Integer> obj  = new HashMap<>();
		String s = "jyotiranjanmahapatra";
		for(int i=0;i<s.length();i++) {
			obj.put(s.charAt(i), obj.getOrDefault(s.charAt(i), 0)+1);
			
		}
		System.out.println(obj);
		
		
		
		
		
	

	}

}