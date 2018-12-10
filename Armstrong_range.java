import java.util.Scanner;
class Armstrong_range {
	public static void main(String[] args) {
		int number, sum, i=100; 
		System.out.println("The Armstrong numbers between 100-999 are:");
		for (; i <= 999; i++){
			sum=0;
	    		number=i;
	    		while(number > 0){ 
				int remainder= number% 10;
	      			sum= sum + (remainder*remainder*remainder);
	      			number=number/10;
	    		}
	    		if(i == sum){
	    			System.out.println( sum );
	    		}
	    	}
	}
}