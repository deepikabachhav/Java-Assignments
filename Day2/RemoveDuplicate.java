/* Write a program to input a word from the user and remove the duplicate characters present in it.*/
public class RemoveDuplicate {

	public String checkWord(String word) {
		String resultOne=new String();
		for (int count = 0; count < word.length(); count++) {
			if(! resultOne.contains(""+ word.charAt(count))){  //to remove the duplicate  characters from the word.
				resultOne +="" +word.charAt(count);
			}
		}
		System.out.println(resultOne);
		return resultOne;
	}
}
