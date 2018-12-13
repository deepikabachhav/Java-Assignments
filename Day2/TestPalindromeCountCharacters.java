/* Test case for count charactrs from palindrome and keep it in descending order */

import static org.junit.Assert.*;
import org.junit.Test;
public class TestPalindromeCountCharacters {

	@Test
	public void test() {
		PalindromeString palindrome= new PalindromeString();
		String arrayOfStringOne= "deepika,ankita,snehal,aditi,monika,nitin, amma, anna";
		//String ArrayOfStringTwo="nitin, amma, anna";
		String resultOne= palindrome.checkpalindrome(arrayOfStringOne);
		//String resultTwo= palindrome.checkpalindrome(ArrayOfStringTwo);
	
	}

}
