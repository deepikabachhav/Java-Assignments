/*1)	Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
a.	Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount’s object one by one.
b.	Now save the ArrayList which contains SavingAccount’s object into a file and read the file and display all savingAccount Object one by one.
c.	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
 */

package com.capgemini.savingaccount;

import java.io.Serializable;

/**
 * @author dbachhav SavingAccount is a class which implements serializable and
 *         comparable and override compareTo() method.
 */
public class SavingAccount implements Serializable, Comparable {
	private String accountHolderName;
	private double accountBalance;
	private int accountNumber;
	private boolean isSalary;

	/**
	 * Constructor to initialize instance members.
	 * 
	 * @param accountHolderName
	 * @param accountBalance
	 * @param accountNumber
	 * @param isSalary
	 */
	public SavingAccount(String accountHolderName, double accountBalance,
			int accountNumber, boolean isSalary) {
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.isSalary = isSalary;
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

	public boolean isSalary() {
		return isSalary;
	}

	/**
	 * withdraw() method which implements the logic of withdraw.
	 * 
	 * @param amount
	 * @return
	 */
	public double withdraw(double amount) {
		if (amount <= this.getAccountBalance()) {
			return this.accountBalance -= amount;
		} else
			return 0;

	}

	/**
	 * Deposit() method which implements the logic of deposite amount.
	 * 
	 * @param amount
	 * @return
	 */
	public double deposit(double amount) {
		if (amount > 0) {
			return this.accountBalance = this.accountBalance + amount;
		} else
			return 0;
	}

	/**
	 * toString() method to display the members.
	 */
	@Override
	public String toString() {
		return "SavingAccount [accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountNumber="
				+ accountNumber + ", isSalary=" + isSalary + "]";
	}

	/**
	 * Override compareTo() method for implementation of the TreeSet.
	 */
	@Override
	public int compareTo(Object o) {
		SavingAccount sa = (SavingAccount) o;
		return this.accountNumber - sa.accountNumber;

	}
}
