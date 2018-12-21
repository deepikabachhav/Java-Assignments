package com.app.file;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyClass implements Serializable {
	private int rollNumber;
	private String name;

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public MyClass(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	/*public List<String> student() {
		List<String> student = new ArrayList<String>();
		student.add("studentOne");
		student.add("studentTwo");
		student.add("studentThree");
		student.add("studentFour");
		student.add("studentFive");
		return student;
	}*/

}
