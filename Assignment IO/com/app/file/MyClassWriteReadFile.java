package com.app.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author dbachhav
 * MyClassWriteReadFile is a class contains MyClassWrite and MyClassRead  methods for reading and writing file.
 */
public class MyClassWriteReadFile {
	public void MyClassWrite(ArrayList<MyClass> list, String path)throws IOException {
		FileOutputStream file = new FileOutputStream(path);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(list);
		out.close();
		file.close();
	}

	public ArrayList<MyClass> MyClassRead(String path) throws IOException,ClassNotFoundException {
		ArrayList<MyClass> myClass = null;
		if (new File(path).exists()) {
			FileInputStream fileinput = new FileInputStream(path);
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
			myClass = (ArrayList<MyClass>) objectinput.readObject();
			objectinput.close();
			fileinput.close();
		} else if (!(new File(path).exists())) {
			throw new FileNotFoundException();
		}
		return myClass;
	}
}
