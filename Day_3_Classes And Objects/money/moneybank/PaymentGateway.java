/* class paymentGateway for transfering amount from sender to receiver */

package money.moneybank;
public class PaymentGateway {
		//method to transfer the given amount from the src to target account.
		public static boolean transfer(SavingAccount sender, SavingAccount receiever, double amount) 
		{
			if(sender.getAccountBalance()>= amount){		//If the sender account balance = the given amount then the amount is transferred from the sender to the reciever account and true is returned
				sender.withdraw(amount);
				receiever.deposit(amount);
				return true;
			}
			else 
				return false;				//otherwise false is returned.
		}
}

