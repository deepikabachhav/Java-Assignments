/* Write a program to accept an array of names and a name and check whether the name is present in the array. Return the count of occurrence. */

public class CheckName {

	public int IsNamePresentInArray(String[] arrayOfNames, String string) {
		int counter=0;
		int length=arrayOfNames.length;
		for(int count = 0 ;count<length; count++){
			if(string.equals(arrayOfNames[count])){         //.equals() to compare the string.
				counter++;
			}
		}
		return counter;
	}
}
