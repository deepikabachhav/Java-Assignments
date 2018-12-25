package com.capgemini.bankemployee;

public class MMASavingAccount {
	private String accountHolderName;
	private double accountBalance;
	private int accountid;
	private boolean isSalary;
	
	public MMASavingAccount(String accountHolderName, double accountBalance,
			int accountid, boolean isSalary) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountid = accountid;
		this.isSalary = isSalary;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public int getAccountid() {
		return accountid;
	}

	public boolean isSalary() {
		return isSalary;
	}

	@Override
	public String toString() {
		return "MMASavingAccount [accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountid="
				+ accountid + ", isSalary=" + isSalary + "]";
	}

	
}
