/* Test class for finding missing number in the array of integers */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestDistinctNumber {
	private static DistinctNumber distinctNumber;
	
	@Before
	public void setUp(){
	 distinctNumber= new DistinctNumber();
	}
	@Test
	public void TestMissing() {
		int[] arrayOfIntegers={1,2,3,5,6};
		int result= distinctNumber.checkNumber(arrayOfIntegers);
		assertEquals(4,result);
	}

	@Test
	public void TestMissingNumber() {
		int[] arrayOfIntegers={1,2,3,5,4,7,9,6};
		int result= distinctNumber.checkNumber(arrayOfIntegers);
		assertEquals(8,result);
	}
	

	@Test
	public void TestMissingTwo() {
		int[] arrayOfIntegers={1,8,3,5,4,7,9,6};
		int result= distinctNumber.checkNumber(arrayOfIntegers);
		assertEquals(2,result);
	}

}
