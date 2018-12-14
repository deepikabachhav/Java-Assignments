/* Test class and test cases for addition of two complex numbers */

package complex.number;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestComplexNumbers {
	private Complex complexNumberOne;
	private Complex complexNumberTwo;
	private Complex result;
	
	@Before
	public void setUp(){
		 complexNumberOne= new Complex();
		 complexNumberTwo= new Complex();
		 result= new Complex();
	}

	@Test
	public void TestTwoPositiveRealParts() {
			complexNumberOne.set(10, 20);
			complexNumberTwo.set(21,62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(31,result.getReal(),0.02);
	}
	
	@Test
	public void TestTwoNegativeRealParts() {
			complexNumberOne.set(-10, 20);
			complexNumberTwo.set(-21,62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(-31,result.getReal(),0.02);
	}
	
	@Test
	public void TestTwoNegativeImaginaryParts() {
			complexNumberOne.set(10,-80);
			complexNumberTwo.set(21,-62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(-142,result.getImaginary(),0.02);
	}


	@Test
	public void TestTwoPositiveImaginaryParts() {
			complexNumberOne.set(10,80);
			complexNumberTwo.set(21,62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(142,result.getImaginary(),0.02);
	}
	

	@Test
	public void TestOneNegativeOnePositiveRealParts() {
			complexNumberOne.set(-10,-80);
			complexNumberTwo.set(21,-62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(11,result.getReal(),0.02);
	}
	
	@Test
	public void TestOneNegativeOnePositiveImaginaryParts() {
			complexNumberOne.set(-10,-80);
			complexNumberTwo.set(21,62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(-18,result.getImaginary(),0.02);
	}
	

	@Test
	public void TestOneZeroOnePositiveImaginaryParts() {
			complexNumberOne.set(-10,0);
			complexNumberTwo.set(21,62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(62,result.getImaginary(),0.02);
	}
	

	@Test
	public void TestOneNegativeOneZeroImaginaryParts() {
			complexNumberOne.set(-10,-80);
			complexNumberTwo.set(21,0);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(-80,result.getImaginary(),0.02);
	}
	

	@Test
	public void TestOneZeroOnePositiveRealParts() {
			complexNumberOne.set(0,-80);
			complexNumberTwo.set(21,62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(21,result.getReal(),0.02);
	}
	

	@Test
	public void TestOneZeroOneNegativeImaginaryParts() {
			complexNumberOne.set(-10,-80);
			complexNumberTwo.set(0,62);
			result = result.sum(complexNumberOne, complexNumberTwo);
			assertEquals(-10,result.getReal(),0.02);
	}
}
