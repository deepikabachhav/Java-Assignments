package com.app.file;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dbachhav
 *MyClass is a class which implements serializable and read and write data in the file.
 */
public class MyClass implements Serializable {
	private int rollNumber;
	private String name;

	public int getRollNumber() {
		return rollNumber;
	}

	@Override
	public String toString() {
		return "MyClass [rollNumber=" + rollNumber + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public MyClass(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
}
