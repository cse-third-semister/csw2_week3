package map_classwork;

import java.util.Map;
import java.util.TreeMap;
class employee{
	double salary;
	String name;
	String id;
	employee(double salary,String name,String id){
		this.salary = salary;
		this.name = name;
		this.id = id;
		
	}
}
public class q5 {

	public static void main(String[] args) {
		Map<Double,employee> obj = new TreeMap<>();
		
		employee obj1 = new employee(100,"jyoti","10");
		obj.put(obj1.salary, obj1);
		
		obj1 = new employee(10,"ram","30");
		obj.put(obj1.salary, obj1);
		
		obj1 = new employee(50,"hari","20");
		obj.put(obj1.salary, obj1);
		
		for(employee e : obj.values()) {
			
			System.out.println(e.name + "," + e.salary + "," + e.id);
		}
		
		
		
		
		

	}

}