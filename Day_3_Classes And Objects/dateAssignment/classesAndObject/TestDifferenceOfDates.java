/* Test class for testing  differnce on date */

package dateAssignment.classesAndObject;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestDifferenceOfDates {

	@Test
	public void TestDifferenceOfDates() {			//test for number of days,number of months and number of years.
		Date date=new Date(15,02,1996);
		Date dateTwo=new Date(16,06,1995);
		int[] difference= dateTwo.difference(date);
		assertEquals(1,difference[0]);
		assertEquals(4,difference[1]);
		assertEquals(1,difference[2]);
	}
	
	@Test
	public void TestDifferenceOfDatesDateTwoisBig() {
		Date date=new Date(15,02,1996);
		Date dateTwo=new Date(5,06,2012);
		int[] difference= dateTwo.difference(date);
		assertEquals(16,difference[0]);
		assertEquals(4,difference[1]);
		assertEquals(10,difference[2]);
	}
	
	@Test
	public void TestDifferenceOfDatesDateisBig() {
		Date date=new Date(15,02,1996);
		Date dateTwo=new Date(5,06,1992);
		int[] difference= dateTwo.difference(date);
		assertEquals(4,difference[0]);
		assertEquals(4,difference[1]);
		assertEquals(10,difference[2]);
	}



	
}
