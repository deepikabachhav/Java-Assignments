package com.app.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountLine {
	public int numberofLines(String path) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		int lines = 0;
		while (bufferedReader.readLine() != null) lines++;
		bufferedReader.close();
		return lines;
}
}
