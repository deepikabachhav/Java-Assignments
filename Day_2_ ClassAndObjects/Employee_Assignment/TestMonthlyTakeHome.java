/* Test class for testing monthly take home */

package Employee_Assignment;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestMonthlyTakeHome {
	private Employee employee;
	
	@Before
	public void setUp(){
		employee= new Employee();
		employee.setName("Deepika Bachhav");
		employee.setID(102);
	}
	

	@Test
	public void TestPositiveMonthlyTakeHome() {
		employee.setMonthlyBasic(1500);
		double monthlyTakeHome=employee.getMonthlyTakeHome();
		assertEquals(4178.75,monthlyTakeHome,0.02);
	}
	
	@Test
	public void TestZeroeMonthlyTakeHome() {
		employee.setMonthlyBasic(00);
		double monthlyTakeHome=employee.getMonthlyTakeHome();
		assertEquals(2000.0,monthlyTakeHome,0.02);
	}

	

}
