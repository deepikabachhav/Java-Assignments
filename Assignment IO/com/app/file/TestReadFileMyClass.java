package com.app.file;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
/**
 * @author dbachhav
 *TestReadFileMyClass is a class  which reads the file.
 */
public class TestReadFileMyClass {

	@Test
	public void TestForReadFile() {
		ArrayList<MyClass> list = new ArrayList<MyClass>();
		MyClassWriteReadFile readwritefile = new MyClassWriteReadFile();
		String path = "C:\\FileInputOutput\\MyClass.txt";
		try {
			list = readwritefile.MyClassRead(path);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}

}
