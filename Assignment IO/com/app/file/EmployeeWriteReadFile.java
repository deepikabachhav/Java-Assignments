package com.app.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * @author dbachhav
 *EmployeeWriteReadFile is a class which contains methods to read and write the file.
 */
public class EmployeeWriteReadFile {
	
	public void EmployeeWrite(Employee employee, String path) throws IOException{
		 FileOutputStream file = new FileOutputStream (path); 
		 ObjectOutputStream out = new ObjectOutputStream (file); 
			out.writeObject(employee);
			out.close();
			file.close();
			}

	public Employee EmployeeRead(String path) throws IOException, ClassNotFoundException{
		Employee employee= null;
		if(new File(path).exists()){
			 FileInputStream fileinput= new FileInputStream (path); 
			 ObjectInputStream objectinput = new ObjectInputStream (fileinput); 
			 objectinput.readObject();
			 objectinput.close();
			 fileinput.close();
		}
			else if(!( new File(path).exists())){
			throw new FileNotFoundException();
			}
		return employee;
	}
}