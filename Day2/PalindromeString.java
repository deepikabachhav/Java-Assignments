import java.util.Arrays;


public class PalindromeString {

	public String checkpalindrome(String arrayOfStringOne) {
		
		char add = 0;
		//String s = " ";
		String [] values= arrayOfStringOne.split("\\s*,\\s*");
		int length= arrayOfStringOne.length();
		// System.out.println(Arrays.toString(values));
		// System.out.println(values[0]);
		
		 
		 for(int count=0;count<(length-1);count++)
		 {
				 String s= values[count];
				char [] arr=s.toCharArray();
				for(int countOne = arr.length-1; countOne>0; countOne--){
					 add += arr[count];
				}
		 
		 if(s.equals(add)){
			 System.out.println(add);
			 
		 }
	}
		 return Arrays.toString(values);	
}
}
