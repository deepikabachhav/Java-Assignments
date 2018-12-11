/* write a program for linear search */

import java.util.Scanner;

class Linear_search{
	static String search(int array[], int n, int x){
	int previous=0;
	if(array[n-1] ==x)
	previous= array[n-1];
	array[n-1]=x;
		for(int i=0; ; i++){
			if (array[i]==x){
			array[n-1]=previous;
			if(i<n-1){
				System.out.println("present");
			}
			else
				System.out.println("not present");
			}
		}
	}

	public static void main(String[] args){
	int array[]={5,12,14,6,78,19,1,26,23,35,37,7,52,86,47};
	int n=array.length;
	Scanner in=new Scanner(System.in);
	System.out.println("Value to be search is :");
	int value =in.nextInt();
	search(array, n, value);
	}
}