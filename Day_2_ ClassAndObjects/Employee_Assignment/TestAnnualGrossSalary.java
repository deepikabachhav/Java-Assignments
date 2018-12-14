/* Test case for testing Annual Gross Salary */

package Employee_Assignment;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestAnnualGrossSalary {
	private Employee employee;
	
	@Before
	public void setUp(){
		employee= new Employee();
		employee.setName("Deepika Bachhav");
		employee.setID(102);
	}
	
	@Test
	public void TestPositiveAnnualGrossSalary() {
		employee.setMonthlyBasic(1500);
		double annualGrossSalary=employee.getAnnualGrossSalary();
		assertEquals(51600.0,annualGrossSalary,0.02);
	}
	
	@Test
	public void TestZeroAnnualGrossSalary() {
		employee.setMonthlyBasic(0);
		double annualGrossSalary=employee.getAnnualGrossSalary();
		assertEquals(24600.0,annualGrossSalary,0.02);
	}

}
