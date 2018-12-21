package com.app.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Grep {

	public String getLineNumberAndLine(String string, String path) throws IOException  {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		String line;
		int lineNumber=0;
		ArrayList arrayList=new ArrayList();
		ArrayList arrayofnumber=new ArrayList();
		 while((line = bufferedReader.readLine()) != null) 
	        { 
			 		lineNumber++;
	                String[] wordList = line.split(" "); 
	                for(String word : wordList){
	                	if(word.equals(string))
	                	{
	                		arrayList.add(line);
	                		arrayofnumber.add(lineNumber);
	                	}
	                }
	            }
		 		return "" +arrayofnumber+ ""+arrayList;	
	}
}


