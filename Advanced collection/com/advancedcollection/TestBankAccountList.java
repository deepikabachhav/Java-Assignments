package com.advancedcollection;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;
import com.advancedcollection.SavingAccountWriteReadFile;

/**
 * @author dbachhav
 *Test class for the list should not allow duplicates as well as data should be displayed in sorted order (as per acc_ID). 
 */
public class TestBankAccountList {
private SavingAccount savingAccount;
	@Test
	public void test() {
		List<SavingAccount> list= new ArrayList<SavingAccount>();
		list.add(new SavingAccount("Deepika",10000,106,true));
		list.add(new SavingAccount("Deepika",10000,106,true));
		list.add(new SavingAccount("Ankita",9000,102,true));
		list.add(new SavingAccount("Harshali",6000,103,false));
		list.add(new SavingAccount("rashmi",8000,109,true));
		list.add(new SavingAccount("anjali",87000,105,false));
		Set<SavingAccount> treeset=new TreeSet<>(list);
		//System.out.println(treeset);
		}
	}
	


