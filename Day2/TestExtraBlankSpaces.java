/* Test case for remove extra spaces from sentence and delete word from the sentence and display the sentence*/

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestExtraBlankSpaces {
	private RemoveSpaces removespaces;
	
	@Before
	public void setUp(){
		removespaces= new RemoveSpaces();
	}
	@Test
	public void TestIsExtraSpaces() {           //Test case one to check result
		String sentence= removespaces.getSentenceRemoveSpaces("A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.","IS", 6);
		assertEquals( "A MORNING WALK IS A  BLESSING FOR THE WHOLE DAY.",sentence);
	}
	
	@Test
	public void TestIsExtraSpacesOne() {      //Test case two to check the result
		String sentence= removespaces.getSentenceRemoveSpaces("HELLO EVERYONE HOW ARE YOU YOU FEELING NOW.","YOU", 5);
		assertEquals( "HELLO EVERYONE HOW ARE  YOU FEELING NOW.",sentence);
	}
		
		

}
