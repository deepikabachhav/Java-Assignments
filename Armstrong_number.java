import java.util.Scanner;
class Armstrong_number {
	public static void main(String[] args) {
		int number, n, sum=0;
		System.out.println("Enter a number to find it is armstrong or not:");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		n=number;
		while(number > 0){ 
			int remainder= number% 10;
			sum = sum + (remainder*remainder*remainder);
			number=number/10;
		}
		if(sum == n){
			System.out.println(n +" is a armstrong number" );
		}
		else{
			System.out.println(n +" is not a armstrong number"); 
	    	}
	}
}