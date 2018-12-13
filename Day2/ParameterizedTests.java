/* JUnit parameterized test and class practise */

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
//@IncludeCategory(AdditionCategory.class)
@Suite.SuiteClasses({Test.class, TestSubtraction.class})
public class ParameterizedTests {
	
	private static Addition addition=new Addition();
	private static Subtraction subtraction=new Subtraction();
	private int inputOne=0;
	private int inputTwo=0;
	private int expected=0;
	
	
	@Parameters
	public static List<Object[]> dataOne(){
		return Arrays.asList(new Object[][]{
				{80,50,130},
				{-80,-50,-130},
				{80,-50,30}
				});
	}
	/*
	@Parameters
	public static List<Object[]> dataTwo(){
		return Arrays.asList(new Object[][]{
				{45,10,35},
				{-45,-10,-35},
				{45,-10,55},
				{-45,10,-55},
				{0,10,-10}
				});
	}
	*/
	
	public ParameterizedTests(int inputOne,int inputTwo, int expected){
		this.inputOne=inputOne;
		this.inputTwo=inputTwo;
		this.expected=expected;
	}

	@Test
	public void test(){
		addition.addNumbers(inputOne, inputTwo);
		subtraction.subtractNumbers(inputOne, inputTwo);
	}

}
