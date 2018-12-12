
public class CheckName {

	public int IsNamePresentInArray(String[] arrayOfNames, String string) {
		int counter=0;
		int length=arrayOfNames.length;
	
		for(int count = 0 ;count<length; count++){
			if(string.equals(arrayOfNames[count])){
				counter++;
			}
		}
		//System.out.println(counter);
		return counter;
	}

}
