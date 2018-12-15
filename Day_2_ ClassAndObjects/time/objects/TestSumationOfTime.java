/* Test class for testing sumation of time */

package time.objects;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import distance.objects.Distance;
public class TestSumationOfTime {
	private Time time;
	private Time objectOne;
	private Time objectTwo;
	
	@Before
	public void setUp(){
		time= new Time();
		objectOne= new Time();
		objectTwo= new Time();
	}
	
	@Test
	public void TestTwoPositiveHoursParts() {
		objectOne.setTime(5,30);
		objectTwo.setTime(4,40);
		time=time.sum(objectOne, objectTwo);
		assertEquals(10,time.getHours());
	}
	
	@Test
	public void TestTwoPositiveMinutesParts() {
		objectOne.setTime(5,30);
		objectTwo.setTime(4,40);
		time=time.sum(objectOne, objectTwo);
		assertEquals(10,time.getMinutes());
	}
	
	@Test
	public void TestOneZeroHoursParts() {
		objectOne.setTime(0,30);
		objectTwo.setTime(4,40);
		time=time.sum(objectOne, objectTwo);
		assertEquals(5,time.getHours());
	}
	
	@Test
	public void TestOneZeroMinutesParts() {
		objectOne.setTime(5,0);
		objectTwo.setTime(4,60);
		time=time.sum(objectOne, objectTwo);
		assertEquals(0,time.getMinutes());
	}
}
