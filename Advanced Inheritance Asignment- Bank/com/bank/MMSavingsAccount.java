package com.bank;
public class MMSavingsAccount extends SavingsAccount {
	private static final double MINBAL=100;
	public MMSavingsAccount(String accountHolderName, double accountBalance,boolean isSalary) {
		super(accountHolderName, accountBalance, isSalary);	
	}

	@Override
	public void withdraw(double amount) throws InsufficientAmountException, InvalidAmountException {
		if( amount<= MINBAL  && amount <= this.getAccountBalance()){
			super.deposit(-amount);
			}
			else
				throw new InsufficientAmountException("Insufficient Amount, Transaction failed!");
			
	}

	@Override
	public String toString() {
		return "MMSavingsAccount [isSalary()=" + isSalary() + ", toString()="
				+ super.toString() + "]";
	}
}
