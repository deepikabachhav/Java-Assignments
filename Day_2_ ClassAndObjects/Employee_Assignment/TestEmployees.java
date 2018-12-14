package Employee_Assignment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestEmployeeName.class,TestAnnualBasic.class, TestAnnualGrossSalary.class,TestAnnualTakeHome.class,TestMonthlyDeductions.class,TestmonthlyGrossSalary.class,TestMonthlyTakeHome.class})
public class TestEmployees {

}
