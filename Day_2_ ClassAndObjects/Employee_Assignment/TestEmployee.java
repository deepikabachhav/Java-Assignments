package Employee_Assignment;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestEmployee {

	@Test
	public void test() {
		Employee employee= new Employee();
		employee.setName("Deepika Bachhav");
		employee.setID(102);
		employee.setMonthlyBasic(1500);
		double annualBasic= employee.getAnnualBasic();
		assertEquals(18000.0,annualBasic,0.02);
		double monthlyGrossSalary=employee.getMonthlyGrossSalary();
		assertEquals(4300.0,monthlyGrossSalary,0.02);
		double annualGrossSalary=employee.getAnnualGrossSalary();
		assertEquals(51600.0,annualGrossSalary,0.02);
		double monthlyDeductions=employee.getMonthlyDeductions();
		assertEquals(121.25,monthlyDeductions,0.02);
		double monthlyTakeHome=employee.getMonthlyTakeHome();
		assertEquals(4178.75,monthlyTakeHome,0.02);
		double annualTakeHome=employee.getAnnualTakeHome();
		assertEquals(50145.0,annualTakeHome,0.02);
//		double PFRate=employee.setPFRate(20.0);
//		assertEquals(20.0,PFRate,0.02);
//		double PFRate1=employee.getPFRate();
//		assertEquals(20.0,PFRate1,0.02);
	}
}
