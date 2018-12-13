/* Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward. */

import java.util.Arrays;
public class PalindromeString {

	public String checkpalindrome(String arrayOfStringOne) {
		char add = 0;
		//String s = " ";
		String [] values= arrayOfStringOne.split("\\s*,\\s*");     //separate the integer from string.
		int length= arrayOfStringOne.length();
		// System.out.println(Arrays.toString(values));
		for(int count=0;count<(length-1);count++){
				 String s= values[count];
				char [] arr=s.toCharArray();
				for(int countOne = arr.length-1; countOne>0; countOne--){
					 add += arr[count];
				}
				if(s.equals(add)){         //check the two strings.
					System.out.println(add);
				}
		}
		return Arrays.toString(values);	
	}
}
