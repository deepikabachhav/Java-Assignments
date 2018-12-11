/* Test Case for palindrome number */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestPalindrome {

	private Palindrome palindrome;
	
	@Before
	public void setup(){
		palindrome = new Palindrome();
	}
	
	@Test
	public void TestPositiveInteger() {
		boolean result=palindrome.checkPalindrome("121");
		assertTrue(result);
	}
	
	@Test
	public void TestNegativeInteger() {
		Palindrome palindrome= new Palindrome();
		String number= "-121";
		boolean result=palindrome.checkPalindrome(number);
		assertFalse(result);
	}
	
	@Test
	public void TestTwoDigitInteger() {
		Palindrome palindrome= new Palindrome();
		boolean result=palindrome.checkPalindrome("10");
		assertFalse(result);
	}
}
