/* Test class for testing sum of distance of two objects */

package distance.objects;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestSumOfDistance {
	private Distance distance;
	private Distance objectOne;
	private Distance objectTwo;

	@Before
	public void setUp(){
		 distance= new Distance();
		 objectOne= new Distance();
		 objectTwo= new Distance();
	}
	
	@Test
	public void TestTwoPositiveFeetParts() {
		objectOne.set(3, (float) 6.0);
		objectTwo.set(5,(float) 8.0);
		distance = distance.sum(objectOne, objectTwo);
		assertEquals(9,distance.getFeet());
	}
	
	@Test
	public void TestOneZeroOnePositiveFeetParts() {
		objectOne.set(0, (float) 6.0);
		objectTwo.set(5,(float) 8.0);
		distance = distance.sum(objectOne, objectTwo);
		assertEquals(6,distance.getFeet());
	}
	
	@Test
	public void TestOneZeroOnePositiveInchParts() {
		objectOne.set(3, (float) 0.0);
		objectTwo.set(5,(float) 11.0);
		distance = distance.sum(objectOne, objectTwo);
		assertEquals(11.0,distance.getInch(),0.2);
	}
	
	@Test
	public void TestTwoPositiveInchParts() {
		objectOne.set(3, (float) 6.0);
		objectTwo.set(5,(float) 8.0);
		distance = distance.sum(objectOne, objectTwo);
		assertEquals(2.0,distance.getInch(),0.2);
	}
}


