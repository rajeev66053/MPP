package assignment9.prob11A;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//Expected Output  Alice Richards, Joe Stevens, John Sims, Steven Walters
		  System.out.println(emps.stream()
				  .filter(e->e.getSalary()>100000)
				  .filter(e->e.getLastName().charAt(0)>'M')
				  .filter(e->e.getLastName().charAt(0)<='Z')
				  .map(e->Employee.fullName(e))
				  .sorted()
				  .collect(Collectors.joining(", "))
				  );
				               
		  

	}
	
}
