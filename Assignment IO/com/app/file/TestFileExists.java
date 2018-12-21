package com.app.file;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.Test;

public class TestFileExists {

	@Test
	public void TestForFileExist() {
		FileExist fileExist= new FileExist();
		boolean yes;
		try {
			yes = fileExist.fileExists("C:\\FileInputOutput\\fileExist.txt");
			assertEquals(true,yes);
		} 
		catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
	}
	
	@Test
	public void TestForLineCountInFile() {
		CountLine countLine= new CountLine();
		try {
			int lines=countLine.numberofLines("C:\\FileInputOutput\\fileExist.txt");
			assertEquals(3,lines);
			//System.out.println(lines);
		} 
		catch (IOException e) {
		}
	}
	
	@Test
	public void TestForWordCountInFile() {
		CountWord countWord= new CountWord();
		try {
			int words=countWord.numberOfWords("C:\\FileInputOutput\\fileExist.txt");
			assertEquals(5,words);
			//System.out.println(words);
		} 
		catch (IOException e) {
		}
	}
	

	@Test
	public void TestForJavaGrepApplication() {
		Grep grep=new Grep();
		try {
			String words=grep.getLineNumberAndLine("Deepika","C:\\FileInputOutput\\fileExist.txt");
			assertEquals("[3][Deepika here..]",words);
		} 
		catch (IOException e) {
		}
	}

}
