package com.advancedcollection;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
/**
 * @author dbachhav
 * Test class for Write file.
 */
public class TestForWriteFile {

	@Test
	public void TestForWriteFile() {
		List<SavingAccount> list= new ArrayList<SavingAccount>();
		list.add(new SavingAccount("Deepika",10000,101,true));
		list.add(new SavingAccount("Ankita",9000,102,true));
		list.add(new SavingAccount("Harshali",6000,103,false));
		list.add(new SavingAccount("rashmi",8000,104,true));
		list.add(new SavingAccount("anjali",87000,101,false));
		
		SavingAccountWriteReadFile readwritefile =new SavingAccountWriteReadFile();
		String path="C:\\FileInputOutput\\SavingAccount.txt";
		try {
		readwritefile.SavingAccountWrite(list,path);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}


