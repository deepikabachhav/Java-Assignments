package com.bank;

public abstract class SavingsAccount extends BankAccount {
	private boolean isSalary;
	private static final double MINBAL=100;
	
	public SavingsAccount(String accountHolderName, double accountBalance, boolean isSalary) {
		super(accountHolderName, accountBalance);
		this.isSalary=isSalary;
	}
	
	public boolean isSalary() {
		return isSalary;
	}

	@Override
	public String toString() {
		return "SavingsAccount [isSalary=" + isSalary + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public abstract void withdraw(double amount) throws InsufficientAmountException, InvalidAmountException;

}
