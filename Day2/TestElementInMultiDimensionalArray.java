/* Test case for finding particulae element int the multi -dimensional Array */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestElementInMultiDimensionalArray {
	private CheckElement checkElement;
	
	@Before
	public void setUp(){
		 checkElement =new CheckElement();
	}
	
	@Test
	public void TestElementOne() {
		int[][] array={{1,2,3},{4,5,2}};
		int element= checkElement.IsElementPresentInArray(array,4);
		assertEquals(4,element);
	}
	
	@Test
	public void TestElement() {
		int[][] array={{1,5,9,6},{5,3,2,8},{9,3,5,4}};
		int element= checkElement.IsElementPresentInArray(array,2);
		assertEquals(2,element);
	}
	
	@Test
	public void TestElementTwo() {
		int[][] array={{1,2,3},{4,5,2}};
		int element= checkElement.IsElementPresentInArray(array,0);
		assertEquals(0,element);
	}
}
