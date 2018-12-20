package com.bank;
import static org.junit.Assert.*;

import org.junit.Test;
public class TestBankAccount {

	@Test
	public void TestDepositThroughMMSavingsAccount() {
	BankAccount account= new MMSavingsAccount("Deepika", 1000.0,true);
	try {
		account.deposit(100.0);
	} 
	catch (InvalidAmountException e) {
		e.printStackTrace();
	}
	assertEquals(1100.0,account.getAccountBalance(),0.02);
	}
	
	@Test
	public void TestDepositByInstantiateMMBankFactoryByObjectNewSavingAccount() {
	BankFactory factory= new MMBankFactory();
	SavingsAccount savingAccount=factory.getNewSavingAccount(100, "Deepika", 10000.0, true);
	try {
		savingAccount.deposit(100.0);
	} 
	catch (InvalidAmountException e) {
		e.printStackTrace();
	}
	assertEquals(10100.0,savingAccount.getAccountBalance(),0.02);
	}
	
	@Test
	public void TestDepositByInstantiateMMBankFactoryByObjectNewCurrentAccount() {
	BankFactory factory= new MMBankFactory();
	CurrentAccount savingAccount=factory.getNewCurrentAccount(100, "Deepika", 6000.0, 10000.0);
	try {
		savingAccount.deposit(100.0);
	} 
	catch (InvalidAmountException e) {
		e.printStackTrace();
	}
	assertEquals(6100.0,savingAccount.getAccountBalance(),0.02);
	}
	
	@Test
	public void TestDepositeByInstantiateMMSavingAccount1() {
	SavingsAccount factory= new MMSavingsAccount( "Deepika", 6000.0, true);
	try {
		factory.deposit(100.0);
	} 
	catch (InvalidAmountException e) {
		e.printStackTrace();
	}
	assertEquals(6100.0,factory.getAccountBalance(),0.02);
	}
	
	@Test
	public void TestDepositeThroughMMCurrentAccount() {
	CurrentAccount factory= new MMCurrentAccount( "Deepika", 6000.0,1000.0);
	try {
		factory.deposit(100.0);
	} 
	catch (InvalidAmountException e) {
		e.printStackTrace();
	}
	assertEquals(6100.0,factory.getAccountBalance(),0.02);
	}
	
	@Test
	public void TestWithdrawThroughMMSavingsAccount() {
	BankAccount account= new MMSavingsAccount("Deepika", 1000.0,true);
	try {
		account.withdraw(100.0);
		assertEquals(900.0,account.getAccountBalance(),0.02);
		} 
	catch (InsufficientAmountException e) {
			e.printStackTrace();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	@Test
	public void TestWithdrawByInstantiateMMBankFactoryByObjectNewSavingAccount() {
	BankFactory factory= new MMBankFactory();
	SavingsAccount savingAccount=factory.getNewSavingAccount(100, "Deepika", 10000.0, true);
	try {
		savingAccount.withdraw(100.0);
		assertEquals(9900.0,savingAccount.getAccountBalance(),0.02);
	} 
	catch (InsufficientAmountException e) {
		e.printStackTrace();
	} 
	catch (InvalidAmountException e) {
			e.printStackTrace();
	}
	}
	
	@Test
	public void TestWithdrawByInstantiateMMBankFactoryByObjectNewCurrentAccount() {
	BankFactory factory= new MMBankFactory();
	CurrentAccount savingAccount=factory.getNewCurrentAccount(100, "Deepika", 6000.0, 10000.0);
	try {
		savingAccount.withdraw(100.0);
		assertEquals(5900.0,savingAccount.getAccountBalance(),0.02);
	}
	catch (InsufficientAmountException e) {
		e.printStackTrace();
	} 
	catch (InvalidAmountException e) {
		e.printStackTrace();
	}
	}
	
	@Test
	public void TestDepositeByInstantiateMMSavingAccount(){
	SavingsAccount factory= new MMSavingsAccount( "Deepika", 6000.0, true);
	try {
		factory.withdraw(500);
		assertEquals(5500.0,factory.getAccountBalance(),0.02);
	}
	catch (InvalidAmountException e) {
			e.printStackTrace();
	}
	catch(InsufficientAmountException e){}
	}
	
	@Test
	public void TestWithdrawThroughMMCurrentAccount() {
	CurrentAccount factory= new MMCurrentAccount( "Deepika", 6000.0,1000.0);
	try {
		factory.withdraw(100.0);
		assertEquals(5900.0,factory.getAccountBalance(),0.02);
	} 
	catch (InsufficientAmountException e) {
		e.printStackTrace();
	} 
	catch (InvalidAmountException e) {
		e.printStackTrace();
	}
	}
}
