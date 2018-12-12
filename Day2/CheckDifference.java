
public class CheckDifference {

	public boolean absoluteDifference(int[] arrayOfIntegers, int i, int j, int k) {
		int length= arrayOfIntegers.length;
		int difference = 0;
			for(int count=0; count< length;count++){
					if(arrayOfIntegers[i]==arrayOfIntegers[j]){
						difference=j-i;
						
					}
			}
			System.out.println(difference);
			if(difference<=k){
				return true;
			}
			else{
				return false;
			}
	}
}
