/* iven an array of integers and an integer k, find out whether there are two distinct indices i and j in the 
array such that nums[i] = nums[j] and the absolute difference between i and j is at most k. */

public class CheckDifference {

	public boolean absoluteDifference(int[] arrayOfIntegers, int i, int j, int k) {
		int length= arrayOfIntegers.length;
		int difference = 0;
			for(int count=0; count< length;count++){
					if(arrayOfIntegers[i]==arrayOfIntegers[j]){
						difference=j-i;	
					}
			}  
			if(difference<=k){         //check whether the difference is same as k or not.    
				return true;
			}
			else{
				return false;
			}
	}
}
