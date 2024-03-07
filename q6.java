package map_classwork;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
class player{
	int score;
	
	String id;
	player(int score,String id){
		this.score = score;
		
		this.id = id;
		
	}
}

public class q6 {
	

	public static void main(String[] args) {
		Map<Integer,player> obj = new TreeMap<>(Collections.reverseOrder());
		
		player obj1 = new player(100,"10");
		obj.put(obj1.score, obj1);
		
		obj1 = new player(200,"20");
		obj.put(obj1.score, obj1);
		
for(player p : obj.values()) {
			
			System.out.println(p.score +"," + p.id);
		}
		
		
		
		

	}

}