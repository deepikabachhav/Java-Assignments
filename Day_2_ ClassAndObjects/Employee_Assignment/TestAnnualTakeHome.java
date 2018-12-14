/* Test class for testing annual take home*/

package Employee_Assignment;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestAnnualTakeHome {
	private Employee employee;
	
	@Before
	public void setUp(){
		employee= new Employee();
		employee.setName("Deepika Bachhav");
		employee.setID(102);
	}
	

	@Test
	public void TestPositiveAnnualTakeHome() {
		employee.setMonthlyBasic(1500);
		double annualTakeHome=employee.getAnnualTakeHome();
		assertEquals(50145.0,annualTakeHome,0.02);
	}
	
	@Test
	public void TestZeroeAnnualTakeHome() {
		employee.setMonthlyBasic(00);
		double annualTakeHome=employee.getAnnualTakeHome();
		assertEquals(24000.0,annualTakeHome,0.02);
	}

}
