package com.advancedcollection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
/**
 * @author dbachhav
 *SavingAccountWriteReadFile is a class for reading and writing the file which implements serialization and deserialization.
 */
public class SavingAccountWriteReadFile {
	
	public void SavingAccountWrite(List<SavingAccount> savingAccount, String path) throws IOException{
		 FileOutputStream file = new FileOutputStream (path); 
		 ObjectOutputStream out = new ObjectOutputStream (file); 
			out.writeObject(savingAccount);
			out.close();
			file.close();
	}

	public 	List<SavingAccount> SavingAccountRead(String path) throws IOException, ClassNotFoundException{
		List<SavingAccount> savingAccount= null;
		if(new File(path).exists()){
			 FileInputStream fileinput= new FileInputStream (path); 
			 ObjectInputStream objectinput = new ObjectInputStream (fileinput); 
			 savingAccount= (List<SavingAccount>) objectinput.readObject();
			 objectinput.close();
			 fileinput.close();
		}
		else if(!( new File(path).exists())){
			throw new FileNotFoundException();
		}
		return savingAccount;
	}
}
