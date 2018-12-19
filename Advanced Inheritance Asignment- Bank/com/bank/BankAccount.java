package com.bank;

public abstract class BankAccount {
	private String accountHolderName;
	private double accountBalance;
	private  int accountNumber;
	private static int nextAccountNumber=0;
	
	static{
		nextAccountNumber=0;
	}
	{
		++nextAccountNumber;
	}
	
	public BankAccount(String accountHolderName,double accountBalance ){
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		this.accountNumber=nextAccountNumber;
	}
	
	public BankAccount(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public static int getNextAccountNumber() {
		return nextAccountNumber;
	}
	
	public double deposit(double amount){
		return this.accountBalance+= amount;
	}
	
	public abstract void withdraw();

	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName
				+ ", accountBalance=" + getAccountBalance() + ", accountNumber="
				+ accountNumber + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountBalance()="
				+ getAccountBalance() + ", getAccountNumber()="
				+ getAccountNumber() + "]";
	}
}
