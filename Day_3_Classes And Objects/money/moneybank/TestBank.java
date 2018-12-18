/* test class for testing withdraw , deposite and checking  next account number */

package money.moneybank;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestBank {

	@Test
	public void TestWithdrawSuccessful() {
		SavingAccount savingAccount = new SavingAccount("Deepika", 8000.00);
		double amount=savingAccount.withdraw(500.00);
		assertEquals(7500.00,amount,0.02);
	}

	@Test
	public void TestWithdrawNotSuccessful() {
		SavingAccount savingAccountOne = new SavingAccount("Ankita", 8000.00);
		double amount=savingAccountOne.withdraw(9000.00);
		assertEquals(0.00,amount,0.02);
	}
	
	@Test
	public void TestDepositSuccessful() {
		SavingAccount savingAccount = new SavingAccount("Deepika", 8000.00);
		double amount=savingAccount.deposit(500.00);
		assertEquals(8500.00,amount,0.02);
	}
	
	@Test
	public void TestForCheckingNextAccountNumber() {
		SavingAccount savingAccount = new SavingAccount("Ankita", 8000.00);
		int nextNumber=savingAccount.getNextAccountNumber();
		assertEquals(5,nextNumber);
	}
}
