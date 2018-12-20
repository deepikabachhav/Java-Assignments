package com.bank;

public class MMCurrentAccount extends CurrentAccount {
	private final double creditLimit=10000;
	public MMCurrentAccount(String accountHolderName, double accountBalance,double creditLimit) {
		super(accountHolderName, accountBalance, creditLimit);
	}

	@Override
	public void withdraw(double amount) throws InsufficientAmountException, InvalidAmountException {
		double withdrawLimit= creditLimit +this.getAccountBalance();
		
		if(amount <= withdrawLimit){
			super.deposit(-amount);
		}
		else
			throw new InsufficientAmountException("Transaction failed because of Insuficient balance");
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [getCreditLimit()=" + getCreditLimit()
				+ ", toString()=" + super.toString() + "]";
	}

}
