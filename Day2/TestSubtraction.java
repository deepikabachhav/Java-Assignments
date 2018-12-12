/* JUnit Test Case for TestSubtraction */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(GoodOperationCategory.class)
public class TestSubtraction {

	private Subtraction subtraction;
	
	@Before
	public void setUp(){
		subtraction = new Subtraction();
	}
	
	@Test
	public void TestTwoPositiveNumbers() {
		int result= subtraction.subtractNumbers(45,10);
		assertEquals(35, result);
	}
	
	@Test
	public void TestTwoNegativeNumbers() {
		int result= subtraction.subtractNumbers(-45,-10);
		assertEquals(-35, result);
	}
	
	@Test
	public void TestOnePositiveNumber() {
		int result= subtraction.subtractNumbers(45,-10);
		assertEquals(55, result);
	}
	
	@Test
	public void TestOneOnePositiveNumber() {
		int result= subtraction.subtractNumbers(-45,10);
		assertEquals(-55, result);
	}
	
	@Test
	public void TestOneZeroeNumber() {
		int result= subtraction.subtractNumbers(0,10);
		assertEquals(-10, result);
	}
}
