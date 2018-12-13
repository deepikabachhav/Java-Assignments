/* Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.*/
 
import java.util.Arrays;
public class DistinctNumber {
	
	public int checkNumber(int[] arrayOfIntegers) {
		int total=0;
		int length= arrayOfIntegers.length;
		Arrays.sort(arrayOfIntegers);
		total=((length+1)*(length+2))/2;
		for(int count = 0; count<length; count++)
			total -= arrayOfIntegers[count];
			//System.out.println(total);
			return total;
	}
}


