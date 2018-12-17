/* Test for checking smaller date */

package dateAssignment.classesAndObject;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestSmallerDate {

	@Test
	public void TestSmallerDate() {
		Date date=new Date(15,02,1996);
		Date dateTwo=new Date(16,06,1995);
		boolean smallDate=date.isSmaller(dateTwo);
		assertEquals(true,smallDate);
	}
	
	@Test
	public void TestBiggerDate() {       
		Date date=new Date(15,02,1996);
		Date dateTwo=new Date(16,01,1997);
		boolean smallDate=date.isSmaller(dateTwo);
		assertEquals(false,smallDate);
	}
}
