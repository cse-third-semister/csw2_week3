package map_classwork;

import java.util.TreeMap;
import java.util.Map;
import java.util.*;

class Employee{
		
	
	private int id;
    private  double salary;
   static  double bonusPercentage;

   public Employee(int id, double salary, double bonusPercentage) {
        this.id = id;
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }
   

   
   @Override
   public String toString() {
       return "ID: " + id + ", Salary: " + salary + ", Bonus Percentage: " + bonusPercentage ;
   }
   
   
   

}

public class q8 {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Employee obj;
		Map <Double,Employee> emp = new TreeMap<>(Comparator.reverseOrder());
		for(int i=0;i<3;i++) {
			System.out.println("Enter id ");
			int id =  sc.nextInt();
			System.out.println("Enter salary ");
			double salary = sc.nextDouble();
			System.out.println("Enter bonus percentage ");
			double bonusPercentage = sc.nextDouble();
			
			obj = new Employee(id,salary,bonusPercentage);
			double b = salary * bonusPercentage;
			double bon = salary + b;
			emp.put(bon, obj);
		}
		System.out.println(emp);
		
		
		
		
		
	
		
		
		
		
		
		
	
		
		 
		

	}

}