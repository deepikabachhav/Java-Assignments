/* Class savingAccount to withdraw , deposit amount and getNextAccountNumber */

package money.moneybank;
public class SavingAccount {
	private String name;
	private double initialBalance;
	private double accountBalance;
	private  int accountNumber;
	private static int nextAccountNumber=0;
	
	SavingAccount(String name, double initialBalance){    //constructor for saving aacount class
		this.name=name;
		this.accountNumber=nextAccountNumber++;
		this.accountBalance=initialBalance;
	}
	
	SavingAccount(String name){				// constructor for zero balance account.
		this.name=name;
	}
	
	public int getNextAccountNumber(){  		//method for checking next account number.
		return nextAccountNumber+1;
	}
	
	@Override
	public String toString() {					// method for display data members.
		return "SavingAccount [name=" + name + ", initialBalance="
				+ initialBalance +  " accountBalance=" + getAccountBalance() + "]";
	}
	
	public double withdraw(double withdrawAmount){				//method for withdraw amount from account balance and update account balance.
		if(withdrawAmount <= accountBalance){
			return this.accountBalance=this.accountBalance-withdrawAmount;	 
		}
		else
			return 0;
	}
	
	public double deposit(double depositAmount){			// method for deposit amount in the account and retun  updated account balance.
		return (this.accountBalance += depositAmount);
	}
	public double getAccountBalance(){				//get account balance from method getAccountBalance()
		return accountBalance;
	}
}