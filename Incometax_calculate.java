import java.util.Scanner;
class Incometax_calculate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// enter the user to enter taxable income
        	System.out.println("Enter the amount of income: ");  
        	double income = input.nextDouble();
        	double tax = 0;
        	if (income >0 && income < 180000)
        		System.out.print("Income tax amount: Nil "); 
        	else if (income > 181001 && income < 300000){
			tax = income *0.01;
        		System.out.print(" Income tax amount is: " +tax); 
       		}
        	else if (income > 300001 && income < 500000){
            		tax = income *0.02;
        		System.out.print("Income tax amount is: " +tax); 
        	}
        	else if (income > 500001 && income < 1000000){
            		tax = income *0.03;
        		System.out.print("Income tax amount is: " +tax);
        	}
    	}
}