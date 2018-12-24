package com.app.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author dbachhav
 *CountWord is a class to return the number of words in a line.
 */
public class CountWord {
	public int numberOfWords(String path) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		String line;
		int countWord = 0;
		int characterCount = 0;
		while ((line = bufferedReader.readLine()) != null) {
			String[] wordList = line.split("\\s+");
			countWord += wordList.length;
		}
		return countWord;
	}
}