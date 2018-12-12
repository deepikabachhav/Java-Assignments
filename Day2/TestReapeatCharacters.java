import static org.junit.Assert.*;

import org.junit.Test;
public class TestReapeatCharacters {
	
	@Test
	public void TestOne() {
	RemoveDuplicate removeDuplicate= new RemoveDuplicate();
	String word= removeDuplicate.checkWord("abcabcabc");
	assertEquals("abc" ,word);
	}
	
	@Test
	public void TestTwo() {
	RemoveDuplicate removeDuplicate= new RemoveDuplicate();
	String word= removeDuplicate.checkWord("javaforschool");
	assertEquals("javforschl" ,word);
	}
	
	@Test
	public void TestThree() {
	RemoveDuplicate removeDuplicate= new RemoveDuplicate();
	String word= removeDuplicate.checkWord("Mississippi");
	assertEquals("Misp" ,word);
	}
}
