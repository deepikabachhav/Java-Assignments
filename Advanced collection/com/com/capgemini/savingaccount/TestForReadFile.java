package com.capgemini.savingaccount;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * @author dbachhav Test class for read the file SavingAccount.txt.
 */
public class TestForReadFile {

	@Test
	public void TestForReadFile() {
		List<SavingAccount> list = new ArrayList<SavingAccount>();
		SavingAccountWriteReadFile readwritefile = new SavingAccountWriteReadFile();
		String path = "C:\\FileInputOutput\\SavingAccount.txt";
		try {
			list = readwritefile.SavingAccountRead(path);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}
}
