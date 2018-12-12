import static org.junit.Assert.*;

import org.junit.Test;


public class TestAbsoluteDifference {

	@Test
	public void test() {
		CheckDifference checkDifference=new CheckDifference();
		int[] arrayOfIntegers={10,1,2,5,8,9,1,6,2,6,4,7,3};
		boolean result= checkDifference.absoluteDifference(arrayOfIntegers,1,6,5);
		assertEquals(true,result);
	}

}
