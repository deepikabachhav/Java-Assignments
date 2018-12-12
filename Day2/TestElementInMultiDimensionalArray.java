import static org.junit.Assert.*;

import org.junit.Test;


public class TestElementInMultiDimensionalArray {

	@Test
	public void test() {
		CheckElement checkElement =new CheckElement();
		int[][] array={{1,2,3},{4,1,2}};
		boolean element= checkElement.IsElementPresentInArray(array,4);
		assertEquals(true,element);
	}

}
