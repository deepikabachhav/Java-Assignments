/* Test class for testing monthly deductions */

package Employee_Assignment;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestMonthlyDeductions {
	private Employee employee;
	
	@Before
	public void setUp(){
		employee= new Employee();
		employee.setName("Deepika Bachhav");
		employee.setID(102);
	}
	
	@Test
	public void TestPositiveMonthlyDeductions() {
		employee.setMonthlyBasic(1500);
		double monthlyDeductions=employee.getMonthlyDeductions();
		assertEquals(121.25,monthlyDeductions,0.02);
	}
	
	@Test
	public void TestZeroeMonthlyDeductions() {
		employee.setMonthlyBasic(00);
		double monthlyDeductions=employee.getMonthlyDeductions();
		assertEquals(50,monthlyDeductions,0.02);
	}

}
