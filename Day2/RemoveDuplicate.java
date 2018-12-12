
public class RemoveDuplicate {

	public String checkWord(String word) {
		String resultOne=new String();
		for (int count = 0; count < word.length(); count++) {
			if(! resultOne.contains(""+ word.charAt(count))){
				resultOne +="" +word.charAt(count);
			}
		}
		System.out.println(resultOne);
		return resultOne;
	}
}
