package assignment10.prob5.soln2;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestMain {
	@Test
	public void testSalaryGreaterThan100000() {
		Employee e1 = new Employee("Joe", "Andrews", 90000); //should not be included
		Employee e2 = new Employee("Bill", "Richards", 120000); //should be included
		Main m = new Main();
		assertTrue(m.salaryGreaterThan100000(e2));
		assertFalse(m.salaryGreaterThan100000(e1));
	}
	@Test
	public void testLastNameAfterM() {
		Employee e1 = new Employee("Joe", "Andrews", 90000); //should not be included
		Employee e2 = new Employee("Bill", "Richards", 120000); //should be included
		Main m = new Main();
		assertTrue(m.lastNameAfterM(e2));
		assertFalse(m.lastNameAfterM(e1));
	}
	@Test
	public void testFullName() {
		Employee e1 = new Employee("Joe", "Andrews", 90000); 
		Main m = new Main();
		assertEquals("Joe Andrews", m.fullName(e1));
	}
}
