/* write a program to find Armstring number*/

import java.util.Scanner;
class Armstrong_number {				// class Armstrong_number 
	public static void main(String[] args) {	// main method 
		int number, storeNumber, sum=0;
		System.out.println("Enter a number to find it is armstrong or not:");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		storeNumber=number;
		while(number > 0){ 
			int remainder= number% 10;
			sum = sum + (remainder*remainder*remainder);
			number=number/10;
		}
		if(sum == storeNumber){
			System.out.println(storeNumber +" is a armstrong number" );
		}
		else{
			System.out.println(storeNumber +" is not a armstrong number"); 
	    	}
	}
}