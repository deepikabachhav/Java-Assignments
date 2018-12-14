/* Test class for testing monthly gross salary */

package Employee_Assignment;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestmonthlyGrossSalary {
	private Employee employee;
	
	@Before
	public void setUp(){
		employee= new Employee();
		employee.setName("Deepika Bachhav");
		employee.setID(102);
	}
	
	@Test
	public void TestPositivetmonthlyGrossSalary() {
		employee.setMonthlyBasic(1500);
		double monthlyGrossSalary=employee.getMonthlyGrossSalary();
		assertEquals(4300.0,monthlyGrossSalary,0.02);
	}
	
	@Test
	public void TestZerotmonthlyGrossSalary() {
		employee.setMonthlyBasic(0);
		double monthlyGrossSalary=employee.getMonthlyGrossSalary();
		assertEquals(2050.0,monthlyGrossSalary,0.02);
	}


}
