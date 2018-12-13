/* program to remove extra spaces and delete word from the sentence and display new sentence */

import java.util.Arrays;
public class RemoveSpaces {

	public String getSentenceRemoveSpaces(String sentence, String word, int positionNumber) {
		String newSentence= sentence.replaceAll("\\s+"," ");         //remove extra spaces from sentence.
		String[] newOneSentence=newSentence.split(" ");
	        for(int count=0;count<newOneSentence.length-1;count++)
	        {
	        	if(newOneSentence[count]==newOneSentence[positionNumber-1])
	        	{
	        		newOneSentence[count]=newOneSentence[count].replaceAll(word,"");     //delete the word from sentence whose position number is given.
	        	}
	        }
	    String blankSpace=" ";
	    String result=String.join(blankSpace,newOneSentence);
		return result ;
	}
}

	


