package com.app.file;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExist {
	public boolean fileExists(String path) throws FileNotFoundException{
	File file=new File(path);
	if(file.exists())
	return true;
	else 
		throw new FileNotFoundException("File is not present");
	}
}
