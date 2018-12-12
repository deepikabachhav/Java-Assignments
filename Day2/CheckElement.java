
public class CheckElement {

	@SuppressWarnings("null")
	public boolean IsElementPresentInArray(int[][] array, int i) {
		 int numberRows = 0 ,numberColumns = 0;
		   int[][] values = null;
		for(int count = 0; count < numberRows; count++){
		      
				for(int countOne = 0; countOne < numberColumns; countOne++){
		         
					if(values[count][countOne] == i)
		            	return true;
		        }
		  }
		return false;
	}
}
