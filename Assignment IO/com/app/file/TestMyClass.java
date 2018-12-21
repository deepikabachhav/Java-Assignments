package com.app.file;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TestMyClass {

	@Test
	public void test() {
		MyClass studentOne = new MyClass(1, "Deepika");
		MyClass studentTwo = new MyClass(2, "Ankita");
		MyClass studentThree = new MyClass(3, "tejas");
		MyClass studentFour = new MyClass(4, "tushar");
		MyClass studenFive = new MyClass(5, "shubham");

		ArrayList<MyClass> list = new ArrayList<MyClass>();
		list.add(studentOne);
		list.add(studentTwo);
		list.add(studentThree);
		list.add(studentFour);
		list.add(studenFive);
		/*Iterator<MyClass> itr=list.iterator();
		while(itr.hasNext()){
			List<MyClass> a= (List) itr.next();
			Iterator<MyClass> itr1=a.iterator();
			while(itr1.hasNext()){
				MyClass myClass=(MyClass)itr1.next();
				System.out.println(myClass.getName());
				System.out.println(myClass.getRollNumber());
			}
		}
*/
		MyClassWriteReadFile readwritefile = new MyClassWriteReadFile();
		String path = "C:\\FileInputOutput\\MyClass.txt";
		try {
			readwritefile.MyClassWrite(list, path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestForReadFile() {
		MyClassWriteReadFile readwritefile = new MyClassWriteReadFile();
		String path = "C:\\FileInputOutput\\MyClass.txt";
		//System.out.println( list);
		try {
			readwritefile.MyClassRead(path);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
