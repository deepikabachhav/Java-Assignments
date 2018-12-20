package com.bank;

public abstract class CurrentAccount extends BankAccount {
	private final double creditLimit;
	public CurrentAccount(String accountHolderName, double accountBalance,double creditLimit) {
		super(accountHolderName, accountBalance);
		this.creditLimit=creditLimit;
	}
	
	@Override
	public abstract void withdraw(double amount) throws InsufficientAmountException, InvalidAmountException;

	public double getCreditLimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + "]";
	}
}
