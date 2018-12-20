package com.bank;
	/**
	* @author dbachhav
    * BankAccount is an abstract class with the Fields accountHolderName,accountBalance,
    * accountNumber.It has abstract method and implemented method.  
    */
public abstract class BankAccount {
	private String accountHolderName;
	private double accountBalance;
	private  int accountNumber;
	private static int nextAccountNumber=0;
	/**
	 * Static and non-static initializers for automatic incrementation of accountNumber. 
	 */
	static{
		nextAccountNumber=0;
	}
	{
		++nextAccountNumber;
	}
	
	/**
	 * 
	 * @param accountHolderName
	 * @param accountBalance
	 * BankAccount Constructor which holds the properties of the class.
	 */
	public BankAccount(String accountHolderName,double accountBalance ){
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		this.accountNumber=nextAccountNumber;
	}
	/**
	 * getters and setters for the properties.
	 */
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
	/**
	 * @param amount
	 * @throws InvalidAmountException
	 * Deposit method is used to deposite amount throws exception when invalid amount is entered.
	 */
	public void deposit(double amount) throws InvalidAmountException{
		if(amount >0){
			this.accountBalance=this.accountBalance+ amount;
		}
		else
			throw new InvalidAmountException("Invalid Amount is entered!");
		
	}
	
	/**
	 * Withdraw is an abstract method which implements method after implementation.
	 * @param amount
	 * @throws InsufficientAmountException
	 * @throws InvalidAmountException
	 */
	public abstract void withdraw(double amount) throws InsufficientAmountException, InvalidAmountException;

	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName+ ", accountBalance=" + getAccountBalance() + ", accountNumber="
				+ accountNumber + ", getAccountHolderName()="+ getAccountHolderName() + ", getAccountBalance()="+ getAccountBalance() + ", getAccountNumber()="+ getAccountNumber() + "]";
	}
}
