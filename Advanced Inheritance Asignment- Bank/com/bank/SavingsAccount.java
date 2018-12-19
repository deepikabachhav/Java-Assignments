package com.bank;

public abstract class SavingsAccount extends BankAccount {
	private boolean isSalary;
	
	public SavingsAccount(String accountHolderName, double accountBalance, boolean isSalary) {
		super(accountHolderName, accountBalance);
		this.isSalary=isSalary;
	}
}
