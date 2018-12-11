/* Test Case for reverse string*/

import static org.junit.Assert.*;
import org.junit.Test;

public class TestReverseString {

	@Test
	public void test() {
		ReverseString reverseString= new ReverseString();
		String checkReverse= reverseString.reverse("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc", checkReverse);
	}

}
