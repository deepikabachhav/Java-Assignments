/* Write a program to find if a particular element is present in a multi-dimensional array. */

public class CheckElement {

	public int IsElementPresentInArray(int[][] array, int i) {
		int answer = 0;
		for(int count = 0; count < array.length; count++){    //loop for checking rows.
		      for(int countOne = 0; countOne <array.length; countOne++){    //loop for checking columns.
					if(array[count][countOne] == i)
						answer=array[count][countOne]; 
		      }
		}
		return answer;
	}
}
