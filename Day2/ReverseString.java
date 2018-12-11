
public class ReverseString {

	public String reverse(String string) {
		String words[]=string.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    } 
	    System.out.println(reverseWord);
	    return reverseWord.trim();  
	}

}