/* Test class for testing Annual Basic */

package Employee_Assignment;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestAnnualBasic {
	private Employee employee;
	
	@Before
	public void setUp(){
		employee= new Employee();
		employee.setName("Deepika Bachhav");
		employee.setID(102);
	}
	
	@Test
	public void TestPositiveAnnualBasic() {
		employee.setMonthlyBasic(1500);
		double annualBasic= employee.getAnnualBasic();
		assertEquals(18000.0,annualBasic,0.02);
	}
	
	@Test
	public void TestZeroAnnualBasic() {
		employee.setMonthlyBasic(0);
		double annualBasic= employee.getAnnualBasic();
		assertEquals(0.0,annualBasic,0.02);
	}
}
