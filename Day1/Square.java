/* write a program to find multiplicatin table and square of the table */

import java.util.Scanner;
class Square {
	public static void main(String[] args) {
		int number, c;
		System.out.println("Enter an integer whose multiplication table you want:");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		System.out.println("Multiplication table of " + number);
		System.out.println("Square of " + number+ " is" +" : "+(number*number));
		for (c = 1; c <= 10; c++)
		System.out.println(number + "*" + c + " = " + (number*c)+"----"+((number*c)*(number*c)));
	}
}
