package com.app.file;

import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author dbachhav
 *FileExist is a class to find that at the given path the file is present or not.
 */
public class FileExist {
	public boolean fileExists(String path) throws FileNotFoundException{
	File file=new File(path);
	if(file.exists())
	return true;
	else 
		throw new FileNotFoundException("File is not present");
	}
}
