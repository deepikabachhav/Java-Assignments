package com.bank;

public abstract class BankFactory {

	public abstract SavingsAccount getNewSavingAccount(int accountNumber, String accountHolderName, double accountBalance, boolean isSalary);

	public abstract CurrentAccount getNewCurrentAccount(int accountNumber, String accountHolderName, double accountBalance,double creditLimit);

}
