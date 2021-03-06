package assignment9.prob11B;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;


public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer,Character, String> EMPLOYEE_NAME 
		= (list,salaryGreaterThan, lastNameStartWith) ->list.stream()
															.filter(emp->emp.getSalary()>salaryGreaterThan)
															.filter(emp->emp.getLastName().charAt(0)>lastNameStartWith)
															.map(e->Employee.fullName(e))
															.sorted()
															.collect(Collectors.joining(", "));
}
