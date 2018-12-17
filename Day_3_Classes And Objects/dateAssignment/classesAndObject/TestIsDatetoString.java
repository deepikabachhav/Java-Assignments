/* Test class for testing date in dd/mm/yyyy format using toString method */

package dateAssignment.classesAndObject;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestIsDatetoString {

	@Test
	public void TestValidDateFormat() {					//test for valid date format.
		Date date=new Date(28,2,1997);
		String dateOne= date.toString();
		assertEquals("Date : 28/2/1997",dateOne);
	}
	
	@Test
	public void TestInValidDateFormat() {					//test for invalid date format.
		Date date=new Date(15,2,1996);
		String dateOne= date.toString();
		assertNotEquals("Date : 15\2\1996",dateOne);
	}
	/*
	@Test
	public void TestInValidDate() {					//test for invalid date .(nov has not 31 days)
		Date date=new Date(31,11,1996);
		String dateOne= date.toString();
		assertEquals("Date : 31/11/1996",dateOne);    //invalid date is entered
	}
	*/
}
