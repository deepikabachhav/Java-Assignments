package com.app.file;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
/**
 * @author dbachhav
 *TestWriteFileMyClass is a class which writes the data in the file.
 */
public class TestWriteFileMyClass {
	@Test
	public void TestForWriteFileMyClass() {
		MyClass  studentOne = new MyClass(1, "Deepika");
		MyClass  studentTwo = new MyClass(2, "Ankita");
		MyClass  studentThree = new MyClass(3, "tejas");
		MyClass  studentFour = new MyClass(4, "tushar");
		MyClass  studenFive = new MyClass(5, "shubham");

			ArrayList<MyClass> list = new ArrayList<MyClass>();
			list.add(studentOne);
			list.add(studentTwo);
			list.add(studentThree);
			list.add(studentFour);
			list.add(studenFive);
			
		MyClassWriteReadFile readwritefile = new MyClassWriteReadFile();
		String path = "C:\\FileInputOutput\\MyClass.txt";
		try {
			readwritefile.MyClassWrite(list, path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
