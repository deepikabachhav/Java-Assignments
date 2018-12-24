package com.app.file;
import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author dbachhav
 *Test class for read and write in a file.
 */
public class TestEmployee {
	private Employee employee;
	
	@Before
	public void setUp(){
		new Employee(100,"Deepika",40000.00);
	}
	@Test
	public void TestForWriteFile(){
		EmployeeWriteReadFile readwritefile =new EmployeeWriteReadFile();
		String path="C:\\FileInputOutput\\Employee.txt";
		try {
			readwritefile.EmployeeWrite(employee,path);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void TestForReadFile(){
		EmployeeWriteReadFile readwritefile =new EmployeeWriteReadFile();
		String path="C:\\FileInputOutput\\Employee.txt";
		
			try {
				readwritefile.EmployeeRead(path);
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
			e.printStackTrace();
		}
	}
}
