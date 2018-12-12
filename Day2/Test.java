/* Test class for Addition */

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

//@Category(AdditionCategory.class)
public class Test {
	private Addition addition;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("After class");
	}
	
	@Before
	public void setUp(){
		System.out.println("Before method");
		addition= new Addition();
	}
	
	@After
	public void tearDown(){
		System.out.println("AFTER METHOD");
	}
	
	@org.junit.Test
	@Category(GoodOperationCategory.class)
	public void TestTwoPositiveNumbers() {
		int result= addition.addNumbers(80, 50);
		//assertEquals(130 ,result);
		assertThat(result,is(130));
		assertThat(result, allOf(is(130),instanceOf(Integer.class)));
	}
	
	@org.junit.Test
	//@Ignore
	@Category({BadOperationCategory.class,GoodOperationCategory.class})
	public void TestTwoNegativeNumbers() {
		int result= addition.addNumbers(-80, -50);
		assertEquals(-130 ,result);
	}
	
	
	@org.junit.Test
	public void TestOnePositiveNumbers() {
		int result= addition.addNumbers(80, -50);
		assertEquals(30 ,result);
	}
	
	/*
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	@org.junit.Test
	//@org.junit.Test(expected= InvalidResultException.class)
	
	public void WhenResultIsSetToLessThanZeroExceptionIsThrown() throws InvalidResultException{
		thrown.expect(InvalidResultException.class);
		thrown.expectMessage("Result is less than zero");
		//thrown.expectMessage(containsString("Result"));
		  addition.addNumbers(-10, 9);
		 
	}*/

}
