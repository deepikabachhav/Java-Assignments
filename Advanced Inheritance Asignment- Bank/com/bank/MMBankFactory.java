package com.bank;

public class MMBankFactory extends BankFactory{
	public MMSavingsAccount getNewSavingAccount(int accountNumber, String accountHolderName, double accountBalance, boolean isSalary){
		return new MMSavingsAccount(accountHolderName, accountBalance, isSalary);
	}
	
	public MMCurrentAccount getNewCurrentAccount(int accountNumber, String accountHolderName, double accountBalance,double creditLimit){
		return new MMCurrentAccount(accountHolderName, accountBalance,creditLimit);
	}
}
