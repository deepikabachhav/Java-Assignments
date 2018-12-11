/* write a program to find armstrong numbers in the range 100-999 */

import java.util.Scanner;
class Armstrong_range {
	public static void main(String[] args) {
		int number, sum, count=100; 
		System.out.println("The Armstrong numbers between 100-999 are:");
		for (; count <= 999; count++){
			sum=0;
	    		number=count;
	    		while(number > 0){ 
				int remainder= number% 10;
	      			sum= sum + (remainder*remainder*remainder);
	      			number=number/10;
	    		}
	    		if(count == sum){
	    			System.out.println( sum );
	    		}
	    	}
	}
}