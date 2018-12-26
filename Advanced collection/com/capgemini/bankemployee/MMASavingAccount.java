package com.capgemini.bankemployee;
/**
 * @author dbachhav
 *MMASavingAccount is a class contains instance members accountHolderName,accountBalance,accountid,isSalary.
 */
public class MMASavingAccount {
	private String accountHolderName;
	private double accountBalance;
	private int accountid;
	private boolean isSalary;
	
	/**
	 * Constructor to initiate instance members.
	 * @param accountHolderName
	 * @param accountBalance
	 * @param accountid
	 * @param isSalary
	 */
	public MMASavingAccount(String accountHolderName, double accountBalance,
			int accountid, boolean isSalary) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountid = accountid;
		this.isSalary = isSalary;
	}
	
	/**
	 * getter methods to return values.
	 * @return
	 */
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
	/**
	 * toString() method to display values. 
	 */
	@Override
	public String toString() {
		return "MMASavingAccount [accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountid="
				+ accountid + ", isSalary=" + isSalary + "]";
	}

	
}
