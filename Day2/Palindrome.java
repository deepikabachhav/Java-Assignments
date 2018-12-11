import java.util.Arrays;


public class Palindrome {

	public boolean checkPalindrome(String integer) {
		char[] inputArray = integer.toCharArray();
		int length=integer.length();
		char[] newinput = new char[length];

		for(int count=0,n=(length-1);count<length && n>=0;count++,n--)
		{
			newinput[count]=inputArray[n];
		}
		
		boolean Palindrome=Arrays.equals(newinput, inputArray);
		return Palindrome;
	}
}
