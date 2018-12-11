/* Test class for Addition */

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

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
	public void TestTwoPositiveNumbers() {
		int result= addition.addNumbers(80, 50);
		assertEquals(130 ,result);
	}
	
	@org.junit.Test
	//@Ignore
	public void TestTwoNegativeNumbers() {
		int result= addition.addNumbers(-80, -50);
		assertEquals(-130 ,result);
	}
	
	
	@org.junit.Test
	public void TestOnePositiveNumbers() {
		int result= addition.addNumbers(80, -50);
		assertEquals(30 ,result);
	}

}
